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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.JScrollPane;

public class Classes {

	JFrame frmEducsoftWelcome;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private Initialize init=new Initialize();
	private JLabel lblMmlleVitouley, label, lblMathematiques;

	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classes window = new Classes();
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
					Classes window = new Classes();
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
	public Classes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */


	private void initialize() {
		frmEducsoftWelcome = new JFrame();
	//	frmEducsoftWelcome.setResizable(false);
		frmEducsoftWelcome.setTitle("Educsoft - Bordereau de notes de "+init.lire_le_fichier(Constantes.current_classe));
		//frmEducsoftWelcome.setBounds((int)(0*e1, (int)(0*e2), (int)(101101*e1), (int)(870*e2));
		frmEducsoftWelcome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		frmEducsoftWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEducsoftWelcome.getContentPane().setLayout(null);
		 
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel.setBackground(Color.WHITE);
		 
		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		float e1= ((float)dim.getWidth()/1571); float e2=(float) dim.getHeight()/853;
		
		
		
		panel.setBounds((int)(0*e1), (int)(0*e2), (int)(1571*e1), (int)(863*e2));
		frmEducsoftWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel lblNewLabel_4 = new JPanel();
		lblNewLabel_4.setBackground(Color.BLUE);
		lblNewLabel_4.setBounds((int)(218*e1), (int)(131*e2), (int)(8*e1), (int)(800*e2));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/Embleme_benin.jpg")));
		lblNewLabel_2.setBounds((int)(1447*e1), (int)(0*e2), (int)(93*e1), (int)(72*e2));
		panel.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(SystemColor.textHighlight);
		panel_2.setBackground(new Color(30, 144, 255));
		panel_2.setBounds(0, (int)(78*e2), (int)(214*e1), (int)(736*e2));
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblParamtrageClasse = new JLabel("  Bordereau de note");
		lblParamtrageClasse.setOpaque(true);
		lblParamtrageClasse.setBackground(Color.WHITE);
		lblParamtrageClasse.setForeground(Color.BLACK);
		lblParamtrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblParamtrageClasse.setBounds(0, (int)(52*e2), (int)(321*e1), (int)(86*e2));
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		//lblParamtrageClasse.setIcon(new ImageIcon(par_icon));
		panel_2.add(lblParamtrageClasse);
		
		JLabel lblInsrerUneNote = new JLabel("  Ins\u00E9rer une note");
		lblInsrerUneNote.setForeground(Color.WHITE);
		Image st_icon= new ImageIcon(this.getClass().getResource("/Icon 3 St.png")).getImage();
		//label.setIcon(new ImageIcon(st_icon));
		lblInsrerUneNote.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInsrerUneNote.setBounds(0,(int)(174*e2), (int)(331*e1), (int)(95*e2));
		panel_2.add(lblInsrerUneNote);

		lblMmlleVitouley = new JLabel();
		label = new JLabel("01");

		lblMathematiques = new JLabel();
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
		lblDisciplinesDeLa.setBounds(0, (int)(471*e1), (int)(204*e1), (int)(97*e2));
		panel_2.add(lblDisciplinesDeLa);
		
		JLabel lblInscrireUnlve = new JLabel("  Inscrire un \u00E9l\u00E8ve");
		lblInscrireUnlve.setForeground(Color.WHITE);
		Image gp_icon= new ImageIcon(this.getClass().getResource("/Icon 5 Sgpp.png")).getImage();
		//label_3.setIcon(new ImageIcon(gp_icon));
		lblInscrireUnlve.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInscrireUnlve.setBounds((int)(0*e1), (int)(578*e2), (int)(331*e1), (int)(97*e2));
		panel_2.add(lblInscrireUnlve);
		
		JLabel lblStatistiques = new JLabel("  Statistiques");
		lblStatistiques.setForeground(Color.WHITE);
		lblStatistiques.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStatistiques.setBounds((int)(0*e1), (int)(364*e2), (int)(331*e1), (int)(97*e2));
		panel_2.add(lblStatistiques);
		
		JPanel panel_1 = new JPanel();//new Color(0, 0, 139)
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds((int)(0*e1), (int)(78*e2), (int)(1540*e1), (int)(10*e2));
		panel.add(panel_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(this.getClass().getResource("/Carte benin.png")));
		lblNewLabel_3.setBounds((int)(0*e1), (int)(0*e2), (int)(91*e1), (int)(79*e2));
		panel.add(lblNewLabel_3);
		 
		
		JLabel lblNewLabel_5 = new JLabel(init.lire_le_fichier(Constantes.ecole_name));
		lblNewLabel_5.setBackground(Color.BLUE);
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Berlin Sans FB", Font.BOLD, 70));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds((int)(173*e1), (int)(0*e2), (int)(1253*e1), (int)(77*e2));
		panel.add(lblNewLabel_5);
		
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
		
		JLabel lblParametrageClasse = new JLabel("PARAMETRAGE CLASSE      >         "+init.lire_le_fichier(Constantes.current_classe));
		lblParametrageClasse.setBounds((int)(196*e1), (int)(14*e2), (int)(597*e1), (int)(25*e2));
		panel_3.add(lblParametrageClasse);
		lblParametrageClasse.setForeground(Color.WHITE);
		lblParametrageClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnImprimerDesCertificat = new JButton("IMPRIMER DES CERTIFICATS DE SCOLARITE");
		btnImprimerDesCertificat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Certificat c= new Certificat();
				c.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
			}
		});
		btnImprimerDesCertificat.setBounds((int)(784*e1), (int)(10*e2), (int)(316*e1), (int)(21*e2));
		panel_3.add(btnImprimerDesCertificat);
		
		String title[]=new String[] {"N", "Nom Pr\u00E9noms", "I1", "I2", "I3", "I4", "Moy Interro", "Dev 1", "Dev 2", "Moy sem", "Moy coef", "Rang", "Obs"} ;
		
		
		JLabel lblNewLabel = new JLabel("Copyright 2019 VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds((int)(1220*e1), (int)(813*e2), (int)(299*e1), (int)(13*e2));
		panel.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLUE);
		panel_4.setBounds((int)(1053*e1), (int)(131*e2), (int)(8*e1), (int)(800*e2));
		panel.add(panel_4);
		/*
		table_1.setModel(new DefaultTableModel(	,
			
		{
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Float.class, Float.class, Float.class, Float.class, Float.class, Float.class, Float.class, Float.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
 */
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Math\u00E9matiques", "Anglais", "Histoire-G\u00E9ographie"}));
		comboBox.setBounds((int)(1130*e1), (int)(313*e2), (int)(318*e1), (int)(21*e2));
		panel.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("SELECTIONNER LA MATIERE");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds((int)(1161*e1), (int)(253*e2), (int)(240*e1), (int)(26*e2));
		panel.add(lblNewLabel_6);
		
		JButton btnExporterVersExcel = new JButton("EXPORTER VERS EXCEL");
		btnExporterVersExcel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExporterVersExcel.setBounds((int)(1130*e1), (int)(427*e2), (int)(322*e1), (int)(21*e2));
		panel.add(btnExporterVersExcel);
		btnExporterVersExcel.setEnabled(false);
		/*
		btnExporterVersExcel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				XSSFWorkbook wb= new XSSFWorkbook();
				
			}
			
		});*/
		
		
		JButton btnImprimer = new JButton("IMPRIMER");
		btnImprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnImprimer.setBounds((int)(1130*e1), (int)(563*e2), (int)(322*e1), (int)(21*e2));
		panel.add(btnImprimer);
		remplir(init.lire_le_fichier(Constantes.fichier_ann), init.lire_le_fichier(Constantes.current_classe), comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);

		JPanel panel_5 = new JPanel();
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(Color.WHITE);
		btnImprimer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) { 
				scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
				scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				scrollPane_1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				scrollPane_1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
				PrinterJob pj= PrinterJob.getPrinterJob();
				pj.setJobName("Bordereau");
				pj.setPrintable(new Printable() {
					@Override
					public int print(Graphics arg0, PageFormat arg1, int index) throws PrinterException {
						if(index>0) {
							return Printable.NO_SUCH_PAGE;
						}
						
						Graphics2D g2d=(Graphics2D)arg0;
						g2d.translate(arg1.getImageableX()+10, arg1.getImageableY()+35);
						
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

				scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				scrollPane_1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				scrollPane_1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				
			}
			
		});
		
		lblInsrerUneNote.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Inserer_note inscription= new Inserer_note();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
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
	
		lblDisciplinesDeLa.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Matieres_classes inscription= new Matieres_classes();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.setVisible(false);
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
				frmEducsoftWelcome.setVisible(false);
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
				frmEducsoftWelcome.setVisible(false);
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
				
				scrollPane.setBounds((int)(224*e1), (int)(133*e2), (int)(792*e1), (int)(691*e2));
				panel.add(scrollPane);
		
				scrollPane.setViewportView(panel_5);
				scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
				panel_5.setPreferredSize(new Dimension((int)(900*e1), (int)(1000*e2)));
				
				panel_5.setBackground(Color.WHITE);
				panel_5.setLayout(null);
				
				
				JLabel lblCollgeCatholiqueSt = new JLabel(init.lire_le_fichier(Constantes.ecole_name).toUpperCase());
				lblCollgeCatholiqueSt.setBounds(0, 10, 789, 19);
				panel_5.add(lblCollgeCatholiqueSt);
				lblCollgeCatholiqueSt.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblCollgeCatholiqueSt.setHorizontalAlignment(SwingConstants.CENTER);
				
				JLabel lblNewLabel_1 = new JLabel("Discipline:");
				//lblNewLabel_1.setBounds((int)(20*e1), (int)(48*e2), (int)(78*e1), (int)(13*e2));
				lblNewLabel_1.setBounds((int)(20 ), (int)(48 ), 78, 20);
				panel_5.add(lblNewLabel_1);
				lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 14));
				
				//lblMathematiques.setBounds((int)(98*e1), (int)(48*e2), (int)(161*e1), (int)(13*e2));
				lblMathematiques.setBounds((int)(98 ), (int)(48 ), 161, 20);
				panel_5.add(lblMathematiques);
				lblMathematiques.setForeground(Color.BLUE);
				lblMathematiques.setFont(new Font("Calibri", Font.BOLD, 15));
				
				JLabel lblEnseignant = new JLabel("Enseignant:");
				//lblEnseignant.setBounds((int)(268*e1), (int)(48*e2), (int)(78*e1), (int)(13*e2));
				lblEnseignant.setBounds((int)(268), (int)(48), 78, 20);
				panel_5.add(lblEnseignant);
				lblEnseignant.setFont(new Font("Calibri", Font.BOLD, 14));
				
				lblMmlleVitouley.setBounds((int)(360), (int)(48), 318, 20);
				panel_5.add(lblMmlleVitouley);
				lblMmlleVitouley.setForeground(Color.BLUE);
				lblMmlleVitouley.setFont(new Font("Calibri", Font.BOLD, 15));
				
				JLabel lblCoefficient = new JLabel("Coefficient:");
				lblCoefficient.setBounds((int)(680), (int)(48), 78, 20);
				panel_5.add(lblCoefficient);
				lblCoefficient.setFont(new Font("Calibri", Font.BOLD, 14));
				
				label.setBounds((int)(750), (int)(48), 48, 20);
				panel_5.add(label);
				label.setForeground(Color.BLUE);
				label.setFont(new Font("Calibri", Font.BOLD, 15));
				
				JLabel lblAnneScolaire = new JLabel("Ann\u00E9e scolaire: ");
				lblAnneScolaire.setBounds((int)(110), (int)(78), (int)(140), (int)(16));
				panel_5.add(lblAnneScolaire);
				lblAnneScolaire.setFont(new Font("Calibri", Font.BOLD, 14));
				
				JLabel label_1 = new JLabel(init.lire_le_fichier(Constantes.fichier_ann));
				label_1.setBounds(215, 80, (int)(318), (int)(16));
				panel_5.add(label_1);
				label_1.setHorizontalAlignment(SwingConstants.CENTER);
				label_1.setForeground(Color.BLUE);
				label_1.setFont(new Font("Calibri", Font.BOLD, 15));
				
				
				JLabel lblTrimestre = new JLabel(init.lire_le_fichier(Constantes.current_trim).toUpperCase());
				lblTrimestre.setBounds((int)(639), (int)(20), (int)(161), (int)(13));
				panel_5.add(lblTrimestre);
				lblTrimestre.setForeground(Color.BLUE);
				lblTrimestre.setFont(new Font("Tahoma", Font.BOLD, 16));
				
				scrollPane_1.setBounds(13, 121, 800, 1000);
				panel_5.add(scrollPane_1);
				//AbstractTableModel model= new AbstractTableModel(getOb(), title);new Object[40][13]
				table_1 = new JTable(getOb(), title);
				scrollPane_1.setViewportView(table_1);
				table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				table_1.setAutoCreateRowSorter(true);
				table_1.setPreferredScrollableViewportSize(new Dimension(741, 1000));
				table_1.setRowSelectionAllowed(false);
				table_1.setRowHeight(40);
				
				table_1.setEnabled(false);
				
				table_1.getColumnModel().getColumn(0).setPreferredWidth(41);
				table_1.getColumnModel().getColumn(0).setResizable(false);
				table_1.getColumnModel().getColumn(1).setPreferredWidth(158);
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

		JPanel panel_10 = new JPanel();
		panel_10.setBounds((int)(dim.getWidth()-36), 0, (int)(36*e1), 2000);
		panel_10.setBackground(new Color(30, 144, 255));
		panel.add(panel_10);
			
	}
	
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
			 
			Object[][] ob =new Object[15][13];
			JSONArray js =init.getEleves("eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "classe = '"+classe+"'", create);
			System.out.println(js.length()+"------------");
			 if(js==null)
				return ob;
			else {
				
				if(js.length()==0)
					return ob;
				String autre=""; 
				List<String> tab=new ArrayList(200);
				List<String> infos=new ArrayList(200);
				int compt= js.length();
				for(int i=0; i<js.length();i++) {
					try {
						JSONObject rs=js.getJSONObject(i);
						tab.add(rs.getString("nom")+" "+rs.getString("prenoms"));
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				String names[]= new String[compt];
				String ordres[] = new String[compt];
				for(int i=0; i<compt; i++) {
					if(tab.get(i)!=null) {
						names[i]=tab.get(i);
						ordres[i]=String.valueOf(i);
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
					} 
				}
				ob=new Object[compt+55][13];
				for(int i=0; i<compt; i++) {
					ob[i][0]="  "+(i+1);
					ob[i][1]= "  "+ names[i];
					System.out.println("\nOrdre "+i+": "+ob[i][1]);
				}
			}
			
			
			
			
		
		

		return ob;
	}

	String id_ecol="";
	public void remplir(String annees, String classe, JComboBox combo) {
		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		String create= "CREATE TABLE IF NOT EXISTS classes_matieres_"+id_ecol.replaceAll("-", "")+" (classe VARCHAR(255),matieres VARCHAR(255),enseignant VARCHAR(255),annees VARCHAR(255),matricule VARCHAR (255),coef VARCHAR (255),autre TEXT)";
				 
		id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		String sql= "SELECT * FROM classes_matieres_"+id_ecol.replaceAll("-", "")+" WHERE classe='"+classe+"' and annees= '"+annees+"'";

		List<String> list= new ArrayList(500);
		int compt=0;
		JSONArray js= init.getClassesMatieres("classes_matieres_"+id_ecol.replaceAll("-", ""), "classe='"+classe+"' and annees= '"+annees+"'", create);
		if(js==null)
			return;
		for(int i=0; i<js.length(); i++) {
			String coef;
			try {
				JSONObject rs= js.getJSONObject(i);
				String mat= rs.getString("matieres");
				String ens= rs.getString("enseignant");
				coef = rs.getString("coef");
				list.add(mat+"\n"+ens+"\n"+coef);
				compt++;
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(js.length()==0)
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
		
		combo.setModel(new DefaultComboBoxModel(matieres));
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblMmlleVitouley.setText("M..  "+object[combo.getSelectedIndex()][1]);
				label.setText("0"+object[combo.getSelectedIndex()][2]);
				lblMathematiques.setText(""+object[combo.getSelectedIndex()][0]);
			}
			
		});
		combo.setSelectedIndex(0);
	}



}
