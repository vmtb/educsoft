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
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Date;  
import java.text.SimpleDateFormat;
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

public class Fiches_Paie {

	JFrame frmEducsoftWelcome;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private String diplome, cat="A", ech="1", eclon="1", mat_princ, mat_sec;
	private String[]infos_prof;
	
	private Initialize init= new Initialize();
	private String annees=init.lire_le_fichier(Constantes.fichier_ann);
	private String heure_sup="0"; String prix_heure_sup="0";

	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fiches_Paie window = new Fiches_Paie();
					window.frmEducsoftWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fiches_Paie window = new Fiches_Paie();
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
	public Fiches_Paie() {
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
		
		frmEducsoftWelcome.setTitle("Educsoft - Gestion du Personnel enseignant");
		frmEducsoftWelcome.setBounds(0, 0, (int)(101101*e1), (int)( 870*e2));
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
		
		
		JLabel lblCollgeCatholiqueSaint = new JLabel("Coll\u00E8ge catholique Saint Fran\u00E7ois d'assise de Bohicon");
		
		JLabel lblParamtrageClasse2 = new JLabel("  Annuaire du personnel enseignant");
		lblParamtrageClasse2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblParamtrageClasse2.setBounds(0, (int)(52*e2), (int)(214*e1), (int)(86*e2));
		lblParamtrageClasse2.setForeground(Color.WHITE);
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		//lblParamtrageClasse.setIcon(new ImageIcon(par_icon));
		panel_2.add(lblParamtrageClasse2);
		
		JLabel lblInsrerUneNote = new JLabel("  Classification du personnel enseignant");
		lblInsrerUneNote.setForeground(Color.WHITE);
		Image st_icon= new ImageIcon(this.getClass().getResource("/Icon 3 St.png")).getImage();
		//label.setIcon(new ImageIcon(st_icon));
		lblInsrerUneNote.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInsrerUneNote.setBounds(0, (int)(174*e2), (int)(214*e1), (int)(95*e2));
		panel_2.add(lblInsrerUneNote);
		
		JLabel lblBulletinsDeLa = new JLabel("  Fiches de paie");
		lblBulletinsDeLa.setOpaque(true);
		lblBulletinsDeLa.setBackground(Color.WHITE);
		lblBulletinsDeLa.setForeground(Color.BLACK);
		Image cs_icon= new ImageIcon(this.getClass().getResource("/Icon 1.png")).getImage();
		//label_1.setIcon(new ImageIcon(cs_icon));
		lblBulletinsDeLa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBulletinsDeLa.setBounds(0, (int)(279*e2), (int)(214*e1), (int)(79*e2));
		panel_2.add(lblBulletinsDeLa);
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
		lblNewLabel_5.setBounds((int)(173*e1), 0,(int)( 1253*e1), (int)(77*e2));
		panel.add(lblNewLabel_5); 
		if(init.lire_le_fichier(Constantes.ecole_name).equals("")) {
			init.remplir(lblNewLabel_5, null, null, null, null, null);
			init.remplir(lblCollgeCatholiqueSaint, null, null, null, null, null);
		}else {
			lblNewLabel_5.setText(init.lire_le_fichier(Constantes.ecole_name));
			lblCollgeCatholiqueSaint.setText(init.lire_le_fichier(Constantes.ecole_name));
		}

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
		lblCopyrightVibecro.setBounds(0,(int)(819*e2), (int)(208*e1), (int)(13*e2));
		panel.add(lblCopyrightVibecro);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLUE);
		panel_4.setBounds((int)(844*e1), (int)(131*e2), (int)(8*e1), (int)(800*e2));
		panel.add(panel_4);
		
		JLabel lblInscrireUnEnseignant = new JLabel("FICHES DE PAIE DES ENSEIGNANTS");
		lblInscrireUnEnseignant.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblInscrireUnEnseignant.setHorizontalAlignment(SwingConstants.CENTER);
		lblInscrireUnEnseignant.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblInscrireUnEnseignant.setBounds((int)(312*e1), (int)(159*e2), (int)(416*e1), (int)(38*e2));
		panel.add(lblInscrireUnEnseignant);
		
