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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
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
import javax.swing.JTextPane;

public class Certificat {

	private Initialize init=new Initialize();
	 JFrame frmEducsoftWelcome;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JComboBox comboBox_2;
	private String path= "";	
	private String nom, prenom, date_de_nai, lieu_de_nai, matricule, g_sang="Inconnu", electr="Inconnu", sexe="M", cont_urgence="ras";
	private String nom_parent, prenom_parent, Profession= "ras", contact_mob="", contact_dom="ras", contact_trav="ras", adresse_ville="ras", arrond="ras", qtier="ras";
	private JLabel label_5, label_6, label_7, label_8, label_9;
	/**
	 * Launch the application.
	 */
	/*public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Certificat window = new Certificat();
					window.frmEducsoftWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public static void main(String args []  ) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Certificat window = new Certificat();
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
	public Certificat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private float e1, e2;
	private void initialize() {
		frmEducsoftWelcome = new JFrame();
		//frmEducsoftWelcome.setResizable(false);
		frmEducsoftWelcome.setTitle("Educsoft - "+init.lire_le_fichier(Constantes.ecole_name)+" - CERTIFICATS DE SCOLARITÈS DE LA "+init.lire_le_fichier(Constantes.current_classe));

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


		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/Embleme_benin.jpg")));
		lblNewLabel_2.setBounds((int)(1447*e1), 0, (int)(93*e1), (int)(72*e2));
		panel.add(lblNewLabel_2);
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		Image st_icon= new ImageIcon(this.getClass().getResource("/Icon 3 St.png")).getImage();
		Image cs_icon= new ImageIcon(this.getClass().getResource("/Icon 1.png")).getImage();
		Image ca_icon= new ImageIcon(this.getClass().getResource("/Icon 2.png")).getImage();
		Image gp_icon= new ImageIcon(this.getClass().getResource("/Icon 5 Sgpp.png")).getImage();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(665, 131, (int)(709*e1),( int)(694*e2));
		panel.add(scrollPane);
		
		JPanel panel_5 = new JPanel();
		scrollPane.setViewportView(panel_5);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setPreferredSize(new Dimension(709, 694));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		
		JLabel lblRepubliqueDuBenin = new JLabel("  REPUBLIQUE DU BENIN");
		lblRepubliqueDuBenin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRepubliqueDuBenin.setHorizontalAlignment(SwingConstants.LEFT);
		lblRepubliqueDuBenin.setBounds(5, 10, 690, 17);
		panel_5.add(lblRepubliqueDuBenin);
		
		JLabel label = new JLabel("        * * * * *");
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(10, 33, (int)(706), (int)(13));
		//label.setBounds((int)(10*e1), (int)(24*e2), (int)(706*e1), (int)(13*e2));
		panel_5.add(label);
		
		JTextPane lblMinistereDesEnseignements = new JTextPane();
		
		lblMinistereDesEnseignements.setText("MINISTERE DES ENSEIGNEMENTS SECONDAIRE, TECHNIQUE ET DE LA  FORMATION PROFESSIONNELLE");
		
		lblMinistereDesEnseignements.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMinistereDesEnseignements.setEditable(false);
		lblMinistereDesEnseignements.setOpaque(false);
		lblMinistereDesEnseignements.setBounds((int)(10*e1), (int)(47*e2), (int)(706*e1), (int)(24*e2));
		lblMinistereDesEnseignements.setBounds((int)(10), (int)(47), (int)(400), (int)(70));
		panel_5.add(lblMinistereDesEnseignements);
		
		JLabel label_1 = new JLabel("        * * * * *");
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(10,93, (int)(706), (int)(13));
		panel_5.add(label_1);
		
		JLabel txtpnComplexeScolairePrive = new JLabel();
		txtpnComplexeScolairePrive.setHorizontalAlignment(SwingConstants.CENTER);
		txtpnComplexeScolairePrive.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
		txtpnComplexeScolairePrive.setText(init.lire_le_fichier(Constantes.ecole_name));
		txtpnComplexeScolairePrive.setBounds((int)(20), (int)(99), (int)(696), (int)(40));
		panel_5.add(txtpnComplexeScolairePrive);
		
		JLabel lblCertificatDeScolarite = new JLabel("CERTIFICAT DE SCOLARITE N\u00B0:...........................................................................................................");
		lblCertificatDeScolarite.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCertificatDeScolarite.setBounds((int)(174*e1), (int)(149*e2), (int)(430*e1), (int)(47*e2));
		lblCertificatDeScolarite.setBounds((int)(174), (int)(149), (int)(430), (int)(47));
		panel_5.add(lblCertificatDeScolarite);
		
		JLabel lblLeDirecteurD = new JLabel("Le Directeur d");
		lblLeDirecteurD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLeDirecteurD.setBounds((int)(40*e1), (int)(212*e2), (int)(117*e1), (int)(13*e2));
		lblLeDirecteurD.setBounds((int)(40), (int)(212), (int)(117), (int)(13));
		panel_5.add(lblLeDirecteurD);
		
		JLabel label_2 = new JLabel(init.lire_le_fichier(Constantes.ecole_name));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds((int)(157*e1),(int)( 212*e2), (int)(543*e1), (int)(13*e2));
		label_2.setBounds((int)(157),(int)( 212), (int)(543), (int)(13));
		panel_5.add(label_2);
		
		JLabel label_3 = new JLabel("*_*_*_*_* ");
		label_3.setHorizontalTextPosition(SwingConstants.CENTER);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds((int)(10*e1), (int)(136*e2), (int)(706*e1), (int)(13*e2));
		label_3.setBounds((int)(10), (int)(136), (int)(706), (int)(13));
		panel_5.add(label_3);
		
		JLabel lblSitu = new JLabel("situ\u00E9 \u00E0 ");
		lblSitu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSitu.setBounds((int)(10*e1), (int)(239*e2), (int)(117*e1), (int)(13*e2));
		lblSitu.setBounds((int)(10), (int)(239), (int)(117), (int)(13));
		panel_5.add(lblSitu);
		
		JLabel label_4 = new JLabel("...................................................................................................................................................................................");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds((int)(61*e1), (int)(239*e2), (int)(332*e1), (int)(13*e2));
		label_4.setBounds((int)(61), (int)(239), (int)(332), (int)(13));
		panel_5.add(label_4);
		
		JLabel lblCertifieQueLlve = new JLabel("certifie que l'\u00E9l\u00E8ve");
		lblCertifieQueLlve.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCertifieQueLlve.setBounds(500, 239, 300, 13);
		lblCertifieQueLlve.setBounds((int)(403), (int)(239), (int)(350), (int)(13));
		panel_5.add(lblCertifieQueLlve);
		
		 label_5 = new JLabel("...................................................................................................................................................................................");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.BLUE);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds((int)(10*e1),(int)( 272*e2), (int)(543*e1), (int)(13*e2));
		label_5.setBounds((int)(10),(int)( 272), (int)(543), (int)(13));
		panel_5.add(label_5);
		
		JLabel lblNeLe = new JLabel("n\u00E9(e) le");
		lblNeLe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNeLe.setBounds((int)(563*e1), (int)(272*e2), (int)(117*e1), (int)(13*e2));
		lblNeLe.setBounds((int)(563), (int)(272), (int)(117), (int)(13));
		panel_5.add(lblNeLe);
		
		 label_6 = new JLabel("...................................................................................................................................................................................");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.BLUE);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds((int)(10*e1), (int)(299*e2), (int)(543*e1), (int)(13*e2));
		label_6.setBounds((int)(10), (int)(299), (int)(543), (int)(13));
		panel_5.add(label_6);
		
		JLabel lblFilsfilleDe = new JLabel("fils/fille de ");
		lblFilsfilleDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFilsfilleDe.setBounds((int)(563*e1), (int)(299*e2), (int)(137*e1), (int)(13*e2));
		lblFilsfilleDe.setBounds((int)(563), (int)(299), (int)(250), (int)(13));
		panel_5.add(lblFilsfilleDe);
		
		 label_7 = new JLabel("...................................................................................................................................................................................");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.BLUE);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds((int)(10*e1), (int)(325*e2), (int)(543*e1), (int)(13*e2));
		label_7.setBounds((int)(10), (int)(325), (int)(543), (int)(13));
		panel_5.add(label_7);
		
		JLabel lblEstffectivement = new JLabel("est effectivement");
		lblEstffectivement.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEstffectivement.setBounds((int)(563*e1), (int)(327*e2), (int)(117*e1), (int)(13*e2));
		lblEstffectivement.setBounds((int)(563), (int)(327), (int)(117), (int)(13));
		panel_5.add(lblEstffectivement);
		
		JLabel lblInscrite = new JLabel("inscrit(e) dans mon \u00E9tablissement sous le num\u00E9ro matricule ");
		lblInscrite.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInscrite.setBounds((int)(10*e1), (int)(359*e2), (int)(395*e1), (int)(13*e2));
		lblInscrite.setBounds((int)(10), (int)(359), (int)(395), (int)(13));
		panel_5.add(lblInscrite);
		
		 label_8 = new JLabel("...................................................................................................................................................................................");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.BLUE);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds((int)(376*e1), (int)(353*e2), (int)(224*e1), (int)(24*e2));
		label_8.setBounds((int)(376), (int)(353), (int)(224), (int)(24));
		panel_5.add(label_8);
		
		JLabel lblEtPoursuit = new JLabel("et poursuit");
		lblEtPoursuit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEtPoursuit.setBounds((int)(609*e1), (int)(359*e2), (int)(107*e1), (int)(13*e2));
		lblEtPoursuit.setBounds((int)(609), (int)(359), (int)(107), (int)(13));
		panel_5.add(lblEtPoursuit);
		
		JLabel lblActuellementSestudes = new JLabel("actuellement ses \u00E9tudes en classe de");
		lblActuellementSestudes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblActuellementSestudes.setBounds((int)(10*e1), (int)(387*e2), (int)(245*e1), (int)(13*e2));
		lblActuellementSestudes.setBounds((int)(10), (int)(387), (int)(245), (int)(13));
		panel_5.add(lblActuellementSestudes);
		
		 label_9 = new JLabel("...................................................................................................................................................................................");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.BLUE);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_9.setBounds((int)(242*e1), (int)(382*e2), (int)(224*e1), (int)(24*e2));
		label_9.setBounds((int)(242), (int)(382), (int)(224), (int)(24));
		panel_5.add(label_9);
		
		JLabel lblAvecLesApprciations = new JLabel("avec les appr\u00E9ciations suivantes:");
		lblAvecLesApprciations.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAvecLesApprciations.setBounds((int)(476*e1), (int)(389*e2), (int)(245*e1), (int)(13*e2));
		lblAvecLesApprciations.setBounds((int)(476), (int)(389), (int)(245), (int)(13));
		panel_5.add(lblAvecLesApprciations);
		
		JLabel lblAssiduit = new JLabel("Assiduit\u00E9:..............................................................................");
		lblAssiduit.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssiduit.setForeground(Color.BLUE);
		lblAssiduit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAssiduit.setBounds((int)(203*e1), (int)(429*e2), (int)(332*e1), (int)(13*e2));
		lblAssiduit.setBounds((int)(203), (int)(429), (int)(332), (int)(13));
		panel_5.add(lblAssiduit);
		
		JLabel lblConduite = new JLabel("Conduite:..............................................................................");
		lblConduite.setHorizontalAlignment(SwingConstants.CENTER);
		lblConduite.setForeground(Color.BLUE);
		lblConduite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConduite.setBounds((int)(203*e1), (int)(462*e2), (int)(332*e1), (int)(13*e2));
		lblConduite.setBounds((int)(203), (int)(462), (int)(332), (int)(13));
		panel_5.add(lblConduite);
		
		JLabel lblTravail = new JLabel("Travail   :.................................................................................");
		lblTravail.setHorizontalAlignment(SwingConstants.CENTER);
		lblTravail.setForeground(Color.BLUE);
		lblTravail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTravail.setBounds((int)(203*e1), (int)(493*e2), (int)(332*e1), (int)(13*e2));
		lblTravail.setBounds((int)(203), (int)(493), (int)(332), (int)(13));
		panel_5.add(lblTravail);
		
		JLabel lblObservationParticulire = new JLabel("Observation particuli\u00E8re: .....................................................................................................................................................................");
		lblObservationParticulire.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblObservationParticulire.setBounds((int)(10*e1), (int)(540*e2), (int)(690*e1), (int)(15*e2));
		lblObservationParticulire.setBounds((int)(10), (int)(540), (int)(690), (int)(15));
		panel_5.add(lblObservationParticulire);
		
		JLabel lblCe = new JLabel("Ce ...................................................................................");
		lblCe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCe.setBounds((int)(338), (int)(563), (int)(266), (int)(13));
		panel_5.add(lblCe);
		
		JLabel lblDirecteur = new JLabel("<HTML><U>DIRECTEUR<U></HTML>");
		lblDirecteur.setHorizontalAlignment(SwingConstants.CENTER);
		lblDirecteur.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDirecteur.setBounds((int)(286*e1), (int)(637*e2), (int)(430*e1), (int)(47*e2));
		lblDirecteur.setBounds((int)(286), (int)(637), (int)(430), (int)(47));
		panel_5.add(lblDirecteur);
		
		JLabel lblLeDirecteur = new JLabel("<HTML><U>Le Directeur,<U></HTML>");
		lblLeDirecteur.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLeDirecteur.setBounds((int)(460*e1), (int)(587*e2), (int)(266*e1), (int)(13*e2));
		lblLeDirecteur.setBounds((int)(460), (int)(587), (int)(266), (int)(13));
		panel_5.add(lblLeDirecteur);
		
				panel_5.setBackground(new Color(255, 255, 224));
				
		remplir(label_4, lblDirecteur);
		
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
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(30, 144, 255));
		panel_3.setBounds(0, (int)(82*e2), (int)(1504*e1), (int)(46*e2));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		//Image home_icon= new ImageIcon(this.getClass().getResource("/Home.png")).getImage();
		JLabel lblHome = new JLabel("< Retour     ");
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
		
		JLabel lblParametrageClasse = new JLabel("CERTIFICATS DE SCOLARITÈS       >         "+init.lire_le_fichier(Constantes.current_classe));
		lblParametrageClasse.setBounds((int)(196*e1), (int)(14*e2), (int)(597*e1), (int)(25*e2));
		panel_3.add(lblParametrageClasse);
		lblParametrageClasse.setForeground(Color.WHITE);
		lblParametrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		
		JLabel lblNewLabel = new JLabel("Copyright 2019 VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds((int)(1220*e1), (int)(813*e2), (int)(299*e1), (int)(13*e1));
		panel.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "CERTIFICAT DE SCOLATITE DE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panel_4.setBounds((int)(10*e1), (int)(172*e2), (int)(326*e1), (int)(160*e2));
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
		
		JButton btnSuivant = new JButton("IMPRIMER \u263B");
		btnSuivant.setBounds((int)(10*e1), (int)(430*e2), (int)(366*e1), (int)(21*e2));
		panel.add(btnSuivant);
		btnSuivant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				PrinterJob pj= PrinterJob.getPrinterJob();
				pj.setJobName("Certificat de scolaritÈ");
				pj.setPrintable(new Printable() {

					@Override
					public int print(Graphics arg0, PageFormat arg1, int index) throws PrinterException {
						if(index>0) {
							return Printable.NO_SUCH_PAGE;
						}
						
						Graphics2D g2d=(Graphics2D)arg0;
						g2d.translate(arg1.getImageableX()+30, arg1.getImageableY()+100);
						
						g2d.scale(0.70	, 0.70);
						panel_5.paint(g2d);
						
						return Printable.PAGE_EXISTS;
					}
					
				});
				
				boolean bool= pj.printDialog();
				if(bool) {
					try {
						pj.print();
					} catch (PrinterException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}			
		});

		
		remplir_annee(comboBox_1,comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds((int)(dim.getWidth()-36), 0, (int)(36*e1), 2000);
		panel_2.setBackground(new Color(30, 144, 255));
		panel.add(panel_2);

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

				Classes inscription= new Classes();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
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
	
		
		 
		
	}
	
	String id_ecol="";
		
	
	private void remplir(JLabel lieu, JLabel dir) {
		{
			 
			JSONArray infos= init.getEcoles("ecoles", "id_ecl='"+id_ecol+"'", "");

			for(int i=0;i<infos.length(); i++) {
				if(i!=infos.length()-1)
					continue;
				JSONObject rs;
				try {
					rs = infos.getJSONObject(i);
					String nom = rs.getString("nom");
					String lieux= rs.getString("lieu");
					String contact_ecole= rs.getString("contact_ecole");
					String email_ecole= rs.getString("email_ecole");
					
					String dir_name= rs.getString("dir_name");
					String dir_contact=rs.getString("dir_contact");
					
					init.ecrire(Constantes.ecole_name, nom);
					
					lieu.setText(lieux);
					
					dir.setText("<HTML><U>"+dir_name+"</U></HTML>");
					
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
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
		String ann= init.lire_le_fichier(Constantes.fichier_ann);
		String y= ann.substring(ann.lastIndexOf("-")+1);
		String create="CREATE TABLE annees(id_ecole VARCHAR(255),annees int(40),autre TEXT)";		
		JSONArray js= init.getAnnees("annees", "id_ecole='"+id_ecol+"' and annees='"+y+"'", create);
		if(js==null)
			return;
		
		for(int i=0; i<js.length(); i++) {
			JSONObject rs;
			try {
				rs = js.getJSONObject(i);
				int current= rs.getInt("annees");
				autre= init.lire_le_fichier(Constantes.current_classe);
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
					label_5.setText("................   "+details.get(0)+" "+details.get(1)+"   ................");
					label_6.setText("................   "+details.get(2)+" ‡ "+details.get(3)+"   ................");
					label_7.setText("................   "+details.get(6)+" "+details.get(7)+" ................");
					label_8.setText("........  "+details.get(4)+"  ........");
					label_9.setText("......   "+init.lire_le_fichier(Constantes.current_classe)+"   ......"); 
					String sexe= details.get(12);
					System.out.println("Sexe: "+sexe); 

					
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

		if(js.length()==0)
			return;
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
			return;
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
