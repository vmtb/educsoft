import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane; 
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Component;

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
import java.awt.font.TextAttribute;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;   
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

public class Cartes_scolaires {

	JFrame frmEducsoftWelcome;
	private JTable table;
	private Initialize init= new Initialize();
	private String fichier1= Constantes.fichier_key;
	private String fichier2= Constantes.fichier_ann;
	private String classe="6ème";
	private String total_classe="";
	private JTable table_1;
	private JLabel s1,s3, s4, dir1, dir22, dir33, is1, is3, is11, is22, is33, label_29, label_6, label_10 ,  is4, is44, dir4;
	private JLabel is2;
	private JLabel s2, label_21;
	private JComboBox comboBox_2;
	private JTextPane nom1, nom3, pre1, pre3, lieu1, lieu3, cont1, cont3, classe11, classe3, mat1, mat3, sc1, sc3, sc11, sc22, sc33,sc44, nom4, pre4, lieu4, cont4, classe4, mat4, sc4;
	private JTextPane sc2;
	private JTextPane mat2;
	private JTextPane classe2;
	private JTextPane cont2;
	private JTextPane lieu2;
	private JTextPane pre2;
	private JTextPane nom2;
	private JPanel  carte1, carte3, carte22, carte33, carte2, carte4, carte44;
	private JButton button, btnSuivant;
	 
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cartes_scolaires window = new Cartes_scolaires();
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
					Cartes_scolaires window = new Cartes_scolaires();
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
	public Cartes_scolaires() {
		initialize();
	}
	
