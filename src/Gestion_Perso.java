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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Cursor;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Gestion_Perso {

	JFrame frmEducsoftWelcome;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_2;
	private String diplome, cat="A", ech="1", eclon="1", mat_princ, mat_sec;
	private String[]infos_prof;
	private Initialize init= new Initialize();

	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestion_Perso window = new Gestion_Perso();
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
					Gestion_Perso window = new Gestion_Perso();
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
	public Gestion_Perso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private float e1, e2;
	private void initialize() {
		frmEducsoftWelcome = new JFrame();
	//frmEducsoftWelcome.setResizable(false);
		frmEducsoftWelcome.setTitle("Educsoft - Gestion du Personnel enseignant");
		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		e1= ((float)dim.getWidth()/1571);  e2=(float) dim.getHeight()/863;
		frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
	 
		frmEducsoftWelcome.setBounds(0, 0,(int)( 101101*e1), (int)(870*e2));
		frmEducsoftWelcome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEducsoftWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEducsoftWelcome.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, (int)(1571*e1), (int)(863*e2));
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
		panel_2.setBounds(0, (int)(78*e2), (int)(214*e1), (int)(736*e2));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblParamtrageClasse = new JLabel("  Annuaire du personnel enseignant");
		lblParamtrageClasse.setOpaque(true);
		lblParamtrageClasse.setBackground(Color.WHITE);
		lblParamtrageClasse.setForeground(Color.BLACK);
		lblParamtrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblParamtrageClasse.setBounds(0, (int)(52*e1), (int)(214*e1), (int)(86*e2));
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		//lblParamtrageClasse.setIcon(new ImageIcon(par_icon));
		panel_2.add(lblParamtrageClasse);
		
		JLabel lblInsrerUneNote = new JLabel("  Classification du personnel enseignant");
		lblInsrerUneNote.setForeground(Color.WHITE);
		Image st_icon= new ImageIcon(this.getClass().getResource("/Icon 3 St.png")).getImage();
		//label.setIcon(new ImageIcon(st_icon));
		lblInsrerUneNote.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInsrerUneNote.setBounds(0, (int)(174*e2), (int)(214*e1), (int)(95*e2));
		panel_2.add(lblInsrerUneNote);
		
		JLabel lblBulletinsDeLa = new JLabel("  Fiches de paie");
		lblBulletinsDeLa.setForeground(Color.WHITE);
		Image cs_icon= new ImageIcon(this.getClass().getResource("/Icon 1.png")).getImage();
		//label_1.setIcon(new ImageIcon(cs_icon));
		lblBulletinsDeLa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBulletinsDeLa.setBounds(0, (int)(279*e2), (int)(204*e1), (int)(79*e2));
		panel_2.add(lblBulletinsDeLa);
		
		JLabel label_1 = new JLabel(" < Retour");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(0, (int)(10*e2), (int)(128*e1), (int)(44*e2));
		panel_2.add(label_1);
		Image ca_icon= new ImageIcon(this.getClass().getResource("/Icon 2.png")).getImage();
		Image gp_icon= new ImageIcon(this.getClass().getResource("/Icon 5 Sgpp.png")).getImage();
		
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
		}else
			lblNewLabel_5.setText(init.lire_le_fichier(Constantes.ecole_name));

		JPanel panel_10 = new JPanel();
		panel_10.setBounds((int)(dim.getWidth()-36), 0, (int)(36*e1), 2000);
		panel_10.setBackground(new Color(30, 144, 255));
		panel.add(panel_10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(30, 144, 255));
		panel_3.setBounds((int)(183*e1), (int)(82*e2), (int)(1357*e1), (int)(48*e2));
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
		
		JLabel lblParametrageClasse = new JLabel("GESTION DU PERSONNEL ENSEIGNANT");
		lblParametrageClasse.setBounds((int)(196*e1), (int)(14*e2), (int)(597*e1), (int)(25*e2));
		panel_3.add(lblParametrageClasse);
		lblParametrageClasse.setForeground(Color.WHITE);
		lblParametrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblCopyrightVibecro = new JLabel("Copyright 2019 VIBECRO Inc, Tous droits r\u00E9serv\u00E9s");
		lblCopyrightVibecro.setBounds(0, (int)(819*e2), (int)(208*e1), (int)(13*e2));
		panel.add(lblCopyrightVibecro);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLUE);
		panel_4.setBounds((int)(844*e1)-2, (int)(131*e2), (int)(8*e1), (int)(800*e2));
		panel.add(panel_4);
		
		JLabel lblInscrireUnEnseignant = new JLabel("INSCRIRE UN ENSEIGNANT");
		lblInscrireUnEnseignant.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblInscrireUnEnseignant.setHorizontalAlignment(SwingConstants.CENTER);
		lblInscrireUnEnseignant.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblInscrireUnEnseignant.setBounds((int)(312*e1), (int)(159*e2), (int)(416*e1), (int)(38*e2));
		panel.add(lblInscrireUnEnseignant);
		
		JLabel lblRepertoireDesEnseignants = new JLabel("REPERTOIRE DES ENSEIGNANTS");
		lblRepertoireDesEnseignants.setHorizontalAlignment(SwingConstants.CENTER);
		lblRepertoireDesEnseignants.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRepertoireDesEnseignants.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblRepertoireDesEnseignants.setBounds((int)(1034*e1), (int)(159*e2), (int)(416*e1), (int)(38*e2));
		panel.add(lblRepertoireDesEnseignants);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Informations G\u00E9n\u00E9rales", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_5.setBounds((int)(236*e1), (int)(224*e2), (int)(584*e1), (int)(559*e2));
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNom.setBounds((int)(10*e1), (int)(35*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblNom);
		
		textField_1 = new JTextField();
		textField_1.setBounds((int)(275*e1), (int)(35*e2), (int)(279*e1), (int)(29*e2));
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrnoms = new JLabel("Pr\u00E9noms:");
		lblPrnoms.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrnoms.setBounds((int)(10*e1), (int)(79*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblPrnoms);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds((int)(275*e1), (int)(79*e2), (int)(279*e1), (int)(29*e2));
		panel_5.add(textField_2);
		
		JLabel lblNMatricule = new JLabel("N\u00B0 Matricule:");
		lblNMatricule.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNMatricule.setBounds((int)(10*e1), (int)(128*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblNMatricule);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds((int)(275*e1), (int)(128*e2), (int)(279*e1), (int)(29*e2));
		panel_5.add(textField_3);
		
		JLabel lblDiplme = new JLabel("Dipl\u00F4me:");
		lblDiplme.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiplme.setBounds((int)(10*e1), (int)(181*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblDiplme);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Baccalaur\u00E9at", "Bac+1", "Bac+2", "Licence", "Master", "BAPES", "Bac+4", "CAPES", "Ing\u00E9nierie", "Doctorat", "Agr\u00E9gat"}));
		comboBox.setBounds((int)(275*e1), (int)(183*e2), (int)(279*e1), (int)(25*e2));
		panel_5.add(comboBox);
		diplome= "Baccalauréat";
		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				diplome= arg0.getItem().toString();
				
			}
			
		}); 
		
		JLabel lblGrade = new JLabel("Cat\u00E9gorie de grade:");
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGrade.setBounds((int)(10*e1), (int)(231*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblGrade);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E"}));
		comboBox_1.setBounds((int)(275*e1), (int)(233*e2), (int)(279*e1), (int)(25*e2));
		panel_5.add(comboBox_1);

		comboBox_1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				cat= arg0.getItem().toString();
				
			}
			
		}); 
		JLabel lblEchelon = new JLabel("Echelle de grade:");
		lblEchelon.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEchelon.setBounds((int)(10*e1), (int)(288*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblEchelon);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2.setBounds((int)(275*e1), (int)(290*e2), (int)(279*e1), (int)(25*e2));
		panel_5.add(comboBox_2);
		comboBox_2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				ech= arg0.getItem().toString();
				
			}
			
		}); 
		JLabel lblMatirePrincipale = new JLabel("Mati\u00E8re Principale:");
		lblMatirePrincipale.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMatirePrincipale.setBounds((int)(10*e1), (int)(410*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblMatirePrincipale);
		
		JLabel lblMatireSecondaire = new JLabel("Mati\u00E8re Secondaire:");
		lblMatireSecondaire.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMatireSecondaire.setBounds((int)(10*e1), (int)(470*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblMatireSecondaire);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Anglais", "Physique", "..."}));
		comboBox_3.setBounds((int)(275*e1), (int)(412*e2), (int)(279*e1), (int)(25*e2));
		panel_5.add(comboBox_3);
		
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Pas de mati\u00E8re secondaire", "Anglais", "Maths", "..."}));
		comboBox_4.setBounds((int)(275*e1), (int)(472*e2), (int)(279*e1), (int)(25*e2));
		panel_5.add(comboBox_4);

		comboBox_4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				mat_sec= arg0.getItem().toString();
			}
			
		}); 
		
		JLabel lblContact = new JLabel("Contact:");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContact.setBounds((int)(10*e1), (int)(525*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblContact);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds((int)(275*e1), (int)(520*e2), (int)(279*e1), (int)(29*e2));
		panel_5.add(textField_4);
		
		JLabel label = new JLabel("Echelon de grade:");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds((int)(10*e1), (int)(347*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(label);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_5.setBounds((int)(275*e1), (int)(351*e2), (int)(279*e1), (int)(25*e2));
		panel_5.add(comboBox_5);
		comboBox_5.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				eclon= arg0.getItem().toString();
				
			}
			
		}); 
		JButton btnInscrire = new JButton("INSCRIRE");
		btnInscrire.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnInscrire.setBounds((int)(512*e1), (int)(793*e2), (int)(279*e1), (int)(31*e2));
		panel.add(btnInscrire);
		
		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds((int)(865*e1), (int)(224*e2), (int) (780*e1), (int)(590*e2));
		panel.add(panel_6);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_6.add(scrollPane_1);
		
		table_2 = new JTable();
		table_2.setRowSelectionAllowed(false);
		table_2.setPreferredScrollableViewportSize(new Dimension(450, 540));
		table_2.setRowHeight(40);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"N\u00B0", "Nom et Pr\u00E9noms", "Mati\u00E8re Principale", "Action"
			}
		));
		table_2.getColumnModel().getColumn(0).setResizable(false);
		table_2.getColumnModel().getColumn(0).setPreferredWidth(40);
		table_2.getColumnModel().getColumn(1).setResizable(false);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(221);
		table_2.getColumnModel().getColumn(2).setResizable(false);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(138);
		table_2.getColumnModel().getColumn(3).setResizable(false);
		table_2.getColumnModel().getColumn(3).setPreferredWidth(83);
		scrollPane_1.setViewportView(table_2);


		btnInscrire.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String nom= textField_1.getText().toString().trim();
				String prenom= textField_2.getText().toString().trim();
				String mat= textField_3.getText().toString().trim();
				String contact= textField_4.getText().toString().trim();
				String grade= cat+""+ech+""+eclon;
				String _prin= mat_princ;
				String _sec= mat_sec;
				if(mat_princ==null) {
					init.Alerter("Veuillez choisir une matière principale!");
					return;
				}
				if(nom.equals("")||prenom.equals("")||contact.equals("")) {
					init.Alerter_warn("Vous devez obligatoirement remplir les champs \"Nom\", \"Prénoms\" et \"Contact\"", "Important");
				}else {
					if(init.msgIsShow("Voulez-vous vraiment ajouter: \nNom: "+nom+"\nPrénoms: "+prenom+"\nContact: "+contact+"\nDiplôme: "+diplome+"\nMatricule: "+mat+"\nGrade: "+grade+"\nMatière Principale: "+_prin+"\nMatière Secondaire: "+_sec+"  ?", "Confirmer")) {
						inscrire_enseignant(table_2,nom, prenom, mat, diplome,grade, _prin+";"+_sec, contact);
					}
				}
			}
			
		});
		  
		initialise_les_mat(comboBox_3, comboBox_4);
		

		comboBox_3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				mat_princ= arg0.getItem().toString();
				
			}
			
		}); 
		
		comboBox_4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				mat_sec= arg0.getItem().toString();
			}
			
		}); 
		getEnseignant(table_2);
		
		JButton btnImprimer = new JButton("IMPRIMER");
		btnImprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollPane_1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
				PrinterJob pj= PrinterJob.getPrinterJob();
				pj.setJobName("Personnelle");
				pj.setPrintable(new Printable() {
					@Override
					public int print(Graphics arg0, PageFormat arg1, int index) throws PrinterException {
						if(index>0) {
							return Printable.NO_SUCH_PAGE;
						}
						
						Graphics2D g2d=(Graphics2D)arg0;
						g2d.translate(arg1.getImageableX()+56, arg1.getImageableY()+50);
						
						g2d.scale(1	, 1);
						scrollPane_1.paint(g2d);
						
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

				scrollPane_1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			}
		});
		btnImprimer.setBounds((int)(845*e1)+4, (int)(169*e2), (int)(124*e1), (int)(21*e2));
		panel.add(btnImprimer);

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
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
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
		label_1.addMouseListener(new MouseListener() {

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
				label_1.setForeground(Color.BLACK);
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label_1.setForeground(Color.WHITE);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				label_1.setForeground(Color.BLACK);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label_1.setForeground(Color.WHITE);
			}
			 
			
		});
		
		lblBulletinsDeLa.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Fiches_Paie inscription= new Fiches_Paie();
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
		

		lblInsrerUneNote.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Fiches_Paie inscription= new Fiches_Paie();
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
		
		

		
	}
	
	
	String id_ecol="";
	
	private void initialise_les_mat(JComboBox j_p, JComboBox j_s) {
		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));

	 
		String matieres=""; 
		
		String create= "CREATE TABLE ecoles_info (id_ecl VARCHAR(255),promotions VARCHAR(255),matieres VARCHAR (255),autre VARCHAR (255))";
		
		JSONArray js= init.getEcolesInfos("ecoles_info", "id_ecl='"+id_ecol+"'", create);
		
		if(js==null) {
			return;
		}else {
			for(int i=0; i<js.length(); i++) {
				if(i!=js.length()-1)
					continue;
				JSONObject rs;
				try {
					rs = js.getJSONObject(i);
					matieres= rs.getString("matieres");
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		if(js.length()==0)
			return;
		
		String [] year=new String[1];
		if(!matieres.equals("")) {
			int anc_pos= 0; int compt=0;
			String s= matieres;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='\n') {
					compt++;
				}
			}
			year=new String[compt];
			int pos=0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='\n') {
					year[pos]= s.substring(anc_pos, i);
					anc_pos=i+1;
					pos++;
				}else if(i==s.length()-1) {
					year[pos]= s.substring(anc_pos, i+1);
					anc_pos=i+1;
					pos++;
				}
			}
			String reste[]= new String[compt+1];
			reste[0]= "Pas de matière secondaire";
			for(int i=0; i<compt; i++) {
				reste[i+1]=year[i];
			}
			
			j_s.setModel(new DefaultComboBoxModel(reste));
			j_p.setModel(new DefaultComboBoxModel(year));
			mat_princ= year[0];
			mat_sec= reste[0];
		}
		
		
	}


	private void inscrire_enseignant(JTable jtable, String nom, String prenom,String matricule, String diplome,  String grade, String matiere, String contact) {
		
		String create= "CREATE TABLE IF NOT EXISTS enseignants_"+id_ecol.replaceAll("-", "")+" (nom VARCHAR(255),prenoms VARCHAR(255),matricule VARCHAR (255),diplome VARCHAR (255),grade VARCHAR (255),matieres TEXT,contact VARCHAR (255),autre TEXT)";
		 
		
		String sql= "SELECT * from enseignants_"+id_ecol.replaceAll("-", "")+" WHERE matricule = '"+matricule.replaceAll("'", "\"")+"'";
		JSONArray js=init.getEnseignant("enseignants_"+id_ecol.replaceAll("-", ""), "matricule = '"+matricule.replaceAll("'", "\"")+"'", create);
		if(js!=null) {
			if(!js.toString().equals("[]")) {
				init.Alerter_warn("Cet enseignant a déjà été ajouté dans votre école (Numéro matricule déjà utilisé)", "ATTENTION");
				if(init.msgIsShow("Voulez-vous modifier ?", "Avertissement")) {
					String query="UPDATE enseignants_"+id_ecol.replaceAll("-", "")+
							" SET nom='"+nom.replaceAll("'", "\"")+"', prenoms='"+prenom.replaceAll("'", "\"")+"', matricule= '"+matricule.replaceAll("'", "\"")+"', diplome='"+diplome+"', grade='"+grade+"', matieres='"+matiere.replaceAll("'", "\"")+"', contact='"+contact.replaceAll("'", "\"")+"', autre='ras' "
							+" WHERE matricule ='"+matricule.replaceAll("'", "\"")+"'";
					
					if(init.update_2(query, "enseignants_"+id_ecol.replaceAll("-", ""), "", "", "matricule")==0) {
						init.Alerter("Enseignant "+matricule+" modifié avec succès !");
					}else {
						init.Alerter("Echec de la modification de l'Enseignant "+matricule+"! Veuillez réessayer...");
					}
				}
				return;
			}
		}
		
		String query= "INSERT INTO `enseignants_"+id_ecol.replaceAll("-", "")+"`(`nom`, `prenoms`, `matricule`, `diplome`, `grade`, `matieres`, `contact`, `autre`)"
				+ " VALUES ('"+nom.replaceAll("'", "\"")+"','"+prenom.replaceAll("'", "\"")+"','"+matricule.replaceAll("'", "\"")+"','"+diplome+"','"+grade+"','"+matiere.replaceAll("'", "\"")+"','"+contact.replaceAll("'", "\"")+"','ras')";
		
		  
		if(init.inserer_(query, "enseignants_"+id_ecol.replaceAll("-", ""), create, "grade", "Enseignant "+matricule+" ajoué avec succès !", "Echec de l'ajout de l'enseignant ! Veuillez réessayer...")==0) {
			getEnseignant(jtable);
		}
		
		
	}
	

 	private void getEnseignant(JTable table) {
		
		String create= "CREATE TABLE IF NOT EXISTS enseignants_"+id_ecol.replaceAll("-", "")+" (nom VARCHAR(255),prenoms VARCHAR(255),matricule VARCHAR (255),diplome VARCHAR (255),grade VARCHAR (255),matieres TEXT,contact VARCHAR (255),autre TEXT)";
		 
		//String sql= "SELECT * from enseignants_"+id_ecol.replaceAll("-", "")+" WHERE 1";
		 
		List<String> list= new ArrayList(500);
		List<String> mat= new ArrayList(500);
		List<String> list2= new ArrayList(500);
		int compt=0; 
		
		JSONArray js= init.getEnseignant("enseignants_"+id_ecol.replaceAll("-", ""), "1", create);
		if(js==null)
			return;
		for(int i=0; i<js.length(); i++) {
			String nom;
			try {
				JSONObject rs= js.getJSONObject(i);
				nom = rs.getString("nom");
				String prenom=rs.getString("prenoms");
				String matricule=rs.getString("matricule");
				String diplome=rs.getString("diplome");
				String grade=rs.getString("grade");
				String matieres=rs.getString("matieres");
				String contact=rs.getString("contact"); 				
				compt++;
				mat.add(matieres.substring(0, matieres.indexOf(';')));
				list.add(nom+" "+prenom+"\t"+matricule+"\t"+diplome+"\t"+grade+"\t"+matieres+"\t"+contact);
				list2.add("Nom: "+nom+" "+prenom+"\n\nN° Matricule: "+matricule+"\n\nDiplôme: "+diplome+"\n\nGrade: "+grade+"\n\nMatières: "+matieres+"\n\nContact: "+contact+"\n\n\nPour modifier les données de cet enseignant, veuillez remplir les nouvelles informations et utilisez le même numéro matricule pour mettre à jour ses informations ! Merci...");
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
		if(compt!=0) {
			infos_prof=new String[compt];
			String [] names=new String[compt];
			String [] names2=new String[compt];
			String [] ordres=new String[compt];
			for(int i=0; i<compt; i++) {
				names[i]= list.get(i).substring(0, list.get(i).indexOf('\t'));
				names2[i]= names[i];
				ordres[i]=String.valueOf(i); 
			}
			/*TODO TRI */
			
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
					System.out.println("\n"+pos);
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
			
			for(int i=0; i<compt; i++) {
				infos_prof[i]= list.get(Integer.parseInt(ordres[i])); 
			}
			
			/*CONSTITUTION DE OBJECT*/
			Object[][] ob=new Object[compt+20][4];
			for(int i=0; i<compt;i++) {
				ob[i][0]= i+1;
				ob[i][1]= names[i];
				ob[i][2]= mat.get(Integer.parseInt(ordres[i]));
			}
			table.setModel(new DefaultTableModel(
					ob,
					new String[] {
						"N\u00B0", "Nom et Pr\u00E9noms", "Mati\u00E8re Principale", "Action"
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
			

			table.getColumnModel().getColumn(0).setResizable(false);
			table.getColumnModel().getColumn(0).setPreferredWidth(40);
			table.getColumnModel().getColumn(1).setResizable(false);
			table.getColumnModel().getColumn(1).setPreferredWidth(221);
			table.getColumnModel().getColumn(2).setResizable(false);
			table.getColumnModel().getColumn(2).setPreferredWidth(138);
			table.getColumnModel().getColumn(3).setResizable(false);
			table.getColumnModel().getColumn(3).setPreferredWidth(83);
			
			final int f=compt;
			table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){  
				@Override
				public void valueChanged(ListSelectionEvent arg0) {
					
					
					int i=table.getSelectedRow();
					if(i>=f)
						return;
					
					init.Alerter(list2.get(Integer.parseInt(ordres[i])));
					
				}
		    });
		}

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
