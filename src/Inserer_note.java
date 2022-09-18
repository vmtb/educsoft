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
import java.awt.Component;

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javax.swing.ScrollPaneConstants;

public class Inserer_note {

	JFrame frmEducsoftWelcome;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private Initialize init=new Initialize();
	private JButton btnExporterVersExcel;
	private JLabel lblMmlleVitouley, label, lblMathematiques;

	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inserer_note window = new Inserer_note();
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
					Inserer_note window = new Inserer_note();
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
	public Inserer_note() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEducsoftWelcome = new JFrame();
		//frmEducsoftWelcome.setResizable(false);
		frmEducsoftWelcome.setTitle("Educsoft - Welcome");

		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		float e1= ((float)dim.getWidth()/1571); float e2=(float) dim.getHeight()/863;
		frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		frmEducsoftWelcome.setBounds((int)(0*e1), (int)(0*e2), (int)(101101*e1), (int)(870*e2));
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
		
		JLabel lblParamtrageClasse = new JLabel("  Bordereau de note");
		lblParamtrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblParamtrageClasse.setBounds(0, (int)(52*e2), (int)(321*e1), (int)(86*e2));
		lblParamtrageClasse.setForeground(Color.WHITE);
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		//lblParamtrageClasse.setIcon(new ImageIcon(par_icon));
		panel_2.add(lblParamtrageClasse);
		
