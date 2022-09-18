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
import java.lang.Object;
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
import java.text.DecimalFormat;
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
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.JScrollPane;
import java.awt.Component;

public class Bulletin {

	JFrame frmEducsoftWelcome;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JPanel panel_5;	private JButton btnExporterVersExcel, btnSuivant;
	 
	private Initialize init=new Initialize();
	private JLabel name_label, classe,lblMoyenneAnnuelle, label, matri_label, lblEditedByEducsoftvibecro,lblNbTouteRature,label_4,label_5, lbler,lblAssezbien,lblTableauDhonneur, label_6,label_7;
	private JScrollPane scrollPane ;

	/**
	 * Launch the application.
	 */
	public static void demarre(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bulletin window = new Bulletin();
					window.frmEducsoftWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	public static void main(String [] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bulletin window = new Bulletin();
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
	public Bulletin() {
		initialize();
	}
	private float e1, e2;
	/**
	 * Initialize the contents of the frame.
	 */ 
	private void initialize() {
		frmEducsoftWelcome = new JFrame();
	//	frmEducsoftWelcome.setResizable(false);
		frmEducsoftWelcome.setTitle("Educsoft - "+init.lire_le_fichier(Constantes.ecole_name)+" - BULLETIN DE LA "+init.lire_le_fichier(Constantes.current_classe));

		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		 e1= ((float)dim.getWidth()/1571);  e2=(float) dim.getHeight()/863;
		 frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
			
		frmEducsoftWelcome.setBounds(0, 0, 101101, 870);
		frmEducsoftWelcome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEducsoftWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEducsoftWelcome.getContentPane().setLayout(null);
	
		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		//scrollPane_1.setViewportView(panel_5);
		panel_5.setBackground(Color.WHITE);
		panel_5.setMinimumSize(new Dimension(820, 2000));
		panel_5.setPreferredSize(new Dimension(820, 2000));
		panel_5.setBounds((int)(234*e1), (int)(133*e2), (int)(820*e1), (int)(690*e2)); 
		panel_5.setLayout(null);
			
		JScrollPane scrollPane_1 = new JScrollPane(panel_5);
		scrollPane_1.setAutoscrolls(true);
		scrollPane_1.setMinimumSize(new Dimension(840, 200)); 
		scrollPane_1.setPreferredSize(new Dimension(840, 200));
		scrollPane_1.setBounds((int)(234*e1), (int)(133*e2), (int)(863*e1), (int)(690*e2));
		scrollPane_1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frmEducsoftWelcome.getContentPane().add(scrollPane_1);
		 
		 JPanel panel_6 = new JPanel();
		 panel_6.setBorder(new LineBorder(new Color(105, 105, 105), 1, true));
		 panel_6.setBounds((int)(5), (int)(299), (int)(820), (int)(148));
		 //panel_6.setBounds((int)(5*e1), (int)(299*e2), (int)(834*e1), (int)(148*e2));
		 panel_5.add(panel_6);
		 panel_6.setLayout(null);
		 
		 JLabel lblMoyenneSemestrielle = new JLabel("Total g\u00E9n\u00E9ral:");
		 lblMoyenneSemestrielle.setFont(new Font("Calibri", Font.BOLD, 14));
		 lblMoyenneSemestrielle.setBounds((int)(10*e1), (int)(20*e2), (int)(197*e1), (int)(17*e2));
		 panel_6.add(lblMoyenneSemestrielle);
		 
		 JLabel lblMoyenneTrimestrielle = new JLabel("Moyenne Trimestrielle :");
		 lblMoyenneTrimestrielle.setFont(new Font("Calibri", Font.BOLD, 14));
		 lblMoyenneTrimestrielle.setBounds((int)(10*e1), (int)(47*e2), (int)(197*e1), (int)(17*e2));
		 panel_6.add(lblMoyenneTrimestrielle);
		 
		 JLabel lblRang = new JLabel("Rang:");
		 lblRang.setFont(new Font("Calibri", Font.BOLD, 14));
		 lblRang.setBounds((int)(10*e1), (int)(74*e2), (int)(197*e1), (int)(17*e2));
		 panel_6.add(lblRang);
		 
		 JLabel lblDcision = new JLabel("D\u00E9cision:");
		 lblDcision.setFont(new Font("Calibri", Font.BOLD, 14));
		 lblDcision.setBounds((int)(10*e1), (int)(101*e2), (int)(197*e1), (int)(17*e2));
		 panel_6.add(lblDcision);
		 
		 JLabel lblPlusForteMoyenne = new JLabel("Plus forte moyenne :");
		 lblPlusForteMoyenne.setFont(new Font("Calibri", Font.BOLD, 14));
		 lblPlusForteMoyenne.setBounds((int)(533*e1), (int)(20*e2), (int)(197*e1), (int)(17*e2));
		 panel_6.add(lblPlusForteMoyenne);
		 
		 JLabel lblPlusFaibleMoyenne = new JLabel("Plus faible moyenne :");
		 lblPlusFaibleMoyenne.setFont(new Font("Calibri", Font.BOLD, 14));
		 lblPlusFaibleMoyenne.setBounds((int)(533*e1), (int)(59*e2), (int)(197*e1), (int)(17*e2));
		 panel_6.add(lblPlusFaibleMoyenne);
		 
		 label_4 = new JLabel("0000");
		 label_4.setForeground(Color.BLUE);
		 label_4.setFont(new Font("Calibri", Font.BOLD, 15));
		 label_4.setBounds((int)(200*e1), (int)(22*e2), (int)(76*e1), (int)(19*e2));
		 panel_6.add(label_4);
		 
		 label_5 = new JLabel("00.00");
		 label_5.setForeground(Color.BLUE);
		 label_5.setFont(new Font("Calibri", Font.BOLD, 15));
		 label_5.setBounds((int)(200*e1), (int)(47*e2), (int)(76*e1), (int)(19*e2));
		 panel_6.add(label_5);
		 
		 lbler = new JLabel("1er");
		 lbler.setForeground(Color.BLUE);
		 lbler.setFont(new Font("Calibri", Font.BOLD, 15));
		 lbler.setBounds((int)(200*e1), (int)(73*e2), (int)(76*e1), (int)(19*e2));
		 panel_6.add(lbler);
		 
		 lblTableauDhonneur = new JLabel("Tableau d'honneur");
		 lblTableauDhonneur.setForeground(Color.BLUE);
		 lblTableauDhonneur.setFont(new Font("Calibri", Font.BOLD, 15));
		 lblTableauDhonneur.setBounds((int)(200*e1), (int)(101*e2), (int)(216*e1), (int)(19*e2));
		 panel_6.add(lblTableauDhonneur);
		 
		 label_6 = new JLabel("00.00");
		 label_6.setForeground(Color.BLUE);
		 label_6.setFont(new Font("Calibri", Font.BOLD, 15));
		 label_6.setBounds((int)(708*e1), (int)(20*e2), (int)(76*e1),(int)( 19*e2));
		 panel_6.add(label_6);
		 
		 label_7 = new JLabel("00.00");
		 label_7.setForeground(Color.BLUE);
		 label_7.setFont(new Font("Calibri", Font.BOLD, 15));
		 
		 label_7.setBounds((int)(708*e1), (int)(59*e2), (int)(76*e1), (int)(19*e2));
		 panel_6.add(label_7);
		 
		 JLabel ecoleName = new JLabel("ECOLE NAME"/*init.lire_le_fichier(Constantes.ecole_name)*/);
		 ecoleName.setBounds(0, (int)(53*e2), (int)(848*e1), (int)(20*e2));
		 ecoleName.setBounds(0, (int)(53 ), (int)(848 ), (int)(20 ));
		 panel_5.add(ecoleName);
		 ecoleName.setFont(new Font("Tahoma", Font.BOLD, 16));
		 ecoleName.setHorizontalAlignment(SwingConstants.CENTER);
		 
		 JPanel panel_7 = new JPanel();
		 panel_7.setOpaque(false);
		 panel_7.setLayout(null);
		 panel_7.setBorder(new LineBorder(new Color(105, 105, 105), 1, true));
		 //panel_7.setBounds(0, (int)(457*e2), (int)(848*e1), (int)(148*e2));
		 panel_7.setBounds(0, (int)(457), (int)(840), (int)(148));
		 panel_5.add(panel_7);
		 
		 JLabel lblDirecteurName = new JLabel("Directeur Name");
		 lblDirecteurName.setHorizontalAlignment(SwingConstants.CENTER);
		 lblDirecteurName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		 lblDirecteurName.setBounds((int)(532*e1), (int)(104*e2), (int)(321*e1), (int)(34*e2));
		 panel_7.add(lblDirecteurName);
		 
		 JLabel lblAppreciationDuDirecteur = new JLabel("APPRECIATION DU DIRECTEUR");
		 lblAppreciationDuDirecteur.setBorder(new LineBorder(new Color(105, 105, 105), 1, true));
		 lblAppreciationDuDirecteur.setHorizontalAlignment(SwingConstants.CENTER);
		 lblAppreciationDuDirecteur.setForeground(Color.BLUE);
		 lblAppreciationDuDirecteur.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 21));
		// lblAppreciationDuDirecteur.setBounds(0, 0, (int)(853*e1), (int)(41*e2));
		 lblAppreciationDuDirecteur.setBounds(0, 0, (int)(853 ), (int)(41 ));
		 panel_7.add(lblAppreciationDuDirecteur);
		 
		 lblAssezbien = new JLabel("ASSEZ-BIEN ");
		 lblAssezbien.setForeground(new Color(255, 0, 0));
		 lblAssezbien.setFont(new Font("Jokerman", Font.BOLD, 45));
		 lblAssezbien.setHorizontalAlignment(SwingConstants.CENTER);
		 lblAssezbien.setBounds((int)(10*e1), (int)(51*e2), (int)(327*e1), (int)(87*e2));
		 panel_7.add(lblAssezbien);
		
		 matri_label = new JLabel("EL0002");
		 matri_label.setBounds((int)(116), (int)(182), (int)(143), (int)(19));
		// matri_label.setBounds((int)(116*e1), (int)(182*e2), (int)(143*e1), (int)(19*e2));
		 panel_5.add(matri_label);
		 matri_label.setForeground(Color.BLUE);
		 matri_label.setFont(new Font("Calibri", Font.BOLD, 15));
		 
		 JLabel infoline = new JLabel("Cel: 98989898 - Email: vibecroinc@contact.info");
		 infoline.setBounds(0, (int)(76), (int)(848), (int)(17));
		 //infoline.setBounds(0, (int)(76*e2), (int)(848*e1), (int)(17*e2));
		 panel_5.add(infoline);
		 infoline.setHorizontalAlignment(SwingConstants.CENTER);
		 infoline.setFont(new Font("Calibri", Font.BOLD, 15));
		 
		  name_label = new JLabel("M. /Mlle VITOULEY Antonio");
		  name_label.setBounds((int)(116), (int)(209), (int)(252), (int)(19));
		  //name_label.setBounds((int)(116*e1), (int)(209*e2), (int)(252*e1), (int)(19*e2));
		  panel_5.add(name_label);
		  name_label.setForeground(Color.BLUE);
		  name_label.setFont(new Font("Calibri", Font.BOLD, 15));
		  
		  JLabel lblCoefficient = new JLabel("Effectif:");
		  lblCoefficient.setBounds((int)(651), (int)(183), (int)(47), (int)(17));
		  //lblCoefficient.setBounds((int)(651*e1), (int)(183*e2), (int)(47*e1), (int)(17*e2));
		  panel_5.add(lblCoefficient);
		  lblCoefficient.setFont(new Font("Calibri", Font.BOLD, 14));
		  
		  table_1 = new JTable();
		  table_1.setBackground(new Color(255, 255, 255));
		  table_1.setBounds((int)(1*e1), (int)(25*e2), (int)(781*e1), (int)(600*e2));
		  table_1.setModel(new DefaultTableModel (
		  	new Object[][] {
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  		{null, null, null, null, null, null, null, null, null, null, null, null},
		  	},
		  	new String[] {
		  		"Mati\u00E8res", "Coef", "Moy Interro", "Dev 1", "Dev 2", "Moy", "Moy coef", "Plus forte Moy", "Plus faible Moy", "Rang", "Appr\u00E9ciation", "Signature Prof"
		  	}
		  ) {
		  	boolean[] columnEditables = new boolean[] {
		  		false, false, false, false, false, false, false, false, false, true, true, true
		  	};
		  	public boolean isCellEditable(int row, int column) {
		  		return columnEditables[column];
		  	}
		  });
		  table_1.getColumnModel().getColumn(0).setResizable(false);
		  table_1.getColumnModel().getColumn(0).setPreferredWidth(144);
		  table_1.getColumnModel().getColumn(1).setResizable(false);
		  table_1.getColumnModel().getColumn(1).setPreferredWidth(31);
		  table_1.getColumnModel().getColumn(2).setResizable(false);
		  table_1.getColumnModel().getColumn(2).setPreferredWidth(63);
		  table_1.getColumnModel().getColumn(3).setResizable(false);
		  table_1.getColumnModel().getColumn(3).setPreferredWidth(63);
		  table_1.getColumnModel().getColumn(4).setResizable(false);
		  table_1.getColumnModel().getColumn(4).setPreferredWidth(63);
		  table_1.getColumnModel().getColumn(4).setMinWidth(63);
		  table_1.getColumnModel().getColumn(5).setResizable(false);
		  table_1.getColumnModel().getColumn(5).setPreferredWidth(63);
		  table_1.getColumnModel().getColumn(6).setResizable(false);
		  table_1.getColumnModel().getColumn(6).setPreferredWidth(63);
		  table_1.getColumnModel().getColumn(7).setResizable(false);
		  table_1.getColumnModel().getColumn(7).setPreferredWidth(63);
		  table_1.getColumnModel().getColumn(8).setResizable(false);
		  table_1.getColumnModel().getColumn(8).setPreferredWidth(63);
		  table_1.getColumnModel().getColumn(9).setResizable(false);
		  table_1.getColumnModel().getColumn(9).setPreferredWidth(45);
		  table_1.getColumnModel().getColumn(10).setResizable(false);
		  table_1.getColumnModel().getColumn(10).setPreferredWidth(91);
		  table_1.getColumnModel().getColumn(11).setResizable(false);
		  table_1.getColumnModel().getColumn(11).setPreferredWidth(86);
		  
		  			table_1.setRowHeight(40);
		  			table_1.setEnabled(false);
		  			table_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		  			table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		  			table_1.setAutoCreateRowSorter(true);
		  			table_1.setRowSelectionAllowed(false);
		  			//	table_1.setBounds(1, 25, 1005, 160);
		  				//panel_5.add(table_1);
		  				table_1.setRowHeight(40);
		  				
		  				
		  				scrollPane = new JScrollPane(table_1);
		  				scrollPane.setBackground(new Color(255, 255, 255));
		  				scrollPane.setBounds((int)(5), (int)(247), (int)(836), (int)(32));
		  				//scrollPane.setBounds((int)(5*e1), (int)(247*e2), (int)(844*e1), (int)(32*e2));
		  				panel_5.add(scrollPane);
		  				table_1.setEditingColumn(0);
		  				
		  				JLabel lblMatricule = new JLabel("Matricule:");
		  				lblMatricule.setBounds((int)(27), (int)(183), (int)(62), (int)(17));
		  				//lblMatricule.setBounds((int)(27*e1), (int)(183*e2), (int)(62*e1), (int)(17*e2));
		  				panel_5.add(lblMatricule);
		  				lblMatricule.setFont(new Font("Calibri", Font.BOLD, 14));
		  				
		  				JLabel lblElve = new JLabel("El\u00E8ve        :");
		  				lblElve.setBounds((int)(27), (int)(210), (int)(62), (int)(17));
		  				//lblElve.setBounds((int)(27*e1), (int)(210*e2), (int)(62*e1), (int)(17*e2));
		  				panel_5.add(lblElve);
		  				lblElve.setFont(new Font("Calibri", Font.BOLD, 14));
		  				
		  				JLabel lblRepublilqueDuBenin = new JLabel("REPUBLIQUE DU BENIN");
		  				//lblRepublilqueDuBenin.setBounds((int)(10*e1), (int)(6*e2), (int)(838*e1), (int)(17*e2));
		  				lblRepublilqueDuBenin.setBounds((10), (int)(6), (int)(838), (int)(17));
		  				panel_5.add(lblRepublilqueDuBenin);
		  				lblRepublilqueDuBenin.setHorizontalAlignment(SwingConstants.CENTER);
		  				lblRepublilqueDuBenin.setFont(new Font("Calibri", Font.PLAIN, 14));
		  				
		  				JLabel lblMinistereDesEnseignements = new JLabel("MINISTERE DES ENSEIGNEMENTS SECONDAIRE, TECHNIQUE ET DE LA FORMATION PROFESSIONNELLE");
		  				//lblMinistereDesEnseignements.setBounds((int)(10*e1), (int)(35*e2), (int)(838*e1), (int)(17*e2));
		  				lblMinistereDesEnseignements.setBounds((int)(10), (int)(35), (int)(838), (int)(17));
		  				panel_5.add(lblMinistereDesEnseignements);
		  				lblMinistereDesEnseignements.setHorizontalAlignment(SwingConstants.CENTER);
		  				lblMinistereDesEnseignements.setFont(new Font("Calibri", Font.PLAIN, 14));
		  				
		  				JLabel year = new JLabel("ANNEE SCOLAIRE "+init.lire_le_fichier(Constantes.fichier_ann));
		  				year.setBounds(2, 103, (int)(838), (int)(17));
		  				//year.setBounds((int)(10*e1), (int)(103*e2), (int)(838*e1), (int)(17*e2));
		  				panel_5.add(year);
		  				year.setHorizontalAlignment(SwingConstants.CENTER);
		  				year.setFont(new Font("Calibri", Font.BOLD, 14));
		  				
		  				JLabel lblClasse = new JLabel("Classe :");
		  				lblClasse.setBounds((int)(651), (int)(210), (int)(47), (int)(17));
		  				//lblClasse.setBounds((int)(651*e1), (int)(210*e2), (int)(47*e1), (int)(17*e2));
		  				panel_5.add(lblClasse);
		  				lblClasse.setFont(new Font("Calibri", Font.BOLD, 14));
		  				
		  				JLabel effectif = new JLabel("01");
		  				effectif.setBounds((int)(732), (int)(182), (int)(46), (int)(19));
		  				//effectif.setBounds((int)(732*e1), (int)(182*e2), (int)(46*e1), (int)(19*e2));
		  				panel_5.add(effectif);
		  				effectif.setForeground(Color.BLUE);
		  				effectif.setFont(new Font("Calibri", Font.BOLD, 15));
		  				
		  				 classe = new JLabel(init.lire_le_fichier(Constantes.current_classe) );
		  				 classe.setBounds((int)(732), (int)(209), (int)(68), (int)(19));
		  				 //classe.setBounds((int)(732*e1), (int)(209*e2), (int)(68*e1), (int)(19*e2));
		  				 panel_5.add(classe);
		  				 classe.setForeground(Color.BLUE);
		  				 classe.setFont(new Font("Calibri", Font.BOLD, 15));
		  				 
		  				 JLabel label_2 = new JLabel("BULLETIN DE NOTES DU "+init.lire_le_fichier(Constantes.current_trim).toUpperCase() );
		  				 label_2.setHorizontalAlignment(SwingConstants.CENTER);
		  				 label_2.setForeground(Color.BLUE);
		  				 label_2.setFont(new Font("Berlin Sans FB", Font.BOLD, 27));
		  				 label_2.setBounds((int)(10), (int)(129), (int)(838), (int)(22));
		  				//label_2.setBounds((int)(10*e1), (int)(129*e2), (int)(838*e1), (int)(22*e2));
		  				 panel_5.add(label_2);
		  				 
		  				  lblNbTouteRature = new JLabel("NB: Toute rature ou surcharge des notes annule la validit\u00E9 de ce bulletin");
		  				 lblNbTouteRature.setFont(new Font("Calibri", Font.BOLD, 13));
		  				 lblNbTouteRature.setBounds((int)(10), (int)(880), (int)(766), (int)(17));
		  				 //lblNbTouteRature.setBounds((int)(10*e1), (int)(880*e2), (int)(766*e1), (int)(17*e2));
		  				 panel_5.add(lblNbTouteRature);
		  				 
		  				  lblEditedByEducsoftvibecro = new JLabel("Edited by EducSoft-VIBECRO Inc");
		  				 lblEditedByEducsoftvibecro.setHorizontalAlignment(SwingConstants.RIGHT);
		  				 lblEditedByEducsoftvibecro.setFont(new Font("Bradley Hand ITC", Font.BOLD, 11));
		  				 lblEditedByEducsoftvibecro.setBounds(0, (int)(880), (int)(834), (int)(17));
		  				//lblEditedByEducsoftvibecro.setBounds(0, (int)(880*e2), (int)(834*e1), (int)(17*e2));
		  				 
		  				 panel_5.add(lblEditedByEducsoftvibecro);
		  				 
		String title[]=new String[] {"Matières", "Coef", "Moy Interro", "Dev 1", "Dev 2", "Moy", "Moy coef", "Plus forte Moy", "Plus faible Moy", "Rang", "Appréciation", "Signature Prof"} ;
		
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
		
		JLabel lblParamtrageClasse = new JLabel("  Bordereau de note");
		lblParamtrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblParamtrageClasse.setBounds(0, (int)(52*e2), (int)(321*e1), (int)(86*e2));
		lblParamtrageClasse.setForeground(Color.WHITE);
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		//lblParamtrageClasse.setIcon(new ImageIcon(par_icon));
		panel_2.add(lblParamtrageClasse);
		
		JLabel lblInsrerUneNote = new JLabel("  Ins\u00E9rer une note");
		Image st_icon= new ImageIcon(this.getClass().getResource("/Icon 3 St.png")).getImage();
		//label.setIcon(new ImageIcon(st_icon));
		lblInsrerUneNote.setForeground(Color.WHITE);
		lblInsrerUneNote.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInsrerUneNote.setBounds(0, (int)(174*e2), (int)(331*e1), (int)(95*e2));
		panel_2.add(lblInsrerUneNote);
		
		JLabel lblBulletinsDeLa = new JLabel("  Bulletins de la classe");
		lblBulletinsDeLa.setOpaque(true);
		lblBulletinsDeLa.setBackground(Color.WHITE);
		lblBulletinsDeLa.setForeground(Color.BLACK);
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
		
		JLabel lblInscrireUnlve = new JLabel("  Inscrire un \u00E9l\u00E8ve");
		lblInscrireUnlve.setForeground(Color.WHITE);
		Image gp_icon= new ImageIcon(this.getClass().getResource("/Icon 5 Sgpp.png")).getImage();
		//label_3.setIcon(new ImageIcon(gp_icon));
		lblInscrireUnlve.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInscrireUnlve.setBounds(0, (int)(578*e2), (int)(331*e1), (int)(97*e2));
		panel_2.add(lblInscrireUnlve);
		
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
		 

		JPanel panel_10 = new JPanel();
		panel_10.setBounds((int)(dim.getWidth()-36), 0, (int)(36*e1), 2000);
		panel_10.setBackground(new Color(30, 144, 255));
		panel.add(panel_10);
		
		JLabel lblNewLabel_5 = new JLabel(init.lire_le_fichier(Constantes.ecole_name));
		lblNewLabel_5.setBackground(Color.BLUE);
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Berlin Sans FB", Font.BOLD, 70));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds((int)(183*e1), 0, (int)(1253*e1), (int)(77*e2));
		panel.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color((int)(30), (int)(144), (int)(255)));
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
		
