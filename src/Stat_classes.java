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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class Stat_classes {

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
	private JTable table_3;
	private Initialize init= new Initialize();
	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stat_classes window = new Stat_classes();
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
					Stat_classes window = new Stat_classes();
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
	public Stat_classes() {
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
		frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		 e1= ((float)dim.getWidth()/1571);  e2=(float) dim.getHeight()/863;
		frmEducsoftWelcome.setTitle("Educsoft - "+init.lire_le_fichier(Constantes.ecole_name)+" - STATISTIQUES "+init.lire_le_fichier(Constantes.current_classe));
		frmEducsoftWelcome.setBounds(0, 0, (int)(101101*e1), (int)(870*e2));
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
		lblParamtrageClasse.setOpaque(true);
		lblParamtrageClasse.setBackground(new Color(30, 144, 255));
		lblParamtrageClasse.setForeground(Color.WHITE);
		lblParamtrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblParamtrageClasse.setBounds(0, (int)(78*e2), (int)(321*e1), (int)(86*e2));
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		
		JLabel lblInscrireUnlve = new JLabel("  Inscrire un \u00E9l\u00E8ve");
		lblInscrireUnlve.setForeground(Color.WHITE);
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
		lblBulletinsDeLa.setBounds(0,(int)( 279*e2), (int)(204*e1), (int)(79*e1));
		panel_2.add(lblBulletinsDeLa);
		
		JLabel lblDisciplinesDeLa = new JLabel("  Disciplines de la classe");
		lblDisciplinesDeLa.setForeground(Color.WHITE);
		Image ca_icon= new ImageIcon(this.getClass().getResource("/Icon 2.png")).getImage();
		//label_2.setIcon(new ImageIcon(ca_icon));
		lblDisciplinesDeLa.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDisciplinesDeLa.setBounds(0, (int)(471*e2), (int)(214*e1), (int)(97*e2));
		panel_2.add(lblDisciplinesDeLa);
		Image gp_icon= new ImageIcon(this.getClass().getResource("/Icon 5 Sgpp.png")).getImage();
		
		JLabel lblStatistiques = new JLabel("  Statistiques");
		lblStatistiques.setBackground(Color.WHITE);
		lblStatistiques.setForeground(Color.BLACK);
		lblStatistiques.setOpaque(true);
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
		
		JLabel lblParametrageClasse = new JLabel("PARAMETRAGE CLASSE      >   STATISTIQUES "+init.lire_le_fichier(Constantes.current_classe));
		lblParametrageClasse.setBounds((int)(196*e1), (int)(14*e2), (int)(597*e1), (int)(25*e2));
		panel_3.add(lblParametrageClasse);
		lblParametrageClasse.setForeground(Color.WHITE);
		lblParametrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		
		JLabel lblNewLabel = new JLabel("Copyright 2019 VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds((int)(1220*e1), (int)(813*e2), (int)(299*e1), (int)(13*e2));
		panel.add(lblNewLabel);
		
		JLabel lblFormulaireDinscription = new JLabel("STATISTIQUES (EFFECTIF) "+init.lire_le_fichier(Constantes.current_classe));
		lblFormulaireDinscription.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFormulaireDinscription.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFormulaireDinscription.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormulaireDinscription.setBounds((int)(576*e1), (int)(140*e2), (int)(662*e1), (int)(35*e2));
		panel.add(lblFormulaireDinscription);
		
		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds((int)(565*e1), (int)(255*e2), (int)(696*e1), (int)(479*e2));
		panel.add(panel_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setOpaque(false);
		panel_5.add(scrollPane);
		 DefaultTableCellRenderer center=new DefaultTableCellRenderer();
		  center.setHorizontalAlignment(JLabel.CENTER);
		   
		table_3 = new JTable();
		table_3.setEnabled(false);
		table_3.setForeground(Color.BLUE);
		table_3.setFont(new Font("Times New Roman", Font.BOLD, 28));
		scrollPane.setViewportView(table_3);
		String[] compte= gar_fil(init.lire_le_fichier(Constantes.fichier_ann), init.lire_le_fichier(Constantes.current_classe));
		int tot=Integer.parseInt(compte[0])+Integer.parseInt(compte[1]);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{" Inscrits", compte[0], compte[1], (tot)+""},
				{" Redoublants", "*/*", "*/*", "*/*"},
				{" Abandons", "*/*", "*/*", "*/*"},
				{" Total", compte[0], compte[1], tot+""},
			},
			new String[] {
				init.lire_le_fichier(Constantes.current_classe), "Gar\u00E7ons", "Filles", "Total"
			}
		));
		table_3.getColumnModel().getColumn(1).setCellRenderer(center);
		table_3.getColumnModel().getColumn(2).setCellRenderer(center);
		table_3.getColumnModel().getColumn(3).setCellRenderer(center);
		table_3.getColumnModel().getColumn(0).setPreferredWidth(132);
		table_3.getColumnModel().getColumn(1).setResizable(false);
		table_3.getColumnModel().getColumn(2).setCellRenderer(center);
		table_3.getColumnModel().getColumn(3).setCellRenderer(center);
		table_3.getColumnModel().getColumn(1).setCellRenderer(center);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(2).setResizable(false);
		table_3.getColumnModel().getColumn(2).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(3).setResizable(false);
		table_3.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(3).setMinWidth(100);
		table_3.setRowHeight(100);
		
		JButton btnImprimer = new JButton("IMPRIMER");
		btnImprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane .setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
				scrollPane .setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				PrinterJob pj= PrinterJob.getPrinterJob();
				pj.setJobName("Statistique");
				pj.setPrintable(new Printable() {

					@Override
					public int print(Graphics arg0, PageFormat arg1, int index) throws PrinterException {
						if(index>0) {
							return Printable.NO_SUCH_PAGE;
						}
						
						Graphics2D g2d=(Graphics2D)arg0;
						g2d.translate(arg1.getImageableX()+150, arg1.getImageableY()+100);
						
						g2d.scale(0.70	, 0.70);
						scrollPane.paint(g2d);
						
						return Printable.PAGE_EXISTS;
					}
					
				});
				
				boolean bool= pj.printDialog();
				if(bool) {
					try {
						pj.print();
					} catch (PrinterException ee) {
						// TODO Auto-generated catch block
						ee.printStackTrace();
					}
				}
				scrollPane .setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				scrollPane .setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			}
		});
		btnImprimer.setBounds((int)(799*e1), (int)(219*e2), (int)(190*e1), (int)(21*e2));
		panel.add(btnImprimer);
		

		
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
	
	
	public String[] gar_fil(String year, String classe) {

		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		System.out.println("starting...");
		String create= "CREATE TABLE IF NOT EXISTS eleves_"+year.replaceAll("-", "")
		+"_"+id_ecol.replaceAll("-", "")
		+" (classe VARCHAR(255),nom VARCHAR(255),prenoms VARCHAR(255),date VARCHAR (255),lieu VARCHAR (255),matricule VARCHAR (255),"
		+ "cont_urgence TEXT,nom_p VARCHAR (255),prenom_p TEXT,cont_mobile VARCHAR (255),cont_domicile VARCHAR (255),cont_travail VARCHAR (255),"
		+ "profession VARCHAR (255),arrond VARCHAR (255),adresse VARCHAR (255),qtier VARCHAR (255),g_sanguin VARCHAR (255),"
		+ "electroph VARCHAR (255),sexe VARCHAR (255),logo LONGBLOB,autre VARCHAR (255))";
		 
		//String sql= "SELECT * from eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", "")+" WHERE classe = '"+classe+"'";
		  
		String autre="";
		int m=0, f=0; 
		JSONArray js= init.getEleves("eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "classe = '"+classe+"'", create);
		if(js==null){

			String [] total= new String[2];
			total[0]=String.valueOf(0);
			total[1]=String.valueOf(0);
			return total;
		}
		if(js.length()==0){

			String [] total= new String[2];
			total[0]=String.valueOf(0);
			total[1]=String.valueOf(0);
			return total;
		}

		for(int i =0; i<js.length(); i++) {
			JSONObject rs;
			try {
				rs = js.getJSONObject(i);
				if(rs.getString("sexe").equals("M"))
					m++;
				else
					f++;
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String [] total= new String[2];
		total[0]=String.valueOf(m);
		total[1]=String.valueOf(f);
		return total;
	}
}