		JLabel lblRepertoireDesEnseignants = new JLabel("APERçU");
		lblRepertoireDesEnseignants.setHorizontalAlignment(SwingConstants.CENTER);
		lblRepertoireDesEnseignants.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRepertoireDesEnseignants.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblRepertoireDesEnseignants.setBounds((int)(953*e1), (int)(159*e2), (int)(416*e1), (int)(38*e2));
		panel.add(lblRepertoireDesEnseignants);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Informations G\u00E9n\u00E9rales", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_5.setBounds((int)(236*e1), (int)(322*e2), (int)(584*e1), (int)(420*e2));
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNom = new JLabel("Enseignant:");
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNom.setBounds((int)(10*e1), (int)(35*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblNom);
		
		JLabel lblPrnoms = new JLabel("Masse horaire du mois:");
		lblPrnoms.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrnoms.setBounds((int)(10*e1), (int)(79*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblPrnoms);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds((int)(275*e1), (int)(79*e2), (int)(279*e1), (int)(29*e2));
		panel_5.add(textField_2);
		 
		
		JLabel lblNMatricule = new JLabel("Tarfication de l'heure:");
		lblNMatricule.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNMatricule.setBounds((int)(10*e1), (int)(128*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblNMatricule);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds((int)(275*e1), (int)(128*e2), (int)(279*e1), (int)(29*e2));
		panel_5.add(textField_3);
		
		JLabel lblDiplme = new JLabel("Y a t-il d'heures suppl\u00E9mentaires? ");
		lblDiplme.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDiplme.setBounds((int)(10*e1), (int)(181*e2), (int)(255*e1), (int)(24*e2));
		panel_5.add(lblDiplme);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Non", "Oui"}));
		comboBox.setBounds((int)(275*e1), (int)(183*e2), (int)(279*e1), (int)(25*e2));
		panel_5.add(comboBox);
		diplome= "Non";
		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				diplome= comboBox.getSelectedItem().toString();
				if(diplome.equals("Oui")) {
					textField_1.setEnabled(true);
					textField_5.setEnabled(true);
				}else {
					textField_1.setEnabled(false);
					textField_5.setEnabled(false);
				}
			}
			
		}); 
		