	private float e1, e2;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEducsoftWelcome = new JFrame();
	//	frmEducsoftWelcome.setResizable(false);
		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		e1= ((float)dim.getWidth()/1571);  e2=(float) dim.getHeight()/863;
		frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		frmEducsoftWelcome.setTitle("Educsoft - "+init.lire_le_fichier(Constantes.ecole_name)+" - CARTES SCOLAIRE "+init.lire_le_fichier(Constantes.fichier_ann));
		frmEducsoftWelcome.setBounds((int)(0*e1), (int)(0*e2), (int)(101101*e1), (int)(870*e2));
		frmEducsoftWelcome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEducsoftWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEducsoftWelcome.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 105, 225));
		panel.setBounds((int)(0*e1), (int)(0*e2), (int)(1571*e1), (int)(863*e2));
		frmEducsoftWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/Embleme_benin.jpg")));
		lblNewLabel_2.setBounds((int)(1447*e1), (int)(0*e2), (int)(93*e1), (int)(72*e2));
		panel.add(lblNewLabel_2);

		JPanel panel_90 = new JPanel();
		panel_90.setBounds((int)(dim.getWidth()-36), 0, (int)(36*e1), 2000);
		panel_90.setBackground(new Color(47, 79, 79));
		panel.add(panel_90);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		panel_2.setBounds((int)(0*e1), (int)(78*e2),(int)( 299*e1),(int)( 736*e2));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblParamtrageClasse = new JLabel("Param\u00E9trage classe");
		lblParamtrageClasse.setForeground(Color.WHITE);
		lblParamtrageClasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblParamtrageClasse.setBounds(0, (int)(59*e2),  (int)(282*e1),  (int)(79*e2));
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		lblParamtrageClasse.setIcon(new ImageIcon(par_icon));
		panel_2.add(lblParamtrageClasse);
		
		JLabel label = new JLabel("Statistiques");
		label.setForeground(Color.WHITE);
		Image st_icon= new ImageIcon(this.getClass().getResource("/Icon 3 St.png")).getImage();
		label.setIcon(new ImageIcon(st_icon));
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds((int)(0*e1), (int)(174*e2), (int)(331*e1), (int)(95*e2));
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Cartes scolaires");
		label_1.setOpaque(true);
		label_1.setBackground(new Color(65, 105, 225));
		label_1.setForeground(new Color(255, 255, 255));
		Image cs_icon= new ImageIcon(this.getClass().getResource("/Icon 1.png")).getImage();
		label_1.setIcon(new ImageIcon(cs_icon));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds((int)(0*e1), (int)(331*e2), (int)(331*e1), (int)(79*e2));
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Calendrier scolaire");
		label_2.setForeground(Color.WHITE); 
		Image ca_icon= new ImageIcon(this.getClass().getResource("/Icon 2.png")).getImage();
		label_2.setIcon(new ImageIcon(ca_icon));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(0,  (int)(471*e2),  (int)(282*e1),  (int)(97*e2));
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Gestion du personnel");
		label_3.setForeground(Color.WHITE);
		Image gp_icon= new ImageIcon(this.getClass().getResource("/Icon 5 Sgpp.png")).getImage();
		label_3.setIcon(new ImageIcon(gp_icon));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(0,  (int)(598*e2),  (int)(282*e1),  (int)(97*e2));
		panel_2.add(label_3);
		
		JPanel panel_1 = new JPanel();//new Color(0, 0, 139)
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds((int)(0*e1), (int)(78*e2), (int)(1540*e1), (int)(10*e2));
		panel.add(panel_1);
		
		 
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image ic=(new ImageIcon(this.getClass().getResource("/Carte benin.png"))).getImage();
		lblNewLabel_3.setBounds((int)(0*e1), (int)(0*e2), (int)(91*e1), (int)(79*e2));
		lblNewLabel_3.setIcon(new ImageIcon(ic.getScaledInstance(91, 79, Image.SCALE_SMOOTH)));
		panel.add(lblNewLabel_3);
		 
		
		JLabel lblNewLabel_5 = new JLabel("Coll\u00E8ge catholique Saint Fran\u00E7ois d'Assise");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Berlin Sans FB", Font.BOLD, 70));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds((int)(173*e1), (int)(0*e2), (int)(1253*e1), (int)(77*e2));
		panel.add(lblNewLabel_5);
		 
		
		JLabel lblNewLabel = new JLabel("Copyright 2019 VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds((int)(0*e1), (int)(817*e2), (int)(299*e1), (int)(13*e2));
		panel.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(47, 79, 79));
		panel_3.setBounds((int)(298*e1), (int)(82*e2), (int)(1242*e1), (int)(55*e2));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		//Image home_icon= new ImageIcon(this.getClass().getResource("/Home.png")).getImage();
		JLabel lblHome = new JLabel("Accueil  >   ");
		//lblHome.setIcon(new ImageIcon(home_icon));
		lblHome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setBounds((int)(10*e1), (int)(10*e2), (int)(128*e1), (int)(33*e2));
		panel_3.add(lblHome);
		
		JLabel lblParametrageClasse = new JLabel("CARTES SCOLAIRES "+init.lire_le_fichier(Constantes.fichier_ann));
		lblParametrageClasse.setForeground(Color.WHITE);
		lblParametrageClasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblParametrageClasse.setBounds((int)(119*e1), (int)(10*e2), (int)(504*e1), (int)(33*e2));
		panel_3.add(lblParametrageClasse);
		
		JLabel lblAide = new JLabel("Aide ?");
		lblAide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAide.setForeground(new Color(255, 255, 255));
		lblAide.setBounds((int)(1175*e1), (int)(13*e2), (int)(77*e1), (int)(27*e2));
		panel_3.add(lblAide);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds((int)(309*e1), (int)(147*e2), (int)(219*e1), (int)(21*e2));
		panel.add(comboBox);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds((int)(309*e1), (int)(192*e2), (int)(219*e1), (int)(21*e2));
		panel.add(comboBox_2);

		JPanel panel_12 = new JPanel(); 
		panel_12.setPreferredSize(new Dimension(630, 1800));
		panel_12.setMinimumSize(new Dimension(630, 1800));
		panel_12.setBackground(Color.WHITE);
		panel_12.setOpaque(false);
		panel_12.setBounds((int)(298*e1), (int)(0*e2), (int)(630*e1), (int)(1800*e2));
		panel_12.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(panel_12);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds((int)(436*e1), (int)(226*e2), (int)(864*e1), (int)(1244*e2)); 
		scrollPane.setAutoscrolls(true);
		
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scrollPane);
		
		
		carte2 = new JPanel();
		carte2.setBounds(new Rectangle((int)(4), (int)(300), (int)(411), (int)(277)));
		panel_12.add(carte2);
		carte2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		carte2.setBackground(Color.WHITE);
		carte2.setLayout(null);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds((int)(2), (int)(4), (int)(80), (int)(60));
		Image im= new ImageIcon(this.getClass().getResource("/Embleme_benin.jpg")).getImage();
		 
		Image img=im.getScaledInstance(label_4.getWidth(), label_4.getHeight(), Image.SCALE_SMOOTH);
		label_4.setIcon(new ImageIcon(img));
		label_4.setOpaque(true);
		
		carte2.add(label_4);
		
		JTextPane txtpnMinistereDesEnseignements = new JTextPane();
		txtpnMinistereDesEnseignements.setEditable(false);
		txtpnMinistereDesEnseignements.setOpaque(false);
		txtpnMinistereDesEnseignements.setFont(new Font("Tahoma", Font.BOLD, 8));
		txtpnMinistereDesEnseignements.setForeground(Color.BLACK);
		txtpnMinistereDesEnseignements.setText("MINISTERE DES ENSEIGNEMENTS SECONDAIRE TECHNIQUE ET DE LA FORMATION PROFESSIONNELLE");
		txtpnMinistereDesEnseignements.setBounds((int)(85), (int)(3), (int)(172), (int)(72));
		//.setBounds((int)(85), (int)(3), (int)(168), (int)(72));
		carte2.add(txtpnMinistereDesEnseignements);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.YELLOW);
		panel_5.setBounds((int)(85), (int)(58), (int)(169), (int)(5));
		carte2.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_5.add(panel_6);
		panel_6.setBackground(Color.GREEN);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.RED);
		panel_7.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_5.add(panel_7);
		
		 sc2 = new JTextPane();
		sc2.setEditable(false);
		sc2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		sc2.setForeground(Color.BLACK);
		sc2.setText("COMPLEXE SCOLAIRE PRIVE LA TRINITE - BOHICON");
		sc2.setBounds((int)(254), (int)(11), (int)(154), (int)(72));
		carte2.add(sc2);
		
		 is2 = new JLabel("CARTE D'IDENTITE SCOLAIRE 2019-2020");
		is2.setHorizontalAlignment(SwingConstants.CENTER);
		is2.setFont(new Font("Tahoma", Font.BOLD, 14));
		is2.setBounds((int)(10), (int)(92), (int)(391), (int)(21));
		carte2.add(is2);
		
		JLabel lblRepubliqueDuBenin = new JLabel(" REPUBLIQUE  DU  BENIN");
		lblRepubliqueDuBenin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRepubliqueDuBenin.setBounds((int)(85), (int)(72), (int)(172), (int)(13));
		carte2.add(lblRepubliqueDuBenin);
		
		 label_6 = new JLabel(" ");
		label_6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label_6.setBackground(Color.GRAY);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setIcon(new ImageIcon(this.getClass().getResource("/ID ES.png")));
		label_6.setBounds((int)(10), (int)(123), (int)(105), (int)(119));
		carte2.add(label_6);
		
		JLabel lblNom = new JLabel("<HTML><U>Nom:</U></HTML>");
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNom.setBounds((int)(120), (int)(123), (int)(51), (int)(21));
		carte2.add(lblNom);
		
		JLabel lblprnoms = new JLabel("<HTML><U>Pr\u00E9nom(s):</U></HTML>");
		lblprnoms.setFont(new Font("Calibri", Font.BOLD, 16));
		lblprnoms.setBounds((int)(120), (int)(145), (int)(87), (int)(21));
		carte2.add(lblprnoms);
		
		JLabel lblneLe = new JLabel("<HTML><U>N\u00E9(e) le:</U></HTML>");
		lblneLe.setFont(new Font("Calibri", Font.BOLD, 16));
		lblneLe.setBounds((int)(120), (int)(169), (int)(87), (int)(21));
		carte2.add(lblneLe);
		
		JLabel lblcontactDurgence = new JLabel("<HTML><U>Contact d'urgence:</U></HTML>");
		lblcontactDurgence.setFont(new Font("Calibri", Font.BOLD, 16));
		lblcontactDurgence.setBounds((int)(120), (int)(193), (int)(141), (int)(21));
		carte2.add(lblcontactDurgence);
		
		JLabel classe22 = new JLabel("<HTML><U>Classe:</U></HTML>");
		classe22.setFont(new Font("Calibri", Font.BOLD, 16));
		classe22.setBounds((int)(120), (int)(217), (int)(141), (int)(21));
		carte2.add(classe22);
		
		JLabel lblsignature = new JLabel("<HTML><U>Signature,</U></HTML>");
		lblsignature.setFont(new Font("Calibri", Font.BOLD, 16));
		lblsignature.setBounds((int)(299), (int)(223), (int)(90), (int)(21));
		carte2.add(lblsignature);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds((int)(282), (int)(245), (int)(105), (int)(23));
		carte2.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.YELLOW);
		panel_9.setBounds((int)(106), (int)(262), (int)(169), (int)(8));
		carte2.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.GREEN);
		panel_10.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_9.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.RED);
		panel_11.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_9.add(panel_11);
		
		JLabel lblmatEl = new JLabel("<HTML><U>Mat: </U></HTML>");
		lblmatEl.setFont(new Font("Calibri", Font.BOLD, 16));
		lblmatEl.setBounds((int)(10), (int)(248), (int)(141), (int)(21));
		carte2.add(lblmatEl);
		
		nom2 = new JTextPane();
		nom2.setOpaque(false);
		nom2.setText("NOM");
		nom2.setForeground(Color.BLACK);
		nom2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		nom2.setEditable(false);
		nom2.setBounds((int)(247), (int)(123), (int)(161), (int)(23));
		carte2.add(nom2);
		
		pre2 = new JTextPane();
		pre2.setOpaque(false);
		pre2.setText("Prenoms");
		pre2.setForeground(Color.BLACK);
		pre2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		pre2.setEditable(false);
		pre2.setBounds((int)(247), (int)(145), (int)(162), (int)(23));
		carte2.add(pre2);
		
		lieu2 = new JTextPane();
		lieu2.setText("xxxxx \u00E0 xxxxxxx");
		lieu2.setForeground(Color.BLACK);
		lieu2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		lieu2.setEditable(false);
		lieu2.setBounds((int)(247), (int)(169), (int)(159), (int)(23));
		carte2.add(lieu2);
		
		cont2 = new JTextPane();
		cont2.setText("96969696");
		cont2.setForeground(Color.BLACK);
		cont2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		cont2.setEditable(false);
		cont2.setBounds((int)(247), (int)(195), (int)(158), (int)(23));
		carte2.add(cont2);
		
		classe2 = new JTextPane();
		classe2.setText("96969696");
		classe2.setForeground(Color.BLACK);
		classe2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		classe2.setEditable(false);
		classe2.setBounds((int)(177), (int)(217), (int)(228), (int)(23));
		carte2.add(classe2);
		
		mat2 = new JTextPane();
		mat2.setText("EL");
		mat2.setForeground(Color.BLACK);
		mat2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		mat2.setEditable(false);
		mat2.setBounds((int)(62), (int)(250), (int)(238), (int)(23));
		carte2.add(mat2);
		
		s2 = new JLabel("M");
		s2.setBounds((int)(20), (int)(109), (int)(45), (int)(13));
		carte2.add(s2);
		
		carte22 = new JPanel();
		carte22.setLayout(null);
		carte22.setBounds(new Rectangle((int)(5), (int)(5), (int)(485), (int)(295)));
		carte22.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		carte22.setBackground(Color.WHITE);
		carte22.setBounds((int)(426), (int)(300), (int)(411), (int)(277));
		panel_12.add(carte22);
		
		JPanel panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBackground(Color.YELLOW);
		panel_30.setBounds((int)(139), (int)(10), (int)(169), (int)(5));
		carte22.add(panel_30);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(Color.GREEN);
		panel_31.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_30.add(panel_31);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(Color.RED);
		panel_32.setBounds((int)(112), 0, (int)(57), (int)(10));
		panel_30.add(panel_32);
		
		 sc22 = new JTextPane();
		sc22.setText("COMPLEXE SCOLAIRE PRIVE LA TRINITE - BOHICON");
		sc22.setForeground(Color.BLACK);
		sc22.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		sc22.setEditable(false);
		sc22.setBounds((int)(10), (int)(36), (int)(393), (int)(62));
		carte22.add(sc22);
		
		 is22 = new JLabel("CARTE D'IDENTITE SCOLAIRE "+init.lire_le_fichier(Constantes.fichier_ann));
		is22.setHorizontalAlignment(SwingConstants.CENTER);
		is22.setFont(new Font("Tahoma", Font.BOLD, 14));
		is22.setBounds((int)(10), (int)(92), (int)(409), (int)(27));
		carte22.add(is22);
		
		JLabel label_31 = new JLabel(" ");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label_31.setBackground(Color.GRAY);
		label_31.setBounds((int)(10), (int)(123), (int)(105), (int)(119));
		carte22.add(label_31);
		
		JLabel lblleDirecteur = new JLabel("<HTML><U>Le Directeur,</U></HTML>");
		lblleDirecteur.setFont(new Font("Calibri", Font.BOLD, 16));
		lblleDirecteur.setBounds((int)(259), (int)(151), (int)(114), (int)(21));
		carte22.add(lblleDirecteur);
		
		JPanel panel_34 = new JPanel();
		panel_34.setLayout(null);
		panel_34.setBackground(Color.YELLOW);
		panel_34.setBounds((int)(136), (int)(259), (int)(169), (int)(8));
		carte22.add(panel_34);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(Color.GREEN);
		panel_35.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_34.add(panel_35);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(Color.RED);
		panel_36.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_34.add(panel_36);
		
		dir22 = new JLabel("<HTML><U>Dir name</U></HTML>");
		dir22.setHorizontalAlignment(SwingConstants.CENTER);
		dir22.setFont(new Font("Calibri", Font.BOLD, 16));
		dir22.setBounds((int)(169), (int)(226), (int)(232), (int)(21));
		carte22.add(dir22);
		
		JTextPane sc31 = new JTextPane();
		sc31.setText("Edit\u00E9 par EducSoft -VIBECRO Inc");
		sc31.setForeground(Color.BLACK);
		sc31.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		sc31.setEditable(false);
		sc31.setBounds((int)(9), (int)(243), (int)(228), (int)(23));
		carte22.add(sc31);
		
		carte1 = new JPanel();
		carte1.setLayout(null);
		carte1.setBounds(new Rectangle((int)(4), (int)(310), (int)(411), (int)(277)));
		carte1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		carte1.setBackground(Color.WHITE);
		carte1.setBounds((int)(4), (int)(10), (int)(411), (int)(277));
		panel_12.add(carte1);
		
		JLabel label_7 = new JLabel("");
		label_7.setOpaque(true);
		label_7.setBounds((int)(1.2), (int)(1.2), (int)(80), (int)(60));
		Image img2=im.getScaledInstance(label_7.getWidth(), label_7.getHeight(), Image.SCALE_SMOOTH);
		
		label_7.setIcon(new ImageIcon(img2));
		carte1.add(label_7);
		
		JTextPane textPane = new JTextPane  ( ) ;
		textPane.setText("MINISTERE DES ENSEIGNEMENTS SECONDAIRE TECHNIQUE ET DE LA FORMATION PROFESSIONNELLE");
		 
		textPane.setOpaque(false);
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Tahoma", Font.BOLD, 8));
		textPane.setEditable(false);
		textPane.setBounds((int)(85), (int)(3), (int)(172), (int)(72));
		carte1.add(textPane);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBackground(Color.YELLOW);
		panel_13.setBounds((int)(85), (int)(58), (int)(169), (int)(5));
		carte1.add(panel_13);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.GREEN);
		panel_21.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_13.add(panel_21);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(Color.RED);
		panel_29.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_13.add(panel_29);
		
		sc1 = new JTextPane();
		sc1.setText("COMPLEXE SCOLAIRE PRIVE LA TRINITE - BOHICON");
		sc1.setForeground(Color.BLACK);
		sc1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		sc1.setEditable(false);
		sc1.setBounds((int)(254), (int)(11), (int)(154), (int)(72));
		carte1.add(sc1);
		
		is1 = new JLabel("CARTE D'IDENTITE SCOLAIRE 2019-2020");
		is1.setHorizontalAlignment(SwingConstants.CENTER);
		is1.setFont(new Font("Tahoma", Font.BOLD, 14));
		is1.setBounds((int)(10), (int)(92), (int)(409), (int)(21));
		carte1.add(is1);
		
		JLabel label_28 = new JLabel(" REPUBLIQUE  DU  BENIN");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_28.setBounds((int)(85), (int)(72), (int)(172), (int)(13));
		carte1.add(label_28);
		
		label_29 = new JLabel(" ");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label_29.setBackground(Color.GRAY);
		label_29.setBounds((int)(10), (int)(123), (int)(105), (int)(119));
		carte1.add(label_29);
		
		JLabel label_33 = new JLabel("<HTML><U>Nom:</U></HTML>");
		label_33.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_33.setBounds((int)(120), (int)(123), (int)(51), (int)(21));
		carte1.add(label_33);
		
		JLabel label_34 = new JLabel("<HTML><U>Pr\u00E9nom(s):</U></HTML>");
		label_34.setFont(new Font("Calibri", Font.BOLD, 16));
		label_34.setBounds((int)(120), (int)(145), (int)(87), (int)(21));
		carte1.add(label_34);
		
		JLabel label_37 = new JLabel("<HTML><U>N\u00E9(e) le:</U></HTML>");
		label_37.setFont(new Font("Calibri", Font.BOLD, 16));
		label_37.setBounds((int)(120), (int)(169), (int)(87), (int)(21));
		carte1.add(label_37);
		
		JLabel label_38 = new JLabel("<HTML><U>Contact d'urgence:</U></HTML>");
		label_38.setFont(new Font("Calibri", Font.BOLD, 16));
		label_38.setBounds((int)(120), (int)(193), (int)(141), (int)(21));
		carte1.add(label_38);
		
		JLabel label_39 = new JLabel("<HTML><U>Classe:</U></HTML>");
		label_39.setFont(new Font("Calibri", Font.BOLD, 16));
		label_39.setBounds((int)(120), (int)(217), (int)(141), (int)(21));
		carte1.add(label_39);
		
		JLabel label_40 = new JLabel("<HTML><U>Signature,</U></HTML>");
		label_40.setFont(new Font("Calibri", Font.BOLD, 16));
		label_40.setBounds((int)(299), (int)(223), (int)(90), (int)(21));
		carte1.add(label_40);
		 
		JPanel panel_50 = new JPanel();
		panel_50.setLayout(null);
		panel_50.setBackground(Color.YELLOW);
		panel_50.setBounds((int)(106), (int)(262), (int)(169), (int)(8));
		carte1.add(panel_50);
		
		JPanel panel_51 = new JPanel();
		panel_51.setBackground(Color.GREEN);
		panel_51.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_50.add(panel_51);
		
		JPanel panel_52 = new JPanel();
		panel_52.setBackground(Color.RED);
		panel_52.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_50.add(panel_52);
		
		JLabel label_41 = new JLabel("<HTML><U>Mat: </U></HTML>");
		label_41.setFont(new Font("Calibri", Font.BOLD, 16));
		label_41.setBounds((int)(10), (int)(248), (int)(141), (int)(21));
		carte1.add(label_41);
		
		 nom1 = new JTextPane();
		nom1.setText("NOM");
		nom1.setOpaque(false);
		nom1.setForeground(Color.BLACK);
		nom1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		nom1.setEditable(false);
		nom1.setBounds((int)(247), (int)(123), (int)(161), (int)(23));
		carte1.add(nom1);
		
		 pre1 = new JTextPane();
		pre1.setText("Prenoms");
		pre1.setOpaque(false);
		pre1.setForeground(Color.BLACK);
		pre1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		pre1.setEditable(false);
		pre1.setBounds((int)(247), (int)(145), (int)(162), (int)(23));
		carte1.add(pre1);
		
		 lieu1 = new JTextPane();
		lieu1.setText("xxxxx \u00E0 xxxxxxx");
		lieu1.setForeground(Color.BLACK);
		lieu1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		lieu1.setEditable(false);
		lieu1.setBounds((int)(247), (int)(169), (int)(159), (int)(23));
		carte1.add(lieu1);
		
		 cont1 = new JTextPane();
		cont1.setText("96969696");
		cont1.setForeground(Color.BLACK);
		cont1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		cont1.setEditable(false);
		cont1.setBounds((int)(247), (int)(195), (int)(158), (int)(23));
		carte1.add(cont1);
		
		 classe11 = new JTextPane();
		classe11.setText("96969696");
		classe11.setForeground(Color.BLACK);
		classe11.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		classe11.setEditable(false);
		classe11.setBounds((int)(177), (int)(217), (int)(228), (int)(23));
		carte1.add(classe11);
		
		 mat1 = new JTextPane();
		mat1.setText("EL");
		mat1.setForeground(Color.BLACK);
		mat1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		mat1.setEditable(false);
		mat1.setBounds((int)(62), (int)(250), (int)(238), (int)(23));
		carte1.add(mat1);
		
		s1 = new JLabel("M");
		s1.setBounds((int)(20), (int)(109), (int)(45), (int)(13));
		carte1.add(s1);
		
		carte3 = new JPanel();
		carte3.setLayout(null); 
		carte3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		carte3.setBackground(Color.WHITE);		 
		carte3.setBounds(new Rectangle((int)(5), (int)(5), (int)(411), (int)(277)));
		carte3.setBounds((int)(4), (int)(593),(int)(411), (int)(277)); 
		panel_12.add(carte3);
		
		JLabel label_5 = new JLabel("");
		label_5.setOpaque(true); 
		label_5.setBounds((int)(1.2), (int)(1.2), (int)(80), (int)(60));
		Image img3=im.getScaledInstance(label_5.getWidth(), label_5.getHeight(), Image.SCALE_SMOOTH);
		label_5.setIcon(new ImageIcon(img3));
		carte3.add(label_5);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("MINISTERE DES ENSEIGNEMENTS SECONDAIRE TECHNIQUE ET DE LA FORMATION PROFESSIONNELLE");
		textPane_1.setOpaque(false);
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		textPane_1.setEditable(false);
		textPane_1.setBounds((int)(85), (int)(3), (int)(172), (int)(72));
		carte3.add(textPane_1);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.YELLOW);
		panel_14.setBounds((int)(85), (int)(58), (int)(169), (int)(5));
		carte3.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.GREEN);
		panel_15.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_14.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.RED);
		panel_16.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_14.add(panel_16);
		
		sc3 = new JTextPane();
		sc3.setText("COMPLEXE SCOLAIRE PRIVE LA TRINITE - BOHICON");
		sc3.setForeground(Color.BLACK);
		sc3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		sc3.setEditable(false);
		sc3.setBounds((int)(254), (int)(11), (int)(154), (int)(72));
		carte3.add(sc3);
		
		is3 = new JLabel("CARTE D'IDENTITE SCOLAIRE 2019-2020");
		is3.setHorizontalAlignment(SwingConstants.CENTER);
		is3.setFont(new Font("Tahoma", Font.BOLD, 14));
		is3.setBounds((int)(10), (int)(92), (int)(409), (int)(21));
		carte3.add(is3);
		
		JLabel label_6d = new JLabel(" REPUBLIQUE  DU  BENIN");
		label_6d.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6d.setBounds((int)(85), (int)(72), (int)(172), (int)(13));
		carte3.add(label_6d);
		
		label_10 = new JLabel(" ");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label_10.setBackground(Color.GRAY);
		label_10.setBounds((int)(10), (int)(123), (int)(105), (int)(119));
		carte3.add(label_10);
		
		JLabel label_11 = new JLabel("<HTML><U>Nom:</U></HTML>");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_11.setBounds((int)(120), (int)(123), (int)(51), (int)(21));
		carte3.add(label_11);
		
		JLabel label_12 = new JLabel("<HTML><U>Pr\u00E9nom(s):</U></HTML>");
		label_12.setFont(new Font("Calibri", Font.BOLD, 16));
		label_12.setBounds((int)(120), (int)(145), (int)(87), (int)(21));
		carte3.add(label_12);
		
		JLabel label_13 = new JLabel("<HTML><U>N\u00E9(e) le:</U></HTML>");
		label_13.setFont(new Font("Calibri", Font.BOLD, 16));
		label_13.setBounds((int)(120), (int)(169), (int)(87), (int)(21));
		carte3.add(label_13);
		
		JLabel label_14 = new JLabel("<HTML><U>Contact d'urgence:</U></HTML>");
		label_14.setFont(new Font("Calibri", Font.BOLD, 16));
		label_14.setBounds((int)(120), (int)(193), (int)(141), (int)(21));
		carte3.add(label_14);
		
		JLabel label_15 = new JLabel("<HTML><U>Classe:</U></HTML>");
		label_15.setFont(new Font("Calibri", Font.BOLD, 16));
		label_15.setBounds((int)(120), (int)(217), (int)(141), (int)(21));
		carte3.add(label_15);
		
		JLabel label_16 = new JLabel("<HTML><U>Signature,</U></HTML>");
		label_16.setFont(new Font("Calibri", Font.BOLD, 16));
		label_16.setBounds((int)(299), (int)(223), (int)(90), (int)(21));
		carte3.add(label_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds((int)(282), (int)(245), (int)(105), (int)(23));
		carte3.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBackground(Color.YELLOW);
		panel_18.setBounds((int)(106), (int)(262), (int)(169), (int)(8));
		carte3.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.GREEN);
		panel_19.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_18.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.RED);
		panel_20.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_18.add(panel_20);
		
		JLabel label_18 = new JLabel("<HTML><U>Mat: </U></HTML>");
		label_18.setFont(new Font("Calibri", Font.BOLD, 16));
		label_18.setBounds((int)(10), (int)(248), (int)(141), (int)(21));
		carte3.add(label_18);
		
		nom3 = new JTextPane();
		nom3.setText("NOM");
		nom3.setOpaque(false);
		nom3.setForeground(Color.BLACK);
		nom3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		nom3.setEditable(false);
		nom3.setBounds((int)(247), (int)(123), (int)(161), (int)(23));
		carte3.add(nom3);
		
		pre3 = new JTextPane();
		pre3.setText("Prenoms");
		pre3.setOpaque(false);
		pre3.setForeground(Color.BLACK);
		pre3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		pre3.setEditable(false);
		pre3.setBounds((int)(247), (int)(145), (int)(162), (int)(23));
		carte3.add(pre3);
		
		 lieu3 = new JTextPane();
		lieu3.setText("xxxxx \u00E0 xxxxxxx");
		lieu3.setForeground(Color.BLACK);
		lieu3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		lieu3.setEditable(false);
		lieu3.setBounds((int)(247), (int)(169), (int)(159), (int)(23));
		carte3.add(lieu3);
		
		 cont3 = new JTextPane();
		cont3.setText("96969696");
		cont3.setForeground(Color.BLACK);
		cont3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		cont3.setEditable(false);
		cont3.setBounds((int)(247), (int)(195), (int)(158), (int)(23));
		carte3.add(cont3);
		
		  classe3 = new JTextPane();
		classe3.setText("96969696");
		classe3.setForeground(Color.BLACK);
		classe3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		classe3.setEditable(false);
		classe3.setBounds((int)(177), (int)(217), (int)(228), (int)(23));
		carte3.add(classe3);
		
		 mat3 = new JTextPane();
		mat3.setText("EL");
		mat3.setForeground(Color.BLACK);
		mat3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		mat3.setEditable(false);
		mat3.setBounds((int)(62), (int)(250), (int)(238), (int)(23));
		carte3.add(mat3);
		
		s3 = new JLabel((String) null);
		s3.setBounds((int)(20), (int)(109), (int)(45), (int)(13));
		carte3.add(s3);
		
		JPanel panel_33 = new JPanel();
		panel_33.setLayout(null);
		panel_33.setBounds(new Rectangle((int)(5), (int)(5), (int)(485), (int)(295)));
		panel_33.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds((int)(426), (int)(10), (int)(411), (int)(277));
		panel_12.add(panel_33); 
		
		
		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBackground(Color.YELLOW);
		panel_22.setBounds((int)(139), (int)(10), (int)(169), (int)(5));
		panel_33.add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(Color.GREEN);
		panel_23.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_22.add(panel_23);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.RED);
		panel_24.setBounds((int)(112), 0, (int)(57), (int)(10));
		panel_22.add(panel_24);
		
		 sc11 = new JTextPane();
		sc11.setText("COMPLEXE SCOLAIRE PRIVE LA TRINITE - BOHICON");
		sc11.setForeground(Color.BLACK);
		sc11.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		sc11.setEditable(false);
		sc11.setBounds((int)(10), (int)(36), (int)(393), (int)(62));
		panel_33.add(sc11);
		
		  is11 = new JLabel("CARTE D'IDENTITE SCOLAIRE ");
		is11.setHorizontalAlignment(SwingConstants.CENTER);
		is11.setFont(new Font("Tahoma", Font.BOLD, 14));
		is11.setBounds((int)(10), (int)(92), (int)(409), (int)(27));
		panel_33.add(is11);
		
		JLabel label_17 = new JLabel(" ");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label_17.setBackground(Color.GRAY);
		label_17.setBounds((int)(10), (int)(123), (int)(105), (int)(119));
		panel_33.add(label_17);
		
		JLabel dir11 = new JLabel("<HTML><U>Le Directeur,</U></HTML>");
		dir11.setFont(new Font("Calibri", Font.BOLD, 16));
		dir11.setBounds((int)(259), (int)(151), (int)(114), (int)(21));
		panel_33.add(dir11);
		
		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBackground(Color.YELLOW);
		panel_25.setBounds((int)(136), (int)(259), (int)(169), (int)(8));
		panel_33.add(panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(Color.GREEN);
		panel_26.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_25.add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(Color.RED);
		panel_27.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_25.add(panel_27);
		
		dir1 = new JLabel("<HTML><U>Dir name</U></HTML>");
		dir1.setHorizontalAlignment(SwingConstants.CENTER);
		dir1.setFont(new Font("Calibri", Font.BOLD, 16));
		dir1.setBounds((int)(169), (int)(226), (int)(232), (int)(21));
		panel_33.add(dir1);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Edit\u00E9 par EducSoft -VIBECRO Inc");
		textPane_3.setForeground(Color.BLACK);
		textPane_3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		textPane_3.setEditable(false);
		textPane_3.setBounds((int)(9), (int)(243), (int)(228), (int)(23));
		panel_33.add(textPane_3);
		
		 carte33 = new JPanel();
		carte33.setLayout(null); 
		carte33.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		carte33.setBackground(Color.WHITE);
		carte33.setBounds((int)(426), (int)(593), (int)(411), (int)(277));
		panel_12.add(carte33);
		
 
		
		JPanel panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBackground(Color.YELLOW);
		panel_28.setBounds((int)(139), (int)(10), (int)(169), (int)(5));
		carte33.add(panel_28);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(Color.GREEN);
		panel_37.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_28.add(panel_37);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(Color.RED);
		panel_38.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_28.add(panel_38);
		
		 sc33 = new JTextPane();
		sc33.setText("COMPLEXE SCOLAIRE PRIVE LA TRINITE - BOHICON");
		sc33.setForeground(Color.BLACK);
		sc33.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		sc33.setEditable(false);
		sc33.setBounds((int)(10), (int)(36), (int)(393), (int)(62));
		carte33.add(sc33);
		
		 is33 = new JLabel("CARTE D'IDENTITE SCOLAIRE ");
		is33.setHorizontalAlignment(SwingConstants.CENTER);
		is33.setFont(new Font("Tahoma", Font.BOLD, 14));
		is33.setBounds((int)(10), (int)(92), (int)(409), (int)(27));
		carte33.add(is33);
		
		JLabel label_19 = new JLabel(" ");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label_19.setBackground(Color.GRAY);
		label_19.setBounds((int)(10), (int)(123), (int)(105), (int)(119));
		carte33.add(label_19);
		
		JLabel label_10 = new JLabel("<HTML><U>Le Directeur,</U></HTML>");
		label_10.setFont(new Font("Calibri", Font.BOLD, 16));
		label_10.setBounds((int)(259), (int)(151), (int)(114), (int)(21));
		carte33.add(label_10);
		
		JPanel panel_39 = new JPanel();
		panel_39.setLayout(null);
		panel_39.setBackground(Color.YELLOW);
		panel_39.setBounds((int)(136), (int)(259), (int)(169), (int)(8));
		carte33.add(panel_39);
		
		JPanel carte330 = new JPanel();
		carte330.setBackground(Color.GREEN);
		carte330.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_39.add(carte330);
		
		JPanel carte331 = new JPanel();
		carte331.setBackground(Color.RED);
		carte331.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_39.add(carte331);
		
		dir33 = new JLabel("<HTML><U>Dir name</U></HTML>");
		dir33.setHorizontalAlignment(SwingConstants.CENTER);
		dir33.setFont(new Font("Calibri", Font.BOLD, 16));
		dir33.setBounds((int)(169), (int)(226), (int)(232), (int)(21));
		carte33.add(dir33);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("Edit\u00E9 par EducSoft -VIBECRO Inc");
		textPane_4.setForeground(Color.BLACK);
		textPane_4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		textPane_4.setEditable(false);
		textPane_4.setBounds((int)(9), (int)(243), (int)(228), (int)(23));
		carte33.add(textPane_4);
		
		 carte4 = new JPanel();
		carte4.setLayout(null);
		carte4.setBounds(new Rectangle((int)(5), (int)(5), (int)(411), (int)(277)));
		carte4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		carte4.setBackground(Color.WHITE);
		carte4.setBounds((int)(4), (int)(890), (int)(411), (int)(277));
		panel_12.add(carte4);
		
		JLabel label_8 = new JLabel("");
		label_8.setOpaque(true);
		label_8.setBounds((int)(1.2), (int)(1.2), (int)(80), (int)(60));
		label_5.setBounds((int)(1.2), (int)(1.2), (int)(80), (int)(60));
		Image img4=im.getScaledInstance(label_5.getWidth(), label_5.getHeight(), Image.SCALE_SMOOTH);
		label_8.setIcon(new ImageIcon(img4));
		carte4.add(label_8);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("MINISTERE DES ENSEIGNEMENTS SECONDAIRE TECHNIQUE ET DE LA FORMATION PROFESSIONNELLE");
		textPane_2.setOpaque(false);
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setFont(new Font("Tahoma", Font.BOLD, 8));
		textPane_2.setEditable(false);
		textPane_2.setBounds((int)(85), (int)(3), (int)(172), (int)(72));
		carte4.add(textPane_2);
		
		JPanel panel_40 = new JPanel();
		panel_40.setLayout(null);
		panel_40.setBackground(Color.YELLOW);
		panel_40.setBounds((int)(85), (int)(58), (int)(169), (int)(5));
		carte4.add(panel_40);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(Color.GREEN);
		panel_41.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_40.add(panel_41);
		
		JPanel panel_42 = new JPanel();
		panel_42.setBackground(Color.RED);
		panel_42.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_40.add(panel_42);
		
		 sc4 = new JTextPane();
		sc4.setText("COMPLEXE SCOLAIRE PRIVE LA TRINITE - BOHICON");
		sc4.setForeground(Color.BLACK);
		sc4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		sc4.setEditable(false);
		sc4.setBounds((int)(254), (int)(11), (int)(154), (int)(72));
		carte4.add(sc4);
		
		 is4 = new JLabel("CARTE D'IDENTITE SCOLAIRE 2019-2020");
		is4.setHorizontalAlignment(SwingConstants.CENTER);
		is4.setFont(new Font("Tahoma", Font.BOLD, 14));
		is4.setBounds((int)(10), (int)(92), (int)(409), (int)(21*2));
		carte4.add(is4);
		
		JLabel label_20 = new JLabel(" REPUBLIQUE  DU  BENIN");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_20.setBounds((int)(85), (int)(72), (int)(172), (int)(13));
		carte4.add(label_20);
		
		label_21 = new JLabel(" ");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label_21.setBackground(Color.GRAY);
		label_21.setBounds((int)(10), (int)(123), (int)(105), (int)(119));
		carte4.add(label_21);
		
		JLabel label_22 = new JLabel("<HTML><U>Nom:</U></HTML>");
		label_22.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_22.setBounds((int)(120), (int)(123), (int)(51), (int)(21));
		carte4.add(label_22);
		
		JLabel label_23 = new JLabel("<HTML><U>Pr\u00E9nom(s):</U></HTML>");
		label_23.setFont(new Font("Calibri", Font.BOLD, 16));
		label_23.setBounds((int)(120), (int)(145), (int)(87), (int)(21));
		carte4.add(label_23);
		
		JLabel label_24 = new JLabel("<HTML><U>N\u00E9(e) le:</U></HTML>");
		label_24.setFont(new Font("Calibri", Font.BOLD, 16));
		label_24.setBounds((int)(120), (int)(169), (int)(87), (int)(21));
		carte4.add(label_24);
		
		JLabel label_25 = new JLabel("<HTML><U>Contact d'urgence:</U></HTML>");
		label_25.setFont(new Font("Calibri", Font.BOLD, 16));
		label_25.setBounds((int)(120), (int)(193), (int)(141), (int)(21));
		carte4.add(label_25);
		
		JLabel label_26 = new JLabel("<HTML><U>Classe:</U></HTML>");
		label_26.setFont(new Font("Calibri", Font.BOLD, 16));
		label_26.setBounds((int)(120), (int)(217), (int)(141), (int)(21));
		carte4.add(label_26);
		
		JLabel label_27 = new JLabel("<HTML><U>Signature,</U></HTML>");
		label_27.setFont(new Font("Calibri", Font.BOLD, 16));
		label_27.setBounds((int)(299), (int)(223), (int)(90), (int)(21));
		carte4.add(label_27);
		
		JPanel panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds((int)(282), (int)(245), (int)(105), (int)(23));
		carte4.add(panel_43);
		
		JPanel panel_44 = new JPanel();
		panel_44.setLayout(null);
		panel_44.setBackground(Color.YELLOW);
		panel_44.setBounds((int)(106), (int)(262), (int)(169), (int)(8));
		carte4.add(panel_44);
		
		JPanel panel_45 = new JPanel();
		panel_45.setBackground(Color.GREEN);
		panel_45.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_44.add(panel_45);
		
		JPanel panel_46 = new JPanel();
		panel_46.setBackground(Color.RED);
		panel_46.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_44.add(panel_46);
		
		JLabel label_30 = new JLabel("<HTML><U>Mat: </U></HTML>");
		label_30.setFont(new Font("Calibri", Font.BOLD, 16));
		label_30.setBounds((int)(10), (int)(248), (int)(141), (int)(21));
		carte4.add(label_30);
		
		 nom4 = new JTextPane();
		nom4.setText("NOM");
		nom4.setOpaque(false);
		nom4.setForeground(Color.BLACK);
		nom4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		nom4.setEditable(false);
		nom4.setBounds((int)(247), (int)(123), (int)(161), (int)(23));
		carte4.add(nom4);
		
		 pre4 = new JTextPane();
		pre4.setText("Prenoms");
		pre4.setOpaque(false);
		pre4.setForeground(Color.BLACK);
		pre4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		pre4.setEditable(false);
		pre4.setBounds((int)(247), (int)(145), (int)(162), (int)(23));
		carte4.add(pre4);
		
		 lieu4 = new JTextPane();
		lieu4.setText("xxxxx \u00E0 xxxxxxx");
		lieu4.setForeground(Color.BLACK);
		lieu4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		lieu4.setEditable(false);
		lieu4.setBounds((int)(247), (int)(169), (int)(159), (int)(23));
		carte4.add(lieu4);
		
		 cont4 = new JTextPane();
		cont4.setText("96969696");
		cont4.setForeground(Color.BLACK);
		cont4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		cont4.setEditable(false);
		cont4.setBounds((int)(247), (int)(195), (int)(158), (int)(23));
		carte4.add(cont4);
		
		 classe4 = new JTextPane();
		classe4.setText("96969696");
		classe4.setForeground(Color.BLACK);
		classe4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		classe4.setEditable(false);
		classe4.setBounds((int)(177), (int)(217), (int)(228), (int)(23));
		carte4.add(classe4);
		
		 mat4 = new JTextPane();
		mat4.setText("EL");
		mat4.setForeground(Color.BLACK);
		mat4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		mat4.setEditable(false);
		mat4.setBounds((int)(62), (int)(250), (int)(238), (int)(23));
		carte4.add(mat4);
		
		 s4 = new JLabel((String) null);
		s4.setBounds((int)(20), (int)(109), (int)(45), (int)(13));
		carte4.add(s4);
		
		 carte44 = new JPanel();
		carte44.setLayout(null);
		carte44.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		carte44.setBackground(Color.WHITE);
		carte44.setBounds((int)(426), (int)(890), (int)(411), (int)(277));
		panel_12.add(carte44);
		
		JPanel panel_47 = new JPanel();
		panel_47.setLayout(null);
		panel_47.setBackground(Color.YELLOW);
		panel_47.setBounds((int)(139), (int)(10), (int)(169), (int)(5));
		carte44.add(panel_47);
		
		JPanel panel_48 = new JPanel();
		panel_48.setBackground(Color.GREEN);
		panel_48.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_47.add(panel_48);
		
		JPanel panel_49 = new JPanel();
		panel_49.setBackground(Color.RED);
		panel_49.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_47.add(panel_49);
		
		 sc44 = new JTextPane();
		sc44.setText("COMPLEXE SCOLAIRE PRIVE LA TRINITE - BOHICON");
		sc44.setForeground(Color.BLACK);
		sc44.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));
		sc44.setEditable(false);
		sc44.setBounds((int)(10), (int)(36), (int)(393), (int)(62));
		carte44.add(sc44);
		
		 is44 = new JLabel("CARTE D'IDENTITE SCOLAIRE ");
		is44.setHorizontalAlignment(SwingConstants.CENTER);
		is44.setFont(new Font("Tahoma", Font.BOLD, 14));
		is44.setBounds((int)(10), (int)(92), (int)(409), (int)(27));
		carte44.add(is44);
		
		JLabel label_32 = new JLabel(" ");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label_32.setBackground(Color.GRAY);
		label_32.setBounds((int)(10), (int)(123), (int)(105), (int)(119));
		carte44.add(label_32);
		
		JLabel label_35 = new JLabel("<HTML><U>Le Directeur,</U></HTML>");
		label_35.setFont(new Font("Calibri", Font.BOLD, 16));
		label_35.setBounds((int)(259), (int)(151), (int)(114), (int)(21));
		carte44.add(label_35);
		
		JPanel panel_53 = new JPanel();
		panel_53.setLayout(null);
		panel_53.setBackground(Color.YELLOW);
		panel_53.setBounds((int)(136), (int)(259), (int)(169), (int)(8));
		carte44.add(panel_53);
		
		JPanel panel_54 = new JPanel();
		panel_54.setBackground(Color.GREEN);
		panel_54.setBounds((int)(0), (int)(0), (int)(57), (int)(10));
		panel_53.add(panel_54);
		
		JPanel panel_55 = new JPanel();
		panel_55.setBackground(Color.RED);
		panel_55.setBounds((int)(112), (int)(0), (int)(57), (int)(10));
		panel_53.add(panel_55);
		
		 dir4 = new JLabel("<HTML><U>Dir name</U></HTML>");
		dir4.setHorizontalAlignment(SwingConstants.CENTER);
		dir4.setFont(new Font("Calibri", Font.BOLD, 16));
		dir4.setBounds((int)(169), (int)(226), (int)(232), (int)(21));
		carte44.add(dir4);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("Edit\u00E9 par EducSoft -VIBECRO Inc");
		textPane_6.setForeground(Color.BLACK);
		textPane_6.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 11));
		textPane_6.setEditable(false);
		textPane_6.setBounds((int)(9), (int)(243), (int)(228), (int)(23));
		carte44.add(textPane_6);
		
		JButton btnImprimer = new JButton("IMPRIMER");
		btnImprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PrinterJob pj= PrinterJob.getPrinterJob();
				pj.setJobName("Bordereau");
				pj.setPrintable(new Printable() {

					@Override
					public int print(Graphics arg0, PageFormat arg1, int index) throws PrinterException {
						if(index>0) {
							return Printable.NO_SUCH_PAGE;
						}
						arg1.setOrientation(PageFormat.LANDSCAPE);
						Graphics2D g2d=(Graphics2D)arg0;
						g2d.translate(1.5, arg1.getImageableY());
						
						g2d.scale(0.70	, 0.70);
						
						panel_12.paint(g2d);
						
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
		btnImprimer.setBounds((int)(1376*e1), (int)(172*e2), (int)(138*e1), (int)(21*e2));
		panel.add(btnImprimer);
		
		btnSuivant = new JButton("SUIVANT  >");
		btnSuivant.setBounds((int)(929*e1), (int)(192*e2), (int)(114*e1), (int)(21*e2));
		panel.add(btnSuivant);
		
		button = new JButton("< PRECEDANT");
		
		button.setBounds((int)(637*e1), (int)(192*e2), (int)(114*e1), (int)(21*e2));
		panel.add(button);
		//Font font = lblNom.getFont();
	//	Map attributes = font.getAttributes();
	//	attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
	//	lblNom.setFont(font.deriveFont(attributes));
		

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
				frmEducsoftWelcome.dispose();
				inscription.frmEducsoftWelcome.setVisible(true); 
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
				frmEducsoftWelcome.dispose();
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
		label_2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Calendrier inscription= new Calendrier();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
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

				label_1.setBackground(null);
				label_1.setOpaque(false);
			}
			 
			
		});
		label.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Stat_general inscription= new Stat_general();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
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
				label.setForeground(Color.WHITE);
				label.setBackground(null);
				label.setOpaque(false);
			}
			 
			
		});
		lblParamtrageClasse.addMouseListener(new MouseListener() {

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
				lblParamtrageClasse.setBackground(new Color(65, 105, 225));
				lblParamtrageClasse.setForeground(new Color(255, 255, 255));
				lblParamtrageClasse.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblParamtrageClasse.setForeground(Color.WHITE);

				lblParamtrageClasse.setBackground(null);
				lblParamtrageClasse.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				lblParamtrageClasse.setBackground(null);
				lblParamtrageClasse.setForeground(new Color(255, 255, 255));
				lblParamtrageClasse.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				lblParamtrageClasse.setForeground(Color.WHITE);

				lblParamtrageClasse.setBackground(null);
				lblParamtrageClasse.setOpaque(false);
			}
			 
			
		});
		

		String info_psdo=init.lire_le_fichier(fichier1);
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t')); 
		
		remplir(lblNewLabel_5);
		remplir_annee(comboBox);
		
	}


	public void remplir_annee(JComboBox combo) { 
		String tt=init.lire_le_fichier(Constantes.fichier_ann);
		String n= tt.substring(tt.indexOf('-')+1);
		 
		List<String> tab=new ArrayList(80);
		List<String> autres=new ArrayList(80);
		String autre="";
	 	 

		String create="CREATE TABLE annees(id_ecole VARCHAR(255),annees int(40),autre TEXT)";		
		JSONArray js= init.getAnnees("annees", "id_ecole='"+id_ecol+"' and annees='"+n+"'", create);
		if(js==null)
			return;
		
		for(int i=0; i<js.length(); i++) {
			if(i!=js.length()-1)
				continue;
			JSONObject rs;
			try { 
				rs = js.getJSONObject(i);
				autre= (rs.getString("autre"));	
				
				for_classes(autre, combo);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(js.length()==0)
			return;
		
	}
	
	String id_ecol ;
	private void remplir(JLabel ecole) {
		{
			
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
					ecole.setText(nom);
					init.ecrire(Constantes.ecole_name, nom);
					sc1.setText(nom.toUpperCase()+" - "+lieu);
					sc2.setText(nom.toUpperCase()+" - "+lieu);
					sc3.setText(nom.toUpperCase()+" - "+lieu);
					sc4.setText(nom.toUpperCase()+" - "+lieu);
					sc11.setText(nom.toUpperCase()+" - "+lieu+" ("+contact_ecole+")");
					sc22.setText(nom.toUpperCase()+" - "+lieu+" ("+contact_ecole+")");
					sc33.setText(nom.toUpperCase()+" - "+lieu+" ("+contact_ecole+")");
					sc44.setText(nom.toUpperCase()+" - "+lieu+" ("+contact_ecole+")");
					
					dir1.setText("<HTML><U>"+dir_name+"</U></HTML>");
					dir22.setText("<HTML><U>"+dir_name+"</U></HTML>");
					dir33.setText("<HTML><U>"+dir_name+"</U></HTML>");
					dir4.setText("<HTML><U>"+dir_name+"</U></HTML>");
					
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			
			
		}
	}
	int tot=0;
	List<String> infos, imgs;String ordres[] ;
	
	private void for_classes(String autre, JComboBox comboBoxx) { 
		 
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
		comboBoxx.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String classe= comboBoxx.getSelectedItem().toString();
				init.ecrire("oui_classe_carte.txt", classe);;
				remplir_eleves (classe, init.lire_le_fichier(Constantes.fichier_ann));
				 
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
				remplir_carte(comboBox_2.getSelectedIndex(), tot-1, infos);
				if(comboBox_2.getSelectedIndex()==0) {
					button.setEnabled(false);
					btnSuivant.setEnabled(true);
				}else if(comboBox_2.getSelectedIndex()==tot-1) {
					button.setEnabled(true);
					btnSuivant.setEnabled(false);					
				}else {
					button.setEnabled(true);
					btnSuivant.setEnabled(true);
				}
			}
			
		});
		
		comboBoxx.setSelectedIndex(0);
	}
	
	private void remplir_eleves(String classe, String year) {
		is1.setText("CARTE D'IDENTITE SCOLAIRE "+year);
		is2.setText("CARTE D'IDENTITE SCOLAIRE "+year);
		is3.setText("CARTE D'IDENTITE SCOLAIRE "+year);
		is4.setText("CARTE D'IDENTITE SCOLAIRE "+year);
		is11.setText("CARTE D'IDENTITE SCOLAIRE "+year);
		is22.setText("CARTE D'IDENTITE SCOLAIRE "+year);
		is33.setText("CARTE D'IDENTITE SCOLAIRE "+year);
		is44.setText("CARTE D'IDENTITE SCOLAIRE "+year);
		String create= "CREATE TABLE IF NOT EXISTS eleves_"+init.lire_le_fichier(Constantes.fichier_ann).replaceAll("-", "")
				+"_"+id_ecol.replaceAll("-", "")
				+" (classe VARCHAR(255),nom VARCHAR(255),prenoms VARCHAR(255),date VARCHAR (255),lieu VARCHAR (255),matricule VARCHAR (255),"
				+ "cont_urgence TEXT,nom_p VARCHAR (255),prenom_p TEXT,cont_mobile VARCHAR (255),cont_domicile VARCHAR (255),cont_travail VARCHAR (255),"
				+ "profession VARCHAR (255),arrond VARCHAR (255),adresse VARCHAR (255),qtier VARCHAR (255),g_sanguin VARCHAR (255),"
				+ "electroph VARCHAR (255),sexe VARCHAR (255),logo TEXT,autre VARCHAR (255))";
		 
		List<String> tab=new ArrayList(200);
		imgs=new ArrayList(200);
		infos=new ArrayList(200);
		String autre=""; 
		
		JSONArray js= init.getEleves("eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "classe = '"+classe+"'", create);
		if(js==null)
			return;
		
		for(int i=0; i<js.length();i++) {
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
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if(js.length()==0)
			return;
		
		int compt=0;
		for(int i=0; i<tab.size(); i++) {
			if(tab.get(i)!=null)
				compt++;
		}
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
		
	 
		comboBox_2.setModel(new DefaultComboBoxModel(names));
		tot=compt;
		if(compt==0)
			return;
		comboBox_2.setSelectedIndex(0);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos= comboBox_2.getSelectedIndex();
				if(pos-4<0) { 
					comboBox_2.setSelectedIndex(0);
				}else {
					comboBox_2.setSelectedIndex(pos-4);
				}
			}
		}); 
		
		btnSuivant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos= comboBox_2.getSelectedIndex();
				if(pos+4>(tot-1)) { 
					comboBox_2.setSelectedIndex(tot-1);
				} else {
					comboBox_2.setSelectedIndex(pos+4);
				}
				
			}
		}); 
		
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

	


	private void remplir_carte(int pos, int total, List<String> inf) {
		int nbre= total-pos;
		int fin=0;
		if((nbre>=3)) {
			fin=pos+3;
			 
			carte3.setVisible(true);
			carte33.setVisible(true);
			carte2.setVisible(true);
			carte22.setVisible(true); 

			carte4.setVisible(true);
			carte44.setVisible(true); 
			
		}else if(nbre==2) {
			fin=pos+2;
			carte3.setVisible(true);
			carte33.setVisible(true);
			carte2.setVisible(true);
			carte22.setVisible(true);
			carte4.setVisible(false);
			carte44.setVisible(false); 
		}else if(nbre==1) {
			fin=pos+1;
			carte3.setVisible(false);
			carte33.setVisible(false);
			carte2.setVisible(true);
			carte22.setVisible(true);
			carte4.setVisible(false);
			carte44.setVisible(false);
		}else if(nbre==0) {
			fin=pos+0;	
			carte3.setVisible(false);
			carte33.setVisible(false);
			carte2.setVisible(false);
			carte22.setVisible(false);
			carte4.setVisible(false);
			carte44.setVisible(false);		
		}
		
		completer(pos, fin, inf);
		
		
		
	}
	
	
	private void completer(int pos, int fin, List<String> inf) {
		int posit=0; 
		for(int j=pos; j<=fin;j++) {
			String info= inf.get(Integer.parseInt(ordres[j]));
			List<String> details= new ArrayList(19);
			int anc_pos=0; 
			for(int i=0; i<info.length(); i++) {
				if(info.charAt(i)=='\n') {
					details.add(info.substring(anc_pos, i));
					anc_pos=i+1;
				}
			}
			posit++; 
			if(posit==1) {
				nom1.setText(details.get(0));
				pre1.setText(details.get(1));
				lieu1.setText(details.get(2)+" à "+details.get(3));
				cont1.setText(details.get(8));
				classe11.setText(init.lire_le_fichier("oui_classe_carte.txt"));
				mat1.setText(details.get(4));
				s1.setText(details.get(12));
				String txt=imgs.get(Integer.parseInt(ordres[j]));
				if(txt!=null) {

					for(int i=0; i<txt.length(); i++)
						txt=txt.replace('/', '\\');
					ImageIcon img=new ImageIcon(txt);
					Image image= img.getImage();
					Image image2=image.getScaledInstance(label_29.getWidth()	, label_29.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon icon= new ImageIcon(image2);
					label_29.setIcon(icon);
				}else {
					label_29.setIcon(null);
				}
				
			}else if(posit==2) {
				String txt=imgs.get(Integer.parseInt(ordres[j]));
				nom2.setText(details.get(0));
				pre2.setText(details.get(1));
				lieu2.setText(details.get(2)+" à "+details.get(3));
				cont2.setText(details.get(8));
				classe2.setText(init.lire_le_fichier("oui_classe_carte.txt"));
				mat2.setText(details.get(4));
				s2.setText(details.get(12));
				if(txt!=null) {
					for(int i=0; i<txt.length(); i++)
						txt=txt.replace('/', '\\');
					
					ImageIcon img=new ImageIcon(txt);
					
					Image image= img.getImage();
					Image image2=image.getScaledInstance(label_6.getWidth()	, label_6.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon icon= new ImageIcon(image2);
					label_6.setIcon(icon);
					
				}else {
					label_6.setIcon(null);
				}
			}else if (posit==3) {
				nom3.setText(details.get(0));
				pre3.setText(details.get(1));
				lieu3.setText(details.get(2)+" à "+details.get(3));
				cont3.setText(details.get(8));
				classe3.setText(init.lire_le_fichier("oui_classe_carte.txt"));
				mat3.setText(details.get(4));
				s3.setText(details.get(12));
				
				String txt=imgs.get(Integer.parseInt(ordres[j]));
				
				if(txt!=null) {

					for(int i=0; i<txt.length(); i++)
						txt=txt.replace('/', '\\');
					
					ImageIcon img=new ImageIcon(txt);
					
					Image image= img.getImage();
					Image image2=image.getScaledInstance(label_10.getWidth()	, label_10.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon icon= new ImageIcon(image2);
					label_10.setIcon(icon);
				}else {
					label_10.setIcon(null);
				}
			}else if (posit==4) {
				nom4.setText(details.get(0));
				pre4.setText(details.get(1));
				lieu4.setText(details.get(2)+" à "+details.get(3));
				cont4.setText(details.get(8));
				classe4.setText(init.lire_le_fichier("oui_classe_carte.txt"));
				mat4.setText(details.get(4));
				s4.setText(details.get(12));
				
				String txt=imgs.get(Integer.parseInt(ordres[j]));
				
				if(txt!=null) {

					for(int i=0; i<txt.length(); i++)
						txt=txt.replace('/', '\\');
					
					ImageIcon img=new ImageIcon(txt);
					
					Image image= img.getImage();
					Image image2=image.getScaledInstance(label_21.getWidth()	, label_21.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon icon= new ImageIcon(image2);
					label_21.setIcon(icon);
				}else {
					label_21.setIcon(null);
				}
			}
		}
	}



}
