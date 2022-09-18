import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javafx.scene.image.ImageView;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener; 
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Cursor;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.JScrollPane;
import java.awt.Component;

public class Codes_Parents {

 JFrame frmEducsoftWelcome;
	private JTable table;
	private Initialize init= new Initialize();
	private String fichier1= Constantes.fichier_key;
	private String fichier2= Constantes.fichier_ann;
	private String classe="6ème";
	private String total_classe="";
	private JTable table_1;

	 
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Codes_Parents window = new Codes_Parents();
					window.frmEducsoftWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	 
	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Codes_Parents window = new Codes_Parents();
					window.frmEducsoftWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Codes_Parents() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private float e1, e2;
	private void initialize() {
		frmEducsoftWelcome = new JFrame();
		//frmEducsoftWelcome.setResizable(false);
		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		e1= ((float)dim.getWidth()/1571);  e2=(float) dim.getHeight()/863;

		frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		frmEducsoftWelcome.setTitle("Educsoft - Codes Parents");
		frmEducsoftWelcome.setBounds(0, 0, (int) (101101*e1), (int) (870*e2));
		frmEducsoftWelcome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEducsoftWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEducsoftWelcome.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 105, 225));
		panel.setBounds(0, 0, (int) (1571*e1), (int) (863*e2));
		frmEducsoftWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/Embleme_benin.jpg")));
		lblNewLabel_2.setBounds((int) (1447*e1), 0, (int) (93*e1),(int) ( 72*e2));
		panel.add(lblNewLabel_2);
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		Image st_icon= new ImageIcon(this.getClass().getResource("/Icon 3 St.png")).getImage();
		Image cs_icon= new ImageIcon(this.getClass().getResource("/Icon 1.png")).getImage();
		Image ca_icon= new ImageIcon(this.getClass().getResource("/Icon 2.png")).getImage();
		Image gp_icon= new ImageIcon(this.getClass().getResource("/Icon 5 Sgpp.png")).getImage();
		 
		JPanel panel_1 = new JPanel();//new Color(0, 0, 139)
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds(0, (int) (78*e2), (int) (1540*e1), (int) (10*e2));
		panel.add(panel_1);
		
		 
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(this.getClass().getResource("/Carte benin.png")));
		lblNewLabel_3.setBounds(0, 0, (int) (91*e1), (int) (79*e2));
		panel.add(lblNewLabel_3);
		 
		
		JLabel lblNewLabel_5 = new JLabel("Coll\u00E8ge catholique Saint Fran\u00E7ois d'Assise");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Berlin Sans FB", Font.BOLD, 70));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds((int) (173*e1), 0, (int) (1253*e1), (int) (77*e2));
		panel.add(lblNewLabel_5);
		if(init.lire_le_fichier(Constantes.ecole_name).equals("")) {
			remplir(lblNewLabel_5, null, null, null, null, null);
		}else
			lblNewLabel_5.setText(init.lire_le_fichier(Constantes.ecole_name));
		 

		JPanel panel_10 = new JPanel();
		panel_10.setBounds((int)(dim.getWidth()-36), 0, (int)(36*e1), 2000);
		panel_10.setBackground(new Color(47, 79, 79));
		panel.add(panel_10);
		
		JLabel lblNewLabel = new JLabel("Copyright 2019 VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, (int) (817*e2), (int) (299*e1), (int) (13*e2));
		panel.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(47, 79, 79));
		panel_3.setBounds(0, (int) (82*e1), (int) (1540*e2), (int) (55*e2));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		//Image home_icon= new ImageIcon(this.getClass().getResource("/Home.png")).getImage();
		JLabel lblHome = new JLabel("Accueil  >   ");
		//lblHome.setIcon(new ImageIcon(home_icon));
		lblHome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setBounds((int) (10*e1), (int) (10*e2), (int) (128*e1), (int) (33*e2));
		panel_3.add(lblHome);
		
		JLabel lblParametrageClasse = new JLabel("ATTRIBUTION DES CODES PARENTS");
		lblParametrageClasse.setForeground(Color.WHITE);
		lblParametrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblParametrageClasse.setBounds((int) (119*e1), (int) (10*e2), (int) (504*e1), (int) (33*e2));
		panel_3.add(lblParametrageClasse);
		
		JLabel lblAide = new JLabel("Aide ?");
		lblAide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAide.setForeground(new Color(255, 255, 255));
		lblAide.setBounds((int) (13607*e1), (int) (13*e2), (int) (77*e1),(int) ( 27*e2));
		panel_3.add(lblAide);
		
		JLabel lblTrimestre = new JLabel("Ann\u00E9es Scolaires :");
		lblTrimestre.setForeground(new Color(255, 255, 255));
		lblTrimestre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrimestre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTrimestre.setBounds((int) (10*e1), (int) (147*e2), (int) (216*e1), (int) (55*e2));
		panel.add(lblTrimestre);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"XXXX"}));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_2.setBounds((int) (218*e1), (int) (154*e2), (int) (278*e1), (int) (39*e2));
		panel.add(comboBox_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds((int) (516*e1), (int) (147*e2), (int) (808*e1), (int) (671*e2));
		panel.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[20][4] ,
			new String[] {
				"N\u00B0 matricule", "Nom Pr\u00E9noms", "Nom Pr\u00E9nom (Parent)", "Code Parent"
			}
		) {

			boolean[] columnR= new boolean[] {
					false, false, false, false
				};
			public boolean isCellEditable(int row, int column) {
				return columnR[column];
			}
		}
				);
		
		JLabel lblClasses = new JLabel("Classes                :");
		lblClasses.setHorizontalAlignment(SwingConstants.CENTER);
		lblClasses.setForeground(Color.WHITE);
		lblClasses.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClasses.setBounds((int) (10*e1),(int) ( 252*e2),(int) ( 216*e1),(int) ( 55*e2));
		panel.add(lblClasses);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setBounds((int) (218*e1), (int) (260*e2), (int) (278*e1), (int) (39*e2));
		panel.add(comboBox);
		
		  DefaultTableCellRenderer center=new DefaultTableCellRenderer();
		   center.setHorizontalAlignment(JLabel.CENTER);
		   center.setVerticalAlignment(JLabel.CENTER);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(213);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(212);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(153);
		table_1.getColumnModel().getColumn(1).setCellRenderer(center);
		table_1.getColumnModel().getColumn(2).setCellRenderer(center);
		table_1.getColumnModel().getColumn(3).setCellRenderer(center);
		table_1.getColumnModel().getColumn(0).setCellRenderer(center);
		table_1.setRowHeight(40);
		
		table_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		init.ecrire(Constantes.current_trim, "Trimestre 1");	
		 
		  
		lblHome.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

				WelcomePage inscription= new WelcomePage();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);;
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblHome.setForeground(Color.BLACK);
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblHome.setForeground(Color.WHITE);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				lblHome.setForeground(Color.BLACK);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblHome.setForeground(Color.WHITE);
			}
			 
			
		});
		lblAide.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

				init.Help();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblAide.setBackground(Color.WHITE);
				lblAide.setForeground(Color.BLACK);
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblAide.setBackground(Color.BLUE);
				lblAide.setForeground(Color.WHITE);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				lblAide.setBackground(Color.WHITE);
				lblAide.setForeground(Color.BLACK);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblAide.setBackground(Color.BLUE);
				lblAide.setForeground(Color.WHITE);
			}
			 
			
		});
	
	
		remplir_annee(comboBox_2, comboBox);
		table_1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){  
			@Override
			public void valueChanged(ListSelectionEvent arg0) {

				int i=table_1.getSelectedRow();
			 
				if(table_1.getSelectedRow()==-1)
					return;
				if(table_1.getValueAt(table_1.getSelectedRow(), 1)==null)
					return;
				String name= table_1.getValueAt(table_1.getSelectedRow(), 1).toString();
				if(init.msgIsShow("Voulez-vous envoyer une convocation aux Parents de "+name+" via EducApp?",name)) {
					convocation c= new convocation();
					String s[]= new String[1];
					s[0]=table_1.getValueAt(table_1.getSelectedRow(), 3).toString();
					c.frame.setVisible(true);
				}
				
			}
	    });
	}

	 
	private void remplir(JLabel n,JLabel l,JLabel ce,JLabel ee,JLabel dn,JLabel dc) {
		
		if(init.lire_le_fichier(fichier1).equals("")) {
			
		}else {
			
			String info_psdo=init.lire_le_fichier(fichier1);
			String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
			
			JSONArray infos= init.getEcoles("ecoles", "id_ecl='"+id_ecol+"'", "");

			for(int i=0;i<infos.length(); i++) {
				if(i!=infos.length()-1)
					continue;
				JSONObject rs;
				try {
					rs = infos.getJSONObject(i);
					String nom = rs.getString("nom");
					String lieu= rs.getString("lieu");
					String contact_ecole= rs.getString("contact_ecole");
					String email_ecole= rs.getString("email_ecole");
					
					String dir_name= rs.getString("dir_name");
					String dir_contact=rs.getString("dir_contact");
					
					init.ecrire(Constantes.ecole_name, nom);
					n.setText(nom);
					//l.setText(lieu);
					//ce.setText("Contact: "+contact_ecole);
					//ee.setText("Email: "+email_ecole);
					//dn.setText("Dir "+dir_name);
					//dc.setText(dir_contact);
					
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			
		}
	}
	
	
	String []year;

	public void remplir_annee(JComboBox combo, JComboBox combo2) { 
		String info_psdo=init.lire_le_fichier(fichier1);
		String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t')); 
		String s= "";
		int nbre=0; 
		
		List<String> tab=new ArrayList(40);
		List<String> autres=new ArrayList(40);
		String autre=""; 
		
		String create="CREATE TABLE annees(id_ecole VARCHAR(255),annees int(40),autre TEXT)";		
		JSONArray js= init.getAnnees("annees", "id_ecole='"+id_ecol+"'", create);
		
		if(js!=null) {
			for(int i =0; i<js.length(); i++) {
				JSONObject rs;
				try {
					rs = js.getJSONObject(i);
					int current= rs.getInt("annees");
					autre= (rs.getString("autre"));
					tab.add((current-1)+"-"+current);
					autres.add(autre);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		if(js.length()==0)
			return;
		int compt=0;
		
		for(int i=0; i<tab.size(); i++) {
			if(tab.get(i)!=null) {
				compt++;
				s= tab.get(i)+";"+s; 
			}				
		}

	    compt=0;
		 
		if(!s.equals("")) {
			int anc_pos= 0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)==';') {
					compt++;
				}
			}
			year=new String[compt];
			int pos=0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)==';') {
					year[pos]= s.substring(anc_pos, i);
					anc_pos=i+1;
					pos++;
				}else if(i==s.length()-1) {
					year[pos]= s.substring(anc_pos, i+1);
					anc_pos=i+1;
					pos++;
				}
			}
			String part1= year[0];
			//last_year= Integer.parseInt(part1.substring(part1.indexOf('-')+1));
			 
		}
		
		
		if(compt!=0) {
			int t=compt;
			combo.setModel(new DefaultComboBoxModel(year));
			combo.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String year = combo.getSelectedItem().toString();
					String autre= autres.get(t-1-combo.getSelectedIndex());  
					 
					for_classes(autre, combo2, year);
				}				
			});
			combo2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					 
					String classe= combo2.getSelectedItem().toString();
					 
					remplir_eleves(classe, combo.getSelectedItem().toString());
				}			
			}); 
			combo.setSelectedIndex(0);
			
		}
		
		
	}
	
	private void for_classes(String autre, JComboBox comboBox, String y) {  
		String info_psdo=init.lire_le_fichier(fichier1);
		String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		 
		autre= autre.replaceAll("\r", "");
		int compt=0;
		for(int i=0;i<autre.length();i++) {
			if(autre.charAt(i)=='\n')
				compt++;
		}
		String classes[]= new String[compt+1];
		int anc_pos=0; compt=0;
		for(int i=0; i<autre.length(); i++) {
			if(autre.charAt(i)=='\n') {
				classes[compt]= autre.substring(anc_pos, i);
				anc_pos=i+1;
				compt++;
			}else if(i== autre.length()-1) {
				classes[compt]= autre.substring(anc_pos);
				anc_pos=i+1;
				compt++;
			}
		}
		comboBox.setModel(new DefaultComboBoxModel(classes)); 
		comboBox.setSelectedIndex(0);
	}
	
	private void remplir_eleves(String classe, String year) {
		String info_psdo=init.lire_le_fichier(fichier1);
		String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		
		String create= "CREATE TABLE IF NOT EXISTS eleves_"+year.replaceAll("-", "")
		+"_"+id_ecol.replaceAll("-", "")
		+" (classe VARCHAR(255),nom VARCHAR(255),prenoms VARCHAR(255),date VARCHAR (255),lieu VARCHAR (255),matricule VARCHAR (255),"
		+ "cont_urgence TEXT,nom_p VARCHAR (255),prenom_p TEXT,cont_mobile VARCHAR (255),cont_domicile VARCHAR (255),cont_travail VARCHAR (255),"
		+ "profession VARCHAR (255),arrond VARCHAR (255),adresse VARCHAR (255),qtier VARCHAR (255),g_sanguin VARCHAR (255),"
		+ "electroph VARCHAR (255),sexe VARCHAR (255),logo TEXT,autre VARCHAR (255))";
 
		List<String> tab=new ArrayList(200);
		List<String> infos=new ArrayList(200);
		String autre=""; 
		JSONArray js= init.getEleves("eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "classe = '"+classe+"'", create);
		if(js!=null) {
			for(int i=0; i<js.length(); i++) {
				JSONObject rs;
				try {
					rs = js.getJSONObject(i);
					tab.add(rs.getString("nom")+" "+rs.getString("prenoms"));
					infos.add(
							rs.getString("nom")+"\n"+
							rs.getString("prenoms")+"\n"+
							rs.getString("date")+"\n"+
							rs.getString("lieu")+"\n"+
							rs.getString("matricule")+"\n"+
							rs.getString("cont_urgence")+"\n"+
							rs.getString("nom_p")+"\n"+
							rs.getString("prenom_p")+"\n"+
							rs.getString("cont_mobile")+"\n"+
							rs.getString("cont_domicile")+"\n"+
							rs.getString("cont_travail")+"\n"+
							rs.getString("electroph")+"\n"+
							rs.getString("sexe")+"\n"+
							rs.getString("autre")+"\n"+
							rs.getString("profession")+"\n"+
							rs.getString("arrond")+"\n"+
							rs.getString("adresse")+"\n"+
							rs.getString("qtier")+"\n"+
							rs.getString("autre")+"\n"); 
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		Object ob[][]= new Object[10][4];
		if(js==null) {	
			table_1.setModel(new DefaultTableModel(
				ob ,
				new String[] {
					"N\u00B0 matricule", "Nom Pr\u00E9noms", "Scolarité depuis EducApp", "Code Parent"
				}
			) {

			boolean[] columnR= new boolean[] {
					false, false, false, false
				};
			public boolean isCellEditable(int row, int column) {
				return columnR[column];
			}
			
		}
				); 
				table_1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){  
					@Override
					public void valueChanged(ListSelectionEvent arg0) {
 
						
					}
			    });
			return;
		}
		if(js.length()==0) {
			table_1.setModel(new DefaultTableModel(
					ob ,
					new String[] {
						"N\u00B0 matricule", "Nom Pr\u00E9noms", "Scolarité depuis EducApp", "Code Parent"
					}
				) {

				boolean[] columnR= new boolean[] {
						false, false, false, false
					};
				public boolean isCellEditable(int row, int column) {
					return columnR[column];
				}
				
			}
					);
			table_1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){  
				@Override
				public void valueChanged(ListSelectionEvent arg0) {

					
				}
		    });
			return;
		}
		int compt=0;
		for(int i=0; i<tab.size(); i++) {
			if(tab.get(i)!=null)
				compt++;
		}
		String names[]= new String[compt];
		String names2[]= new String[compt];
		String ordres[] = new String[compt];
		for(int i=0; i<compt; i++) {
			if(tab.get(i)!=null) {
				names[i]=tab.get(i);
				names2[i]=tab.get(i);
				ordres[i]=String.valueOf(i);
			}
		}
		
		for(int i=0; i<compt; i++) {
			String min= names[i];
			int pos=0;				
			for(int j=i; j<compt; j++) {
				if(inferieur(names[j], min)) {
					min= names[j];
					pos=j; 
				}
			} 
			if(pos!=0) {
				names[pos]=names[i];
				names[i]=min;
				for(int j=0; j<compt; j++) {
					for(int k=0; k<compt; k++) {
						if(names[j].equals(names2[k])) {
							ordres[j]=String.valueOf(k);
							break;
						}
					}
				}
 
			} 
		}
		
		ob = new Object[compt][4];
		for(int i=0; i<compt; i++) {
			String info= infos.get(Integer.parseInt(ordres[i]));
			List<String> details= new ArrayList(19);
			int anc_pos=0, pos=0; 
			for(int j=0; j<info.length(); j++) { 
				if(info.charAt(j)=='\n') {
					details.add(info.substring(anc_pos, j));
					anc_pos=j+1; 
				}
			}
			ob[i][0]= details.get(4);
			ob[i][1]= details.get(0)+" "+details.get(1);
			ob[i][2]= scolarite(id_ecol, details.get(18));
			ob[i][3]= details.get(18);
			
		} 
		table_1.setModel(new DefaultTableModel(
				ob ,
				new String[] {
					"N\u00B0 matricule", "Nom Pr\u00E9noms", "Scolarité depuis EducApp", "Code Parent"
				}
			) {

			boolean[] columnR= new boolean[] {
					false, false, false, false
				};
			public boolean isCellEditable(int row, int column) {
				return columnR[column];
			}
			
		}
				); 
		final int f=compt;

			
			  DefaultTableCellRenderer center=new DefaultTableCellRenderer();
			   center.setHorizontalAlignment(JLabel.CENTER);
			   center.setVerticalAlignment(JLabel.CENTER);
			table_1.getColumnModel().getColumn(1).setPreferredWidth(60);
			table_1.getColumnModel().getColumn(2).setPreferredWidth(10);
			table_1.getColumnModel().getColumn(0).setPreferredWidth(20);
			table_1.getColumnModel().getColumn(3).setPreferredWidth(170);
			table_1.getColumnModel().getColumn(1).setCellRenderer(center);
			table_1.getColumnModel().getColumn(2).setCellRenderer(center);
			table_1.getColumnModel().getColumn(3).setCellRenderer(center);
			table_1.getColumnModel().getColumn(0).setCellRenderer(center);
			
			table_1.setRowHeight(40);
			table_1.setEnabled(true);
		
			table_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			
			
		 
	}
	
	private boolean inferieur(String s1,String s2) {
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
	
	public String scolarite(String id_ecl, String code) {
		String create= "CREATE TABLE scolarite_"+id_ecl.replaceAll("-", "")+" (code_parent TEXT, autre VARCHAR(255), solde VARCHAR(255)) ";
		String sco=" - ";
		JSONArray js= init.getScolarite("scolarite_"+id_ecl.replaceAll("-", ""), "code_parent='"+code+"'", create);
		if(js!=null) {
			for(int i=0; i<js.length(); i++) {
				if(i!=js.length()-1)
					continue;
				JSONObject rs;
				try {
					rs = js.getJSONObject(i);
					sco=rs.getString("solde");
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return sco;
		
	}

}