		JLabel lblParametrageClasse = new JLabel("PARAMETRAGE CLASSE      >   "+init.lire_le_fichier(Constantes.current_classe) +"   /  "+init.lire_le_fichier(Constantes.fichier_ann));
		lblParametrageClasse.setBounds((int)(196*e1), (int)(14*e2), (int)(597*e1), (int)(25*e2));
		panel_3.add(lblParametrageClasse);
		lblParametrageClasse.setForeground(Color.WHITE);
		lblParametrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		

//AbstractTableModel model= new AbstractTableModel(getOb(), title);
	
		
		
		JLabel lblNewLabel = new JLabel("Copyright 2019 VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds((int)(1220*e1), (int)(813*e2), (int)(299*e1), (int)(13*e2));
		panel.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLUE);
		panel_4.setBounds((int)(1099*e1), (int)(131*e2), (int)(8*e1), (int)(800*e2));
		panel.add(panel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboBox.setBounds((int)(1183*e1), (int)(312*e2), (int)(318*e1), (int)(21*e2));
		panel.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("ALLEZ A:");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds((int)(1213*e1), (int)(252*e2), (int)(240*e1), (int)(26*e2));
		panel.add(lblNewLabel_6);
		
		 btnExporterVersExcel = new JButton("IMPRIMER LE BULLETIN ACTIF");
		btnExporterVersExcel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExporterVersExcel.setBounds((int)(1183*e1), (int)(419*e2), (int)(322*e1), (int)(21*e2));
		panel.add(btnExporterVersExcel);
		
		JButton btnImprimerTout = new JButton("IMPRIMER TOUT");
		btnImprimerTout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnImprimerTout.setBounds((int)(1183*e1), (int)(530*e2), (int)(322*e1), (int)(21*e2));
		panel.add(btnImprimerTout);
		
		JButton button = new JButton("< Pr\u00E9c\u00E9dant");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds((int)(1130*e1), (int)(160*e2), (int)(134*e1), (int)(21*e2));
		panel.add(button);
		
		 btnSuivant = new JButton("Suivant >");
		btnSuivant.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSuivant.setBounds((int)(1397*e1), (int)(160*e2), (int)(134*e1), (int)(21*e2));
		panel.add(btnSuivant);
		btnImprimerTout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setSelectedIndex(0);
				initialiser() ;
				runnable.run();
			}			
		});
		
		btnExporterVersExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				{				 
				
				PrinterJob pj= PrinterJob.getPrinterJob();
				pj.setJobName("Bulletin");
				pj.setPrintable(new Printable() {

					@Override
					public int print(Graphics arg0, PageFormat arg1, int index) throws PrinterException {
						if(index>0) {
							return Printable.NO_SUCH_PAGE;
						}
						
						Graphics2D g2d=(Graphics2D)arg0;
						g2d.translate(arg1.getImageableX()-0.5, arg1.getImageableY()+15);
						
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
				scrollPane.setOpaque(true);	
				}
			}
		});
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//sauver_cellule() ;		
			}
		});
		
		btnSuivant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//sauver_cellule() ;		
			}
		});
		
		

		
		lblInscrireUnlve.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Insc_eleve inscription= new Insc_eleve();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblInscrireUnlve.setBackground(Color.WHITE);
				lblInscrireUnlve.setForeground(Color.BLACK);
				lblInscrireUnlve.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblInscrireUnlve.setBackground(Color.BLUE);
				lblInscrireUnlve.setForeground(Color.WHITE);

				lblInscrireUnlve.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				lblInscrireUnlve.setBackground(Color.WHITE);
				lblInscrireUnlve.setForeground(Color.BLACK);

				lblInscrireUnlve.setOpaque(true);
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
				frmEducsoftWelcome.setVisible(false);
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
	
		lblStatistiques.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Stat_classes inscription= new Stat_classes();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
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
		
		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		
		remplir_effectif(init.lire_le_fichier(Constantes.fichier_ann), effectif);
		
		remplir_matieres(init.lire_le_fichier(Constantes.fichier_ann), init.lire_le_fichier(Constantes.current_classe), panel_6, panel_7, effectif);
		
		 lblMoyenneAnnuelle = new JLabel("Moyenne annuelle:");
		lblMoyenneAnnuelle.setVisible(false);
		lblMoyenneAnnuelle.setFont(new Font("Calibri", Font.BOLD, 14));
		lblMoyenneAnnuelle.setBounds((int)(533*e1), (int)(101*e2), (int)(197*e1), (int)(17*e2));
		panel_6.add(lblMoyenneAnnuelle);
		
		 label = new JLabel("0");
		label.setVisible(false);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Calibri", Font.BOLD, 15));
		label.setBounds((int)(708*e1), (int)(101*e2), (int)(76*e1), (int)(19*e2));
		panel_6.add(label);
		
		
		remplir_info_general_ecole(ecoleName, infoline, lblDirecteurName);
		
		remplir_eleves(init.lire_le_fichier(Constantes.current_classe),init.lire_le_fichier(Constantes.fichier_ann), comboBox   , name_label, matri_label, effectif, button, btnSuivant);
		
		label_20 = new JLabel("");
		label_20.setBorder(new LineBorder(new Color(0, 0, 0)));
		//label_20.setBounds((int)(732*e1), (int)(10*e2), (int)(99*e1), (int)(110*e2));
		label_20.setBounds((int)(732 ), (int)(10 ), (int)(99 ), (int)(110 ));
		panel_5.add(label_20);
		
		
	}
	private JLabel label_20;
	
	String names[], matrs[];
	int lignes=0;

	protected Object[][] getOb(){
			String year= init.lire_le_fichier(Constantes.fichier_ann);
			String classe= init.lire_le_fichier(Constantes.current_classe);
			String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
			id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
			
			System.out.println("starting...");
			String create= "CREATE TABLE eleves_"+year.replaceAll("-", "")
			+"_"+id_ecol.replaceAll("-", "")
			+" (classe VARCHAR(255),nom VARCHAR(255),prenoms VARCHAR(255),date VARCHAR (255),lieu VARCHAR (255),matricule VARCHAR (255),"
			+ "cont_urgence TEXT,nom_p VARCHAR (255),prenom_p TEXT,cont_mobile VARCHAR (255),cont_domicile VARCHAR (255),cont_travail VARCHAR (255),"
			+ "profession VARCHAR (255),arrond VARCHAR (255),adresse VARCHAR (255),qtier VARCHAR (255),g_sanguin VARCHAR (255),"
			+ "electroph VARCHAR (255),sexe VARCHAR (255),logo TEXT,autre VARCHAR (255))";
						
			//String sql= "SELECT * from eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", "")+" WHERE classe = '"+classe+"'";
			 
			List<String> tab=new ArrayList(200);
			List<String> infos=new ArrayList(200);
			List<String> mats=new ArrayList(200);
			String autre="";
			Object[][] ob =new Object[15][13];
			int compt=0; 
			JSONArray js= init.getEcoles("eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "classe = '"+classe+"'", create);
			if(js==null)
				return ob;
			for(int i=0; i<js.length(); i++) {
				JSONObject rs;
				try {
					rs = js.getJSONObject(i);
					tab.add(rs.getString("nom")+" "+rs.getString("prenoms"));
					mats.add(rs.getString("matricule"));
					compt++;
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(js.length()==0)
				return ob;
			names= new String[compt];
			matrs= new String[compt];
			String ordres[] = new String[compt];
			for(int i=0; i<compt; i++) {
				if(tab.get(i)!=null) {
					names[i]=tab.get(i);
					ordres[i]=String.valueOf(i);
				}
				if(mats.get(i)!=null) {
					matrs[i]=mats.get(i);
				}
			}
			
			for(int i=0; i<compt; i++) {
				String min= names[i];
				int pos=0;				
				for(int j=i; j<compt; j++) {
					if(init.inferieur(names[j], min)) {
						min= names[j];
						pos=j; 
					}
				} 
				if(pos!=0) {
					names[pos]=names[i];
					names[i]=min;
					String val= ordres[i];
					ordres[i]=String.valueOf(pos);
					ordres[pos]=val; 
				//	System.out.println("\nOrdre "+i+": "+ordres[i]);
					
					String val2= matrs[i];
					matrs[i]=matrs[pos];
					matrs[pos]=val2;
				} 
			}
			lignes=compt;
			ob=new Object[compt+5][13];
			for(int i=0; i<compt; i++) {
				ob[i][0]=(i+1);
				ob[i][1]= names[i];
			//	System.out.println("\nOrdre "+i+": "+ob[i][1]);
			}
			
			
			
		
		

		return ob;
	}
	
	//Handler handler;
	Runnable runnable;
	
	private void initialiser() {
		runnable= new Runnable() {
			@Override
			public void run() {
				btnExporterVersExcel.doClick();
				if(btnSuivant.isEnabled()) {
					btnSuivant.doClick();	
					try {
						runnable.wait(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						runnable.run();
					}
				}
			}
			
		};
		
	}
	
	boolean bon=true;
	

	public float calcul_MI(String I1, String I2, String I3, String I4) {
		float MI=0;
		if(!I1.equals("")&&I2.equals("")&&I3.equals("")&&I4.equals(""))              //I1
			MI=Float.parseFloat(I1);	
		else if(I1.equals("")&&!I2.equals("")&&I3.equals("")&&I4.equals(""))		//I2
			MI=Float.parseFloat(I2);
		else if(I1.equals("")&&I2.equals("")&&!I3.equals("")&&I4.equals(""))		//I3
			MI=Float.parseFloat(I3);
		else if(I1.equals("")&&I2.equals("")&&I3.equals("")&&!I4.equals(""))		//I4
			MI=Float.parseFloat(I4);	
		else if (!I1.equals("")&&!I2.equals("")&&I3.equals("")&&I4.equals("")) 			//I1 - I2
			MI=(Float.parseFloat(I1)+Float.parseFloat(I2))/2;
		else if (!I1.equals("")&&I2.equals("")&&!I3.equals("")&&I4.equals("")) 			//I1 - I3
			MI=(Float.parseFloat(I1)+Float.parseFloat(I3))/2;
		else if (!I1.equals("")&&I2.equals("")&&I3.equals("")&&!I4.equals("")) 			//I1 - I4
			MI=(Float.parseFloat(I1)+Float.parseFloat(I4))/2;
		else if (I1.equals("")&&!I2.equals("")&&!I3.equals("")&&I4.equals("")) 				//I3 - I2
			MI=(Float.parseFloat(I2)+Float.parseFloat(I3))/2;
		else if (I1.equals("")&&!I2.equals("")&&I3.equals("")&&!I4.equals("")) 			//I4 - I2
			MI=(Float.parseFloat(I2)+Float.parseFloat(I4))/2;
		else if (I1.equals("")&&I2.equals("")&&!I3.equals("")&&!I4.equals(""))    		//I3 - I4
			MI=(Float.parseFloat(I4)+Float.parseFloat(I3))/2;
		else if (!I1.equals("")&&!I2.equals("")&&!I3.equals("")&&I4.equals("")) 		//I1 - I2  -I3
			MI=(Float.parseFloat(I1)+Float.parseFloat(I2)+Float.parseFloat(I3))/3;
		else if (!I1.equals("")&&!I2.equals("")&&I3.equals("")&&!I4.equals(""))			 //I1 - I2  -I4
			MI=(Float.parseFloat(I1)+Float.parseFloat(I2)+Float.parseFloat(I4))/3;		
		else if (!I1.equals("")&&I2.equals("")&&!I3.equals("")&&!I4.equals("")) 		 //I1 - I3  -I4
			MI=(Float.parseFloat(I1)+Float.parseFloat(I3)+Float.parseFloat(I4))/3;		
		else if (I1.equals("")&&!I2.equals("")&&!I3.equals("")&&!I4.equals("")) 		 //I2 - I3  -I4
			MI=(Float.parseFloat(I2)+Float.parseFloat(I3)+Float.parseFloat(I4))/3;		
		else if (!I1.equals("")&&!I2.equals("")&&!I3.equals("")&&!I4.equals("")) 		 //I1 - I2 - I3  -I4
			MI=(Float.parseFloat(I1)+Float.parseFloat(I2)+Float.parseFloat(I3)+Float.parseFloat(I4))/4;	
		else
			MI=-1;
		
		
		
		
		
		return MI;
	}
	
	
	public float calcul_MS(String MI, String D1, String D2) {
		float MS=0;
			if(!MI.equals("")&&D1.equals("")&&D2.equals(""))		//MI
				MS=Float.parseFloat(MI);
			else if(MI.equals("")&&!D1.equals("")&&D2.equals(""))	//D1
				MS=Float.parseFloat(D1);
			else if(MI.equals("")&&D1.equals("")&&!D2.equals(""))		//D2
				MS=Float.parseFloat(D2);
			else if(!MI.equals("")&&!D1.equals("")&&D2.equals(""))		//MI-D1
				MS=(Float.parseFloat(MI)+Float.parseFloat(D1))/2;
			else if(!MI.equals("")&&D1.equals("")&&!D2.equals(""))		//MI -D2
				MS=(Float.parseFloat(MI)+Float.parseFloat(D2))/2;
			else if(MI.equals("")&&!D1.equals("")&&!D2.equals(""))		//D1 -D2
				MS=(Float.parseFloat(D2)+Float.parseFloat(D1))/2;
			else if(!MI.equals("")&&!D1.equals("")&&!D2.equals(""))		//MI - D1 -D2
				MS=(Float.parseFloat(MI)+Float.parseFloat(D2)+Float.parseFloat(D1))/3;
			else
				MS=-1;
			
				
				
				
		return MS;
	}
	
	
	private String id_ecol="";
	private List<String> imgs, matric_v;
	private String ordres[];
	private void remplir_eleves(String classe, String year, JComboBox comboBox_2, JLabel nom, JLabel matricule, JLabel effectif, JButton prece, JButton next) {

		String create= "CREATE TABLE IF NOT EXISTS eleves_"+year.replaceAll("-", "")
		+"_"+id_ecol.replaceAll("-", "")
		+" (classe VARCHAR(255),nom VARCHAR(255),prenoms VARCHAR(255),date VARCHAR (255),lieu VARCHAR (255),matricule VARCHAR (255),"
		+ "cont_urgence TEXT,nom_p VARCHAR (255),prenom_p TEXT,cont_mobile VARCHAR (255),cont_domicile VARCHAR (255),cont_travail VARCHAR (255),"
		+ "profession VARCHAR (255),arrond VARCHAR (255),adresse VARCHAR (255),qtier VARCHAR (255),g_sanguin VARCHAR (255),"
		+ "electroph VARCHAR (255),sexe VARCHAR (255),logo TEXT,autre VARCHAR (255))";
		//init.create_table(sql2);
		
		
		String sql= "SELECT * from eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", "")+" WHERE classe = '"+classe+"'";
		 
		List<String> tab=new ArrayList(200);
		List<String> infos=new ArrayList(200);
		String autre="";
		imgs=new ArrayList(200);
		matric_v=new ArrayList(200);
		
		 
		JSONArray js=init.getEleves("eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "classe = '"+classe+"'", create);
		if(js==null)
			return;
		for(int i =0; i<js.length();i++) {
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
				matric_v.add(rs.getString("matricule"));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if(js.length()==0)
			return;
		
		int p=0;
		for(int i=0; i<tab.size(); i++) {
			if(tab.get(i)!=null)
				p++;
		}
		final int compt=p;
		String names[]= new String[compt];
		String names2[]= new String[compt];
		 ordres= new String[compt];
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

			//	System.out.println("\nOrdre "+i+": "+ordres[i]);
			} 
		}
		/*
		for(int i=0; i<compt; i++)
			System.out.println("\nOrdre "+i+": "+ordres[i]);
		*/
		comboBox_2.setModel(new DefaultComboBoxModel(names));
		 
		comboBox_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 
				String info= infos.get(Integer.parseInt(ordres[comboBox_2.getSelectedIndex()]));
				List<String> details= new ArrayList(19);
				int anc_pos=0, pos=0; 
				for(int i=0; i<info.length(); i++) {
					if(info.charAt(i)=='\n') {
						details.add(info.substring(anc_pos, i));
						anc_pos=i+1;
					}
				}
				
				nom.setText(details.get(0)+" "+details.get(1));
				matricule.setText(details.get(4));
				String txt=imgs.get(Integer.parseInt(ordres[comboBox_2.getSelectedIndex()]));
				
				if(txt!=null) {

					for(int i=0; i<txt.length(); i++)
						txt=txt.replace('/', '\\');
					if(!txt.equals("mise")&&!txt.isEmpty()&&!txt.equals("ras")) {
						 
						ImageIcon img=new ImageIcon(txt);
						if(img.getIconWidth()>0){
							Image image= img.getImage();
							Image image2=image.getScaledInstance(label_20.getWidth()	, label_20.getHeight(), Image.SCALE_SMOOTH);
							ImageIcon icon= new ImageIcon(image2);
							label_20.setIcon(icon);
						}
					}
				}else {
					label_20.setIcon(null);
				}
				retrieve_note(classe, details.get(4), effectif);
				if(comboBox_2.getSelectedIndex()==0) {
					prece.setEnabled(false);
					next.setEnabled(true);
				}else if(comboBox_2.getSelectedIndex()==compt-1) {
					prece.setEnabled(true);
					next.setEnabled(false);
				}else {
					prece.setEnabled(true);
					next.setEnabled(true);
				}
			}
			
		});
		

		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				comboBox_2.setSelectedIndex(comboBox_2.getSelectedIndex()+1);
			}
		});
		
		prece.setEnabled(false);
		next.setEnabled(true);

		prece.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				comboBox_2.setSelectedIndex(comboBox_2.getSelectedIndex()-1);
			}
		});
		comboBox_2.setSelectedIndex(0);
		
		 
	
	
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

	
	private void retrieve_note(String classe, String matricule, JLabel effectif) {
		
		String create= "CREATE TABLE IF NOT EXISTS notes_"+
				init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", "")+
				"(classe VARCHAR(255), matricule VARCHAR(255), matieres VARCHAR(255),I1 VARCHAR(255),I2 VARCHAR(255),I3 VARCHAR(255),I4 VARCHAR(255),MI VARCHAR(255) ,D1 VARCHAR(255),D2 VARCHAR(255),MS VARCHAR (255),coef VARCHAR (255),MC VARCHAR (255),autre TEXT)";

		JSONArray js1= init.getNotes("notes_"+
				init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", ""), "classe='"+classe+"' and matricule='"+matricule+"' and autre='"+init.lire_le_fichier(Constantes.fichier_ann)+"'", create);
		if(js1==null)
			return;

		DecimalFormat df= new DecimalFormat( "##.##" ) ;
		boolean vrai=false;
	 
		for(int y=0; y<js1.length(); y++) {
			JSONObject rs;
			try {
				rs = js1.getJSONObject(y);
				String matieres= rs.getString("matieres"); 
				String MI= rs.getString("MI");
				String D1= rs.getString("D1");
				String D2= rs.getString("D2");
				String MS= rs.getString("MS");
				String MC= rs.getString("MC"); 
				String coef= rs.getString("coef"); 
				int pos=0;
				int rang=0;
				for(int i=0; i<list.size(); i++) {					 
					if(list.get(i).equals(matieres)) {
						pos=i;
						break;
					}
				}
				for(int i=0; i<Integer.parseInt(effectif.getText().toString()); i++) {					 
					if(MS.equals(rangs[pos][i])) {
						rang=i+1;
						break;
					}
				}
				if(rang==0)
					rang=Integer.parseInt(effectif.getText().toString());
						
				String rg=rang+"e";
				if(rang==1)
					rg="1er";
				
				table_1.setValueAt(matieres, pos, 0) ;
				table_1.setValueAt(coef.equals("")?"**.**":df.format(Float.parseFloat(coef)), pos, 1) ;
				table_1.setValueAt(MI.equals("")?"**.**":df.format(Float.parseFloat(MI)), pos, 2 );
				table_1.setValueAt(D1.equals("")?"**.**":df.format(Float.parseFloat(D1)), pos, 3);
				table_1.setValueAt(D2.equals("")?"**.**":df.format(Float.parseFloat(D2)), pos, 4);
				table_1.setValueAt(MS.equals("")?"**.**":df.format(Float.parseFloat(MS)), pos, 5);
				table_1.setValueAt(MC.equals("")?"**.**":df.format(Float.parseFloat(MC)), pos, 6);
				table_1.setValueAt(rg, pos, 9);
				if(table_1.getValueAt(pos, 7).equals("*/*")&&table_1.getValueAt(pos, 8).equals("*/*"))
					table_1.setValueAt("**.**", pos, 9);
					
				
				
				String mention="Passable";
				if(MS.isEmpty())
					MS="0";
				float ms= Float.parseFloat(MS);
				if(ms<3)
					mention="Nul";
				else if(ms<10)
					mention="Mal";
				else if(ms < 12)
					mention="Passable";
				else if (ms<14)
					mention="A-Bien";
				else if(ms<16)
					mention="Bien";
				else if (ms<18)
					mention="Très Bien";
				else if (ms<20)
					mention ="Excellent";
				
	
				table_1.setValueAt(mention, pos, 10);
	
				if(table_1.getValueAt(pos, 7).equals("*/*")&&table_1.getValueAt(pos, 8).equals("*/*"))
					table_1.setValueAt(" ", pos, 10);
				vrai=true;
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		 
		
		int position= 0;
		for(int i=0; i<Integer.parseInt(effectif.getText().toString()); i++) {
			if(ordre_rang[i]!=null) {
				if(ordre_rang[i].equals(matricule)) {
					position= i;
				}
			}
		}
		label_4.setText(df.format(Float.parseFloat(moys_gene.get(position))));
		label_5.setText(df.format(Float.parseFloat(moys_total.get(position))));
		
		

		String mention="Passable", decision="Blâme";
		float ms= Float.parseFloat(moys_total.get(position));
		if(ms<3) {
			mention="Nul";
			decision="Blâme";
		}else if(ms<10) {
			mention="Mal";
			decision="Avertissement";
		}else if(ms < 12) {
			mention="Passable";
			decision="Doit redoubler d'effort";
		}else if (ms<14) {
			mention="Assez-Bien";
			decision="Tableau d'honneur";
		}else if(ms<16) {
			mention="Bien";
			decision="Tableau d'honneur + Encouragement";
		}else if (ms<18) {
			mention="Très Bien";
			decision="Tableau d'honneur + Encouragement + Félicitations";
		}else if (ms<20) {
			mention ="Excellent";
			decision="Tableau d'honneur + Encouragements + Félicitations";
		}
		lblAssezbien.setText(mention);
		lblTableauDhonneur.setText(decision);
		
		position++;
		String rg=position+"ème";
		if(position==1)
			rg="1er";
		lbler.setText(rg);
		label_6.setText(df.format(Float.parseFloat(moys_total.get(0))));
		label_7.setText(df.format(Float.parseFloat(moys_total.get(Integer.parseInt(effectif.getText().toString())-1))));
		if(!vrai)
		{ 
			for(int pos=0; pos<lignes; pos++) {
				table_1.setValueAt("**.**", pos, 1) ;
				table_1.setValueAt("**.**", pos, 2 );
				table_1.setValueAt("**.**", pos, 3);
				table_1.setValueAt("**.**", pos, 4);
				table_1.setValueAt("**.**", pos, 5);
				table_1.setValueAt("**.**", pos, 6);
				table_1.setValueAt("**.**", pos, 9);
				if(table_1.getValueAt(pos, 7).equals("*/*")&&table_1.getValueAt(pos, 8).equals("*/*"))
					table_1.setValueAt("**.**", pos, 9);
	
				table_1.setValueAt("**.**", pos, 10);
			}

			
		}
		String create2= "CREATE TABLE IF NOT EXISTS moyennes_"+id_ecol.replaceAll("-", "")+" (Trimestre1 VARCHAR(255),Trimestre2 VARCHAR(255),Trimestre3 VARCHAR(255), matricule VARCHAR(255), classe TEXT, annees TEXT, autre TEXT)";
		String trim= init.lire_le_fichier(Constantes.current_trim);
		
		
		String moy__= String.valueOf(ms);
		
		JSONArray js2= init.getMoyennes( "moyennes_"+id_ecol.replaceAll("-", ""), "classe='"+init.lire_le_fichier(Constantes.current_classe)+"' and matricule='"+matricule+"' and annees='"+init.lire_le_fichier(Constantes.fichier_ann)+"'", create2);
		String query= "INSERT INTO `moyennes_"+id_ecol.replaceAll("-", "")+"` (`Trimestre1`, `Trimestre2`, `Trimestre3`, `matricule`, `classe`, `annees`, `autre`) VALUES ('0','0','0', '"+matricule+"', '"+init.lire_le_fichier(Constantes.current_classe)+"', '"+init.lire_le_fichier(Constantes.fichier_ann)+"', 'ras')"; 
		
		if(js2==null) {
			return;
		}else {
			if(js2.toString().equals("[]")) {
				if(init.inserer_simple(query, "moyennes_"+id_ecol.replaceAll("-", ""), create2, "Trimestre2", "")==0) {
					
				}
			}else {
				
				String sql__= "UPDATE moyennes_"+id_ecol.replaceAll("-", "")+" SET "+trim.replaceAll(" ","")+"= '"+moy__+"' WHERE classe='"+init.lire_le_fichier(Constantes.current_classe)+"' and matricule='"+matricule+"' and annees='"+init.lire_le_fichier(Constantes.fichier_ann)+"'";
				init.update_(sql__, "moyennes_"+id_ecol.replaceAll("-", ""), create2, "Trimestre2");
				if(init.lire_le_fichier(Constantes.current_trim).equals("Trimestre 3")) {
					JSONArray js22= init.getMoyennes( "moyennes_"+id_ecol.replaceAll("-", ""), "classe='"+init.lire_le_fichier(Constantes.current_classe)+"' and matricule='"+matricule+"' and annees='"+init.lire_le_fichier(Constantes.fichier_ann)+"'", create2);
					for(int z=0 ; z<js22.length(); z++) {
						if(z!=js22.length())
							return;
						JSONObject rss;
						try {
							rss = js22.getJSONObject(z);
							String t1= rss.getString("Trimestre1");
							String t2= rss.getString("Trimestre2");
							String t3= rss.getString("Trimestre3");
							int to=3;
							int fait=0;
							if(t1.equals("0")||t1.equals("0.0"))
								fait++;
							
							if(t2.equals("0")||t2.equals("0.0"))
								fait++;
							
							if(t3.equals("0")||t3.equals("0.0"))
								fait++;
							
							to=to-fait; 
							if(to!=0) {
								Float moys_annuel= Float.parseFloat(t1)+Float.parseFloat(t2)+Float.parseFloat(t3);
								lblMoyenneAnnuelle.setVisible(true);
								label.setVisible(true);
								label.setText(df.format((moys_annuel/((float)to))+""));
							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}
			}
		}
		
	}

	
	
	private void remplir_effectif(String year, JLabel effectif) {
		
		System.out.println("starting...");
		String create= "CREATE TABLE IF NOT EXISTS eleves_"+year.replaceAll("-", "")
		+"_"+id_ecol.replaceAll("-", "")
		+" (classe VARCHAR(255),nom VARCHAR(255),prenoms VARCHAR(255),date VARCHAR (255),lieu VARCHAR (255),matricule VARCHAR (255),"
		+ "cont_urgence TEXT,nom_p VARCHAR (255),prenom_p TEXT,cont_mobile VARCHAR (255),cont_domicile VARCHAR (255),cont_travail VARCHAR (255),"
		+ "profession VARCHAR (255),arrond VARCHAR (255),adresse VARCHAR (255),qtier VARCHAR (255),g_sanguin VARCHAR (255),"
		+ "electroph VARCHAR (255),sexe VARCHAR (255),logo TEXT,autre VARCHAR (255))";
		 
		effectif.setText("0");
		
		JSONArray js= init.getEleves("eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "classe = '"+init.lire_le_fichier(Constantes.current_classe)+"'", create);
		if(js==null) {
			return;
		}else {

			if(js.length()==0)
				return;
			String autre="";
			int m=0, f=0;
			int pos=0;
			ordre_rang = new String[js.length()];
			for(int i=0; i<js.length(); i++) {
				JSONObject rs;
				try {
					rs = js.getJSONObject(i);
					if(rs.getString("sexe").equals("M"))
						m++;
					else
						f++;
					ordre_rang[pos]= rs.getString("matricule");
					pos++;
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			String [] total= new String[2];
			total[0]=String.valueOf(m);
			total[1]=String.valueOf(f);
			int eff= m+f;
			effectif.setText(eff+"");
		} 
		
	}


	private void remplir_info_general_ecole(JLabel ecole_name,JLabel cont,JLabel dir_) {
			
			JSONArray infos= init.getEcoles("ecoles", "id_ecl='"+id_ecol+"'", "");
			if(infos==null) {

				ecole_name.setText("");
				cont.setText("Cel:  - Email: ");
				dir_.setText("");
				return;
			}
				
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
					ecole_name.setText(nom+" - "+lieu);
					cont.setText("Cel: "+contact_ecole+" - Email: "+email_ecole);
					dir_.setText(dir_name);
					
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			
		}
	
	private List<String> list= new ArrayList(500), coefs,moys_gene ,moys_total;
	private String[][] rangs  ;
	private String[] ordre_rang; 
	public void remplir_matieres(String annees, String classe, JPanel panel6, JPanel panel7, JLabel effectif) {

		   DefaultTableCellRenderer center=new DefaultTableCellRenderer();
		   center.setHorizontalAlignment(JLabel.CENTER);
		   center.setVerticalAlignment(JLabel.CENTER);
		   DefaultTableCellRenderer center2=new DefaultTableCellRenderer( );
		   center2.setVerticalAlignment(JLabel.CENTER);
		   
		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		String create= "CREATE TABLE classes_matieres_"+id_ecol.replaceAll("-", "")+" (classe VARCHAR(255),matieres VARCHAR(255),enseignant VARCHAR(255),annees VARCHAR(255),matricule VARCHAR (255),coef VARCHAR (255),autre TEXT)";
		 
		 
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		String sql= "SELECT * FROM classes_matieres_"+id_ecol.replaceAll("-", "")+" WHERE classe='"+classe+"' and annees= '"+annees+"'";
		
		int compt=0;
		List<String> forte_moys = new ArrayList(Integer.parseInt(effectif.getText().toString()));
		List<String> faible_moys = new ArrayList(Integer.parseInt(effectif.getText().toString()));
		rangs = new String[20][Integer.parseInt(effectif.getText().toString())];
		moys_gene = new ArrayList(Integer.parseInt(effectif.getText().toString()));
		coefs = new ArrayList(Integer.parseInt(effectif.getText().toString()));
		moys_total = new ArrayList(Integer.parseInt(effectif.getText().toString()));
		
		for(int i=0; i<20; i++) {
			for(int j=0; j<Integer.parseInt(effectif.getText().toString()); j++) {
				rangs[i][j]="0";
			}
			forte_moys.add("0");
			faible_moys.add("0");
		}
		
		for(int j=0; j<Integer.parseInt(effectif.getText().toString()); j++) {
			moys_gene.add("0");
			moys_total.add("0");
			coefs.add("0"); 
			//ordre_rang[j]="0";
		} 
		
		
		JSONArray js1= init.getClassesMatieres("classes_matieres_"+id_ecol.replaceAll("-", ""), "classe='"+classe+"' and annees= '"+annees+"'", create);
		if(js1==null)
			return;
		for(int m=0; m<js1.length(); m++) {
			JSONObject rs;
			try {
				rs = js1.getJSONObject(m);
			List<String> moys= new ArrayList(Integer.parseInt(effectif.getText().toString()));
			for(int j=0; j<Integer.parseInt(effectif.getText().toString()); j++) {
				moys.add("0"); 
				//ordre_rang[j]="0";
			}
			String mat= rs.getString("matieres");
			String ens= rs.getString("enseignant");
			String coef= rs.getString("coef");
			if(coef.equals(""))
				coef="0";
			list.add(mat);//+"\n"+ens+"\n"+coef);
			compt++;
			String create3= "CREATE TABLE notes_"+
					init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", "")+
					"(classe VARCHAR(255), matricule VARCHAR(255), matieres VARCHAR(255),I1 VARCHAR(255),I2 VARCHAR(255),I3 VARCHAR(255),I4 VARCHAR(255),MI VARCHAR(255) ,D1 VARCHAR(255),D2 VARCHAR(255),MS VARCHAR (255),coef VARCHAR (255),MC VARCHAR (255),autre TEXT)";
					 				
								
				for(int t=0; t<Integer.parseInt(effectif.getText().toString()); t++) {
					String sql33= "SELECT * FROM notes_"+
							init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", "")+
							" WHERE classe='"+classe+"' and matieres='"+mat+"' and matricule='"+ordre_rang[t]+"' and autre='"+init.lire_le_fichier(Constantes.fichier_ann)+"'";
					 
					int fait=0;
				 
					JSONArray js2= init.getNotes("notes_"+
							init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", ""), "classe='"+classe+"' and matieres='"+mat+"' and matricule='"+ordre_rang[t]+"' and autre ='"+init.lire_le_fichier(Constantes.fichier_ann)+"'", create3);
					if(js2==null)
						return;
					for(int z=0; z<js2.length(); z++) {
						JSONObject rs2;
						try {
							rs2 = js2.getJSONObject(z);
							fait=1;
							String MC= rs2.getString("MS"); 
							String ma=rs2.getString("matricule");
							int val=0;
							for(int i=0; i<Integer.parseInt(effectif.getText().toString()); i++) {
								if(ordre_rang[i].equals(ma)) {
									val=i;
									break;
								}
							} 
							String c=coef;

							if(MC.equals("")||(MC.equals("0"))) {
								MC="0";
								c="0";		
							}
							moys.set(val, MC); 

							rangs[compt-1][val]= MC;
							 
							String MS= rs2.getString("MC");
							if(MS.isEmpty())
								MS="0";
							moys_gene.set(val, (Float.parseFloat(MS)+Float.parseFloat(moys_gene.get(val)))+"");
							coefs.set(val, (Integer.parseInt(c)+Integer.parseInt(coefs.get(val)))+"");
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
				for(int i=0; i<moys.size(); i++) {
					if(moys.get(i).isEmpty())
						moys.set(i, "0");
					float max= Float.parseFloat(moys.get(i)) ;
					for(int j=i; j<moys.size(); j++) {
						if(max<Float.parseFloat(moys.get(j))) {
							max=Float.parseFloat(moys.get(j));
						}
					}
					
					forte_moys.set(compt-1, String.valueOf(max)); 
					break;
				}
				
				for(int i=0; i<moys.size(); i++) {
					
					float max= Float.parseFloat(moys.get(i)) ;
					for(int j=i; j<moys.size(); j++) {
						if(max>Float.parseFloat(moys.get(j))) {
							max=Float.parseFloat(moys.get(j));
						}
					}
					
					faible_moys.set(compt-1, String.valueOf(max)); 
					break;
				}

			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		

		table_1.setModel(new DefaultTableModel (
			  	new Object[compt][12],
			  	new String[] {
			  		"Mati\u00E8res", "Coef", "Moy Interro", "Dev 1", "Dev 2", "Moy", "Moy coef", "Plus forte Moy", "Plus faible Moy", "Rang", "Appr\u00E9ciation", "Signature Prof"
			  	}
			  ) {
			  	boolean[] columnEditables = new boolean[] {
			  		false, false, false, false, false, false, false, false, false, true, true, true
			  	};
			  	public boolean isCellEditable(int row, int column) {
			  		return columnEditables[column];
			  	}
			  });
		
		lignes=compt;
	  table_1.getColumnModel().getColumn(0).setResizable(false);
	  table_1.getColumnModel().getColumn(0).setPreferredWidth(144);
	  table_1.getColumnModel().getColumn(0).setCellRenderer(center2);
	  
	  table_1.getColumnModel().getColumn(1).setResizable(false);
	  table_1.getColumnModel().getColumn(1).setPreferredWidth(31);
	  table_1.getColumnModel().getColumn(1).setCellRenderer(center);
	  
	  table_1.getColumnModel().getColumn(2).setResizable(false);
	  table_1.getColumnModel().getColumn(2).setPreferredWidth(63);
	  table_1.getColumnModel().getColumn(2).setCellRenderer(center);
	  
	  table_1.getColumnModel().getColumn(3).setResizable(false);
	  table_1.getColumnModel().getColumn(3).setPreferredWidth(63);
	  table_1.getColumnModel().getColumn(3).setCellRenderer(center);
	  
	  table_1.getColumnModel().getColumn(4).setResizable(false);
	  table_1.getColumnModel().getColumn(4).setPreferredWidth(63);
	  table_1.getColumnModel().getColumn(4).setMinWidth(63);
	  table_1.getColumnModel().getColumn(4).setCellRenderer(center);
	  
	  table_1.getColumnModel().getColumn(5).setResizable(false);
	  table_1.getColumnModel().getColumn(5).setPreferredWidth(63);
	  table_1.getColumnModel().getColumn(5).setCellRenderer(center);
	  
	  table_1.getColumnModel().getColumn(6).setResizable(false);
	  table_1.getColumnModel().getColumn(6).setPreferredWidth(63);
	  table_1.getColumnModel().getColumn(6).setCellRenderer(center);
	  
	  table_1.getColumnModel().getColumn(7).setResizable(false);
	  table_1.getColumnModel().getColumn(7).setPreferredWidth(63);
	  table_1.getColumnModel().getColumn(7).setCellRenderer(center);
	  
	  table_1.getColumnModel().getColumn(8).setResizable(false);
	  table_1.getColumnModel().getColumn(8).setPreferredWidth(63);
	  table_1.getColumnModel().getColumn(8).setCellRenderer(center);
	  
	  table_1.getColumnModel().getColumn(9).setResizable(false);
	  table_1.getColumnModel().getColumn(9).setPreferredWidth(45);
	  table_1.getColumnModel().getColumn(9).setCellRenderer(center);
	  
	  table_1.getColumnModel().getColumn(10).setResizable(false);
	  table_1.getColumnModel().getColumn(10).setPreferredWidth(91);
	  table_1.getColumnModel().getColumn(10).setCellRenderer(center);
	  
	  table_1.getColumnModel().getColumn(11).setResizable(false);
	  table_1.getColumnModel().getColumn(11).setPreferredWidth(70);
	  
	  			table_1.setRowHeight(40);
	  			table_1.setEnabled(false);
	  			table_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	  			table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	  			table_1.setAutoCreateRowSorter(true);
	  			table_1.setRowSelectionAllowed(false);
	  			//	table_1.setBounds(1, 25, 1005, 160);
	  				//panel_5.add(table_1);
	  				table_1.setRowHeight(40);
	   for(int i=0; i<compt; i++) {
		   table_1.setValueAt(" "+list.get(i), i, 0);
		   DecimalFormat df= new DecimalFormat("##.##");
		   for(int j=1; j<7; j++) {
			   table_1.setValueAt("*/*", i, j);
			   
		   }
		   table_1.setValueAt(df.format(Float.parseFloat(forte_moys.get(i))), i, 7);
		   table_1.setValueAt(df.format(Float.parseFloat(faible_moys.get(i))), i, 8);
		 //  System.out.println("Forte: "+forte_moys.get(i));
		   if(faible_moys.get(i).equals("0.0")&&forte_moys.get(i).equals("0.0")) {
			   table_1.setValueAt("*/*", i, 7);
			   table_1.setValueAt("*/*", i, 8);
			   table_1.setValueAt("*/*", i, 9); 
			   table_1.setValueAt("*/*", i, 10); 
			   table_1.setValueAt("**.**", i, 11); 
		   }
	   }
	   
	   
	   for(int i=0; i<compt; i++) {		   
		   for(int j=0;j<Integer.parseInt(effectif.getText().toString()); j++) {
			   float max= Float.parseFloat(rangs[i][j]);  			   
			   int pos=j;
			   for(int k=j; k<Integer.parseInt(effectif.getText().toString()); k++) {
				   float here= Float.parseFloat(rangs[i][k]);
				   if(max<here) {
					   pos=k;
					   max=here;
				   }
			   }
			   
			   rangs[i][pos]=rangs[i][j];
			   rangs[i][j]=String.valueOf(max);
			  // System.out.print("\nRangs[]"+rangs[i][pos]);
		   }
		   
	   }
	   
	   for(int k=0; k<Integer.parseInt(effectif.getText().toString()); k++) {
		   float un= Float.parseFloat(moys_gene.get(k));
		   float deux= Float.parseFloat(coefs.get(k));
		   if(deux==0) {
			   moys_total.set(k, "0");
			   continue;
		   }
			   
		   float trois= un/deux;
		   moys_total.set(k, trois+"");
		  // System.out.println("Moys: "+moys_total.get(k));
	   }
	   
	   for(int i=0; i<Integer.parseInt(effectif.getText().toString()); i++) {
		   float max= Float.parseFloat(moys_total.get(i));
		   int pos=i;
		   for(int j=i; j<Integer.parseInt(effectif.getText().toString()); j++) {
			   float take= Float.parseFloat(moys_total.get(j));
			   if(max<take) {
				   max=take;
				   pos=j;
			   }
		   }
		   moys_total.set(pos, moys_total.get(i));
		   moys_total.set(i, max+""); 
		   String var= ordre_rang[pos];
		   ordre_rang[pos]=ordre_rang[i];
		   ordre_rang[i]=var;
		   var= moys_gene.get(pos);
		   moys_gene.set(pos, moys_gene.get(i));
		   moys_gene.set(i, var);
		  // System.out.println(moys_total.get(i)+" ** "+ordre_rang[i]);
		   		   
	  }
	   

	   
	  table_1.setBounds((int)(2), (int)(25), (int)(776), (int)(((40*compt)+30)));

	  scrollPane.setBounds((int)(2), (int)(247), (int)(835), (int)((table_1.getHeight()+2)));
	  
	//  table_1.setBounds((int)(2*e1), (int)(25*e2), (int)(776*e1), (int)(((40*compt)+30)*e2));

	 // scrollPane.setBounds((int)(2*e1), (int)(247*e2), (int)(840*e1), (int)((table_1.getHeight()+2)*e2));
	  
	  scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	  scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	  panel6.setBounds((int)(2), (int)(((scrollPane.getY()+scrollPane.getHeight()+20))), (int)(820), (int)(148));
	//  panel6.setBounds((int)(2*e1), (int)(((scrollPane.getY()+scrollPane.getHeight()+20))*e2), (int)(840*e1), (int)(148*e2));
	  
	  panel7.setBounds((int)(2), (int)((panel6.getY()+148+10)), (int)(830), (int)(148));
	  //panel7.setBounds((int)(2*e1), (int)((panel6.getY()+148+10)*e2), (int)(840*e1), (int)(148*e2));
	  panel7.setBackground(Color.WHITE);
	  lblEditedByEducsoftvibecro.setBounds(0,(int)( (panel7.getY()+panel7.getHeight()+10)), (int)(829), (int)(17));
	  //lblEditedByEducsoftvibecro.setBounds(0,(int)( (panel7.getY()+panel7.getHeight()+10)*e2), (int)(840*e1), (int)(17*e2));
	  
	  lblNbTouteRature.setBounds((int)(10), (int)((panel7.getY()+panel7.getHeight()+10)), (int)(766), (int)(17));
	  //lblNbTouteRature.setBounds((int)(10*e1), (int)((panel7.getY()+panel7.getHeight()+10)*e2), (int)(766*e1), (int)(17*e2));
	  
	  panel_5.setMinimumSize(new Dimension(820, lblNbTouteRature.getY()+53));
	  panel_5.setPreferredSize(new Dimension(820, lblNbTouteRature.getY()+53));
	

	}
}
	


