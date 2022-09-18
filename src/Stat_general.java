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
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.SQLException;
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

public class Stat_general {

	JFrame frmEducsoftWelcome;
	private JTable table;
	private Initialize init= new Initialize();
	private String fichier1= Constantes.fichier_key;
	private String fichier2= Constantes.fichier_ann;
	private String classe="6ème";
	private String total_classe="";
	private JTable table_1;

	 
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stat_general window = new Stat_general();
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
					Stat_general window = new Stat_general();
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
	public Stat_general() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame. 
	 */
	private float e1,e2;
	
	private void initialize() {
		frmEducsoftWelcome = new JFrame();
	//	frmEducsoftWelcome.setResizable(false);
		frmEducsoftWelcome.setTitle("Educsoft - "+init.lire_le_fichier(Constantes.ecole_name)+" - STATISTIQUES GENERALES "+init.lire_le_fichier(Constantes.fichier_ann));
		frmEducsoftWelcome.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		e1= ((float)dim.getWidth()/1571);  e2=(float) dim.getHeight()/863;
		
		frmEducsoftWelcome.setBounds(0, 0,(int)( 101101*e1), (int)(870*e2));
		frmEducsoftWelcome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEducsoftWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEducsoftWelcome.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 105, 225));
		panel.setBounds(0, 0, (int)(1571*e1), (int)(863*e2));
		frmEducsoftWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/Embleme_benin.jpg")));
		lblNewLabel_2.setBounds((int)(1447*e1), 0, (int)(93*e1), (int)(72*e2));
		panel.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		panel_2.setBounds(0, (int)(78*e2), (int)(299*e1), (int)(736*e2));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblParamtrageClasse = new JLabel("Param\u00E9trage classe");
		lblParamtrageClasse.setForeground(Color.WHITE);
		lblParamtrageClasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblParamtrageClasse.setBounds(0, (int)(59*e2), (int)(321*e1), (int)(79*e2));
		Image par_icon= new ImageIcon(this.getClass().getResource("/Icon 4 Pc.png")).getImage();
		lblParamtrageClasse.setIcon(new ImageIcon(par_icon));
		panel_2.add(lblParamtrageClasse);
		
		JLabel label = new JLabel("Statistiques");
		label.setOpaque(true);
		label.setBackground(new Color(65, 105, 225));
		label.setForeground(new Color(255, 255, 255));
		Image st_icon= new ImageIcon(this.getClass().getResource("/Icon 3 St.png")).getImage();
		label.setIcon(new ImageIcon(st_icon));
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(0, (int)(174*e2), (int)(331*e1), (int)(95*e2));
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Cartes scolaires");
		label_1.setForeground(Color.WHITE);
		Image cs_icon= new ImageIcon(this.getClass().getResource("/Icon 1.png")).getImage();
		label_1.setIcon(new ImageIcon(cs_icon));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(0, (int)(331*e2), (int)(331*e1), (int)(79*e2));
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Calendrier scolaire");
		label_2.setForeground(Color.WHITE);
		Image ca_icon= new ImageIcon(this.getClass().getResource("/Icon 2.png")).getImage();
		label_2.setIcon(new ImageIcon(ca_icon));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(0,(int)( 471*e2), (int)(331*e1), (int)(97*e2));
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Gestion du personnel");
		label_3.setForeground(Color.WHITE);
		Image gp_icon= new ImageIcon(this.getClass().getResource("/Icon 5 Sgpp.png")).getImage();
		label_3.setIcon(new ImageIcon(gp_icon));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(0,(int)( 598*e2), (int)(331*e1), (int)(97*e2));
		panel_2.add(label_3);
		
		JPanel panel_1 = new JPanel();//new Color(0, 0, 139)
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds(0, (int)(78*e2), (int)(1540*e1), (int)(10*e2));
		panel.add(panel_1);
		
		 
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(this.getClass().getResource("/Carte benin.png")));
		lblNewLabel_3.setBounds(0, 0, (int)(91*e1), (int)(79*e2));
		panel.add(lblNewLabel_3);
		 
		
		JLabel lblNewLabel_5 = new JLabel("Coll\u00E8ge catholique Saint Fran\u00E7ois d'Assise");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Berlin Sans FB", Font.BOLD, 70));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds((int)(173*e1), 0, (int)(1253*e1), (int)(77*e2));
		panel.add(lblNewLabel_5);
		if(init.lire_le_fichier(Constantes.ecole_name).equals("")) {
			remplir(lblNewLabel_5, null, null, null, null, null);
		}else
			lblNewLabel_5.setText(init.lire_le_fichier(Constantes.ecole_name));
		 
		
		JLabel lblNewLabel = new JLabel("Copyright 2019 VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, (int)(817*e2), (int)(299*e1), (int)(13*e2));
		panel.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(47, 79, 79));
		panel_3.setBounds((int)(298*e1), (int)(82*e2), (int)(1242*e1), (int)(55*e2));
		panel.add(panel_3);
		panel_3.setLayout(null);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds((int)(dim.getWidth()-36), 0, (int)(36*e1), 2000);
		panel_10.setBackground(new Color(47, 79, 79));
		panel.add(panel_10);
		//Image home_icon= new ImageIcon(this.getClass().getResource("/Home.png")).getImage();
		JLabel lblHome = new JLabel("Accueil  >   ");
		//lblHome.setIcon(new ImageIcon(home_icon));
		lblHome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setBounds((int)(10*e1), (int)(10*e2), (int)(128*e1), (int)(33*e2));
		panel_3.add(lblHome);
		
		JLabel lblParametrageClasse = new JLabel("STATISTIQUE GENERALE "+init.lire_le_fichier(Constantes.fichier_ann));
		lblParametrageClasse.setForeground(Color.WHITE);
		lblParametrageClasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblParametrageClasse.setBounds((int)(119*e1), (int)(10*e2), (int)(504*e1), (int)(33*e2));
		panel_3.add(lblParametrageClasse);
		
		JLabel lblAide = new JLabel("Aide ?");
		lblAide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAide.setForeground(new Color(255, 255, 255));
		lblAide.setBounds((int)(1175*e1), (int)(13*e2), (int)(77*e1), (int)(27*e2));
		panel_3.add(lblAide);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds((int)(697*e1), (int)(294*e2), (int)(460*e1), (int)(460*e2));
		panel.add(scrollPane);
		//AbstractTableModel model= new AbstractTableModel(getOb(), title);
		
		DefaultTableCellRenderer center=new DefaultTableCellRenderer();
		center.setHorizontalAlignment(JLabel.CENTER);
		String[] compte= gar_fil(init.lire_le_fichier(Constantes.fichier_ann), init.lire_le_fichier(Constantes.current_classe));
		
		int tot=Integer.parseInt(compte[0])+Integer.parseInt(compte[1]);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{" Inscrits", compte[0], compte[1], tot},
				{" Redoublants", "*/*", "*/*", "*/*"},
				{" Abandons", "*/*", "*/*", "*/*"},
				{" Total", compte[0], compte[1], tot},
			},
			new String[] {
				" Ecole", "Gar\u00E7ons", "Filles", "Total"
			}
		));
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(132);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(2).setCellRenderer(center);
		table_1.getColumnModel().getColumn(3).setCellRenderer(center);
		table_1.getColumnModel().getColumn(1).setCellRenderer(center);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(2).setResizable(false);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(3).setResizable(false);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(3).setMinWidth(100);
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_1.setAutoCreateRowSorter(true);
		table_1.setRowSelectionAllowed(false);
		table_1.setBounds(0, 0, (int)(767*e1), (int)(702*e2)); 
		
		table_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		table_1.setAlignmentY(Component.CENTER_ALIGNMENT);
		table_1.setRowHeight(100);
		table_1.setEnabled(false);
		table_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		scrollPane.setViewportView(table_1);
		
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
	
		label_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Cartes_scolaires inscription= new Cartes_scolaires();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftWelcome.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label_1.setBackground(new Color(65, 105, 225));
				label_1.setForeground(new Color(255, 255, 255));
				label_1.setOpaque(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label_1.setForeground(Color.WHITE);

				label_1.setBackground(null);
				label_1.setOpaque(false);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

				label_1.setBackground(null);
				label_1.setForeground(new Color(255, 255, 255));
				label_1.setOpaque(true);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				label_1.setForeground(Color.WHITE);

				label_1.setBackground(null);
				label_1.setOpaque(false);
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
				label_2.setBackground(null);
				label_2.setOpaque(false);
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
		JSONArray js= init.getEleves("eleves_"+year.replaceAll("-", "")+"_"+id_ecol.replaceAll("-", ""), "1", create);
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


	
	private void remplir(JLabel n,JLabel l,JLabel ce,JLabel ee,JLabel dn,JLabel dc) {
		
		if(init.lire_le_fichier(fichier1).equals("")) {
			
		}else {
			
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
					n.setText(nom);
					
					//l.setText(lieu);
					//ce.setText("Contact: "+contact_ecole);
					//ee.setText("Email: "+email_ecole);
					//dn.setText("Dir "+dir_name);
					//dc.setText(dir_contact);
					
				} catch (JSONException e) { 
					e.printStackTrace();
				} 
			}
			
		}
	}
	
	
	
	


}
