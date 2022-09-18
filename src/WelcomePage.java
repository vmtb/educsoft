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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Cursor;
import javax.swing.JScrollPane;

public class WelcomePage {

	JFrame frmEducsoftWelcome;
	private Initialize init= new Initialize();
	private String fichier1= Constantes.fichier_key;
	private String [] year;
	private int last_year=2019;



	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
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
					WelcomePage window = new WelcomePage();
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
	public WelcomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEducsoftWelcome = new JFrame();
	//	frmEducsoftWelcome.setResizable(false);
		frmEducsoftWelcome.setTitle("Educsoft - Welcome");
		//frmEducsoftWelcome.setBounds(0, 0, 1200, 870); 
		frmEducsoftWelcome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEducsoftWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEducsoftWelcome.getContentPane().setLayout(null);
		frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		JPanel panel = new JPanel(); 
		//panel.setPreferredSize(new Dimension(157, 853));
		//panel.setMinimumSize(new Dimension(1600, 853));
		panel.setBackground(SystemColor.text);
		panel.setLayout(null);
 
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setBounds(0, 0, 1571, 853);
		
		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		float ech1= ((float)dim.getWidth()/1571); float ech2=(float) dim.getHeight()/853;
		System.out.println(ech1+" ** "+ech2);
		 
		scrollPane.setBounds(0, 0,(int) (1571*ech1)+1, (int)(853*ech2));
		scrollPane.setAutoscrolls(true);
		
		frmEducsoftWelcome.getContentPane().add(scrollPane);
		
