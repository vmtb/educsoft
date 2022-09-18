
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;  
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.mysql.jdbc.PreparedStatement;

public class Initialize {
//http://www.androiddeft.com/connecting-android-app-remote-database-using-php-mysql/
	public Initialize() {
		ecrire2("Lis Moi.txt", "Attention ! Il ne faut jamais supprimer ni modifier les fichiers VIROMA de crainte de ne pas écraser vos propres données");
	}
	
	/*TODO SQL DATABASE*/
	
	public int inserer(String sql, String succes, String failed) {
		int rs=5;
		try  { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://"+Constantes.db_url+"/"+Constantes.db_name, Constantes.db_user_name, Constantes.db_pass);
			//PreparedStatement ps= con.prepareStatement(sql);
			//ps.executeQuery(stmt);
			Statement stmt=con.createStatement();
			rs= stmt.executeUpdate(sql);
			System.out.print("Insertion result: "+rs);
			if(rs==1) {
				rs=0;
				JOptionPane.showMessageDialog(null, succes);
			}else {
				JOptionPane.showMessageDialog(null, failed);
			}
			
		}catch (Exception e) {
			System.out.print(e);
		}
		return rs; 
	}
	
	public void create_table (String sql) {
		Connection con=null;
		try  { 
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://"+Constantes.db_url+"/"+Constantes.db_name, Constantes.db_user_name, Constantes.db_pass);
			Statement stmt=con.createStatement();
			int rs= stmt.executeUpdate(sql);
			System.out.println("Create table result: "+rs);
			
		}catch (Exception e) {
			System.out.print(e);
		}
	}
	
	public int select_if_exist(String sql) {

		int fait=0;
		try  { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://"+Constantes.db_url+"/"+Constantes.db_name, Constantes.db_user_name, Constantes.db_pass);
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery(sql);
			if(rs.next()) {
				fait=1;
			} 
		}catch (Exception e) {
			System.out.print(e);
		}
		return fait;
	}
	
	public ResultSet select_if_exist_un(String sql) {
		ResultSet rs=null;
		int fait=0;
		try  { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://"+Constantes.db_url+"/"+Constantes.db_name, Constantes.db_user_name,Constantes.db_pass);
			Statement stmt=con.createStatement();
			rs= stmt.executeQuery(sql);
			ResultSet rss=rs;
			System.out.print(rs.getString("autre"));
			/*while(rs.next()) {
				int current= rs.getInt("annees");
			}*/
			if(rss.next()) {
				fait=1;
			}
		}catch (Exception e) {
			System.out.print(e);
		}
		return rs;
	}
	