		JLabel lblInsrerUneNote = new JLabel("  Ins\u00E9rer une note");
		lblInsrerUneNote.setOpaque(true);
		lblInsrerUneNote.setBackground(Color.WHITE);
		lblInsrerUneNote.setForeground(Color.BLACK);
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
		 
		
		JLabel lblNewLabel_5 = new JLabel(init.lire_le_fichier(Constantes.ecole_name));
		lblNewLabel_5.setBackground(Color.BLUE);
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Berlin Sans FB", Font.BOLD, 70));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds((int)(173*e1), 0, (int)(1253*e1), (int)(77*e2));
		panel.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(30, 144, 255));
		panel_3.setBounds((int)(183*e1), (int)(82*e2), (int)(1357*e1), (int)(48*e2));
		panel.add(panel_3);
		panel_3.setLayout(null);
		

		JPanel panel_10 = new JPanel();
		panel_10.setBounds((int)(dim.getWidth()-36), 0, (int)(36*e1), 2000);
		panel_10.setBackground(new Color(30, 144, 255));
		panel.add(panel_10);
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
		
		String title[]=new String[] {"N", "Nom Pr\u00E9noms", "I1", "I2", "I3", "I4", "Moy Interro", "Dev 1", "Dev 2", "Moy sem", "Moy coef", "Rang", "Obs"} ;
		//AbstractTableModel model= new AbstractTableModel(getOb(), title);
		table_1 = new JTable(new Object[15][13], title);
		table_1.setModel(new DefaultTableModel(
			getOb(),
			new String[] {
				"N", "Nom Pr\u00E9noms", "I1", "I2", "I3", "I4", "Moy Interro", "Dev 1", "Dev 2", "Moy sem", "Moy coef", "Rang", "Obs"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, true, true, true, true, false, true, true, false, false, false, false
			};
			boolean[] columnR= new boolean[] {
					false, false, false, false, false, false, false, false, false, false, false, false, false
				};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
			public boolean isCellResizable(int row, int column) {
				return columnR[column];
			}
		});
		
		  DefaultTableCellRenderer center=new DefaultTableCellRenderer();
		   center.setHorizontalAlignment(JLabel.CENTER);
		   center.setVerticalAlignment(JLabel.CENTER);
		   DefaultTableCellRenderer center2=new DefaultTableCellRenderer( );
		   center2.setVerticalAlignment(JLabel.CENTER);
		   
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(6).setResizable(false);
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_1.setAutoCreateRowSorter(true);
		table_1.setRowSelectionAllowed(false);
		table_1.setBounds(0, 0, (int)(767*e1), (int)(702*e2));
		panel.add(table_1);

		table_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		table_1.setAlignmentY(Component.CENTER_ALIGNMENT);
		table_1.setRowHeight(40);
		table_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(41);
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(158);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(2).setResizable(false);
		table_1.getColumnModel().getColumn(2).setCellRenderer(center);
		table_1.getColumnModel().getColumn(3).setResizable(false);
		table_1.getColumnModel().getColumn(3).setCellRenderer(center);
		table_1.getColumnModel().getColumn(4).setResizable(false);
		table_1.getColumnModel().getColumn(4).setCellRenderer(center);
		table_1.getColumnModel().getColumn(5).setResizable(false);
		table_1.getColumnModel().getColumn(5).setCellRenderer(center);
		table_1.getColumnModel().getColumn(6).setResizable(false);
		table_1.getColumnModel().getColumn(6).setCellRenderer(center);
		table_1.getColumnModel().getColumn(7).setResizable(false);
		table_1.getColumnModel().getColumn(7).setCellRenderer(center);
		table_1.getColumnModel().getColumn(8).setResizable(false);
		table_1.getColumnModel().getColumn(8).setCellRenderer(center);
		table_1.getColumnModel().getColumn(9).setResizable(false);
		table_1.getColumnModel().getColumn(9).setCellRenderer(center);
		table_1.getColumnModel().getColumn(10).setResizable(false);
		table_1.getColumnModel().getColumn(11).setCellRenderer(center);
		table_1.getColumnModel().getColumn(10).setCellRenderer(center);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(40);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(40);
		table_1.getColumnModel().getColumn(3).setMinWidth(40);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(40);
		table_1.getColumnModel().getColumn(4).setMinWidth(40);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(40);
		table_1.getColumnModel().getColumn(5).setMinWidth(40);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(64);
		table_1.getColumnModel().getColumn(6).setMinWidth(11);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(40);
		table_1.getColumnModel().getColumn(7).setMinWidth(40);
		table_1.getColumnModel().getColumn(8).setPreferredWidth(40);
		table_1.getColumnModel().getColumn(9).setPreferredWidth(64);
		table_1.getColumnModel().getColumn(10).setPreferredWidth(64);
		
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds((int)(231*e1), (int)(260*e2), (int)(800*e1), (int)(724*e2));
		panel.add(scrollPane);
		
		
		JLabel lblNewLabel = new JLabel("Copyright 2019 VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds((int)(1220*e1), (int)(813*e2), (int)(299*e1), (int)(13*e2));
		panel.add(lblNewLabel);
		
		JLabel lblCollgeCatholiqueSt = new JLabel(init.lire_le_fichier(Constantes.ecole_name));
		lblCollgeCatholiqueSt.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCollgeCatholiqueSt.setHorizontalAlignment(SwingConstants.LEFT);
		//lblCollgeCatholiqueSt.setBounds((int)(243*e1), (int)(140*e2), (int)(857*e1), (int)(19*e2));
		lblCollgeCatholiqueSt.setBounds((int)(243*e1), (int)(140*e2), (int)(772*e1), (int)(19*e2));
		panel.add(lblCollgeCatholiqueSt);
		
		JLabel lblNewLabel_1 = new JLabel("Discipline:");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1.setBounds((int)(243 ), (int)(176 ), (int)(78 ), (int)(18 ));
		//lblNewLabel_1.setBounds((int)(243*e1), (int)(176*e2), (int)(78*e1), (int)(13*e2));
		panel.add(lblNewLabel_1); 
		
		 lblMathematiques = new JLabel("MATHEMATIQUES");
		lblMathematiques.setForeground(Color.BLUE);
		lblMathematiques.setFont(new Font("Calibri", Font.BOLD, 15));
		lblMathematiques.setBounds((int)(319 ), (int)(176 ), (int)(161), (int)(18 ));
		//lblMathematiques.setBounds((int)(319*e1), (int)(176*e2), (int)(161*e1), (int)(13*e2));
		panel.add(lblMathematiques);
		
		JLabel lblEnseignant = new JLabel("Enseignant:");
		lblEnseignant.setFont(new Font("Calibri", Font.BOLD, 14));
		lblEnseignant.setBounds((int)(476 ), (int)(176 ), (int)(78 ), (int)(13 ));
		lblEnseignant.setBounds((int)(476*e1), (int)(176*e2), (int)(100*e1), (int)(18*e2));
		panel.add(lblEnseignant);
		
		 lblMmlleVitouley = new JLabel("M. /Mlle .................");
		lblMmlleVitouley.setForeground(Color.BLUE);
		lblMmlleVitouley.setFont(new Font("Calibri", Font.BOLD, 15));
		lblMmlleVitouley.setBounds((int)(558*e1), (int)(176*e2), (int)(330*e1), (int)(18*e2));
		//lblMmlleVitouley.setBounds((int)(556 ), (int)(176 ), (int)(318), (int)(13 ));
		panel.add(lblMmlleVitouley);
		
		JLabel lblCoefficient = new JLabel("Coefficient:");
		lblCoefficient.setFont(new Font("Calibri", Font.BOLD, 14));
		//lblCoefficient.setBounds((int)(897 ), (int)(176 ), (int)(78 ), (int)(13 ));
		lblCoefficient.setBounds((int)(897*e1), (int)(176*e2), (int)(100*e1), (int)(18*e2));
		panel.add(lblCoefficient);
		 
		 label = new JLabel("01");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Calibri", Font.BOLD, 15));
	//	label.setBounds((int)(988), (int)(176 ), (int)(48 ), (int)(13 ));
		label.setBounds((int)(988*e1), (int)(176*e2), (int)(60*e1), (int)(18*e2));
		panel.add(label);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLUE);
		panel_4.setBounds((int)(1053*e1), (int)(131*e2), (int)(8*e1), (int)(800*e2));
		panel.add(panel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboBox.setBounds((int)(1130*e1), (int)(313*e2), (int)(318*e1), (int)(21*e2));
		panel.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("SELECTIONNER LA MATIERE");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds((int)(1161*e1), (int)(253*e2), (int)(240*e1), (int)(26*e2));
		panel.add(lblNewLabel_6);
		
	   btnExporterVersExcel = new JButton("SAUVEGARDER");
		btnExporterVersExcel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExporterVersExcel.setBounds((int)(1130*e1), (int)(427*e2), (int)(322*e1), (int)(21*e2));
		panel.add(btnExporterVersExcel);
		table_1.setEditingColumn(0);//.isCellEditable(1, 1);
		
		JLabel lblTrimestre = new JLabel(init.lire_le_fichier(Constantes.current_trim).toUpperCase());
		lblTrimestre.setToolTipText(init.lire_le_fichier(Constantes.current_trim).toUpperCase());
		lblTrimestre.setForeground(Color.BLUE);
		lblTrimestre.setFont(new Font("Tahoma", Font.BOLD, 16));
		//lblTrimestre.setBounds((int)(880*e1), (int)(140*e2), (int)(161*e1), (int)(13*e2));
		lblTrimestre.setBounds((int)(674*e1), (int)(215*e2), (int)(280*e1), (int)(20*e2));
		panel.add(lblTrimestre);
		
		remplir(init.lire_le_fichier(Constantes.fichier_ann), init.lire_le_fichier(Constantes.current_classe), comboBox);
		
		btnExporterVersExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				sauver_cellule() ;		
			}
		});


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
	
	
	String names[], matrs[], azert[];
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
			  
			List<String> tab=new ArrayList(200);
			List<String> infos=new ArrayList(200);
			List<String> mats=new ArrayList(200);
			List<String> matss=new ArrayList(200);
			String autre="";
			Object[][] ob =new Object[15][13];
			int compt=0; 
			
			JSONArray js = init.getEleves("eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "classe = '"+classe+"'", create);
			if(js==null)
				return ob;

			if(js.length()==0)
				return ob;
			for(int i=0; i<js.length(); i++) {
				JSONObject rs ;
				try {
					 rs= js.getJSONObject(i);
					tab.add(rs.getString("nom")+" "+rs.getString("prenoms"));
					mats.add(rs.getString("matricule"));
					matss.add(rs.getString("autre"));
					compt++;
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			names= new String[compt];
			matrs= new String[compt];
			azert= new String[compt];
			String ordres[] = new String[compt];
			for(int i=0; i<compt; i++) {
				if(tab.get(i)!=null) {
					names[i]=tab.get(i);
					ordres[i]=String.valueOf(i);
				}
				if(mats.get(i)!=null) {
					matrs[i]=mats.get(i);
				}
				if(matss.get(i)!=null) {
					azert[i]=matss.get(i);
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
					System.out.println("\nOrdre "+i+": "+ordres[i]);
					
					String val2= matrs[i];
					matrs[i]=matrs[pos];
					matrs[pos]=val2;
					String val3= azert[i];
					azert[i]=azert[pos];
					azert[pos]=val2;
				} 
			}
			lignes=compt;
			ob=new Object[compt+5][13];
			for(int i=0; i<compt; i++) {
				ob[i][0]=(i+1);
				ob[i][1]= names[i];
				System.out.println("\nOrdre "+i+": "+ob[i][1]);
			}
			
			
			
		
		

		return ob;
	}
	
	private void sauver_cellule() {
		JTable table= table_1; 
		 
		for(int i= 0; i<lignes; i++) { 
			String I1="", I2="", I3="", I4="", D1="", D2="";
			 
			System.out.println(table.getValueAt(i, 2)+"--"+table.getValueAt(i, 3)+"--"+table.getValueAt(i,4));
			table.editCellAt(i, 3); 

			if(table.getValueAt(i, 2)!=null) {
				I1=table.getValueAt(i, 2).toString().trim();
				if(init.contient_fausse2(I1)) { 
					init.Alerter("La première interrogation de "+names[i]+ " contient des caractères invalides !");
					break;
				}
			}
			
			table.editCellAt(i, 4);
			if(table.getValueAt(i, 3)!=null) {
				I2=table.getValueAt(i, 3).toString().trim();
				if(init.contient_fausse2(I2)) {
					init.Alerter("La seconde interrogation de "+names[i]+ " contient des caractères invalides !");
					break;
				}
			}
			
			table.editCellAt(i, 5);
			if(table.getValueAt(i, 4)!=null) {
				I3=table.getValueAt(i, 4).toString().trim();
				if(init.contient_fausse2(I3)) {
					init.Alerter("La troisième interrogation de "+names[i]+ " contient des caractères invalides !");
					break;
				}
			}
			
			table.editCellAt(i, 6);
			if(table.getValueAt(i, 5)!=null) {
				I4=table.getValueAt(i, 5).toString().trim();
				if(init.contient_fausse2(I4)) {
					init.Alerter("La quatrième interrogation de "+names[i]+ " contient des caractères invalides !");
					break;
				}
			}
			
			table.editCellAt(i, 8);
			if(table.getValueAt(i, 7)!=null) {
				D1=table.getValueAt(i, 7).toString().trim();
				if(init.contient_fausse2(D1)) {
					init.Alerter("Le premier devoir de "+names[i]+ " contient des caractères invalides !");
					break;
				}
			}
			
			table.editCellAt(i, 12);
			if(table.getValueAt(i, 8)!=null) {
				D2=table.getValueAt(i, 8).toString().trim();
				if(init.contient_fausse2(D2)) {
					init.Alerter("Le second devoir de "+names[i]+ " contient des caractères invalides !");
					break;
				}
			} 
			String MII="", MSS="", MCC="";
			float MI= calcul_MI(I1, I2, I3, I4);
			if(MI==-1)
				table.setValueAt("", i, 6);
			else
				table.setValueAt(MI, i, 6);
			 
			MII= table.getValueAt(i, 6).toString();
			int coef= Integer.parseInt(label.getText().toString());
			float MS= calcul_MS(table.getValueAt(i, 6).toString().trim(), D1, D2);
			
			System.out.println(MS+"");
			
			if(MS==-1)
				table.setValueAt("", i, 9);
			else {
				table.setValueAt(MS+"", i, 9);
				table.setValueAt(MS*coef, i, 10);	
			}
			MSS= table.getValueAt(i, 9).toString();
			MCC= table.getValueAt(i, 10).toString();
		
			inserer_note(i==lignes-1, matrs[i], init.lire_le_fichier(Constantes.current_classe), lblMathematiques.getText().toString(), I1, I2, I3, I4, MII, D1, D2, label.getText().toString(), MSS, MCC, azert[i]);
		}
		
	}
	boolean bon=true;
	
	

	public void inserer_note(boolean dernier, String matricule, String classe, String matiere, String I1, String I2, String I3, String I4,String MI, String D1, String D2, String coef, String MS, String MC, String deux) {
		if(dernier) {
			if(bon)
				init.Alerter("INSERTION REUSSIE !");
			else
				init.Alerter("INSERTION ACHEVEE AVEC DES ERREURRS ! \nEssayez de reprendre !");
		}
		
		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		String create= "CREATE TABLE IF NOT EXISTS notes_"+
		init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", "")+
		"(classe VARCHAR(255), matricule VARCHAR(255), matieres VARCHAR(255),I1 VARCHAR(255),I2 VARCHAR(255),I3 VARCHAR(255),I4 VARCHAR(255),MI VARCHAR(255) ,D1 VARCHAR(255),D2 VARCHAR(255),MS VARCHAR (255),coef VARCHAR (255),MC VARCHAR (255),autre TEXT)";
	//	init.create_table(sql2);
		
		JSONArray js = init.getNotes("notes_"+
				init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", ""), "classe='"+classe+"' and matricule ='"+matricule+"' and matieres='"+matiere+"' and autre ='"+init.lire_le_fichier(Constantes.fichier_ann)+"'", create);

		if(js!=null) {
			if(js.toString().equals("[]")) {

				String query="INSERT INTO `notes_"+
						init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", "")+
						"` (`classe`, `matricule`, `matieres`, `I1`,`I2`,`I3`,`I4`,`MI`,`D1`,`D2`,`MS`,`Coef`,`MC`,`autre`)"+
						"VALUES ('"+classe+"', '"+matricule+"', '"+matiere+"', '"+I1+"', '"+I2+"','"+I3+"', '"+I4+"', '"+MI+"', '"+D1+"', '"+D2+"','"+MS+"','"+coef+"','"+MC+"', '"+init.lire_le_fichier(Constantes.fichier_ann)+"')";
				if(init.inserer_simple(query, "notes_"+
						init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", ""), create, "matieres", deux)==0) {
					
				}else {
					bon=false;
				}
				return;
			}
				
			String query="UPDATE notes_"+
					init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", "")+
					" SET I1='"+I1+"', I2='"+I2+"', I3= '"+I3+"', I4='"+I4+"', MI='"+MI+"', D1='"+D1+"', D2='"+D2+"', MS='"+MS+"', coef='"+coef+"', MC='"+MC+"', MS='"+MS+"' "
							+ "WHERE classe='"+classe+"' and matricule ='"+matricule+"' and matieres='"+matiere+"'";
			
			if(init.update_2(query, "notes_"+
					init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", ""), "", "", deux)==0) {
				
			}else {
				bon=false;
				System.out.println("ECHEC");
			}
		}else {
			String query="INSERT INTO `notes_"+
					init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", "")+
					"` (`classe`, `matricule`, `matieres`, `I1`,`I2`,`I3`,`I4`,`MI`,`D1`,`D2`,`MS`,`Coef`,`MC`,`autre`)"+
					"VALUES ('"+classe+"', '"+matricule+"', '"+matiere+"', '"+I1+"', '"+I2+"','"+I3+"', '"+I4+"', '"+MI+"', '"+D1+"', '"+D2+"','"+MS+"','"+coef+"','"+MC+"', '"+init.lire_le_fichier(Constantes.fichier_ann)+"')";
			if(init.inserer_simple(query, "notes_"+
					init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", ""), create, "matieres", deux)==0) {
				
			}else {
				bon=false;
			}
		}
		
		
		 
	
	}
	
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
	
	
	String id_ecol="";
	public void remplir(String annees, String classe, JComboBox combo) {
		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		String create= "CREATE TABLE classes_matieres_"+id_ecol.replaceAll("-", "")+" (classe VARCHAR(255),matieres VARCHAR(255),enseignant VARCHAR(255),annees VARCHAR(255),matricule VARCHAR (255),coef VARCHAR (255),autre TEXT)";
		 
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));


		List<String> list= new ArrayList(500);
		int compt=0;

		JSONArray js=init.getClassesMatieres("classes_matieres_"+id_ecol.replaceAll("-", ""), "classe='"+classe+"' and annees= '"+annees+"'", create);
		if(js==null) {
			btnExporterVersExcel.setEnabled(false);
			return;
		}
		for(int i=0; i<js.length(); i++) {
			JSONObject rs;
			try {
				rs = js.getJSONObject(i);
				String mat= rs.getString("matieres");
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
		String [] matieres=new String[compt];
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)!=null) {				
				String text=list.get(i);
				String mati= text.substring(0, text.indexOf("\n"));
				String ensei= text.substring(text.indexOf("\n")+1, text.lastIndexOf("\n"));
				String coef= text.substring(text.lastIndexOf("\n")+1);
				matieres[i]=mati;
				object[i][0]=mati;
				object[i][1]=ensei;
				object[i][2]=coef;
				
			}
		}
		lblMmlleVitouley.setText("M..... "+object[0][1]);
		label.setText("0"+object[0][2]);
		lblMathematiques.setText(""+object[0][0]);

		//retrieve_note(object[0][0].toString(), init.lire_le_fichier(Constantes.current_classe));
		
		combo.setModel(new DefaultComboBoxModel(matieres));
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblMmlleVitouley.setText("M......  "+object[combo.getSelectedIndex()][1]);
				label.setText("0"+object[combo.getSelectedIndex()][2]);
				lblMathematiques.setText(""+object[combo.getSelectedIndex()][0]);
				reinitialiser() ;
				retrieve_note(object[combo.getSelectedIndex()][0].toString(), init.lire_le_fichier(Constantes.current_classe));
			}
			
		});
		combo.setSelectedIndex(0);
	}
	
	private void reinitialiser() {
		for(int pos=0; pos<lignes; pos++) {
			table_1.setValueAt("", pos, 2);
			table_1.setValueAt("", pos, 3);
			table_1.setValueAt("", pos, 4);
			table_1.setValueAt("", pos, 5);
			table_1.setValueAt("", pos, 6);
			table_1.setValueAt("", pos, 7);
			table_1.setValueAt("", pos, 8);
			table_1.setValueAt("", pos, 9);
			table_1.setValueAt("", pos, 10);
			table_1.setValueAt("", pos, 11);
		}
	}

	private void retrieve_note(String matiere, String classe) {
		String create= "CREATE TABLE notes_"+
				init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", "")+
				"(classe VARCHAR(255), matricule VARCHAR(255), matieres VARCHAR(255),I1 VARCHAR(255),I2 VARCHAR(255),I3 VARCHAR(255),I4 VARCHAR(255),MI VARCHAR(255) ,D1 VARCHAR(255),D2 VARCHAR(255),MS VARCHAR (255),coef VARCHAR (255),MC VARCHAR (255),autre TEXT)";
		

		List<String> rangs_moy=new ArrayList();
		String[] ordres_rang = new String[lignes];
		for (int i=0;i<lignes; i++) {
			rangs_moy.add("0");
			ordres_rang[i]=String.valueOf(-1);
		}
		int here=0; 
		
		JSONArray js= init.getNotes("notes_"+
				init.lire_le_fichier(Constantes.current_trim).trim().replaceAll(" " , "")+"_"+id_ecol.replaceAll("-", ""), "classe='"+classe+"' and matieres='"+matiere+"' and autre ='"+init.lire_le_fichier(Constantes.fichier_ann)+"'", create);
		
		if(js==null)
			return;

		if(js.length()==0)
			return;
		for(int j=0; j<js.length(); j++) {
			JSONObject rs;
			try {
				rs = js.getJSONObject(j);
				System.out.print("JSS: "+js.toString());
				String matricule= rs.getString("matricule");
				String I1= rs.getString("I1");
				String I2= rs.getString("I2");
				String I3= rs.getString("I3");
				String I4= rs.getString("I4");
				String MI= rs.getString("MI");
				String D1= rs.getString("D1");
				String D2= rs.getString("D2");
				String MS= rs.getString("MS");
				String MC= rs.getString("MC"); 
				int pos=0;
				for(int i=0; i<lignes; i++) {					 
					if(matrs[i].equals(matricule)) {
						pos=i;
						break;
					}
				}
				DecimalFormat df= new DecimalFormat("##.##");
				table_1.setValueAt(I1.equals("")?I1:df.format(Float.parseFloat(I1)), pos, 2);
				table_1.setValueAt(I2.equals("")?I2:df.format(Float.parseFloat(I2)), pos, 3);
				table_1.setValueAt(I3.equals("")?I3:df.format(Float.parseFloat(I3)), pos, 4);
				table_1.setValueAt(I4.equals("")?I4:df.format(Float.parseFloat(I4)), pos, 5);
				table_1.setValueAt(MI.equals("")?MI:df.format(Float.parseFloat(MI)), pos, 6);
				table_1.setValueAt(D1.equals("")?D1:df.format(Float.parseFloat(D1)), pos, 7);
				table_1.setValueAt(D2.equals("")?D2:df.format(Float.parseFloat(D2)), pos, 8);
				table_1.setValueAt(MS.equals("")?MS:df.format(Float.parseFloat(MS)), pos, 9);
				table_1.setValueAt(MC.equals("")?MC:df.format(Float.parseFloat(MC)), pos, 10);
				if(MC.equals(""))
						MC="0";
				rangs_moy.set(here, MC);
				
				ordres_rang[here]=String.valueOf(pos);
				here++;
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

				
		}
		
		
		/*if(here==0)
			return;*/
		
		for(int i=0; i<lignes; i++) {
			float max= Float.parseFloat(rangs_moy.get(i));
			int pos=i;
			for(int j=i; j<lignes; j++) {
				float touta= Float.parseFloat(rangs_moy.get(j));
				if(max<touta) {
					pos=j;
					max=touta;
				}
			}
			rangs_moy.set(pos, rangs_moy.get(i));
			rangs_moy.set(i, String.valueOf(max));

			String val= ordres_rang[pos];
			ordres_rang[pos]= ordres_rang[i];
			ordres_rang[i]=val;

			int rg= i+1;
			if(ordres_rang[i].equals("-1"))
				return;
			if(i==0) {
				table_1.setValueAt("1er(e)", Integer.parseInt(ordres_rang[i]), 11);

			}else
				table_1.setValueAt(rg+"ème", Integer.parseInt(ordres_rang[i]), 11);
			
		}
		
		for(int i=0; i<lignes; i++) {
			int pos= Integer.parseInt(ordres_rang[i]);
			
		}
		
	}





}
