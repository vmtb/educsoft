import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JTextField;
import javax.swing.JFileChooser;

public class Parametrage {

	 JFrame frmEducsoftParamtrage;
	private JTextField ecole;
	private JTextField geo;
	private JTextField contact;
	private JTextField email;
	private JTextField dir_nme;
	private JTextField dir_pme;
	private JTextField cont_dir;
	private String []info_gene= new String[7];
	private String fichier= "info_gene_es.txt";

	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parametrage window = new Parametrage();
					window.frmEducsoftParamtrage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void main(String args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parametrage window = new Parametrage();
					window.frmEducsoftParamtrage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Parametrage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEducsoftParamtrage = new JFrame();
		frmEducsoftParamtrage.setResizable(false);
		frmEducsoftParamtrage.setTitle("Educsoft - Param\u00E9trage");
		frmEducsoftParamtrage.setBounds(100, 100, 1016, 732);
		frmEducsoftParamtrage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEducsoftParamtrage.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		JLabel label_1 = new JLabel(new ImageIcon(this.getClass().getResource("/ES 3.png")));
		frmEducsoftParamtrage.setContentPane(label_1);
		frmEducsoftParamtrage.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setOpaque(false);
		panel1.setBounds(0, 0, 1016, 732);
		panel1.setLayout(null); 
		frmEducsoftParamtrage.getContentPane().add(panel1);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 3, true), "Etablissement", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel.setBounds(10, 126, 985, 271);
		panel1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNomDeLcole = new JLabel("Nom de l'\u00E9cole:");
		lblNomDeLcole.setForeground(Color.WHITE);
		lblNomDeLcole.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomDeLcole.setBounds(32, 32, 204, 21);
		panel.add(lblNomDeLcole);
		
		ecole = new JTextField();
		ecole.setBounds(292, 20, 440, 35);
		panel.add(ecole);
		ecole.setColumns(10);
		
		JLabel lblZoneGographique = new JLabel("Zone g\u00E9ographique:");
		lblZoneGographique.setForeground(Color.WHITE);
		lblZoneGographique.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblZoneGographique.setBounds(32, 82, 204, 21);
		panel.add(lblZoneGographique);
		
		geo = new JTextField();
		geo.setColumns(10);
		geo.setBounds(292, 79, 440, 35);
		panel.add(geo);
		
		JLabel lblContact = new JLabel("Contact:");
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblContact.setBounds(32, 140, 204, 21);
		panel.add(lblContact);
		
		contact = new JTextField();
		contact.setColumns(10);
		contact.setBounds(292, 140, 440, 35);
		panel.add(contact);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmail.setBounds(32, 193, 204, 21);
		panel.add(lblEmail);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(292, 198, 440, 35);
		panel.add(email);
		
		JLabel lblLogo = new JLabel("C://Users/...");
		lblLogo.setForeground(Color.WHITE);
		lblLogo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogo.setBounds(771, 106, 204, 21);
		panel.add(lblLogo);
		
		JButton btnLogo = new JButton("Logo");
		btnLogo.setBounds(793, 59, 85, 21);
		panel.add(btnLogo);
		