	public String recup_annees(String where)   {
		String year= "";
		String create="CREATE TABLE annees(id_ecole VARCHAR(255),annees int(40),autre TEXT)";
		
		JSONArray infos=getAnnees("annees", where, create);
		if(infos==null) {
			return "";
		}
		List<String> tab=new ArrayList(40);
		for(int i=0;i<infos.length(); i++) {
			JSONObject rs;
			try {
				rs = infos.getJSONObject(i);
				int current= rs.getInt("annees");
				tab.add((current-1)+"-"+current);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int compt=0;
		
		for(int i=0; i<tab.size(); i++) {
			if(tab.get(i)!=null) {
				compt++;
				year= tab.get(i)+";"+year; 
			}				
		} 
		return year;
	}
	
	
	public int update(String sql) {
	
		int rs=5;
		try  { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://"+Constantes.db_url+"/"+Constantes.db_name, Constantes.db_user_name ,Constantes.db_pass);
			Statement stmt=con.createStatement();
			rs= stmt.executeUpdate(sql);
			System.out.print("Insertion result: "+rs);
			if(rs==1) {
				rs=0;
			}else {
				
			} 
			
		}catch (Exception e) {
			System.out.print(e);
		}
		return rs;
	}
	
	public JSONArray getLicence(String where) {
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_licences.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", "licences");
		map.put("condition", where);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ".TPissanci"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= decode(lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, coder(infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	
	
	public JSONArray getEcolesInfos(String table_name, String where, String create) {
		//http://localhost/EducSoft/select_ecoles_infos.php
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_ecoles_infos.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= decode(lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, coder(infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	

	public JSONArray getUsersInfos(String table_name, String where, String create) {
		//http://localhost/EducSoft/select_ecoles_infos.php
		HttpJsonParser ht= new HttpJsonParser();String url=Constantes.base_url+"/select_utilisateurs.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		JSONArray infos=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		int status=0;
		try {
			
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= decode(lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, coder(infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			} 
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	
	
	public int inserer_(String query, String table_name, String create, String test, String succes, String failed) {
		
			HttpJsonParser ht= new HttpJsonParser();
			String url=Constantes.base_url+"/inserer.php";
			String method="POST";
			Map map=new HashMap();
			map.put("test", test);
			map.put("table_name", table_name);
			map.put("query", query); //insert
			map.put("create", create);  //create 
			
			JSONObject rs=null;
			try {
				rs = ht.makeHttpRequest(url, method, map);
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int status=0;
			int infos=1;
			try {

				if(rs==null) {
					Alerter("Aucune connection");
					return 1;
				}
				status= rs.getInt("success");
				if(status==1) {
					infos=0;
					JOptionPane.showMessageDialog(null, succes);
				}else {
					JOptionPane.showMessageDialog(null, failed);
					System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return infos;	
	}
	

	public int inserer_simple(String query, String table_name, String create, String test, String deux) {
		
			HttpJsonParser ht= new HttpJsonParser();
			String url=Constantes.base_url+"/inserer.php";
			String method="POST";
			Map map=new HashMap();
			Map map2=new HashMap();
			map.put("test", test);
			map2.put("azertyuiop", deux);
			map.put("table_name", table_name);
			map.put("query", query); //insert
			map.put("create", create);  //create 
			
			JSONObject rs=null;
			try {
				rs = ht.makeHttpRequest(url, method, map);
				ht.makeHttpRequest(Constantes.base_url+"/inserer_device.php", method, map2);
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int status=0;
			int infos=1;
			try {
				if(rs==null)
					return 1;
				status= rs.getInt("success");
				if(status==1) {
					infos=0; 
				}else { 
					System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return infos;	
	}
	

	public int update_(String query, String table_name, String create, String test) {
		
			HttpJsonParser ht= new HttpJsonParser();
			String url=Constantes.base_url+"/update.php";
			String method="POST";
			Map map=new HashMap();
			map.put("test", test);
			map.put("table_name", table_name);
			map.put("query", query); //insert
			map.put("create", create);  //create 
			
			JSONObject rs=null;
			try {
				rs = ht.makeHttpRequest(url, method, map);
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int status=0;
			int infos=1;
			try {
				if(rs==null) {
					Alerter("Aucune connection");
					return 1;
				}
				status= rs.getInt("success");
				if(status==1) {
					infos=0;
				}else {
					System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return infos;	
	}
	
	

	

	public int update_2(String query, String table_name, String create, String test, String deux) {
		
			HttpJsonParser ht= new HttpJsonParser();
			String url=Constantes.base_url+"/update.php";
			String method="POST";
			Map map=new HashMap();
			Map map2=new HashMap();
			map.put("test", test);
			map2.put("azertyuiop", deux);
			map.put("table_name", table_name);
			map.put("query", query); //insert
			map.put("create", create);  //create 
			
			JSONObject rs=null;
			try {
				rs = ht.makeHttpRequest(url, method, map);
				ht.makeHttpRequest(Constantes.base_url+"/inserer_device.php", method, map2);
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int status=0;
			int infos=1;
			try {
				if(rs==null) {
					Alerter("Aucune connection");
					return 1;
				}
				status= rs.getInt("success");
				if(status==1) {
					infos=0;
				}else {
					System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return infos;	
	}
	
	
	
    public JSONArray getEcoles(String table_name, String where, String create) {
		 
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_ecoles.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= decode(lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, coder(infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	
	
	public JSONArray getAnnees(String table_name, String where, String create) {
		 
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_annees.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= decode(lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, coder(infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	
	
	public JSONArray getEleves(String table_name, String where, String create) {
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_eleves.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(where);
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= decode(lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= null; 
				}
				return infos;
			}

			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, coder(infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	
	
	public JSONArray getClassesMatieres(String table_name, String where, String create) {
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_class_mat.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= decode(lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, coder(infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	
	
	public JSONArray getEnseignant(String table_name, String where, String create) {
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_enseigant.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= decode(lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, coder(infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	
	
	public JSONArray getNotes(String table_name, String where, String create) {
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_the_notes.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= decode(lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, coder(infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	
	
	public JSONArray getMoyennes(String table_name, String where, String create) {
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_moys.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= decode(lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, coder(infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}

	
	public JSONArray getEnseignantSalaire(String table_name, String where, String create) {
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_enseignant_salaire.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= (lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, (infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	
	
	public JSONArray getCalendrier(String table_name, String where, String create) {
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_calendrier.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= (lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, (infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	

	public JSONArray getScolarite(String table_name, String where, String create) {
		HttpJsonParser ht= new HttpJsonParser();
		String url=Constantes.base_url+"/select_scolarite.php";
		String method="POST";
		Map map=new HashMap();
		map.put("table_name", table_name);
		map.put("condition", where);
		map.put("create", create);
		JSONObject rs=null;
		try {
			rs = ht.makeHttpRequest(url, method, map);
		} catch (JSONException e1) {
			// TODO Auto-generated catch b lock
			e1.printStackTrace();
		}
		int status=0;
		JSONArray infos=null;
		try {
			String fichier= ""+table_name+"+"+where.replaceAll("=", "@")+".viroma";		
			if(rs==null) {
				String ob= (lire_le_fichier2(fichier));
				if(!ob.equals("")) {
					infos= new JSONArray(ob); 
				}else {
					infos= new JSONArray("[]"); 
				}
				return infos;
			}
			status= rs.getInt("success");
			if(status==1) {
				infos = rs.getJSONArray("data");
				if(infos.toString().equals("[]")) {
					
				} 
				ecrire2(fichier, (infos.toString()));
			}else {
				System.out.println("\n\n***\n\nErreur dans la requête: "+rs.getString("message")+"\n\n***\n\n");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*TODO FICHIER*/
	
	public void ecrire(String fichier, String texte) {
		try {
			String path = "C:" + File.separator + "EducSoft" + File.separator + "EducSoft" + File.separator + ""+fichier;
		// Use relative path for Unix systems
			File f = new File(path);

			f.getParentFile().mkdirs(); 
			f.createNewFile();
		
			FileOutputStream fos= new FileOutputStream(f);
			fos.write(texte.getBytes());
			fos.close();
		}catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getIdEcole() {
		String info_psdo= lire_le_fichier(Constantes.fichier_key);
		 
		return info_psdo.substring(0, info_psdo.indexOf('\t'));
	}
	
	public String lire_le_fichier(String fichier) { 
		String texto="";
		try {
			String path = "C:" + File.separator + "EducSoft" + File.separator + "EducSoft" + File.separator + ""+fichier;
			// Use relative path for Unix systems
			File f = new File(path);
			if(!f.exists()) {
				f.getParentFile().mkdirs(); 
				f.createNewFile();
			}
			FileInputStream fil_i=new FileInputStream(f);
			 byte[] buffer= new byte[fil_i.available()];
	         fil_i.read(buffer);
	         texto= new String(buffer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return texto;
	}	
	public void ecrire2(String fichier, String texte) {
		try {
			String path = "C:" + File.separator + "EducSoft" + File.separator + "EducSoft" + File.separator + "Systeme"+ File.separator +""+fichier;
			// Use relative path for Unix systems
			File f = new File(path);

			f.getParentFile().mkdirs(); 
			f.createNewFile();
		
			FileOutputStream fos= new FileOutputStream(f);
			fos.write(texte.getBytes());
			fos.close();
		}catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String lire_le_fichier2(String fichier) { 
		String texto="";
		try {
			String path = "C:" + File.separator + "EducSoft" + File.separator + "EducSoft" + File.separator + "Systeme"+ File.separator +""+fichier;
			// Use relative path for Unix systems
			File f = new File(path);
			if(!f.exists()) {
				f.getParentFile().mkdirs(); 
				f.createNewFile();
			}
			FileInputStream fil_i=new FileInputStream(f);
			 byte[] buffer= new byte[fil_i.available()];
	         fil_i.read(buffer);
	         texto= new String(buffer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return texto;
	}

	
    public boolean contient_fausse(String text){
    	if(text.isEmpty())
    		return false;
        boolean est= false;
        for (int i = 0; i < text.length(); i++) {
            if((text.charAt(i)!='1')&&(text.charAt(i)!='2')&&(text.charAt(i)!='3')
                    &&(text.charAt(i)!='4')&&(text.charAt(i)!='5')&&(text.charAt(i)!='6')
                    &&(text.charAt(i)!='7')&&(text.charAt(i)!='8')&&(text.charAt(i)!='9')&&(text.charAt(i)!='0')){
                est=true;
                break;
            }
        }
        return  est;
    }

    public boolean contient_fausse2(String text){
    	if(text.isEmpty())
    		return false;
        boolean est= false;
        for (int i = 0; i < text.length(); i++) {
            if((text.charAt(i)!='.')&&(text.charAt(i)!='1')&&(text.charAt(i)!='2')&&(text.charAt(i)!='3')
                    &&(text.charAt(i)!='4')&&(text.charAt(i)!='5')&&(text.charAt(i)!='6')
                    &&(text.charAt(i)!='7')&&(text.charAt(i)!='8')&&(text.charAt(i)!='9')&&(text.charAt(i)!='0')){
                est=true;
                break;
            }
        }
        if(est==false) {
        	if(Float.parseFloat(text)>20)
        		est=true;
        }
        return  est;
    }
	
	/*TODO JOPTION PANE ALERT DIALOG*/
	
	public boolean msgIsShow(String text, String title) {
		boolean vrai=false;
		JOptionPane op= new JOptionPane();
		int option=op.showConfirmDialog(null, text, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		return (option != JOptionPane.NO_OPTION && option !=
				JOptionPane.CANCEL_OPTION && option != JOptionPane.CLOSED_OPTION) ;
			 
		
	}
	
	public void Alerter(String s) {
		JOptionPane.showMessageDialog(null, s);
	}

	public void Alerter_warn(String s, String title) {
		JOptionPane.showMessageDialog(null, s,title, JOptionPane.WARNING_MESSAGE);
	}
	
	public void Help() {
		Alerter("Veuillez bien contacter l'assistance au +22961857795 / +22997907489 \nou sur la page facebook de VIBECRO CORPORATION (@vibecrocorporation) ");
	}

	
	
	
	/*TODO REMPLISSAGE DE L'ENTETE*/
	
	public void remplir(JLabel n,JLabel l,JLabel ce,JLabel ee,JLabel dn,JLabel dc) {
		
		if(lire_le_fichier(Constantes.fichier_key).equals("")) {
			
		}else {
			String info_psdo=lire_le_fichier(Constantes.fichier_key);
			String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
			String sql= "SELECT * FROM ecoles WHERE id_ecl='"+id_ecol+"'";
			ResultSet rs= select_if_exist_un(sql);
			try {
				while(rs.next()) {
					if(rs.isLast()) {
						String nom = rs.getString("nom");
						String lieu= rs.getString("lieu");
						String contact_ecole= rs.getString("contact_ecole");
						String email_ecole= rs.getString("email_ecole");
						
						String dir_name= rs.getString("dir_name");
						String dir_contact=rs.getString("dir_contact");
						
						n.setText(nom);
						ecrire(Constantes.ecole_name, nom);
						//l.setText(lieu);
						//ce.setText("Contact: "+contact_ecole);
						//ee.setText("Email: "+email_ecole);
						//dn.setText("Dir "+dir_name);
						//dc.setText(dir_contact);
						
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	

	boolean inferieur(String s1,String s2) {
		String s1p= s1.trim().toLowerCase();
		String s2p= s2.trim().toLowerCase();
		int faible=s2p.length();
		if(s1p.length()<s2p.length())
			faible=s1p.length();
		boolean ans=false;
		int pti=0;
		for(int i=0; i<faible;  i++) {
			if(s1p.charAt(i)<s2p.charAt(i)) {
				ans=true; 
				break;
			}else if(s1p.charAt(i)>s2p.charAt(i)) {
				ans=false;
				break;
			}else
				pti++;
		}
		if(pti==faible) {
			if(faible==s1p.length())
				ans=false;
			else if(s1p.length()!=s2p.length())
				ans=true;
			else
				ans=true;
		}
		return ans;
		
	}
	
	public String coder(String chaine) {
		
		chaine =chaine.replaceAll("1", "@z@");
		chaine =chaine.replaceAll("2", "@y@");
		chaine =chaine.replaceAll("3", "@x@");
		chaine =chaine.replaceAll("4", "@w@");
		chaine =chaine.replaceAll("5", "@u@");
		chaine =chaine.replaceAll("6", "@v@");
		chaine =chaine.replaceAll("7", "@m@");
		chaine =chaine.replaceAll("8", "@g@");
		chaine =chaine.replaceAll("9", "@j@");
		chaine =chaine.replaceAll("0", "@p@");
		System.out.print(chaine);
		return chaine;
	}
	
	public String decode(String chaine) {

		chaine=chaine.replaceAll("@z@", "1");
		chaine=chaine.replaceAll("@y@", "2");
		chaine=chaine.replaceAll( "@x@", "3");
		chaine=chaine.replaceAll( "@w@", "4");
		chaine=chaine.replaceAll( "@u@", "5");
		chaine=chaine.replaceAll( "@v@", "6");
		chaine=chaine.replaceAll( "@m@", "7");
		chaine=chaine.replaceAll( "@g@", "8");
		chaine=chaine.replaceAll( "@j@", "9");
		chaine=chaine.replaceAll( "@p@", "0");
		return chaine;
	}

}
