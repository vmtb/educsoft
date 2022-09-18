import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane; 
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
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
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javax.swing.table.DefaultTableModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Menu_classes {

	JFrame frmEducsoftWelcome;
	private JTextField textField;
	private JTable table;
	private Initialize init= new Initialize();
	private String fichier1= Constantes.fichier_key;
	private String fichier2= Constantes.fichier_ann;
	private String classe="6ème";
	private String total_classe="";

	 
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_classes window = new Menu_classes();
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
					Menu_classes window = new Menu_classes();
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
	public Menu_classes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEducsoftWelcome = new JFrame();
	//	frmEducsoftWelcome.setResizable(false);
		frmEducsoftWelcome.setTitle("Educsoft - Welcome");
		frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		float e1= ((float)dim.getWidth()/1571); float e2=(float) dim.getHeight()/863;
		frmEducsoftWelcome.setBounds(0, 0, (int) (101101*e1), (int) (870*e2));
		frmEducsoftWelcome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEducsoftWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEducsoftWelcome.getContentPane().setLayout(null);
		
		
	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 105, 225));
		panel.setBounds((int) (0*e1), (int) (0*e2), (int) (1571*e1), (int) (863*e2));
		frmEducsoftWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/Embleme_benin.jpg")));
		lblNewLabel_2.setBounds((int) (1447*e1), 0, (int) (93*e1), (int) (72*e2));
		panel.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		panel_2.setBounds(0, (int) (78*e2), (int) (299*e1), (int) (736*e2));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblParamtrageClasse = new JLabel("Param\u00E9trage classe");
		lblParamtrageClasse.setOpaque(true);
		lblParamtrageClasse.setBackground(new Color(65, 105, 225));
		lblParamtrageClasse.setForeground(new Color(255, 255, 255));
		lblParamtrageClasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblParamtrageClasse.setBounds(0,(int)( 59*e2), (int)(282*e1), (int)(79*e2));
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		lblParamtrageClasse.setIcon(new ImageIcon(par_icon));
		panel_2.add(lblParamtrageClasse);
		
		JLabel label = new JLabel("Statistiques");
		label.setForeground(Color.WHITE);
		Image st_icon= new ImageIcon(this.getClass().getResource("/Icon 3 St.png")).getImage();
		label.setIcon(new ImageIcon(st_icon));
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(0, (int) (174*e2), (int) (331*e1), (int) (95*e2));
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Cartes scolaires");
		label_1.setForeground(Color.WHITE);
		Image cs_icon= new ImageIcon(this.getClass().getResource("/Icon 1.png")).getImage();
		label_1.setIcon(new ImageIcon(cs_icon));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(0, (int) (331*e2), (int) (331*e1), (int) (79*e2));
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Calendrier scolaire");
		label_2.setForeground(Color.WHITE);
		Image ca_icon= new ImageIcon(this.getClass().getResource("/Icon 2.png")).getImage();
		label_2.setIcon(new ImageIcon(ca_icon));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(0, (int)(471*e2), (int)(282*e1), (int)(97*e2));
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Gestion du personnel");
		label_3.setForeground(Color.WHITE);
		Image gp_icon= new ImageIcon(this.getClass().getResource("/Icon 5 Sgpp.png")).getImage();
		label_3.setIcon(new ImageIcon(gp_icon));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(0, (int)(598*e2), (int)(282*e1), (int)(97*e2));
		panel_2.add(label_3);
		
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
		panel_3.setBounds((int)(e1*298), (int)(e2*82), (int)(e1*1242), (int)(e2*55));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		//Image home_icon= new ImageIcon(this.getClass().getResource("/Home.png")).getImage();
		JLabel lblHome = new JLabel("Accueil  >   ");
		//lblHome.setIcon(new ImageIcon(home_icon));
		lblHome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setBounds((int) (10*e1), (int) (10*e2), (int) (128*e1), (int) (33*e2));
		panel_3.add(lblHome);
		
		JLabel lblParametrageClasse = new JLabel("PARAMETRAGE CLASSE "+init.lire_le_fichier(Constantes.fichier_ann));
		lblParametrageClasse.setForeground(Color.WHITE);
		lblParametrageClasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblParametrageClasse.setBounds((int) (119*e1), (int) (10*e2), (int) (504*e1), (int) (33*e2));
		panel_3.add(lblParametrageClasse);
		
		JLabel lblAide = new JLabel("Aide ?");
		lblAide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAide.setForeground(new Color(255, 255, 255));
		lblAide.setBounds((int) (1175*e1), (int) (13*e2), (int) (77*e1), (int) (27*e2));
		panel_3.add(lblAide);
		
		JLabel lblVeuillezChoisirLa = new JLabel("Veuillez choisir la classe \u00E0 param\u00E9trer");
		lblVeuillezChoisirLa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVeuillezChoisirLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblVeuillezChoisirLa.setBounds((int) (457*e1), (int) (338*e2), (int) (992*e1), (int) (55*e2));
		panel.add(lblVeuillezChoisirLa);
		
		JComboBox comboBox = new JComboBox();
		first_trait(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setBounds((int) (628*e1), (int) (440*e2), (int) (765*e1), (int) (53*e2));
		panel.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				init.ecrire(Constantes.current_classe, comboBox.getSelectedItem().toString());
				//init.Alerter(comboBox.getSelectedItem().toString()+" et "+init.lire_le_fichier(Constantes.current_trim));
				
				Classes inscription= new Classes();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
				
				
				
				
			}
			
		});
		
		
		JLabel lblClasse = new JLabel("Classe:");
		lblClasse.setForeground(new Color(255, 255, 255));
		lblClasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClasse.setBounds((int) (309*e1), (int) (439*e2), (int) (307*e1), (int) (55*e2));
		panel.add(lblClasse);
		
		JLabel lblAjouterUneClasse = new JLabel("Ajout d'une classe non existante");
		lblAjouterUneClasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjouterUneClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAjouterUneClasse.setBounds((int) (434*e1), (int) (557*e2), (int) (992*e1), (int) (55*e2));
		panel.add(lblAjouterUneClasse);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"6\u00E8me", "5\u00E8me", "4\u00E8me", "3\u00E8me", "2nde", "1\u00E8re", "Tle"}));
		comboBox_1.setBounds((int) (417*e1), (int) (695*e2), (int) (152*e1), (int) (42*e2));
		panel.add(comboBox_1);
		comboBox_1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				classe= arg0.getItem().toString();
				
			}
			
		});
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds((int) (729*e1), (int) (696*e2), (int) (400*e1), (int) (41*e2));
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnAjouter = new JButton("AJOUTER");
		btnAjouter.setBounds((int) (1287*e1), (int) (695*e2), (int) (139*e1), (int) (42*e2));
		panel.add(btnAjouter);
		
		JLabel lblTrimestre = new JLabel("Trimestre: ");
		lblTrimestre.setForeground(new Color(255, 255, 255));
		lblTrimestre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrimestre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTrimestre.setBounds((int) (351*e1), (int) (190*e2), (int) (216*e1), (int) (55*e2));
		panel.add(lblTrimestre);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Trimestre 1", "Trimestre 2", "Trimestre 3"}));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_2.setBounds((int) (628*e1), (int) (191*e2), (int) (765*e1), (int) (53*e2));
		panel.add(comboBox_2);
		init.ecrire(Constantes.current_trim, "Trimestre 1");	
		 
		comboBox_2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				init.ecrire(Constantes.current_trim, arg0.getItem().toString());	
				 
			}
			
		});
		
		btnAjouter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s=textField.getText().toString().trim().replaceAll("'", "\"");
				if(s.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Préciser le numéro de la classe");
				}else if(total_classe.toLowerCase().contains(classe+" "+s.toLowerCase())){
					init.Alerter("Cette classe existe déjà dans votre système de cette année là...");
				}else{
					if(init.msgIsShow("Voulez-vous vraiment ajouter "+classe+" "+s, "Confirmer")) {
						add_classe(classe+" "+s+"\r\n", comboBox);
						textField.setText("");
					} 
				}
				
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
	
		lblHome.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

				WelcomePage inscription= new WelcomePage();
				inscription.frmEducsoftWelcome.setVisible(true); //.demarre();
				frmEducsoftWelcome.setVisible(false);
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
		
		label_3.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Gestion_Perso inscription= new Gestion_Perso();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label_3.setBackground(new Color(65, 105, 225));
				label_3.setForeground(new Color(255, 255, 255));
				label_3.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label_3.setForeground(Color.WHITE);
				label_3.setBackground(null);

				label_3.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				label_3.setBackground(null);
				label_3.setForeground(new Color(255, 255, 255));
				label_3.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				label_3.setForeground(Color.WHITE);
				label_3.setBackground(null);

				label_3.setOpaque(false);
			}
			 
			
		});
		label_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Cartes_scolaires inscription= new Cartes_scolaires();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label_1.setBackground(new Color(65, 105, 225));
				label_1.setForeground(new Color(255, 255, 255));
				label_1.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label_1.setForeground(Color.WHITE);

				label_1.setBackground(null);
				label_1.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				label_1.setBackground(null);
				label_1.setForeground(new Color(255, 255, 255));
				label_1.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				label_1.setForeground(Color.WHITE);

				label_1.setBackground(null);
				label_1.setOpaque(false);
			}
			 
			
		});
		label_2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Calendrier inscription= new Calendrier();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label_2.setBackground(new Color(65, 105, 225));
				label_2.setForeground(new Color(255, 255, 255));
				label_2.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label_2.setForeground(Color.WHITE);
				label_2.setBackground(null);
				label_2.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				label_2.setBackground(null);
				label_2.setForeground(new Color(255, 255, 255));
				label_2.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				label_2.setForeground(Color.WHITE);
				label_2.setBackground(null);
				label_2.setOpaque(false);
			}
			 
			
		});
		label.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Stat_general inscription= new Stat_general();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label.setBackground(new Color(65, 105, 225));
				label.setForeground(new Color(255, 255, 255));
				label.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label.setForeground(Color.WHITE);

				label.setBackground(null);
				label.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				label.setBackground(null);
				label.setForeground(new Color(255, 255, 255));
				label.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label.setForeground(Color.WHITE);

				label.setBackground(null);
				label.setOpaque(false);
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
	
	
	
	private void add_classe(String t, JComboBox comboBox) {
		String part1= init.lire_le_fichier(fichier2);
		int last_year= Integer.parseInt(part1.substring(part1.indexOf('-')+1));
		String info_psdo=init.lire_le_fichier(fichier1);
		String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		String sql= "UPDATE `annees` SET `autre`='"+(t+total_classe)+"' WHERE id_ecole='"+id_ecol+"' and annees='"+last_year+"'";
		if(init.update_(sql, "annees", "", "")==0) {
			init.Alerter("Classe insérée avec succès !");
			first_trait(comboBox);
			
		}
		
	}
	
	
	
	private void first_trait(JComboBox comboBox) {
		
		String part1= init.lire_le_fichier(fichier2);
		if(part1.equals("")) {
			
		}else {
			String autre="";
			int last_year= Integer.parseInt(part1.substring(part1.indexOf('-')+1));
			String info_psdo=init.lire_le_fichier(fichier1);
			String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
			String create="CREATE TABLE annees(id_ecole VARCHAR(255),annees int(40),autre TEXT)";
			
			JSONArray infos =init.getAnnees("annees","id_ecole='"+id_ecol+"' and annees='"+last_year+"'", create);
			if(infos==null) {
				return;
			}
			for(int i=0;i<infos.length(); i++) {
				if(i!=infos.length()-1)
					continue;
				JSONObject rs;
				try {
					rs = infos.getJSONObject(i);
					autre= rs.getString("autre"); 
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			total_classe=autre;
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
			
			
			
		}
	}
}
