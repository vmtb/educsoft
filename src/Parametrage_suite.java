import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.swing.JTextField;
import javax.swing.JFileChooser;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class Parametrage_suite {

	  JFrame frmEducsoftParamtrage;
	private JTextField textField;
	private Initialize init =new Initialize();

	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parametrage_suite window = new Parametrage_suite();
					window.frmEducsoftParamtrage.setVisible(true);
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
					Parametrage_suite window = new Parametrage_suite();
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
	public Parametrage_suite() {
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
		frmEducsoftParamtrage.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		frmEducsoftParamtrage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 3, true), "Disciplines", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBounds(10, 123, 985, 271);
		panel1.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setName("");
		textField.setBounds(678, 24, 297, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Disciplines:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmail.setBounds(32, 193, 123, 55);
		panel.add(lblEmail);
		
		JButton btnLogo = new JButton("AJOUTER");
		btnLogo.setBounds(407, 89, 162, 21);
		panel.add(btnLogo);
		
		JLabel lblAutrePrciser = new JLabel("Autre (\u00E0 pr\u00E9ciser):");
		lblAutrePrciser.setForeground(Color.WHITE);
		lblAutrePrciser.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAutrePrciser.setBounds(523, 23, 145, 32);
		panel.add(lblAutrePrciser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(48, 24, 226, 28);
		panel.add(comboBox);
		String list_[]=new String[] {"Allemand", "Anglais", "Conduite", "Communication Ecrite", "Communication Orale", "Economie", "Education Artistique (Dessin)", "EPS (Education Physique et Sportive)", "Espagnol", "Fran\u00E7ais", "Math\u00E9matiques", "Musique", "Histoire-G\u00E9ographie", "Informatique", "Lecture", "PCT (Physique Chimie Technologie)", "Philosophie", "SVT (Sciences de la vie et de la terre)"};
		comboBox.setModel(new DefaultComboBoxModel(list_));
		
		JLabel select = new JLabel("");
		select.setFont(new Font("Tahoma", Font.BOLD, 14));
		select.setForeground(Color.BLACK);
		select.setBounds(157, 186, 805, 75);
		panel.add(select);
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setOpaque(false);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 3, true), "Classes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_1.setBounds(10, 418, 985, 217);
		panel1.add(panel_1);
		
		JCheckBox chckbxme = new JCheckBox("6\u00E8me");
		chckbxme.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxme.setOpaque(false);
		chckbxme.setBounds(42, 33, 93, 21);
		panel_1.add(chckbxme);
		init.ecrire("classes_ec.txt", "");
		initialiseCheckBox(chckbxme);
		
		JCheckBox chckbxme_1 = new JCheckBox("5\u00E8me");
		chckbxme_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxme_1.setOpaque(false);
		chckbxme_1.setBounds(194, 33, 93, 21);
		panel_1.add(chckbxme_1);
		initialiseCheckBox(chckbxme_1);
		
		JCheckBox chckbxme_2 = new JCheckBox("4\u00E8me");
		chckbxme_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxme_2.setOpaque(false);
		chckbxme_2.setBounds(378, 33, 93, 21);
		panel_1.add(chckbxme_2);
		initialiseCheckBox(chckbxme_2);
		
		JCheckBox chckbxme_3 = new JCheckBox("3\u00E8me");
		chckbxme_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxme_3.setOpaque(false);
		chckbxme_3.setBounds(543, 33, 93, 21);
		panel_1.add(chckbxme_3);
		initialiseCheckBox(chckbxme_3);
		
		JCheckBox chckbxnde = new JCheckBox("2nde");
		chckbxnde.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxnde.setOpaque(false);
		chckbxnde.setBounds(710, 33, 93, 21);
		panel_1.add(chckbxnde);
		initialiseCheckBox(chckbxnde);
		
		JCheckBox chckbxre = new JCheckBox("1\u00E8re");
		chckbxre.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxre.setOpaque(false);
		chckbxre.setBounds(856, 33, 93, 21);
		panel_1.add(chckbxre);
		initialiseCheckBox(chckbxre);
		
		
		JCheckBox chckbxTle = new JCheckBox("Tle");
		chckbxTle.setOpaque(false);
		chckbxTle.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxTle.setBounds(438, 115, 68, 21);
		panel_1.add(chckbxTle);
		initialiseCheckBox(chckbxTle);
		
		JButton btnSuivant = new JButton("SAUVEGARDER");
		btnSuivant.setBounds(862, 660, 100, 21);
		panel1.add(btnSuivant);
		
		JLabel lblParametrageDeVos = new JLabel("PARAMETRAGE DE VOS DONNEES");
		lblParametrageDeVos.setForeground(Color.WHITE);
		lblParametrageDeVos.setFont(new Font("Berlin Sans FB", Font.BOLD, 30));
		lblParametrageDeVos.setBounds(220, 48, 952, 47);
		panel1.add(lblParametrageDeVos);
		
		JButton button = new JButton("< Pr\u00E9c\u00E9dant");
		button.setBounds(675, 660, 100, 21);
		panel1.add(button);
		
		init.ecrire("matieres_es.txt", "");
		
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { 
				{
					if(!init.lire_le_fichier("matieres_es.txt").contains(comboBox.getSelectedItem().toString())) {
						init.ecrire("matieres_es.txt", comboBox.getSelectedItem().toString()+"\n"+init.lire_le_fichier("matieres_es.txt"));
						select.setText(init.lire_le_fichier("matieres_es.txt").replaceAll("\n", " ; "));
						select.setToolTipText(select.getText().toString());
					}else {
						JOptionPane.showMessageDialog(null, comboBox.getSelectedItem().toString()+" existe déjà.. Elle sera supprimée");
						init.ecrire("matieres_es.txt", init.lire_le_fichier("matieres_es.txt").replace(comboBox.getSelectedItem().toString()+"\n", ""));
						select.setText(init.lire_le_fichier("matieres_es.txt").replaceAll("\n", " ; "));
						select.setToolTipText(select.getText().toString());
					}
				}
				 
			}
			
		});
		
		
		btnLogo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String new_mat=textField.getText().toString().replaceAll("'", "\"");
				if(new_mat.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Matière inconnue...");
				}else if(verif_existe(list_, new_mat.trim())){
					JOptionPane.showMessageDialog(null, "Cette matière existe déjà..!");
				}else{
					String newer[]= affaire(list_, new_mat.trim());
					comboBox.setModel(new DefaultComboBoxModel(newer));
					textField.setText("");
				} 
				
			}
			
		});
		
		btnSuivant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(init.lire_le_fichier("matieres_es.txt").equals("")) {
					JOptionPane.showMessageDialog(null, "Vous n'avez choisi aucune matière !");
				}else if(!contains_moins_de_cinq_matiere(init.lire_le_fichier("matieres_es.txt"))) {
					JOptionPane.showMessageDialog(null, "Vous devez choisir au moins 5 matières");
				}else if(init.lire_le_fichier("classes_ec.txt").equals("")) {
					JOptionPane.showMessageDialog(null, "Vous devez choisir au moins une classe");
				}else if(init.lire_le_fichier("info_gene_es.txt").equals("")||init.lire_le_fichier("lien_logo.txt").equals("")) {
					JOptionPane.showMessageDialog(null, "Vous devez achever votre inscription!");
				}else if(init.lire_le_fichier("id_psdo.txt").equals("")) {
					JOptionPane.showMessageDialog(null, "Allez vous inscrire !");
				}else {
					init("info_gene_es.txt");
					sauver_dans_table_ecoles() ;
				}
				
			}
			
		});
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				Parametrage inscription= new Parametrage();
				frmEducsoftParamtrage.dispose();
				inscription.frmEducsoftParamtrage.setVisible(true);
			}
			
		});
		
		
	}
	
	protected void sauver_dans_table_ecoles() {
		String sql1= "CREATE TABLE ecoles (nom VARCHAR(255),lieu VARCHAR(255),id_ecl VARCHAR (255),pseudo VARCHAR (255),"
				+ "contact_ecole VARCHAR (255),email_ecole VARCHAR (255),logo TEXT,"
				+ "dir_name VARCHAR (255),dir_contact VARCHAR (255),autre VARCHAR (255))";
	//	init.create_table(sql1);
		
		String sql2= "CREATE TABLE ecoles_info (id_ecl VARCHAR(255),promotions VARCHAR(255),matieres VARCHAR (255),autre VARCHAR (255))";
	//	init.create_table(sql2);

		String info_psdo= init.lire_le_fichier("id_psdo.txt");
		String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		info_psdo= init.lire_le_fichier("id_psdo.txt");
		String pseudo= info_psdo.substring(info_psdo.indexOf('\t')+1);
		
		String is=init.lire_le_fichier("lien_logo.txt");
		
		String sql3= "INSERT INTO `ecoles`(`nom`, `lieu`, `id_ecl`, `pseudo`, `contact_ecole`, `email_ecole`, `logo`, `dir_name`, `dir_contact`, `autre`)"
				+ " VALUES ('"+info_gene[0]+"','"+info_gene[1]+"','"+id_ecol+"','"+pseudo+"','"+info_gene[2]+"','"+info_gene[3]+"','"+is+"','"+info_gene[5]+" "+info_gene[4]+"','"+info_gene[6]+"','ras')";
		String sql4= "INSERT INTO `ecoles_info`(`id_ecl`, `promotions`, `matieres`, `autre`)"
				+ " VALUES ('"+id_ecol+"','"+init.lire_le_fichier("classes_ec.txt")+"','"+init.lire_le_fichier("matieres_es.txt")+"','ras')";
	
		if(init.inserer_(sql3, "ecoles", sql1, "contact_ecole", "Logo sauvegardé avec succès !", "Echec du téléchargement du logo")==0) {
			if(init.inserer_(sql4, "ecoles_info", sql2, "promotions", "Données sauvegardées avec succès !", "Echec de la connection, veuillez réessayer...!")==0) {

				WelcomePage inscription= new WelcomePage();
				inscription.frmEducsoftWelcome.setVisible(true);
				frmEducsoftParamtrage.setVisible(false);
				init.ecrire("connecte.txt", "connecte"); 
			}
		}
		
	}

	private String []info_gene= new String[7];
	
	public void init(String fichier) {
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
	
	protected boolean verif_existe(String[] list_, String adding) {
		boolean not_exist=false;
		for(int i=0; i<list_.length; i++) {
			if(list_[i].equals(adding)) {
				not_exist=true;
				break;
			}
		}
		return not_exist;
	}
	

	protected void initialiseCheckBox(JCheckBox j) {
		j.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cont= ((JCheckBox)e.getSource()).getText().toString();
				boolean active=  ((JCheckBox)e.getSource()).isSelected();
				if(active) {
					init.ecrire("classes_ec.txt", cont+"\n"+init.lire_le_fichier("classes_ec.txt"));
				}else {	
					init.ecrire("classes_ec.txt", init.lire_le_fichier("classes_ec.txt").replaceAll(cont+"\n", ""));
				}
				//JOptionPane.showMessageDialog(null, init.lire_le_fichier("classes_ec.txt"));
				
			}
			
		});
	}
	
	
	protected String[] affaire(String[]old, String adding) {
		String nouv[]=new String[old.length+1];
		nouv[0]= adding;
		for(int i=0; i<old.length; i++) {
			nouv[i+1]=old[i];
		}
		
		return nouv;
	}

	
	protected boolean contains_moins_de_cinq_matiere(String mat) {
		 
		int compt=0;
		for(int i=0; i<mat.length(); i++) {
			if(mat.charAt(i)=='\n')
				compt++;
		}

		return compt>=5;
	}

}
