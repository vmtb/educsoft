import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
 

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

public class Modifier_matiere {

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
					Modifier_matiere window = new Modifier_matiere();
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
					Modifier_matiere window = new Modifier_matiere();
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
	public Modifier_matiere() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEducsoftParamtrage = new JFrame();
		frmEducsoftParamtrage.setResizable(false);
		frmEducsoftParamtrage.setTitle("Educsoft - Modification");
		frmEducsoftParamtrage.setBounds(100, 100, 1016, 732);
		frmEducsoftParamtrage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JLabel label_1 = new JLabel(new ImageIcon(this.getClass().getResource("/ES FN.png")));
		frmEducsoftParamtrage.setContentPane(label_1);

		frmEducsoftParamtrage.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		frmEducsoftParamtrage.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setOpaque(false);
		panel1.setBounds(0, 0, 1016, 732); 
		panel1.setLayout(null); 
		frmEducsoftParamtrage.getContentPane().add(panel1);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 3, true), "Disciplines", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBounds(10, 123, 985, 384);
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
		lblEmail.setBounds(31, 216, 123, 55);
		panel.add(lblEmail);
		
		JButton btnLogo = new JButton("AJOUTER");
		btnLogo.setBounds(403, 119, 162, 21);
		panel.add(btnLogo);
		
		JLabel lblAutrePrciser = new JLabel("Autre (\u00E0 pr\u00E9ciser):");
		lblAutrePrciser.setForeground(Color.WHITE);
		lblAutrePrciser.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAutrePrciser.setBounds(523, 23, 145, 32);
		panel.add(lblAutrePrciser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(48, 24, 226, 28);
		panel.add(comboBox);
		String list_[]=new String[] {"Allemand", "Anglais", "Conduite",  "Communication Ecrite", "Communication Orale", "Economie", "Education Artistique (Dessin)", "EPS (Education Physique et Sportive)", "Espagnol", "Fran\u00E7ais", "Math\u00E9matiques", "Musique", "Histoire-G\u00E9ographie", "Informatique", "Lecture", "PCT (Physique Chimie Technologie)", "Philosophie", "SVT (Sciences de la vie et de la terre)"};
		comboBox.setModel(new DefaultComboBoxModel(list_));
		
		JLabel select = new JLabel("");
		select.setFont(new Font("Tahoma", Font.BOLD, 14));
		select.setForeground(Color.BLACK);
		select.setBounds(157, 186, 805, 75);
		panel.add(select);
		init.ecrire("classes_ec.txt", "");
		
		JButton btnSuivant = new JButton("SAUVEGARDER");
		btnSuivant.setBounds(748, 536, 100, 21);
		panel1.add(btnSuivant);
		
		JLabel lblParametrageDeVos = new JLabel("MODIFICATION DES MATIERES");
		lblParametrageDeVos.setForeground(Color.WHITE);
		lblParametrageDeVos.setFont(new Font("Berlin Sans FB", Font.BOLD, 30));
		lblParametrageDeVos.setBounds(220, 48, 952, 47);
		panel1.add(lblParametrageDeVos);
		
		JButton btnFermer = new JButton("FERMER");
		btnFermer.setBounds(171, 536, 100, 21);
		panel1.add(btnFermer);
		
		init.ecrire("matieres_es.txt", "");
		set_le_contenu(select);
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
				}else {
					init("info_gene_es.txt");
					sauver_dans_table_ecoles() ;
				}
				
			}
			
		});
		
		btnFermer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frmEducsoftParamtrage.dispose();
				
			}
			
		});
		
		
	}
	
	protected void sauver_dans_table_ecoles() {
	 
		String create= "CREATE TABLE IF NOT EXISTS ecoles_info (id_ecl VARCHAR(255),promotions VARCHAR(255),matieres VARCHAR (255),autre VARCHAR (255))";

		String info_psdo= init.lire_le_fichier("id_psdo.txt");
		String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		info_psdo= init.lire_le_fichier("id_psdo.txt");
		String pseudo= info_psdo.substring(info_psdo.indexOf('\t')+1);
		
		
		String query= "UPDATE ecoles_info SET matieres='"+init.lire_le_fichier("matieres_es.txt")+"' WHERE id_ecl='"+id_ecol+"'";
	
		if(init.update_(query, "ecoles_info", "", "")==0) {
			init.Alerter("Mise à jour effectuée avec succès !") ;
			frmEducsoftParamtrage.dispose();
		}else {
			init.Alerter( "Echec de la mise à jour, veuillez réessayer...!");
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

	private void set_le_contenu( JLabel select) {
		//select.setText(init.lire_le_fichier("matieres_es.txt")
		String create= "CREATE TABLE IF NOT EXISTS ecoles_info (id_ecl VARCHAR(255),promotions VARCHAR(255),matieres VARCHAR (255),autre VARCHAR (255))";

		String info_psdo= init.lire_le_fichier("id_psdo.txt");
		String id_ecole= info_psdo.substring(0, info_psdo.indexOf('\t'));
	 
		
		JSONArray js= init.getEcolesInfos("ecoles_info", "id_ecl='"+id_ecole+"'", create);
		if(js!=null) {
			if(js.length()==0)
				return;
			for(int i=0; i<js.length(); i++) {
				if(i!=js.length()-1)
					continue;
				JSONObject rs;
				try {
					rs = js.getJSONObject(i);
					String mat= rs.getString("matieres");
					init.ecrire("matieres_es.txt", mat);
					select.setText(init.lire_le_fichier("matieres_es.txt").replaceAll("\n", " ; "));
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}
	}
	
	
}