		JLabel lblGrade = new JLabel("Masse des heures suppl\u00E9mentaires");
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGrade.setBounds((int)(10*e1), (int)(231*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblGrade);
		JLabel lblEchelon = new JLabel("Tarification de l'heure suppl\u00E9mentaire:");
		lblEchelon.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEchelon.setBounds((int)(10*e1), (int)(288*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblEchelon);
		
		JLabel lblPrime = new JLabel("Prime:");
		lblPrime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrime.setBounds((int)(10*e1), (int)(347*e2), (int)(210*e1), (int)(24*e2));
		panel_5.add(lblPrime);
		 btnInscrire = new JButton("SAUVAGARDER");
		btnInscrire.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnInscrire.setBounds((int)(512*e1), (int)(793*e2),(int)( 279*e1), (int)(31*e2));
		panel.add(btnInscrire);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBackground(new Color(255, 255, 224));
		panel_6.setBounds((int)(865*e1), (int)(224*e2), (int)(585*e1), (int)(590*e2));
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		
		lblCollgeCatholiqueSaint.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCollgeCatholiqueSaint.setBounds((int)(10*e1), (int)(20*e2),(int)( 293*e1), (int)(24*e2));
		panel_6.add(lblCollgeCatholiqueSaint);
		
		JLabel lblFicheDePaie = new JLabel("FICHE DE PAIE");
		lblFicheDePaie.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFicheDePaie.setBounds((int)(452*e1), (int)(20*e2), (int)(210*e1),(int)( 24*e2));
		panel_6.add(lblFicheDePaie);
		
		lblDate = new JLabel("Date: 20/12/2019");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDate.setBounds((int)(10*e1), (int)(65*e2),(int)( 293*e1), (int)(24*e2));
		panel_6.add(lblDate);
		
		 lblNom_1 = new JLabel("Nom:");
		lblNom_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNom_1.setBounds((int)(10*e1), (int)(116*e2), (int)(293*e1), (int)(24*e2));
		panel_6.add(lblNom_1);
		
		 lblPrnoms_1 = new JLabel("Pr\u00E9noms:");
		lblPrnoms_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrnoms_1.setBounds((int)(10*e1), (int)(166*e2), (int)(293*e1), (int)(24*e2));
		panel_6.add(lblPrnoms_1);
		
		lblMoisXxxxxxxx = new JLabel("Mois - xxxx-xxxx");
		lblMoisXxxxxxxx.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMoisXxxxxxxx.setBounds((int)(313*e1), (int)(73*e2), (int)(293*e1), (int)(24*e2));
		panel_6.add(lblMoisXxxxxxxx);
		
		JLabel lblSalaireDeBase = new JLabel("Salaire de base:   ");
		lblSalaireDeBase.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSalaireDeBase.setBounds((int)(296*e1), (int)(243*e2), (int)(126*e1), (int)(24*e2));
		panel_6.add(lblSalaireDeBase);
		
		JLabel lblHeuresSup = new JLabel("Heures sup:");
		lblHeuresSup.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHeuresSup.setBounds((int)(296*e1), (int)(295*e2), (int)(118*e1),(int)( 24*e2));
		panel_6.add(lblHeuresSup);
		
		JLabel lblPrime_1 = new JLabel("Prime:");
		lblPrime_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrime_1.setBounds((int)(296*e1), (int)(348*e2), (int)(126*e1), (int)(24*e2));
		panel_6.add(lblPrime_1);
		
		JLabel lblSalaireNet = new JLabel("Salaire net \u00E0 payer:");
		lblSalaireNet.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSalaireNet.setBounds((int)(209*e1), (int)(402*e2), (int)(203*e1), (int)(24*e2));
		panel_6.add(lblSalaireNet);
		
		JLabel lblSignatureEtCachet = new JLabel("<HTML><U>Signature et cachet du Directeur:</U></HTML>");
		lblSignatureEtCachet.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSignatureEtCachet.setBounds((int)(10*e1), (int)(463*e2), (int)(293*e1), (int)(24*e2));
		panel_6.add(lblSignatureEtCachet);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds((int)(10*e1), (int)(200*e2), (int)(565*e1), (int)(10*e2));
		panel_6.add(panel_7);
		
		 sbase = new JLabel("XXXX FCFA");
		sbase.setFont(new Font("Tahoma", Font.BOLD, 14));
		sbase.setBounds((int)(432*e1), (int)(243*e2), (int)(126*e1), (int)(24*e2));
		panel_6.add(sbase);
		
		 h_sup = new JLabel("XXXX FCFA");
		h_sup.setFont(new Font("Tahoma", Font.BOLD, 14));
		h_sup.setBounds((int)(432*e1), (int)(295*e2), (int)(126*e1), (int)(24*e2));
		panel_6.add(h_sup);
		
		 prim = new JLabel("XXXX FCFA");
		prim.setFont(new Font("Tahoma", Font.BOLD, 14));
		prim.setBounds((int)(432*e1), (int)(348*e2), (int)(126*e1), (int)(24*e2));
		panel_6.add(prim);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds((int)(249*e1), (int)(391*e2), (int)(326*e1), (int)(1.2*e2));
		panel_6.add(panel_8);
		
		net= new JLabel("XXXX FCFA");
		net.setFont(new Font("Tahoma", Font.BOLD, 14));
		net.setBounds((int)(432*e1), (int)(402*e2), (int)(126*e1), (int)(24*e2));
		panel_6.add(net);


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
	
		btnInscrire.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String mh= textField_2.getText().toString().trim();
				String th= textField_3.getText().toString().trim();
				if(init.contient_fausse(mh)) {
					init.Alerter("Les champs ne doivent pas contenir des lettres !");
					return;
				}
				if(init.contient_fausse(th)) {
					init.Alerter("Les champs ne doivent pas contenir des lettres !");
					return;
				}
				
				if(diplome.equals("Oui")) {
					if(!textField_1.getText().toString().trim().isEmpty()) {
						heure_sup= textField_1.getText().toString().trim();

						if(init.contient_fausse(heure_sup)) {
							init.Alerter("Les champs ne doivent pas contenir des lettres !");
							return;
						}
					}
					if(!textField_5.getText().toString().trim().isEmpty()) {
						prix_heure_sup= textField_5.getText().toString().trim();
						if(init.contient_fausse(prix_heure_sup)) {
							init.Alerter("Les champs ne doivent pas contenir des lettres !");
							return;
						}
					}
				} else {
					heure_sup="0";
					prix_heure_sup="0";
				}
				String prime="0";
				if(!textField_6.getText().toString().trim().isEmpty()) {
					prime= textField_6.getText().toString().trim();
					if(init.contient_fausse(prime)) {
						init.Alerter("Les champs ne doivent pas contenir des lettres !");
						return;
					}
				} 
				if(mh.isEmpty()||th.isEmpty()) {
					init.Alerter("Vous devez renseigner sur la masse horaire de l'enseignnant et le prix unitaire d'heure !");
				}else if(matr.equals("")){
					init.Alerter("Veuillez ajouter d'abord des enseignants !");
				}else {
					inserer(matr, annees, mois, mh, th, heure_sup, prix_heure_sup, prime);
				}

			}
			
		});
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds((int)(275*e1), (int)(39*e2), (int)(279*e1), (int)(25*e2));
		panel_5.add(comboBox_6);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds((int)(275*e1), (int)(236*e2), (int)(279*e1), (int)(29*e2));
		panel_5.add(textField_1);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		textField_5.setBounds((int)(275*e1), (int)(293*e2), (int)(279*e1), (int)(29*e2));
		panel_5.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setColumns(10);
		textField_6.setBounds((int)(275*e1), (int)(352*e2), (int)(279*e1), (int)(29*e2));
		panel_5.add(textField_6);
		
		JLabel lblMois = new JLabel("Mois:");
		lblMois.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMois.setBounds((int)(236*e1), (int)(242*e2), (int)(210*e1), (int)(24*e2));
		panel.add(lblMois);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Janvier", "F\u00E9vrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Ao\u00FBt", "Septembre", "Octobre", "Novembre", "D\u00E9cembre"}));
		comboBox_1.setBounds((int)(315*e1), (int)(242*e2), (int)(200*e1), (int)(25*e2));
		panel.add(comboBox_1);
		comboBox_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 mois= comboBox_1.getSelectedItem().toString();		
				 traitement(annees, mois);
			}
			
		});
		String cur_ye= init.lire_le_fichier(Constantes.fichier_ann);
		
		JLabel label = new JLabel(" de l'année-scolaire ("+cur_ye+")");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds((int)(550*e1), (int)(242*e2), (int)(300*e1), (int)(24*e2));
		panel.add(label);
		JLabel label_1 = new JLabel(" < Retour");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(0, (int)(10*e2), (int)(128*e1), (int)(44*e2));
		panel_2.add(label_1);
		
		JButton btnImprimer = new JButton("IMPRIMER");
		btnImprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PrinterJob pj= PrinterJob.getPrinterJob();
				pj.setJobName("Fiche de paie");
				pj.setPrintable(new Printable() {

					@Override
					public int print(Graphics arg0, PageFormat arg1, int index) throws PrinterException {
						if(index>0) {
							return Printable.NO_SUCH_PAGE;
						}
						
						Graphics2D g2d=(Graphics2D)arg0;
						g2d.translate(arg1.getImageableX()+100, arg1.getImageableY()+100);
						
						g2d.scale(0.70	, 0.70);
						panel_6.paint(g2d);
						
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
		btnImprimer.setBounds((int)(1455*e1), (int)(710*e2), (int)(85*e1), (int)(21*e2));
		panel.add(btnImprimer);
		getEnseignant(comboBox_6);
		traitement(annees, "Janvier");

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

				Menu_classes inscription= new Menu_classes();				inscription.frmEducsoftWelcome.setVisible(true);
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
		
		lblParamtrageClasse2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Gestion_Perso inscription= new Gestion_Perso();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblParamtrageClasse2.setBackground(Color.WHITE);
				lblParamtrageClasse2.setForeground(Color.BLACK);
				lblParamtrageClasse2.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblParamtrageClasse2.setForeground(Color.WHITE);

				lblParamtrageClasse2.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				lblParamtrageClasse2.setBackground(Color.WHITE);
				lblParamtrageClasse2.setForeground(Color.BLACK);
				lblParamtrageClasse2.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
			 
			
		});
		
 
		 
	}
	String id_ecol=init.getIdEcole();
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_6;
	private String mois="Janvier";
	private JButton btnInscrire;
	private JLabel net, sbase, h_sup, prim, lblNom_1, lblPrnoms_1, lblMoisXxxxxxxx,lblDate;
	private String [] names, ordres;
	List<String> matric= new ArrayList(500);
	
	
	private void getEnseignant(JComboBox comboBox_1) {
		
		String create= "CREATE TABLE IF NOT EXISTS enseignants_"+id_ecol.replaceAll("-", "")+" (nom VARCHAR(255),prenoms VARCHAR(255),matricule VARCHAR (255),diplome VARCHAR (255),grade VARCHAR (255),matieres TEXT,contact VARCHAR (255),autre TEXT)";
		 

		List<String> list= new ArrayList(500);
		int compt=0;
		
		JSONArray js= init.getEnseignant("enseignants_"+id_ecol.replaceAll("-", ""), "1", create);
		if(js==null)
			return;
		for(int i=0; i<js.length(); i++) {
			JSONObject rs;
			try {
				rs = js.getJSONObject(i);
				String nom=rs.getString("nom");
				String prenom=rs.getString("prenoms");
				String matricule=rs.getString("matricule");
				String diplome=rs.getString("diplome");
				String grade=rs.getString("grade");
				String matieres=rs.getString("matieres");
				String contact=rs.getString("contact"); 				
				compt++;
				matric.add(matricule);
				list.add(nom+" "+prenom+"\t"+matricule+"\t"+diplome+"\t"+grade+"\t"+matieres+"\t"+contact);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if(js.length()==0)
			return;
		System.out.println("\n"+compt);
		if(compt!=0) {
			infos_prof=new String[compt];
			 names=new String[compt];
			String[] names2=new String[compt];
			 ordres=new String[compt];
			 
			for(int i=0; i<compt; i++) {
				names[i]= list.get(i).substring(0, list.get(i).indexOf('\t'));
				names2[i]=names[i];
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
					
				//	ordres[pos]=String.valueOf(i); 
				//	ordres[i]=String.valueOf(pos);
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
			matr=matric.get(Integer.parseInt(ordres[0])); 
			/*CONSTITUTION DE OBJECT*/
			comboBox_1.setModel(new DefaultComboBoxModel(names));
			comboBox_1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					matr=matric.get(Integer.parseInt(ordres[comboBox_1.getSelectedIndex()]));
					traitement(annees, mois);
				}
				
			});
			
			
			
		}

	}
	private String matr="";

	private void traitement(String annees, String mois) {
		String mat=matr;
		String create= "CREATE TABLE IF NOT EXISTS enseignantssalaires_"+id_ecol.replaceAll("-", "")+" (matricule VARCHAR(255),mh VARCHAR(255),th VARCHAR (255),hs VARCHAR (255),ths VARCHAR (255),prime VARCHAR (255),mois TEXT,annees VARCHAR (255),autre TEXT)";


			JSONArray js= init.getEnseignantSalaire("enseignantssalaires_"+id_ecol.replaceAll("-", ""), "matricule='"+mat+"' and mois='"+mois+"' and annees='"+annees+"'", create);
			if(js==null) {
				btnInscrire.setText("SAUVEGARDER");
				afficher("0","0","0", "0", "0");
				remplir_case("0","0","0", "0", "0");
			}else {
				if(js.toString().equals("[]")) {
					btnInscrire.setText("SAUVEGARDER");
					afficher("0","0","0", "0", "0");
					remplir_case("0","0","0", "0", "0");
				}else {
					btnInscrire.setText("METTRE A JOUR");
					for(int t=0; t<js.length(); t++) {
						if(t!=js.length()-1)
							continue;
						JSONObject rs;
						try {
							rs = js.getJSONObject(t);
							String mh= rs.getString("mh");
							String th= rs.getString("th");
							String hs= rs.getString("hs");
							String ths= rs.getString("ths");
							String prime= rs.getString("prime");
							afficher(mh, th, hs, ths, prime);
							remplir_case(mh, th, hs, ths, prime);
							int pos=0;
							for(int i=0;i<matric.size(); i++) {
								if((matric.get(Integer.parseInt(ordres[i]))).equals(mat)) {
									pos=i;
									break;
								}
							}
							 
							String nm=names[pos];
							 
							lblNom_1.setText("Nom: "+nm.substring(0, nm.indexOf(" ")));
							lblPrnoms_1.setText("Prénoms: "+nm.substring(nm.indexOf(" ")+1));
							lblMoisXxxxxxxx.setText("Mois de "+mois+" / "+annees);	
							SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");					
							if(rs.getString("autre").equals("ras")){
								lblDate.setText("Date: "+sd.format(new Date(System.currentTimeMillis())));
								 
							}else {
								long date= Long.parseLong(rs.getString("autre"));
								lblDate.setText("Date: "+sd.format(new Date(date)));
							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}
			}
		
	}
	
	private void inserer(String mat, String annees, String mois, String mh, String th, String hs, String ths, String prime) {
		String create= "CREATE TABLE IF NOT EXISTS enseignantssalaires_"+id_ecol.replaceAll("-", "")+" (matricule VARCHAR(255),mh VARCHAR(255),th VARCHAR (255),hs VARCHAR (255),ths VARCHAR (255),prime VARCHAR (255),mois TEXT,annees VARCHAR (255),autre TEXT)";
		
		/*if(!btnInscrire.getText().toString().equalsIgnoreCase("mettre a jour")) {
			String query= "INSERT INTO `enseignantssalaires_"+id_ecol.replaceAll("-", "")+"` (`matricule`, `mh`, `th`, `hs`, `ths`, `prime`, `mois`, `annees`, `autre`)"
					+ " VALUES ('"+mat+"','"+mh+"','"+th+"','"+hs+"','"+ths+"','"+prime+"','"+mois+"','"+annees+"','"+String.valueOf(System.currentTimeMillis())+"')";
			
			System.out.println("\nINSERTION\n");
			
			if(init.inserer(sql, "Sauvegarde réussie !", "Echec de la sauvegarde!")==0) {
				traitement(annees, mois);
				
			}
		}else {
			/*String sql= "UPDATE `enseignantsSalaires_"+id_ecol.replaceAll("-", "") +"SET `(`matricule`, `mh`='+"+mh+"'", `th`, `hs`, `ths`, `prime`, `mois`, `annees`, `autre`)"
					+ " VALUES ('"+mat+"','"+mh+"','"+th+"','"+ths+"','"+prime+"','"+mois+"','"+annees+"','ras')";
			
			
			if(init.inserer(sql, "Sauvegarde réussie !", "Echec de la sauvegarde!")==0) {
				
			}*//*
		}*/
		String query= "INSERT INTO `enseignantssalaires_"+id_ecol.replaceAll("-", "")+"` (`matricule`, `mh`, `th`, `hs`, `ths`, `prime`, `mois`, `annees`, `autre`)"
			+ " VALUES ('"+mat+"','"+mh+"','"+th+"','"+hs+"','"+ths+"','"+prime+"','"+mois+"','"+annees+"','"+String.valueOf(System.currentTimeMillis())+"')";
	
		System.out.println("\nINSERTION\n");
	 
		if(init.inserer_(query, "enseignantssalaires_"+id_ecol.replaceAll("-", ""), create, "mh", "Sauvegarde réussie !", "Echec de la sauvegarde!")==0) {
			traitement(annees, mois);	
		}
	}
	
	private void afficher(String mh, String th, String hs, String ths, String prime) {
		int mh1=Integer.parseInt(mh);
		int th1=Integer.parseInt(th);
		int hs1=Integer.parseInt(hs);
		int ths1=Integer.parseInt(ths);
		int pr=Integer.parseInt(prime);
		sbase.setText((mh1*th1)+"");
		h_sup.setText((hs1*ths1)+"");
		prim.setText((pr)+"");
		net.setText((mh1*th1+(hs1*ths1)+pr)+" FCFA");
	}
	
	private void remplir_case(String mh, String th, String hs, String ths, String pr ) {
		textField_6.setText(pr);
		textField_5.setText(ths);
		textField_1.setText(hs);
		textField_3.setText(th);
		textField_2.setText(mh);
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