		//scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
 
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/Embleme_benin.jpg")));
		lblNewLabel_2.setBounds((int) (1447*ech1), 0,(int) (93*ech1),(int) ( 72*ech2));
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 139));
		panel_1.setBounds(0,(int) ( 78*ech2), (int) (1540*ech1),(int) ( 10*ech2));
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(100, 149, 237));
		panel_2.setBounds(0,(int) ( 87*ech2),(int) ( 456*ech1), (int) (684*ech2));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds((int) (158*ech1), (int) (10*ech2), (int) (130*ech1),(int) ( 163*ech2));
		panel_2.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon(this.getClass().getResource("/LOGO par defaut.png")));
		
		JLabel lblCollgeCatholiqueSt = new JLabel("ECOLE");
		lblCollgeCatholiqueSt.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCollgeCatholiqueSt.setHorizontalAlignment(SwingConstants.CENTER);
		lblCollgeCatholiqueSt.setFont(new Font("Sitka Text", Font.BOLD, 26));
		lblCollgeCatholiqueSt.setBounds((int) (10*ech1), (int) (167*ech2),(int) ( 436*ech1),(int) ( 82*ech2));
		panel_2.add(lblCollgeCatholiqueSt);
		
		JLabel lblBohicon = new JLabel("XXXXXX");
		lblBohicon.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBohicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblBohicon.setFont(new Font("Sitka Text", Font.BOLD, 26));
		lblBohicon.setBounds(10, 219,(int) ( 436*ech1),(int) ( 77*ech2));
		panel_2.add(lblBohicon);
		
		JLabel lblContact = new JLabel("Contact: +229 XXXXXXX");
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContact.setForeground(Color.DARK_GRAY);
		lblContact.setBounds((int) (20*ech1), (int) (307*ech2), (int) (329*ech1),(int) ( 33*ech2));
		panel_2.add(lblContact);
		
		JLabel lblEmailMarcosvitouleygmailcom = new JLabel("Email: @gmail.com");
		lblEmailMarcosvitouleygmailcom.setForeground(Color.DARK_GRAY);
		lblEmailMarcosvitouleygmailcom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmailMarcosvitouleygmailcom.setBounds((int) (20*ech1), (int) (369*ech2), (int) (329*ech1),(int) ( 33*ech2));
		panel_2.add(lblEmailMarcosvitouleygmailcom);
		
		JButton panel_4 = new JButton();
		panel_4.setBounds(0, (int) (428*ech2), (int) (456*ech1),(int) ( 222*ech2));
		panel_2.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblAnneScolaire = new JLabel("Ann\u00E9e scolaire:");
		lblAnneScolaire.setFont(new Font("Verdana", Font.BOLD, 20));
		lblAnneScolaire.setBounds((int)(544*ech1), (int)(75*ech2), (int) (227*ech1),(int) ( 57*ech2));
		panel.add(lblAnneScolaire);
		
		JLabel lblDirection = new JLabel("DIRECTION");
		lblDirection.setBounds(0, 0,(int) ( 436*ech1), (int) (82*ech2));
		panel_4.add(lblDirection);
		lblDirection.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDirection.setHorizontalAlignment(SwingConstants.CENTER);
		lblDirection.setFont(new Font("Sitka Text", Font.BOLD, 26));
		
		JLabel lblDirMarcosThyrbus = new JLabel("Dir ");
		lblDirMarcosThyrbus.setBounds((int) (25*ech1), (int) (75*ech2), (int) (329*ech1),(int) ( 33*ech2));
		panel_4.add(lblDirMarcosThyrbus);
		lblDirMarcosThyrbus.setForeground(Color.DARK_GRAY);
		lblDirMarcosThyrbus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel label = new JLabel("+229  ");
		label.setBounds((int) (25*ech1), (int) (135*ech2), (int) (329*ech1),(int) ( 33*ech2));
		panel_4.add(label);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(100, 149, 237));
		panel_3.setBounds((int) (1084*ech1), (int) (87*ech2), (int) (454*ech1),(int) ( 689*ech2));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("PARAMETRAGE CLASSE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(init.lire_le_fichier("annees.txt").equals("")) {
					init.Alerter("Aucune année scolaire n'existe dans votre système");
				}else {
					if(init.msgIsShow("Allez à Paramétrage classe de "+init.lire_le_fichier("annees.txt"), "EducSoft")) {
						Menu_classes inscription= new Menu_classes();
						inscription.frmEducsoftWelcome.setVisible(true);
						frmEducsoftWelcome.setVisible(false);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(0, (int) (59*ech2), (int) (454*ech1), (int) (67*ech2));
		panel_3.add(btnNewButton);
		
		JButton btnStatistiques = new JButton("ATTRIBUTIONS DES CODES PARENTS");
		btnStatistiques.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Codes_Parents cp=new Codes_Parents();
				cp.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
				
			}
		});
		btnStatistiques.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnStatistiques.setBounds(0, (int) (202*ech2), (int) (454*ech1), (int) (67*ech2));
		panel_3.add(btnStatistiques);
		
		JButton btnCartesScolaires = new JButton("CHANGER INFOS DIRECTION");
		btnCartesScolaires.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changer_dir mat= new Changer_dir();
				mat.frmEducsoftParamtrage.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
			}
		});
		btnCartesScolaires.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCartesScolaires.setBounds(0, (int) (339*ech2),(int) ( 454*ech1),(int) ( 67*ech2));
		panel_3.add(btnCartesScolaires);
		
		JButton btnCalendrierScolaire = new JButton("AJOUTER D'AUTRES MATIERES");
		btnCalendrierScolaire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modifier_matiere mat= new Modifier_matiere();
				mat.frmEducsoftParamtrage.setVisible(true);
			}
		});
		btnCalendrierScolaire.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCalendrierScolaire.setBounds(0, (int) (469*ech2), (int) (454*ech1),(int) ( 67*ech2));
		panel_3.add(btnCalendrierScolaire);
		
		JButton btnSgpp = new JButton("DECONNEXION");
		btnSgpp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
				String psdo= info_psdo.substring(info_psdo.indexOf('\t')+1);
			
				if(init.msgIsShow("Voulez-vous vraiment vous déconnecter ? \n[Rappelez-vous de votre ID (pseudo) pour vous connecter à nouveau: \nPseudo: "+psdo+" ]", "Déconnection")) {
					init.ecrire(Constantes.fichier_key, "");
					init.ecrire(Constantes.fichier_ann, "");
					init.ecrire(Constantes.current_trim, "");
					init.ecrire(Constantes.current_classe, "");
					init.ecrire(Constantes.ecole_name, "");
					init.ecrire("info_gene_es.txt", "");
					init.ecrire(Constantes.fichier_pseudo, "");
					Login inscription= new Login();
					inscription.frmEducsoft.setVisible(true);
					frmEducsoftWelcome.setVisible(false);
					frmEducsoftWelcome.dispose();
					
				}
			}
		});
		btnSgpp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSgpp.setBounds(0, (int) (597*ech2), (int) (454*ech1), (int) (67*ech2));
		panel_3.add(btnSgpp);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(this.getClass().getResource("/Carte benin.png")));
		lblNewLabel_3.setBounds(0, 0,(int) (91*ech1), (int) (79*ech2));
		panel.add(lblNewLabel_3);

		JComboBox comboBox = new JComboBox();
		remplir_annee(comboBox);
		comboBox.setBounds((int)(747*ech1), (int)(93*ech2),(int) ( 192*ech1), (int) (21*ech2));
		panel.add(comboBox);
		

		JLabel lblNewLabel_5 = new JLabel("Educsoft, syst\u00E8me de gestion scolaire");
		lblNewLabel_5.setForeground(new Color(0, 0, 205));
		lblNewLabel_5.setFont(new Font("Vivaldi", Font.BOLD, 70));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds((int) (173*ech1), 0,(int) ( 1253*ech1),(int) ( 77*ech2));
		panel.add(lblNewLabel_5);

		JButton btnNewButton_1 = new JButton("Ajouter nouvelle ann\u00E9e scolaire");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		btnNewButton_1.setBounds((int) (857*ech1), (int) (774*ech2),(int) ( 227*ech1), (int) (30*ech2));
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_4 = new JLabel("");

		lblNewLabel_4.setBounds((int) (456*ech1), (int) (105*ech2),(int) ( 634*ech1), (int) (710*ech2));
		lblNewLabel_4.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("/pere-son-eleve-garcon-sac-dos-uniforme_24640-45308.jpg")).getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight()-comboBox.getHeight()-1, Image.SCALE_SMOOTH))));
		panel.add(lblNewLabel_4);
		panel_3.setBounds((int) lblNewLabel_4.getX()+lblNewLabel_4.getWidth(), (int) (87*ech2), (int) (454*ech1),(int) ( 689*ech2));
		
		
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane op= new JOptionPane();
				int option=op.showConfirmDialog(null, "Voulez-vous vraiment completer l'année scolaire suivante ? ("+(last_year+1)+")", 
						"Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if(option != JOptionPane.NO_OPTION && option !=
						JOptionPane.CANCEL_OPTION && option != JOptionPane.CLOSED_OPTION) {
					add(comboBox);
				}
			}
			
		});
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 139));
		panel_5.setBounds(0, (int) (805*ech2),(int) ( 1540*ech1),(int) ( 10*ech2));
		panel.add(panel_5);
		
		JLabel lblNewLabel = new JLabel("Copyright 2019 VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblNewLabel.setBounds(0, (int) (817*ech2), (int) (286*ech1),(int) ( 13*ech2));
		panel.add(lblNewLabel);
		
		remplir(lblCollgeCatholiqueSt, lblBohicon, lblContact, lblEmailMarcosvitouleygmailcom, lblDirMarcosThyrbus, label);
		
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				init.ecrire("annees.txt", comboBox.getSelectedItem().toString());
				Menu_classes inscription= new Menu_classes();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);;
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
					l.setText(lieu);
					ce.setText("Contact: "+contact_ecole);
					ee.setText("Email: "+email_ecole);
					dn.setText("Dir "+dir_name);
					dc.setText(dir_contact);
					
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			
		}
	}
	
	private void add(JComboBox combo) {
		String classes_default= "6ème M1\r\n" + 
				"6ème M2\r\n" + 
				"6ème M3\r\n" + 
				"6ème M4\r\n" + 
				"6ème M5\r\n" + 
				"5ème M1\r\n" + 
				"5ème M2\r\n" + 
				"5ème M3\r\n" + 
				"5ème M4\r\n" + 
				"5ème M5\r\n" + 
				"4ème M1\r\n" + 
				"4ème M2\r\n" + 
				"4ème M3\r\n" + 
				"4ème M4\r\n" + 
				"4ème M5\r\n" + 
				"3ème M1\r\n" + 
				"3ème M2\r\n" + 
				"3ème M3\r\n" + 
				"3ème M4\r\n" + 
				"3ème M5\r\n" + 
				"2nde A1\r\n" + 
				"2nde A2\r\n" + 
				"2nde B\r\n" + 
				"2nde C\r\n" + 
				"2nde D1\r\n" + 
				"2nde D2\r\n" + 
				"2nde E\r\n" + 
				"2nde EA\r\n" + 
				"2nde G1\r\n" + 
				"2nde G2\r\n" + 
				"2nde G3\r\n" + 
				"2nde F1\r\n" + 
				"2nde F2\r\n" + 
				"2nde F3\r\n" + 
				"1ère A1\r\n" + 
				"1ère A2\r\n" + 
				"1ère B\r\n" + 
				"1ère C\r\n" + 
				"1ère D1\r\n" + 
				"1ère D2\r\n" + 
				"1ère E\r\n" + 
				"1ère EA\r\n" + 
				"1ère G1\r\n" + 
				"1ère G2\r\n" + 
				"1ère G3\r\n" + 
				"1ère F1\r\n" + 
				"1ère F2\r\n" + 
				"1ère F3\r\n" + 
				"Tle A1\r\n" + 
				"Tle A2\r\n" + 
				"Tle B\r\n" + 
				"Tle C\r\n" + 
				"Tle D1\r\n" + 
				"Tle D2\r\n" + 
				"Tle E\r\n" + 
				"Tle EA\r\n" + 
				"Tle F1\r\n" + 
				"Tle F2\r\n" + 
				"Tle F3\r\n" + 
				"Tle G1\r\n" + 
				"Tle G2\r\n" + 
				"Tle G3";
		String info_psdo=init.lire_le_fichier(fichier1);
		String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		String sql= "INSERT INTO `annees`(`id_ecole`, `annees`, `autre`) VALUES ('"+id_ecol+"','"+(last_year+1)+"','"+classes_default+"')";
		String create="CREATE TABLE annees(id_ecole VARCHAR(255),annees int(40),autre TEXT)";
		
		if(init.inserer_(sql, "annees", create, "id_ecole", "Année ajoutée avec succès !", "Echec de l'ajout")==0) {
			remplir_annee( combo);
		}
	}
	

	public void remplir_annee(JComboBox combo) {
	 	String info_psdo=init.lire_le_fichier(fichier1);
		String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t')); 
		List<String> tab=new ArrayList(40);
		int nbre=0;
			
		String s= init.recup_annees("id_ecole='"+id_ecol+"'");
		  
		int compt=0;
		 
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
			last_year= Integer.parseInt(part1.substring(part1.indexOf('-')+1));
			
		}
		
		
		if(compt!=0) {
			combo.setModel(new DefaultComboBoxModel(year));
		}
		
	}
}
