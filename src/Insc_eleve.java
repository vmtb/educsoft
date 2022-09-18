import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;

import javafx.scene.image.ImageView;
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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
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
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Insc_eleve {

	private Initialize init=new Initialize();
	JFrame frmEducsoftWelcome;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JComboBox comboBox_2 ,comboBox_4,comboBox_3,comboBox_5;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JLabel label_2;
	private String path= "";	
	private String nom, prenom, date_de_nai, lieu_de_nai, matricule, g_sang="Inconnu", electr="Inconnu", sexe="M", cont_urgence="ras";
	private String nom_parent, prenom_parent, Profession= "ras", contact_mob="", contact_dom="ras", contact_trav="ras", adresse_ville="ras", arrond="ras", qtier="ras";

	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insc_eleve window = new Insc_eleve();
					window.frmEducsoftWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void main(String []  args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insc_eleve window = new Insc_eleve();
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
	public Insc_eleve() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private float e1, e2;
	private void initialize() {
		frmEducsoftWelcome = new JFrame();
		//frmEducsoftWelcome.setResizable(false);
		frmEducsoftWelcome.setTitle("Educsoft - "+init.lire_le_fichier(Constantes.ecole_name)+" - INSCRIPTION EN "+init.lire_le_fichier(Constantes.current_classe));
		frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		e1= ((float)dim.getWidth()/1571);  e2=(float) dim.getHeight()/863;
		
		frmEducsoftWelcome.setBounds(0, 0, (int)(101101*e1), (int)(870*e2));
		frmEducsoftWelcome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEducsoftWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEducsoftWelcome.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel(); 
		panel.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0,(int)(1571*e1), (int)(863*e2));
		frmEducsoftWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel lblNewLabel_4 = new JPanel();
		lblNewLabel_4.setBackground(Color.BLUE);
		lblNewLabel_4.setBounds((int)(218*e1), (int)(131*e2), (int)(8*e1), (int)(800*e2));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/Embleme_benin.jpg")));
		lblNewLabel_2.setBounds((int)(1447*e1), 0, (int)(93*e1), (int)(72*e2));
		panel.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(SystemColor.textHighlight);
		panel_2.setBackground(new Color(30, 144, 255));
		panel_2.setBounds(0, (int)(78*e1)+2, (int)(214*e1), (int)(736*e2));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblParamtrageClasse = new JLabel("  Bordereau de note");
		lblParamtrageClasse.setOpaque(true);
		lblParamtrageClasse.setBackground(new Color(30, 144, 255));
		lblParamtrageClasse.setForeground(Color.WHITE);
		lblParamtrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblParamtrageClasse.setBounds(0, (int)(78*e2), (int)(321*e1), (int)(86*e2));
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		
		JLabel lblInscrireUnlve = new JLabel("  Inscrire un \u00E9l\u00E8ve");
		lblInscrireUnlve.setBackground(Color.WHITE);
		lblInscrireUnlve.setForeground(Color.BLACK);
		lblInscrireUnlve.setOpaque(true);
		//label_3.setIcon(new ImageIcon(gp_icon));
		lblInscrireUnlve.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInscrireUnlve.setBounds(0, (int)(578*e2), (int)(214*e1), (int)(97*e2));
		panel_2.add(lblInscrireUnlve);
		//lblParamtrageClasse.setIcon(new ImageIcon(par_icon));
		panel_2.add(lblParamtrageClasse);
		
		JLabel lblInsrerUneNote = new JLabel("  Ins\u00E9rer une note");
		lblInsrerUneNote.setForeground(Color.WHITE);
		Image st_icon= new ImageIcon(this.getClass().getResource("/Icon 3 St.png")).getImage();
		//label.setIcon(new ImageIcon(st_icon));
		lblInsrerUneNote.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInsrerUneNote.setBounds(0, (int)(174*e2), (int)(331*e1), (int)(95*e2));
		panel_2.add(lblInsrerUneNote);
		
		JLabel lblBulletinsDeLa = new JLabel("  Bulletins de la classe");
		lblBulletinsDeLa.setForeground(Color.WHITE);
		Image cs_icon= new ImageIcon(this.getClass().getResource("/Icon 1.png")).getImage();
		//label_1.setIcon(new ImageIcon(cs_icon));
		lblBulletinsDeLa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBulletinsDeLa.setBounds(0, (int)(279*e2), (int)(204*e1), (int)(79*e2));
		panel_2.add(lblBulletinsDeLa);
		
		JLabel lblDisciplinesDeLa = new JLabel("  Disciplines de la classe");
		lblDisciplinesDeLa.setForeground(Color.WHITE);
		Image ca_icon= new ImageIcon(this.getClass().getResource("/Icon 2.png")).getImage();
		//label_2.setIcon(new ImageIcon(ca_icon));
		lblDisciplinesDeLa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDisciplinesDeLa.setBounds(0, (int)(471*e2), (int)(204*e1), (int)(97*e2));
		panel_2.add(lblDisciplinesDeLa);
		Image gp_icon= new ImageIcon(this.getClass().getResource("/Icon 5 Sgpp.png")).getImage();
		
		JLabel lblStatistiques = new JLabel("  Statistiques");
		lblStatistiques.setForeground(Color.WHITE);
		lblStatistiques.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStatistiques.setBounds(0, (int)(364*e2), (int)(331*e1), (int)(97*e2));
		panel_2.add(lblStatistiques);
		
		JPanel panel_1 = new JPanel();//new Color(0, 0, 139)
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(0, (int)(78*e2), (int)(1540*e1), (int)(10*e2));
		panel.add(panel_1);
		
		 
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(this.getClass().getResource("/Carte benin.png")));
		lblNewLabel_3.setBounds(0, 0, (int)(91*e1), (int)(79*e2));
		panel.add(lblNewLabel_3);
		 
		
		JLabel lblNewLabel_5 = new JLabel("Coll\u00E8ge catholique Saint Fran\u00E7ois d'Assise");
		lblNewLabel_5.setBackground(Color.BLUE);
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Berlin Sans FB", Font.BOLD, 70));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds((int)(173*e1), 0, (int)(1253*e1), (int)(77*e2));
		panel.add(lblNewLabel_5);

		if(init.lire_le_fichier(Constantes.ecole_name).equals("")) {
			init.remplir(lblNewLabel_5, null, null, null, null, null); 
		}else {
			lblNewLabel_5.setText(init.lire_le_fichier(Constantes.ecole_name)); 
		}

		JPanel panel_10 = new JPanel();
		panel_10.setBounds((int)(dim.getWidth()-36), 0, (int)(36*e1), 2000);
		panel_10.setBackground(new Color(30, 144, 255));
		panel.add(panel_10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(30, 144, 255));
		panel_3.setBounds((int)(183*e1), (int)(82*e2), (int)(1357*e1), (int)(48*e1));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		//Image home_icon= new ImageIcon(this.getClass().getResource("/Home.png")).getImage();
		JLabel lblHome = new JLabel("Accueil  >   ");
		//lblHome.setIcon(new ImageIcon(home_icon));
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setBounds((int)(58*e1), (int)(10*e2), (int)(128*e1), (int)(33*e2));
		panel_3.add(lblHome);
		
		JLabel lblAide = new JLabel("Aide ?");
		lblAide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAide.setForeground(new Color(255, 255, 255));
		lblAide.setBounds((int)(1270*e1), (int)(13*e2), (int)(77*e1), (int)(27*e2));
		panel_3.add(lblAide);
		
		JLabel lblParametrageClasse = new JLabel("PARAMETRAGE CLASSE      >         "+init.lire_le_fichier(Constantes.current_classe));
		lblParametrageClasse.setBounds((int)(196*e1), (int)(14*e2), (int)(597*e1), (int)(25*e2));
		panel_3.add(lblParametrageClasse);
		lblParametrageClasse.setForeground(Color.WHITE);
		lblParametrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		
		JLabel lblNewLabel = new JLabel("Copyright 2019 VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds((int)(1220*e1), (int)(813*e2), (int)(299*e1), (int)(13*e1));
		panel.add(lblNewLabel);
		
		JLabel lblFormulaireDinscription = new JLabel("FORMULAIRE D'INSCRIPTION ");
		lblFormulaireDinscription.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFormulaireDinscription.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFormulaireDinscription.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormulaireDinscription.setBounds((int)(576*e1), (int)(140*e2), (int)(662*e1), (int)(35*e2));
		panel.add(lblFormulaireDinscription);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RECHERCHER UN ELEVE A TRANSFERER EN "+init.lire_le_fichier(Constantes.current_classe), TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panel_4.setBounds((int)(236*e1), (int)(172*e2), (int)(326*e1), (int)(160*e2));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblClasse = new JLabel("Classe:");
		lblClasse.setBounds((int)(10*e1), (int)(66*e2), (int)(77*e1), (int)(13*e2));
		panel_4.add(lblClasse);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"6\u00E8me M1", "6\u00E8me M2", "6\u00E8me M3", "6\u00E8me M4", "6\u00E8me M5", "5\u00E8me M1", "5\u00E8me M2", "5\u00E8me M3", "5\u00E8me M4", "5\u00E8me M5", "4\u00E8me M1", "4\u00E8me M2", "4\u00E8me M3", "4\u00E8me M4", "4\u00E8me M5", "3\u00E8me M1", "3\u00E8me M2", "3\u00E8me M3", "3\u00E8me M4", "3\u00E8me M5", "2nde A1", "2nde A2", "2nde B", "2nde C", "2nde D1", "2nde D2", "2nde E", "2nde EA", "2nde G1", "2nde G2", "2nde G3", "2nde F1", "2nde F2", "2nde F3", "1\u00E8re A1", "1\u00E8re A2", "1\u00E8re B", "1\u00E8re C", "1\u00E8re D1", "1\u00E8re D2", "1\u00E8re E", "1\u00E8re EA", "1\u00E8re G1", "1\u00E8re G2", "1\u00E8re G3", "1\u00E8re F1", "1\u00E8re F2", "1\u00E8re F3", "Tle A1", "Tle A2", "Tle B", "Tle C", "Tle D1", "Tle D2", "Tle E", "Tle EA", "Tle F1", "Tle F2", "Tle F3", "Tle G1", "Tle G2", "Tle G3"}));
		comboBox.setBounds((int)(77*e1), (int)(62*e2), (int)(212*e1), (int)(21*e2));
		panel_4.add(comboBox);
		
		JLabel lblAnne = new JLabel("Ann\u00E9e:");
		lblAnne.setBounds((int)(10*e1), (int)(25*e2), (int)(77*e1), (int)(13*e2));
		panel_4.add(lblAnne);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2020", "2019"}));
		comboBox_1.setBounds((int)(77*e1), (int)(21*e2), (int)(212*e1),(int)( 21*e2));
		panel_4.add(comboBox_1);
		
	   comboBox_2 = new JComboBox();
	
		comboBox_2.setBounds((int)(32*e1), (int)(118*e2), (int)(273*e1), (int)(21*e2));
		panel_4.add(comboBox_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "INFORMATIONS PERSONNELLES", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_5.setBounds((int)(236*e1), (int)(342*e2), (int)(1283*e1), (int)(170*e2));
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("*Nom:");
		lblNewLabel_1.setBounds((int)(26*e1), (int)(26*e2), (int)(45*e1), (int)(13*e2));
		panel_5.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds((int)(81*e1), (int)(23*e2), (int)(237*e1), (int)(19*e2));
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrnom = new JLabel("*Pr\u00E9noms:");
		lblPrnom.setToolTipText("Pr\u00E9noms");
		lblPrnom.setBounds((int)(26*e1), (int)(77*e2), (int)(45*e1), (int)(13*e2));
		panel_5.add(lblPrnom);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds((int)(81*e1), (int)(74*e2), (int)(237*e1), (int)(19*e2));
		panel_5.add(textField_2);
		
		JLabel lblSexe = new JLabel("*Sexe:");
		lblSexe.setBounds((int)(26*e1), (int)(130*e2), (int)(45*e1), (int)(13*e2));
		panel_5.add(lblSexe);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Masculin", "F\u00E9minin"}));
		comboBox_3.setBounds((int)(81*e1), (int)(126*e2), (int)(237*e1), (int)(21*e2));
		panel_5.add(comboBox_3);
		
		
		comboBox_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text=comboBox_3.getSelectedItem().toString();
				if(text.equals("Masculin"))
					sexe="M";
				else
					sexe="F";
						
			}
			
		});
		
		JLabel lblDateDeNaissance = new JLabel("*Date de naissance (JJ/MM/AAAA):");
		lblDateDeNaissance.setBounds((int)(402*e1), (int)(26*e2), (int)(176*e1), (int)(13*e2));
		panel_5.add(lblDateDeNaissance);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds((int)(582*e1), (int)(23*e2), (int)(237*e1), (int)(19*e2));
		panel_5.add(textField_3);
		
		JLabel lblLieuDeNaissance = new JLabel("*Lieu de naissance:");
		lblLieuDeNaissance.setBounds((int)(402*e1), (int)(77*e2), (int)(185*e1), (int)(13*e2));
		panel_5.add(lblLieuDeNaissance);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds((int)(582*e1), (int)(74*e2), (int)(237*e1), (int)(19*e2));
		panel_5.add(textField_4);
		
		JLabel lblNumroMatricule = new JLabel("*Num\u00E9ro matricule");
		lblNumroMatricule.setBounds((int)(402*e1), (int)(130*e2), (int)(185*e1), (int)(13*e2));
		panel_5.add(lblNumroMatricule);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds((int)(582*e1), (int)(127*e2), (int)(237*e1), (int)(19*e2));
		panel_5.add(textField_5);
		
		JLabel lblGroupeSanguin = new JLabel("*Groupe sanguin:");
		lblGroupeSanguin.setBounds((int)(913*e1), (int)(26*e2), (int)(185*e1), (int)(13*e2));
		panel_5.add(lblGroupeSanguin);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Inconnu", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		comboBox_4.setBounds((int)(1036*e1), (int)(22*e2), (int)(237*e1), (int)(21*e2));
		panel_5.add(comboBox_4);  
		
		comboBox_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				g_sang=comboBox_4.getSelectedItem().toString();
			}
			
		});
		
		
		
		JLabel lblElectrophorse = new JLabel("*Electrophor\u00E8se:");
		lblElectrophorse.setBounds((int)(913*e1), (int)(77*e2), (int)(185*e1), (int)(13*e2));
		panel_5.add(lblElectrophorse);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Inconnu", "AA", "AC", "AS", "SC", "SS"}));
		comboBox_5.setBounds((int)(1036*e1), (int)(73*e2), (int)(237*e1), (int)(21*e2));
		panel_5.add(comboBox_5);
		

		comboBox_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				electr=comboBox_5.getSelectedItem().toString();
			}
			
		});
		
		JLabel lblContactDurgence = new JLabel("Contact d'urgence:");
		lblContactDurgence.setBounds((int)(913*e1), (int)(130*e2), (int)(135*e1), (int)(13*e2));
		panel_5.add(lblContactDurgence);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds((int)(1036*e1), (int)(127*e2), (int)(237*e1), (int)(19*e2));
		panel_5.add(textField_6);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "INFORMATIONS PARENTS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds((int)(236*e1), (int)(557*e2), (int)(1283*e1), (int)(170*e2));
		panel.add(panel_6);
		
		JLabel label = new JLabel("*Nom:");
		label.setBounds((int)(26*e1), (int)(26*e2), (int)(45*e1), (int)(13*e2));
		panel_6.add(label);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds((int)(81*e1), (int)(23*e2), (int)(237*e1), (int)(19*e2));
		panel_6.add(textField_7);
		
		JLabel label_1 = new JLabel("*Pr\u00E9noms:");
		label_1.setToolTipText("Pr\u00E9noms");
		label_1.setBounds((int)(26*e1), (int)(77*e2), (int)(45*e1), (int)(13*e2));
		panel_6.add(label_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds((int)(81*e1), (int)(74*e2), (int)(237*e1), (int)(19*e2));
		panel_6.add(textField_8);
		
		JLabel lblProfession = new JLabel("Profession:");
		lblProfession.setToolTipText("Profession");
		lblProfession.setBounds((int)(26*e1), (int)(130*e2), (int)(45*e1), (int)(13*e2));
		panel_6.add(lblProfession);
		
		JLabel lblcontactMobile = new JLabel("*Contact Mobile");
		lblcontactMobile.setBounds((int)(402*e1), (int)(26*e2), (int)(185*e1), (int)(13*e2));
		panel_6.add(lblcontactMobile);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds((int)(582*e1), (int)(23*e2),(int)( 237*e1), (int)(19*e2));
		panel_6.add(textField_9);
		
		JLabel lblContactDomicile = new JLabel("Contact Domicile:");
		lblContactDomicile.setBounds((int)(402*e1), (int)(77*e2), (int)(185*e1), (int)(13*e2));
		panel_6.add(lblContactDomicile);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds((int)(582*e1), (int)(74*e2), (int)(237*e1), (int)(19*e2));
		panel_6.add(textField_10);
		
		JLabel lblContactTravail = new JLabel("Contact Travail:");
		lblContactTravail.setBounds((int)(402*e1), (int)(130*e2), (int)(185*e1), (int)(13*e2));
		panel_6.add(lblContactTravail);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds((int)(582*e1),(int)( 127*e2),(int)( 237*e1), (int)(19*e2));
		panel_6.add(textField_11);
		
		JLabel lblAdresseVille = new JLabel("Adresse ville:");
		lblAdresseVille.setBounds((int)(913*e1), (int)(26*e2), (int)(185*e1), (int)(13*e2));
		panel_6.add(lblAdresseVille);
		
		JLabel lblArrondissement = new JLabel("Arrondissement:");
		lblArrondissement.setBounds((int)(913*e1), (int)(77*e2), (int)(185*e1), (int)(13*e2));
		panel_6.add(lblArrondissement);
		
		JLabel lblQtiermaison = new JLabel("Qtier/Maison:");
		lblQtiermaison.setBounds((int)(913*e1),(int)( 130*e2), (int)(135*e1), (int)(13*e2));
		panel_6.add(lblQtiermaison);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds((int)(1036*e1), (int)(127*e2), (int)(237*e1), (int)(19*e2));
		panel_6.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds((int)(81*e1), (int)(127*e2), (int)(237*e1), (int)(19*e2));
		panel_6.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds((int)(1036*e1), (int)(74*e2), (int)(237*e1), (int)(19*e2));
		panel_6.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds((int)(1036*e1), (int)(23*e2), (int)(237*e1), (int)(19*e2));
		panel_6.add(textField_15);
		
		JLabel lblNbLesChamps = new JLabel("NB: Les champs marqu\u00E9 '*' sont obligatoires !");
		lblNbLesChamps.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNbLesChamps.setForeground(Color.RED);
		lblNbLesChamps.setBounds((int)(346*e1), (int)(759*e2), (int)(388*e1), (int)(13*e2));
		panel.add(lblNbLesChamps);
		
		JButton btnSuivant = new JButton("Suivant \u263B");
		btnSuivant.setBounds((int)(1153*e1), (int)(755*e2), (int)(366*e1), (int)(21*e2));
		panel.add(btnSuivant);
		
		btnSuivant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!textField_10.getText().trim().isEmpty())
					contact_dom=textField_10.getText().trim().replaceAll("'", "\"");
				if(!textField_11.getText().trim().isEmpty())
					contact_trav=textField_11.getText().trim().replaceAll("'", "\"");
				if(!textField_12.getText().trim().isEmpty())
					qtier=textField_12.getText().toString().trim().replaceAll("'", "\"");
				if(!textField_13.getText().trim().isEmpty())
					Profession=textField_13.getText().trim().replaceAll("'", "\"");
				if(!textField_14.getText().trim().isEmpty())
					arrond=textField_14.getText().toString().trim().replaceAll("'", "\"");
				if(!textField_15.getText().trim().isEmpty())
					adresse_ville=textField_15.getText().toString().trim().replaceAll("'", "\"");
				if(!textField_6.getText().trim().isEmpty())
					cont_urgence=textField_6.getText().toString().trim().replaceAll("'", "\"");
				
				if(textField_1.getText().trim().isEmpty())
					init.Alerter("Le nom de l'élève ne doit pas être vide !");
				else if(textField_2.getText().trim().isEmpty())
					init.Alerter("Le prénom de l'élève ne doit pas être vide !");
				else if(textField_3.getText().trim().isEmpty())
					init.Alerter("La date de naissance de l'élève ne doit pas être vide !");
				else if(textField_4.getText().trim().isEmpty())
					init.Alerter("Le lieu de naissance de l'élève ne doit pas être vide !");
				else if(textField_5.getText().trim().isEmpty())
					init.Alerter("Le numéro matricule de l'élève ne doit pas être vide !"); 
				else if(textField_7.getText().trim().isEmpty())
					init.Alerter("Le nom du parent ne doit pas être vide !");
				else if(textField_8.getText().trim().isEmpty())
					init.Alerter("Le prénom du parent ne doit pas être vide !");
				else if(textField_9.getText().trim().isEmpty())
					init.Alerter("Le contact mobile du parent ne doit pas être vide !");
				else {
					nom=textField_1.getText().toString().trim().replaceAll("'", "\""); prenom=textField_2.getText().toString().trim().replaceAll("'", "\"");
					date_de_nai=textField_3.getText().toString().trim().replaceAll("'", "\""); lieu_de_nai=textField_4.getText().toString().trim().replaceAll("'", "\"");
					matricule=textField_5.getText().toString().trim().replaceAll("'", "\"");nom_parent=textField_7.getText().toString().trim().replaceAll("'", "\"");
					prenom_parent=textField_8.getText().toString().trim().replaceAll("'", "\"");  contact_mob=textField_9.getText().toString().trim().replaceAll("'", "\"");
					inscrire_eleve(init.lire_le_fichier(Constantes.fichier_ann), init.lire_le_fichier(Constantes.current_classe),comboBox_1,comboBox);
				}
			}
			
		});


		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
	

		remplir_annee(comboBox_1,comboBox);  
		
		JLabel lblAnneScolaireCourante = new JLabel("Ann\u00E9e scolaire courante:  "+init.lire_le_fichier(Constantes.fichier_ann));
		lblAnneScolaireCourante.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnneScolaireCourante.setForeground(Color.RED);
		lblAnneScolaireCourante.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
		lblAnneScolaireCourante.setBounds((int)(576*e1), (int)(214*e2), (int)(662*e1), (int)(48*e2));
		panel.add(lblAnneScolaireCourante);
		
		label_2 = new JLabel(" ");
		label_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_2.setBounds((int)(1248*e1), (int)(172*e2), (int)(133*e1), (int)(130*e2));
		panel.add(label_2);
		
		JLabel lblCutilisateur = new JLabel("C://Utilisateur/....");
		lblCutilisateur.setBounds((int)(1153*e1), (int)(320*e2), (int)(192*e1), (int)(13*e2));
		panel.add(lblCutilisateur);
		JButton btnLogo = new JButton("Photo");
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser filechooser=new JFileChooser();
				filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				filechooser.addChoosableFileFilter(new FileNameExtensionFilter("*.IMAGE", "*.jpg", "*.png"));
				int result= filechooser.showSaveDialog(null);
				if(result== JFileChooser.APPROVE_OPTION) {
					File selectedFile= filechooser.getSelectedFile();
					path= selectedFile.getAbsolutePath();
					lblCutilisateur.setText(path);
					ImageIcon img=new ImageIcon(path);
					Image image= img.getImage();
					Image image2=image.getScaledInstance(label_2.getWidth()	, label_2.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon icon= new ImageIcon(image2);
					label_2.setIcon(icon);
				}else if (result==JFileChooser.CANCEL_OPTION) {
					System.out.println("Annulé !");
				}
			}
		});
		btnLogo.setBounds((int)(1365*e1), (int)(316*e2), (int)(85*e1), (int)(21*e2));
		panel.add(btnLogo);
		

		
		lblInsrerUneNote.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Inserer_note inscription= new Inserer_note();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblInsrerUneNote.setBackground(Color.WHITE);
				lblInsrerUneNote.setForeground(Color.BLACK);
				lblInsrerUneNote.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblInsrerUneNote.setBackground(Color.BLUE);
				lblInsrerUneNote.setForeground(Color.WHITE);

				lblInsrerUneNote.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				lblInsrerUneNote.setBackground(Color.WHITE);
				lblInsrerUneNote.setForeground(Color.BLACK);

				lblInsrerUneNote.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
			 
			
		});
	
		
		lblParamtrageClasse.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Classes inscription= new Classes();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblParamtrageClasse.setBackground(Color.WHITE);
				lblParamtrageClasse.setForeground(Color.BLACK);
				lblParamtrageClasse.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblParamtrageClasse.setBackground(Color.BLUE);
				lblParamtrageClasse.setForeground(Color.WHITE);

				lblParamtrageClasse.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				lblParamtrageClasse.setBackground(Color.WHITE);
				lblParamtrageClasse.setForeground(Color.BLACK);

				lblParamtrageClasse.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
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
	
		lblStatistiques.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Stat_classes inscription= new Stat_classes();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblStatistiques.setBackground(Color.WHITE);
				lblStatistiques.setForeground(Color.BLACK);
				lblStatistiques.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblStatistiques.setBackground(Color.BLUE);
				lblStatistiques.setForeground(Color.WHITE);

				lblStatistiques.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				lblStatistiques.setBackground(Color.WHITE);
				lblStatistiques.setForeground(Color.BLACK);

				lblStatistiques.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
			 
			
		});
	
		lblDisciplinesDeLa.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Matieres_classes inscription= new Matieres_classes();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblDisciplinesDeLa.setBackground(Color.WHITE);
				lblDisciplinesDeLa.setForeground(Color.BLACK);
				lblDisciplinesDeLa.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblDisciplinesDeLa.setBackground(Color.BLUE);
				lblDisciplinesDeLa.setForeground(Color.WHITE);

				lblDisciplinesDeLa.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				lblDisciplinesDeLa.setBackground(Color.WHITE);
				lblDisciplinesDeLa.setForeground(Color.BLACK);

				lblDisciplinesDeLa.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
			 
			
		});
	
		lblHome.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

				Menu_classes inscription= new Menu_classes();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblHome.setBackground(Color.WHITE);
				lblHome.setForeground(Color.BLACK);
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblHome.setBackground(Color.BLUE);
				lblHome.setForeground(Color.WHITE);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				lblHome.setBackground(Color.WHITE);
				lblHome.setForeground(Color.BLACK);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblHome.setBackground(Color.BLUE);
				lblHome.setForeground(Color.WHITE);
			}
			 
			
		});
		
		lblBulletinsDeLa.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Bulletin inscription= new Bulletin();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblBulletinsDeLa.setBackground(Color.WHITE);
				lblBulletinsDeLa.setForeground(Color.BLACK);
				lblBulletinsDeLa.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblBulletinsDeLa.setBackground(Color.BLUE);
				lblBulletinsDeLa.setForeground(Color.WHITE);

				lblBulletinsDeLa.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				lblBulletinsDeLa.setBackground(Color.WHITE);
				lblBulletinsDeLa.setForeground(Color.BLACK);

				lblBulletinsDeLa.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
			 
			
		});
	
		
		 
		
	}
	
	String id_ecol="";
		
	
	
	private void inscrire_eleve(String year, String classe, JComboBox comboBox_1, JComboBox comboBox) {
		
		System.out.println("starting...");
		String create= "CREATE TABLE IF NOT EXISTS eleves_"+year.replaceAll("-", "")
		+"_"+id_ecol.replaceAll("-", "")
		+" (classe VARCHAR(255),nom VARCHAR(255),prenoms VARCHAR(255),date VARCHAR (255),lieu VARCHAR (255),matricule VARCHAR (255),"
		+ "cont_urgence TEXT,nom_p VARCHAR (255),prenom_p TEXT,cont_mobile VARCHAR (255),cont_domicile VARCHAR (255),cont_travail VARCHAR (255),"
		+ "profession VARCHAR (255),arrond VARCHAR (255),adresse VARCHAR (255),qtier VARCHAR (255),g_sanguin VARCHAR (255),"
		+ "electroph VARCHAR (255),sexe VARCHAR (255),logo TEXT,autre VARCHAR (255))";
	   
		 
		for(int i= 0; i<path.length(); i++)
			path=path.replace('\\', '/');
		
		JSONArray js= init.getEleves("eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "matricule = '"+matricule+"' and classe = '"+classe+"'", create);
		
		if(js!=null) {
			if(js.toString().equals("[]")) {
				Date date = new Date();
				long g= date.getTime();
				Random r= new Random();
				
				String ras= g+"-"+init.lire_le_fichier(Constantes.fichier_ann)+"-"+id_ecol+"-"+r.nextInt(10);
				String query= "INSERT INTO `eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", "")+
						"`(`classe`, `nom`, `prenoms`, `date`, `lieu`, `matricule`, `cont_urgence`, `nom_p`, "
						+ "`prenom_p`, `cont_mobile`, `cont_domicile`, `cont_travail`, `profession`, `arrond`,"
						+ " `adresse`, `qtier`, `g_sanguin`, `electroph`, `sexe`, `logo`, `autre`)"
						+ " VALUES ('"+classe+"','"+nom+"','"+prenom+"','"+date_de_nai+"','"+lieu_de_nai+"',"
								+ "'"+matricule+"','"+cont_urgence+"','"+nom_parent+"','"+prenom_parent+"','"+
						contact_mob+"','"+contact_dom+"','"+contact_trav+"','"+Profession+"','"+arrond+"','"+
								adresse_ville+"','"+qtier+"','"+g_sang+"','"+electr+"','"+sexe+"', '"+path+"', '"+ras+"')"; //(a_j?"'"+is+"'":null)

				
				if(init.inserer_(query, "eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), create, "arrond", "Elève "+matricule+" ajouté avec succès !", "Echec de l'ajout de l'élève ! Veuillez réessayer...")==0) {
					remplir_annee(comboBox_1,comboBox);  
					textField_1.setText("");textField_2.setText("");textField_3.setText("");textField_4.setText("");textField_5.setText("");
					textField_6.setText("");textField_7.setText("");textField_8.setText("");textField_9.setText("");textField_10.setText("");
					textField_11.setText("");textField_12.setText("");textField_13.setText("");textField_14.setText("");textField_15.setText("");
					comboBox_3.setSelectedIndex(0);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
					Profession= "ras"; contact_mob="";contact_dom="ras"; contact_trav="ras"; adresse_ville="ras"; arrond="ras"; qtier="ras";
					g_sang="Inconnu"; electr="Inconnu"; sexe="M"; cont_urgence="ras";
			
				}
				return;
			}
			if(init.msgIsShow("Cet élève a déjà été ajouté dans cette classe (Numéro matricule déjà utilisé), Voulez-vous mettre à jour ces infos ?", "SCOOP")) {
				String query= "UPDATE eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", "")+" SET "
						+ "date= '"+date_de_nai+"',"
						+ "lieu= '"+lieu_de_nai+"',"
						+ "nom= '"+nom+"',"
						+ "prenoms= '"+prenom+"',"
						+ "cont_urgence= '"+cont_urgence+"',"
						+ "nom_p= '"+nom_parent+"',"
						+ "prenom_p= '"+prenom_parent+"',"
						+ "cont_mobile= '"+contact_mob+"',"
						+ "cont_domicile= '"+contact_dom+"',"
						+ "cont_travail= '"+contact_trav+"',"
						+ "profession= '"+Profession+"',"
						+ "arrond= '"+arrond+"'," 
						+ "adresse= '"+adresse_ville+"',"
						+ "qtier= '"+qtier+"',"
						+ "g_sanguin= '"+g_sang+"',"
						+ "electroph= '"+electr+"',"
						+ "sexe= '"+sexe+"',"
						+ "logo= '"+path+"'," 
						+ " WHERE matricule = '"+matricule+"' and classe = '"+classe+"'";
				
				if(init.update_(query, "eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "", "")==0) {
					init.Alerter("Les données de l'élève "+matricule+" ont été mises à jour avec succès !\n\nVous lez verrez à la prochaine actualisation");
					remplir_eleves(classe,year);  
					textField_1.setText("");textField_2.setText("");textField_3.setText("");textField_4.setText("");textField_5.setText("");
					textField_6.setText("");textField_7.setText("");textField_8.setText("");textField_9.setText("");textField_10.setText("");
					textField_11.setText("");textField_12.setText("");textField_13.setText("");textField_14.setText("");textField_15.setText("");
					comboBox_3.setSelectedIndex(0);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
				}else
					init.Alerter("Echec de la mise à jour des données de l'élève "+matricule+"!");
			}
		}else {
			Date date = new Date();
			long g= date.getTime();
			Random r= new Random();
			
			String ras= g+"-"+init.lire_le_fichier(Constantes.fichier_ann)+"-"+id_ecol+"-"+r.nextInt(10);
			String query= "INSERT INTO `eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", "")+
					"`(`classe`, `nom`, `prenoms`, `date`, `lieu`, `matricule`, `cont_urgence`, `nom_p`, "
					+ "`prenom_p`, `cont_mobile`, `cont_domicile`, `cont_travail`, `profession`, `arrond`,"
					+ " `adresse`, `qtier`, `g_sanguin`, `electroph`, `sexe`, `logo`, `autre`)"
					+ " VALUES ('"+classe+"','"+nom+"','"+prenom+"','"+date_de_nai+"','"+lieu_de_nai+"',"
							+ "'"+matricule+"','"+cont_urgence+"','"+nom_parent+"','"+prenom_parent+"','"+
					contact_mob+"','"+contact_dom+"','"+contact_trav+"','"+Profession+"','"+arrond+"','"+
							adresse_ville+"','"+qtier+"','"+g_sang+"','"+electr+"','"+sexe+"', '"+path+"', '"+ras+"')"; //(a_j?"'"+is+"'":null)

			
			if(init.inserer_(query, "eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), create, "arrond", "Elève "+matricule+" ajouté avec succès !", "Echec de l'ajout de l'élève ! Veuillez réessayer...")==0) {
				remplir_annee(comboBox_1,comboBox);  
				textField_1.setText("");textField_2.setText("");textField_3.setText("");textField_4.setText("");textField_5.setText("");
				textField_6.setText("");textField_7.setText("");textField_8.setText("");textField_9.setText("");textField_10.setText("");
				textField_11.setText("");textField_12.setText("");textField_13.setText("");textField_14.setText("");textField_15.setText("");
				comboBox_3.setSelectedIndex(0);
				comboBox_4.setSelectedIndex(0);
				comboBox_5.setSelectedIndex(0);
				Profession= "ras"; contact_mob="";contact_dom="ras"; contact_trav="ras"; adresse_ville="ras"; arrond="ras"; qtier="ras";
				g_sang="Inconnu"; electr="Inconnu"; sexe="M"; cont_urgence="ras";
		
			}
		}
		 
		
	}
	
	
	String []year;

	public void remplir_annee(JComboBox combo, JComboBox combo2) { 
		String s= "";
		int nbre=0;		
		List<String> tab=new ArrayList(80);
		List<String> autres=new ArrayList(80);
		String autre="";
	
		String create="CREATE TABLE annees(id_ecole VARCHAR(255),annees int(40),autre TEXT)";		
		JSONArray js= init.getAnnees("annees", "id_ecole='"+id_ecol+"'", create);
		if(js==null)
			return;
		
		for(int i=0; i<js.length(); i++) {
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
					reprendre(combo.getSelectedItem().toString(), combo2);
				}
				
			});

			combo2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					 
					remplir_eleves (combo2.getSelectedItem().toString(), combo.getSelectedItem().toString());
				}
				
			}); 
			comboBox_2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					//init.Alerter(year);
					String info= infos.get(Integer.parseInt(ordres[comboBox_2.getSelectedIndex()]));
					List<String> details= new ArrayList(19);
					int anc_pos=0, pos=0; 
					for(int i=0; i<info.length(); i++) {
						if(info.charAt(i)=='\n') {
							details.add(info.substring(anc_pos, i));
							anc_pos=i+1;
						}
					}
					if(imgs.get(Integer.parseInt(ordres[comboBox_2.getSelectedIndex()]))==null) {
						path="";
						label_2.setText("ttt");
					}else {
						path="mise";
						//byte[] byt=imgs.get(Integer.parseInt(ordres[comboBox_2.getSelectedIndex()]));
						//label_2.setText(byt+""); 
						String txt=imgs.get(Integer.parseInt(ordres[comboBox_2.getSelectedIndex()]));
						for(int i=0; i<txt.length(); i++)
							txt=txt.replace('/', '\\');
						ImageIcon img=new ImageIcon(txt);
						
						Image image= img.getImage();
						Image image2=image.getScaledInstance(label_2.getWidth()	, label_2.getHeight(), Image.SCALE_SMOOTH);
						ImageIcon icon= new ImageIcon(image2);
						label_2.setIcon(icon);
					}
					
					textField_1.setText(details.get(0));textField_2.setText(details.get(1));textField_3.setText(details.get(2));
					textField_4.setText(details.get(3));textField_5.setText(details.get(4));textField_7.setText(details.get(6));
					textField_8.setText(details.get(7));textField_9.setText(details.get(8));

					
					
					textField_6.setText((details.get(5).equals("ras")||details.get(5)==null ? "": details.get(5)));
					textField_10.setText((details.get(9).equals("ras")||details.get(9)==null ? "": details.get(9))); 
					textField_11.setText((details.get(10).equals("ras")||details.get(10)==null ? "": details.get(10))); 
					textField_12.setText((details.get(17).equals("ras")||details.get(17)==null ? "": details.get(17)));
					textField_13.setText((details.get(14).equals("ras")||details.get(14)==null ? "": details.get(14)));
					textField_14.setText((details.get(15).equals("ras")||details.get(15)==null ? "": details.get(15)));
					textField_15.setText((details.get(16).equals("ras")||details.get(16)==null ? "": details.get(16)));
					
					String sexe= details.get(12);
					System.out.println("Sexe: "+sexe);
					if(sexe.equals("M"))
						comboBox_3.setSelectedIndex(0);
					else
						comboBox_3.setSelectedIndex(1);
					
					String groupes[]=new String[] {"Inconnu", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
					if(details.get(18)!=null) {
						for(int i=0; i<9; i++) {
							if(groupes[i].equals(details.get(18))) {
								comboBox_4.setSelectedIndex(i);
								break;
							}
						}
					}
					System.out.println(details.get(18)+"\t"+details.get(11));	 
					String elect[]=new String[] {"Inconnu", "AA", "AC", "AS", "SC", "SS"};
					if(details.get(11)!=null) {
						for(int i=0; i<6; i++) {
							if(elect[i].equals(details.get(11))) {
								comboBox_5.setSelectedIndex(i);
								break;
							}
						}
					}
				}
				
			});

			combo.setSelectedIndex(0);
		}
		
	}
	

	
	private void reprendre(String year, JComboBox combo2) {
		String current= year.substring(year.indexOf("-")+1);
		String create="CREATE TABLE annees(id_ecole VARCHAR(255),annees int(40),autre TEXT)";		
		
	//	String sql= "SELECT * FROM annees WHERE id_ecole='"+id_ecol+"' and annees='"+Integer.parseInt(current)+"'";  
		String s= "";
		int nbre=0;
		
		List<String> tab=new ArrayList(80);
		List<String> autres=new ArrayList(80);
		String autre="";
		
		JSONArray js= init.getAnnees("annees", "id_ecole='"+id_ecol+"' and annees='"+Integer.parseInt(current)+"'", create);
		if(js==null)
			return;
		for(int i=0 ; i<js.length(); i++) {
			if(i!=js.length()-1)
				continue;
			JSONObject rs;
			try {
				rs = js.getJSONObject(i);
				autre= (rs.getString("autre"));
				for_classes(autre, combo2, year);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	private void for_classes(String autre, JComboBox comboBoxx, String year) { 
		//System.out.println(autre);
		 
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
		final int[] a= {0}; 
		comboBoxx.setModel(new DefaultComboBoxModel(classes));
		comboBoxx.setSelectedIndex(0);
	}
	List<String> infos,imgs;
	String ordres[];
	
	
	
	private void remplir_eleves(String classe, String year) {
		String create= "CREATE TABLE IF NOT EXISTS eleves_"+year.replaceAll("-", "")
		+"_"+id_ecol.replaceAll("-", "")
		+" (classe VARCHAR(255),nom VARCHAR(255),prenoms VARCHAR(255),date VARCHAR (255),lieu VARCHAR (255),matricule VARCHAR (255),"
		+ "cont_urgence TEXT,nom_p VARCHAR (255),prenom_p TEXT,cont_mobile VARCHAR (255),cont_domicile VARCHAR (255),cont_travail VARCHAR (255),"
		+ "profession VARCHAR (255),arrond VARCHAR (255),adresse VARCHAR (255),qtier VARCHAR (255),g_sanguin VARCHAR (255),"
		+ "electroph VARCHAR (255),sexe VARCHAR (255),logo TEXT,autre VARCHAR (255))";
	 	
		List<String> tab=new ArrayList(200);
		infos=new ArrayList(200);
		String autre="";
		imgs=new ArrayList(200);
		 
		JSONArray js =init.getEleves("eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "classe = '"+classe+"'", create);
		if(js==null) {
			
		}else {
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
							rs.getString("g_sanguin")+"\n"); 
	 
					imgs.add(rs.getString("logo"));
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
			if(tab.get(i)!=null)
				compt++;
		}
		if(compt==0)
			return;
		String names[]= new String[compt];
		String names2[]= new String[compt];
		ordres = new String[compt];
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
		
		for(int i=0; i<compt; i++)
			System.out.println("\nOrdre "+i+": "+ordres[i]);
		
		comboBox_2.setModel(new DefaultComboBoxModel(names));
		
		
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

}