		JLabel lblS = new JLabel("");
		lblS.setBounds(752, 140, 223, 121);
		panel.add(lblS);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setOpaque(false);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 3, true), "Administration", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_1.setBounds(10, 418, 985, 217);
		panel1.add(panel_1);
		
		JLabel lblNomDuDirecteur = new JLabel("Nom du Directeur:");
		lblNomDuDirecteur.setForeground(Color.WHITE);
		lblNomDuDirecteur.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomDuDirecteur.setBounds(21, 32, 204, 21);
		panel_1.add(lblNomDuDirecteur);
		
		dir_nme = new JTextField();
		dir_nme.setColumns(10);
		dir_nme.setBounds(296, 18, 440, 35);
		panel_1.add(dir_nme);
		
		JLabel lblContact_1 = new JLabel("Contact:");
		lblContact_1.setForeground(Color.WHITE);
		lblContact_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblContact_1.setBounds(21, 159, 204, 21);
		panel_1.add(lblContact_1);
		
		JLabel lblPrnomDuDirecteur = new JLabel("Pr\u00E9nom du Directeur:");
		lblPrnomDuDirecteur.setForeground(Color.WHITE);
		lblPrnomDuDirecteur.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrnomDuDirecteur.setBounds(21, 93, 204, 21);
		panel_1.add(lblPrnomDuDirecteur);
		
		dir_pme = new JTextField();
		dir_pme.setColumns(10);
		dir_pme.setBounds(296, 79, 440, 35);
		panel_1.add(dir_pme);
		
		cont_dir = new JTextField();
		cont_dir.setColumns(10);
		cont_dir.setBounds(296, 142, 440, 35);
		panel_1.add(cont_dir);
		
		JButton btnSuivant = new JButton("Suivant >");
		btnSuivant.setBounds(862, 660, 100, 21);
		panel1.add(btnSuivant);
		
		JLabel lblParametrageDeVos = new JLabel("PARAMETRAGE DE VOS DONNEES");
		lblParametrageDeVos.setForeground(Color.WHITE);
		lblParametrageDeVos.setFont(new Font("Berlin Sans FB", Font.BOLD, 30));
		lblParametrageDeVos.setBounds(220, 48, 952, 47);
		panel1.add(lblParametrageDeVos);
		Initialize init= new Initialize();
		if(init.lire_le_fichier(fichier)!="") {
			init();
			ecole.setText(info_gene[0]);
			geo.setText(info_gene[1]);
			contact.setText(info_gene[2]);
			email.setText(info_gene[3]);
			dir_nme.setText(info_gene[4]);
			dir_pme.setText(info_gene[5]);
			cont_dir.setText(info_gene[6]);
		}
		
		btnSuivant.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String ec_nme= ecole.getText().toString().trim().replaceAll("'", "\"");
				String  lieu= geo.getText().toString().trim().replaceAll("'", "\"");	
				String contact_ecol= contact.getText().toString().trim().replaceAll("'", "\"");
				String email_ecol= email.getText().toString().trim().replaceAll("'", "\"");
				
				String dir_name= dir_nme.getText().toString().trim().replaceAll("'", "\"");
				String dir_pname= dir_pme.getText().toString().trim().replaceAll("'", "\"");
				String contact_dir= cont_dir.getText().toString().trim().replaceAll("'", "\"");
				
				if(ec_nme.isEmpty()||lieu.isEmpty()||contact_ecol.isEmpty()||email_ecol.isEmpty()||dir_name.isEmpty()||dir_pname.isEmpty()||contact_dir.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Veuillez bien remplir tous les champs !");
				}else if(lblLogo.getText().toString().equals("C://Users/...")){
					JOptionPane.showMessageDialog(null, "Veuillez choisir le logo de votre école!");
				}else {
					init.ecrire(fichier, ec_nme+"\t"+lieu+"\t"+contact_ecol+"\t"+email_ecol+"\t"+dir_name+"\t"+dir_pname+"\t"+contact_dir);
					init.ecrire("lien_logo.txt", lblLogo.getText().toString());
					

					Parametrage_suite inscription= new Parametrage_suite();
					frmEducsoftParamtrage.dispose();
					inscription.frmEducsoftParamtrage.setVisible(true);

				
					
				}
			}
			
		});	
		btnLogo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				JFileChooser filechooser=new JFileChooser();
				filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				filechooser.addChoosableFileFilter(new FileNameExtensionFilter("*.IMAGE", "*.jpg", "*.png"));
				int result= filechooser.showSaveDialog(null);
				if(result== JFileChooser.APPROVE_OPTION) {
					File selectedFile= filechooser.getSelectedFile();
					String path= selectedFile.getAbsolutePath();
					lblLogo.setText(path);
					ImageIcon ic=new ImageIcon(path);
					Image img= (ic.getImage()).getScaledInstance(lblS.getWidth(), lblS.getHeight(), Image.SCALE_SMOOTH);
					lblS.setIcon(new ImageIcon(img));
				}else if (result==JFileChooser.CANCEL_OPTION) {
					System.out.println("Annulé !");
				}
				
			} 
			
		});
		
	}
	
	public void init() {
		Initialize init= new Initialize();
		int anc_pos=0, compt=0;
		for(int i=0; i<init.lire_le_fichier(fichier).length(); i++) {
			if(init.lire_le_fichier(fichier).charAt(i)=='\t') {
				info_gene[compt]= init.lire_le_fichier(fichier).substring(anc_pos, i);
				anc_pos=i+1;
				compt++;
			}else if(i==init.lire_le_fichier(fichier).length()-1) {
				info_gene[compt]= init.lire_le_fichier(fichier).substring(anc_pos, i+1);
				anc_pos=i+1;
				compt++;
			}
		}
	}
}
