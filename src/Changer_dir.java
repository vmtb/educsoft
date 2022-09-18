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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.swing.JTextField;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;

public class Changer_dir {

	 JFrame frmEducsoftParamtrage;
	private JTextField dir_nme;
	private JTextField dir_pme;
	private JTextField cont_dir;
	private String []info_gene= new String[7];
	private String fichier= "info_gene_es.txt";
	private Initialize init= new Initialize(); 

	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Changer_dir window = new Changer_dir();
					window.frmEducsoftParamtrage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void main(String []args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Changer_dir window = new Changer_dir();
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
	public Changer_dir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEducsoftParamtrage = new JFrame();
		frmEducsoftParamtrage.setResizable(false);
		frmEducsoftParamtrage.setTitle("Educsoft - Nouveau Directeur");
		frmEducsoftParamtrage.setBounds(100, 100, 1016, 732);
		frmEducsoftParamtrage.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		frmEducsoftParamtrage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JLabel label_1 = new JLabel(new ImageIcon(this.getClass().getResource("/ES FN.png")));
		frmEducsoftParamtrage.setContentPane(label_1);
		frmEducsoftParamtrage.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setOpaque(false);
		panel1.setBounds(0, 0, 1016, 732);
		panel1.setLayout(null); 
		frmEducsoftParamtrage.getContentPane().add(panel1);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setOpaque(false);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 3, true), "Administration", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_1.setBounds(10, 202, 985, 217);
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
		
		JButton btnSuivant = new JButton("Sauvegarder");
		btnSuivant.setBounds(806, 460, 100, 21);
		panel1.add(btnSuivant);
		
		JLabel lblParametrageDeVos = new JLabel("Nouveau Directeur");
		lblParametrageDeVos.setHorizontalAlignment(SwingConstants.CENTER);
		lblParametrageDeVos.setForeground(Color.WHITE);
		lblParametrageDeVos.setFont(new Font("Berlin Sans FB", Font.BOLD, 30));
		lblParametrageDeVos.setBounds(25, 58, 952, 47);
		panel1.add(lblParametrageDeVos);
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomePage wp = new WelcomePage();
				wp.frmEducsoftWelcome.setVisible(true);
				frmEducsoftParamtrage.dispose();
			}
		});
		btnFermer.setBounds(117, 460, 100, 21);
		panel1.add(btnFermer);
		
		btnSuivant.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) { 
				
				String dir_name= dir_nme.getText().toString().trim().replaceAll("'", "\"");
				String dir_pname= dir_pme.getText().toString().trim().replaceAll("'", "\"");
				String contact_dir= cont_dir.getText().toString().trim().replaceAll("'", "\"");
				
				if(dir_name.isEmpty()||dir_pname.isEmpty()||contact_dir.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Veuillez bien remplir tous les champs !");
				} else { 

					sauver_dans_table_ecoles(contact_dir, dir_pname+" "+dir_name);
					
				}
			}
			
		});
		
	}
	
	
	protected void sauver_dans_table_ecoles(String contact, String name) {
	 	 
		String info_psdo= init.lire_le_fichier("id_psdo.txt");
		String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		info_psdo= init.lire_le_fichier("id_psdo.txt");
		String pseudo= info_psdo.substring(info_psdo.indexOf('\t')+1);
		
		
		String query= "UPDATE ecoles SET dir_name='"+name+"', dir_contact='"+contact+"' WHERE id_ecl='"+id_ecol+"'";
		 
		if(init.update_(query, "ecoles", "", "promotions")==0) {

			init.Alerter("Mise à jour effectuée avec succès !") ;

			WelcomePage inscription= new WelcomePage(); 
			inscription.frmEducsoftWelcome.setVisible(true);
			frmEducsoftParamtrage.dispose();
			  
		}else {

			init.Alerter( "Echec de la mise à jour, veuillez réessayer...!");
		}
		
	}



}
