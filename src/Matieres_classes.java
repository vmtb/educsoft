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
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class Matieres_classes {

	JFrame frmEducsoftWelcome;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
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
	private JTable table_2;
	private Initialize init = new Initialize();

	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Matieres_classes window = new Matieres_classes();
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
					Matieres_classes window = new Matieres_classes();
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
	public Matieres_classes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private float e1, e2;
	
	private String coef="1", enseign_names="", matiere="" ;
	private void initialize() {
		frmEducsoftWelcome = new JFrame();
		//frmEducsoftWelcome.setResizable(false);
		frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		frmEducsoftWelcome.setTitle("Educsoft - "+init.lire_le_fichier(Constantes.ecole_name)+" - DISCIPLINES DE LA "+init.lire_le_fichier(Constantes.current_classe));
		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		e1= ((float)dim.getWidth()/1571);  e2=(float) dim.getHeight()/863;
		
		frmEducsoftWelcome.setBounds(0, 0, (int) (101101*e1), (int) (870*e2));
		frmEducsoftWelcome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEducsoftWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEducsoftWelcome.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, (int) (1571*e1), (int) (863*e2));
		frmEducsoftWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel lblNewLabel_4 = new JPanel();
		lblNewLabel_4.setBackground(Color.BLUE);
		lblNewLabel_4.setBounds((int) (218*e1), (int) (131*e2), (int) (8*e1), (int) (800*e2));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/Embleme_benin.jpg")));
		lblNewLabel_2.setBounds((int) (1447*e1), 0, (int) (93*e1), (int) (72*e2));
		panel.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(SystemColor.textHighlight);
		panel_2.setBackground(new Color(30, 144, 255));
		panel_2.setBounds(0, (int) (78*e2), (int) (214*e1), (int) (736*e2));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblParamtrageClasse = new JLabel("  Bordereau de note");
		lblParamtrageClasse.setOpaque(true);
		lblParamtrageClasse.setBackground(new Color(30, 144, 255));
		lblParamtrageClasse.setForeground(Color.WHITE);
		lblParamtrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblParamtrageClasse.setBounds(0, (int) (78*e2), (int) (321*e1), (int) (86*e2));
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		
		JLabel lblInscrireUnlve = new JLabel("  Inscrire un \u00E9l\u00E8ve");
		lblInscrireUnlve.setForeground(Color.BLACK);
		//label_3.setIcon(new ImageIcon(gp_icon));
		lblInscrireUnlve.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInscrireUnlve.setBounds(0, (int) (578*e2), (int) (214*e1), (int) (97*e2));
		panel_2.add(lblInscrireUnlve);
		//lblParamtrageClasse.setIcon(new ImageIcon(par_icon));
		panel_2.add(lblParamtrageClasse);
		
		JLabel lblInsrerUneNote = new JLabel("  Ins\u00E9rer une note");
		lblInsrerUneNote.setForeground(Color.WHITE);
		Image st_icon= new ImageIcon(this.getClass().getResource("/Icon 3 St.png")).getImage();
		//label.setIcon(new ImageIcon(st_icon));
		lblInsrerUneNote.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInsrerUneNote.setBounds(0, (int) (174*e2), (int) (331*e1), (int) (95*e2));
		panel_2.add(lblInsrerUneNote);
		
		JLabel lblBulletinsDeLa = new JLabel("  Bulletins de la classe");
		lblBulletinsDeLa.setForeground(Color.WHITE);
		Image cs_icon= new ImageIcon(this.getClass().getResource("/Icon 1.png")).getImage();
		//label_1.setIcon(new ImageIcon(cs_icon));
		lblBulletinsDeLa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBulletinsDeLa.setBounds(0, (int) (279*e1), (int) (204*e1), (int) (79*e2));
		panel_2.add(lblBulletinsDeLa);
		
		JLabel lblDisciplinesDeLa = new JLabel("  Disciplines de la classe");
		lblDisciplinesDeLa.setBackground(Color.WHITE);
		lblDisciplinesDeLa.setForeground(Color.BLACK);
		lblDisciplinesDeLa.setOpaque(true);
		Image ca_icon= new ImageIcon(this.getClass().getResource("/Icon 2.png")).getImage();
		//label_2.setIcon(new ImageIcon(ca_icon));
		lblDisciplinesDeLa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDisciplinesDeLa.setBounds(0, (int) (471*e2), (int) (214*e1), (int) (97*e2));
		panel_2.add(lblDisciplinesDeLa);
		Image gp_icon= new ImageIcon(this.getClass().getResource("/Icon 5 Sgpp.png")).getImage();
		
		JLabel lblStatistiques = new JLabel("  Statistiques");
		lblStatistiques.setForeground(Color.WHITE);
		lblStatistiques.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStatistiques.setBounds(0, (int) (364*e2), (int) (331*e1), (int) (97*e2));
		panel_2.add(lblStatistiques);
		
		JPanel panel_1 = new JPanel();//new Color(0, 0, 139)
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(0, (int) (78*e2), (int) (1540*e1), (int) (10*e2));
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
		lblNewLabel_5.setBounds((int) (173*e1), 0, (int) (1253*e1), (int) (77*e2));
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
		panel_3.setBounds((int) (183*e1), (int) (82*e2), (int) (1357*e1), (int) (48*e2));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		//Image home_icon= new ImageIcon(this.getClass().getResource("/Home.png")).getImage();
		JLabel lblHome = new JLabel("Accueil  >   ");
		//lblHome.setIcon(new ImageIcon(home_icon));
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setBounds((int) (58*e1), (int) (10*e2), (int) (128*e1), (int) (33*e2));
		panel_3.add(lblHome);
		
		JLabel lblAide = new JLabel("Aide ?");
		lblAide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAide.setForeground(new Color(255, 255, 255));
		lblAide.setBounds((int) (1270*e1), (int) (13*e2), (int) (77*e1), (int) (27*e2));
		panel_3.add(lblAide);
		
		JLabel lblParametrageClasse = new JLabel("PARAMETRAGE CLASSE      >         "+init.lire_le_fichier(Constantes.current_classe));
		lblParametrageClasse.setBounds((int) (196*e1), (int) (14*e2), (int) (597*e1), (int) (25*e2));
		panel_3.add(lblParametrageClasse);
		lblParametrageClasse.setForeground(Color.WHITE);
		lblParametrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		
		JLabel lblNewLabel = new JLabel("Copyright 2019 VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds((int) (1220*e1), (int) (813*e2), (int) (299*e1), (int) (13*e2));
		panel.add(lblNewLabel);
		
		JLabel lblFormulaireDinscription = new JLabel("AJOUTER DES MATIERES A CETTE CLASSE");
		lblFormulaireDinscription.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFormulaireDinscription.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFormulaireDinscription.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormulaireDinscription.setBounds((int) (576*e1), (int) (140*e2), (int) (662*e1), (int) (35*e2));
		panel.add(lblFormulaireDinscription);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLUE);
		panel_4.setBounds((int) (911*e1), (int) (185*e2), (int) (8*e1), (int) (800*e2));
		panel.add(panel_4);
		
		JLabel lblDejaAjoutees = new JLabel("MATIERES DEJA AJOUTEES EN "+init.lire_le_fichier(Constantes.current_classe));
		lblDejaAjoutees.setHorizontalAlignment(SwingConstants.CENTER);
		lblDejaAjoutees.setFocusable(false);
		lblDejaAjoutees.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDejaAjoutees.setBounds((int) (1060*e1), (int) (230*e2), (int) (437*e1), (int) (16*e2));
		panel.add(lblDejaAjoutees);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds((int) (929*e1), (int) (268*e2), (int) (696*e1), (int) (479*e2));
		panel.add(panel_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		panel_5.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setRowMargin(3);
		table_2.setRowHeight(30);
		table_2.setEnabled(false);
		scrollPane.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Mati\u00E8res", "Enseignant", "Action"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_2.getColumnModel().getColumn(0).setPreferredWidth(133);
		table_2.getColumnModel().getColumn(1).setResizable(false);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(165);
		table_2.setBackground(Color.WHITE);
		
		JLabel lblMatiere = new JLabel("MATIERE:");
		lblMatiere.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMatiere.setBounds((int) (533*e1), (int) (231*e2), (int) (114*e1), (int) (13*e2));
		panel.add(lblMatiere);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds((int) (410*e1), (int) (268*e2), (int) (345*e1), (int) (21*e2));
		panel.add(comboBox);
		
		JLabel lblEnseignant = new JLabel("ENSEIGNANT:");
		lblEnseignant.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnseignant.setBounds((int) (533*e1), (int) (345*e2), (int) (114*e1), (int) (13*e2));
		panel.add(lblEnseignant);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds((int) (410*e1), (int) (390*e2), (int) (345*e1), (int) (21*e2));
		panel.add(comboBox_1);
		
		JButton btnAjouter = new JButton("AJOUTER");
		btnAjouter.setBounds((int) (493*e1), (int) (574*e2), (int) (201*e1), (int) (53*e2));
		panel.add(btnAjouter);
		
		JLabel lblCoefficient = new JLabel("Coefficient:");
		lblCoefficient.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCoefficient.setBounds((int)(533*e1), (int) (446*e2), (int) (114*e1), (int) (13*e2));
		panel.add(lblCoefficient);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"}));
		comboBox_2.setBounds((int) (410*e1), (int) (497*e2), (int) (345*e1), (int) (21*e2));
		panel.add(comboBox_2);
		
		comboBox_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				coef= comboBox_2.getSelectedItem().toString();
			}
			
		});
		
		
		btnAjouter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(init.lire_le_fichier(Constantes.current_classe).equals(""))
					return;
				if(enseign_names.equals("")||matiere.equals(""))
					init.Alerter("Veuillez choisir la matière et la discipline !");
				else {
					if(init.msgIsShow("Voulez-vous vraiment ajouter: \nMatière: "+matiere+"\nChargé du cours: "+enseign_names+"\nCoefficient: "+coef+"\n  ?", "Confirmer")) {
						inscrire_enseignant(table_2, enseign_names, matr, coef,matiere, init.lire_le_fichier(Constantes.current_classe), init.lire_le_fichier(Constantes.fichier_ann));
					}
				}
				
			}
			
		});



		initialise_les_mat(comboBox,comboBox_1);

		remplir( init.lire_le_fichier(Constantes.current_classe),  init.lire_le_fichier(Constantes.fichier_ann)) ; 

		lblInscrireUnlve.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Insc_eleve inscription= new Insc_eleve();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
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
	
	protected void inscrire_enseignant(JTable table_22, String enseign_names2, String matr2, String coef2,
			String matiere2, String classe, String year) {
		
		String create= "CREATE TABLE IF NOT EXISTS classes_matieres_"+id_ecol.replaceAll("-", "")+" (classe VARCHAR(255),matieres VARCHAR(255),enseignant VARCHAR(255),annees VARCHAR(255),matricule VARCHAR (255),coef VARCHAR (255),autre TEXT)";
		 
		JSONArray js= init.getClassesMatieres("classes_matieres_"+id_ecol.replaceAll("-", ""), "matieres = '"+matiere2+"' and classe = '"+classe+"' and annees = '"+year+"'", create);
//		String sql= "SELECT * from classes_matieres_"+id_ecol.replaceAll("-", "")+" WHERE matieres = '"+matiere2+"' and classe = '"+classe+"' and annees = '"+year+"'";
		if(js==null) {

			String query= "INSERT INTO `classes_matieres_"+id_ecol.replaceAll("-", "")+"`(`classe`, `matieres`, `enseignant`, `annees`,`matricule`, `coef`,`autre`)"
					+ " VALUES ('"+classe+"','"+matiere2+"','"+enseign_names2+"','"+year+"','"+matr2+"','"+coef2+"','ras')";
			
			if(init.inserer_(query, "classes_matieres_"+id_ecol.replaceAll("-", ""), create, "enseignant", "Matière "+matiere2+" ajoutée avec succès !", "Echec de l'ajout de la matière ! Veuillez réessayer...")==0) {
				remplir( classe,  year) ;
			}
			
		}else {
			if(js.toString().equals("[]")) {
				String query= "INSERT INTO `classes_matieres_"+id_ecol.replaceAll("-", "")+"`(`classe`, `matieres`, `enseignant`, `annees`,`matricule`, `coef`,`autre`)"
						+ " VALUES ('"+classe+"','"+matiere2+"','"+enseign_names2+"','"+year+"','"+matr2+"','"+coef2+"','ras')";
				
				if(init.inserer_(query, "classes_matieres_"+id_ecol.replaceAll("-", ""), create, "enseignant", "Matière "+matiere2+" ajoutée avec succès !", "Echec de l'ajout de la matière ! Veuillez réessayer...")==0) {
					remplir( classe,  year) ;
				}
				return;
			}
			String query= "UPDATE `classes_matieres_"+id_ecol.replaceAll("-", "") +"` SET  `enseignant`='"+enseign_names2+"', `coef`='"+coef2+"' WHERE matieres = '"+matiere2+"' and classe = '"+classe+"' and annees = '"+year+"'";
			if(init.update_(query, "classes_matieres_"+id_ecol.replaceAll("-", ""), "", "")==0) {
				init.Alerter("Mis à jour effectuée avec succès !"); 
				remplir( classe,  year) ;
			}else {
				init.Alerter("Echec de la mise à jour !");
			}
	 
		} 
		
		
	}

	private String [] names, ordres;
	List<String> matric= new ArrayList(500);
	
	
	private void getEnseignant(JComboBox comboBox_1, String matiere) {
		
		String create= "CREATE TABLE IF NOT EXISTS enseignants_"+id_ecol.replaceAll("-", "")+" (nom VARCHAR(255),prenoms VARCHAR(255),matricule VARCHAR (255),diplome VARCHAR (255),grade VARCHAR (255),matieres TEXT,contact VARCHAR (255),autre TEXT)";
		 
		 
		List<String> list= new ArrayList(500);
		int compt=0; 
		JSONArray js=init.getEnseignant("enseignants_"+id_ecol.replaceAll("-", ""), "1", create);
		
		if(js==null)
			return;
		if(js.toString().equals("[]"))
			return;
		
		for(int i=0;i<js.length(); i++) {
			JSONObject rs;
			try {
				rs = js.getJSONObject(i);
				String nom=rs.getString("nom");
				String prenom=rs.getString("prenoms");
				String matricule=rs.getString("matricule");
				String diplome=rs.getString("diplome");
				String grade=rs.getString("grade");
				String matieres=rs.getString("matieres");
				if(!matieres.contains(matiere))
					continue;
				String contact=rs.getString("contact"); 				
				compt++;
				matric.add(matricule);
				list.add(nom+" "+prenom+"\t"+matricule+"\t"+diplome+"\t"+grade+"\t"+matieres+"\t"+contact);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		if (compt!=0)  {
			//infos_prof=new String[compt];
			 names=new String[compt];
			 ordres=new String[compt];
			 
			for(int i=0; i<compt; i++) {
				names[i]= list.get(i).substring(0, list.get(i).indexOf('\t'));
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
					ordres[pos]=String.valueOf(i); 
					ordres[i]=String.valueOf(pos);
				} 
			}
			enseign_names= names[0]; 
			matr=matric.get(Integer.parseInt(ordres[0])); 
			/*CONSTITUTION DE OBJECT*/
			comboBox_1.setModel(new DefaultComboBoxModel(names));
			comboBox_1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					matr=matric.get(Integer.parseInt(ordres[comboBox_1.getSelectedIndex()]));
					enseign_names= names[comboBox_1.getSelectedIndex()];
					
				}
				
			});
			
			
			
		}

	}

	private void getEnseignant2(JComboBox comboBox_1, String matiere) {
		
		String create= "CREATE TABLE IF NOT EXISTS enseignants_"+id_ecol.replaceAll("-", "")+" (nom VARCHAR(255),prenoms VARCHAR(255),matricule VARCHAR (255),diplome VARCHAR (255),grade VARCHAR (255),matieres TEXT,contact VARCHAR (255),autre TEXT)";
		 
		 
		List<String> list= new ArrayList(500);
		int compt=0; 
		JSONArray js=init.getEnseignant("enseignants_"+id_ecol.replaceAll("-", ""), "1", create);
		
		if(js==null)
			return;
		if(js.toString().equals("[]"))
			return;
		
		for(int i=0;i<js.length(); i++) {
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
		
		if (compt!=0)  {
			//infos_prof=new String[compt];
			 names=new String[compt];
			 ordres=new String[compt];
			 
			for(int i=0; i<compt; i++) {
				names[i]= list.get(i).substring(0, list.get(i).indexOf('\t'));
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
					ordres[pos]=String.valueOf(i); 
					ordres[i]=String.valueOf(pos);
				} 
			}
			enseign_names= names[0]; 
			matr=matric.get(Integer.parseInt(ordres[0])); 
			/*CONSTITUTION DE OBJECT*/
			comboBox_1.setModel(new DefaultComboBoxModel(names));
			comboBox_1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					matr=matric.get(Integer.parseInt(ordres[comboBox_1.getSelectedIndex()]));
					enseign_names= names[comboBox_1.getSelectedIndex()];
					
				}
				
			});
			
			
			
		}

	}
	private String matr="";

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
	
	String id_ecol="";
	private void initialise_les_mat(JComboBox j_p , JComboBox ensei) {
		String create= "CREATE TABLE ecoles_info (id_ecl VARCHAR(255),promotions VARCHAR(255),matieres VARCHAR (255),autre VARCHAR (255))";
		
		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
	//	String sql= "SELECT * FROM ecoles_info WHERE id_ecl='"+id_ecol+"'";
		 	
		String matieres="";
 
		JSONArray js= init.getEcolesInfos("ecoles_info", "id_ecl='"+id_ecol+"'", create);
		if(js==null)
			return;
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
			 
			 
			j_p.setModel(new DefaultComboBoxModel(year));
			j_p.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					matiere= j_p.getSelectedItem().toString();
					if(matiere.equals("Conduite")) {
						getEnseignant2 ( ensei, matiere) ;
					}else
						getEnseignant ( ensei, matiere) ;
				}
				
			});
		}
		
		
	}

	 
	public void remplir(String classe, String annees) {
		String create= "CREATE TABLE IF NOT EXISTS classes_matieres_"+id_ecol.replaceAll("-", "")+" (classe VARCHAR(255),matieres VARCHAR(255),enseignant VARCHAR(255),annees VARCHAR(255),matricule VARCHAR (255),coef VARCHAR (255),autre TEXT)";
		 
		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
	 
		List<String> list= new ArrayList(500);
		int compt=0; 
		JSONArray js= init.getClassesMatieres("classes_matieres_"+id_ecol.replaceAll("-", ""), "classe='"+classe+"' and annees= '"+annees+"'", create);
		if(js==null)
			return;
		
		for(int i=0; i<js.length(); i++) {
			String mat;
			try {
				JSONObject rs=js.getJSONObject(i);
				mat = rs.getString("matieres");
				String ens= rs.getString("enseignant");
				String coef= rs.getString("coef");
				list.add(mat+"\n"+ens+"\n"+coef);
				compt++;
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(compt==0)
			return;
		Object [][] object= new Object[compt][3];
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)!=null) {
				
				String text=list.get(i);
				String mati= text.substring(0, text.indexOf("\n"));
				String ensei= text.substring(text.indexOf("\n")+1, text.lastIndexOf("\n"));
				String coef= text.substring(text.lastIndexOf("\n")+1);
				
				object[i][0]=mati;
				object[i][1]=ensei;
				object[i][2]=coef;
				
			}
		}
		table_2.setModel(new DefaultTableModel(object,
				new String[] {
					"Mati\u00E8res", "Enseignant", "Coefficient"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					true, false, true
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
		

		table_2.getColumnModel().getColumn(0).setPreferredWidth(133);
		table_2.getColumnModel().getColumn(1).setResizable(false);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(165);
		table_2.setBackground(Color.WHITE);
	}
	
}
