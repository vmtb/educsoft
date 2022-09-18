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

import org.json.JSONArray;

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

public class Licences {

 JFrame frmEducsoftParamtrage;
	private JTextField dir_nme;
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
					Licences window = new Licences();
					window.frmEducsoftParamtrage.setVisible(true);
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
					Licences window = new Licences();
					window.frmEducsoftParamtrage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	public Licences() {
		initialize();
	}
 
	private void initialize() {
		frmEducsoftParamtrage = new JFrame();
		frmEducsoftParamtrage.setResizable(false);
		frmEducsoftParamtrage.setTitle("Educsoft - Réactivation");
		frmEducsoftParamtrage.setBounds(400, 200, 851, 579);
		frmEducsoftParamtrage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JLabel label_1 = new JLabel(new ImageIcon(this.getClass().getResource("/ES FN.png")));
		frmEducsoftParamtrage.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
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
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 3, true), "Info Licence", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_1.setBounds(10, 167, 812, 217);
		panel1.add(panel_1);
		
		JLabel lblNomDuDirecteur = new JLabel("Votre code d'activation:");
		lblNomDuDirecteur.setForeground(Color.WHITE);
		lblNomDuDirecteur.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomDuDirecteur.setBounds(23, 101, 244, 21);
		panel_1.add(lblNomDuDirecteur);
		
		dir_nme = new JTextField();
		dir_nme.setText("VXB-XXXX-XXXX-XXXX-XX-XXXX-XXXX-XXXX-BX");
		dir_nme.setColumns(10);
		dir_nme.setBounds(304, 98, 475, 35);
		panel_1.add(dir_nme);
		
		JButton btnSuivant = new JButton("Sauvegarder");
		btnSuivant.setBounds(669, 428, 100, 21);
		panel1.add(btnSuivant);
		
		JLabel lblParametrageDeVos = new JLabel("REACTIVATION DE EDUCSOFT");
		lblParametrageDeVos.setHorizontalAlignment(SwingConstants.CENTER);
		lblParametrageDeVos.setForeground(Color.WHITE);
		lblParametrageDeVos.setFont(new Font("Berlin Sans FB", Font.BOLD, 30));
		lblParametrageDeVos.setBounds(25, 58, 797, 47);
		panel1.add(lblParametrageDeVos);
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				frmEducsoftParamtrage.dispose();
			}
		});
		btnFermer.setBounds(68, 428, 100, 21);
		panel1.add(btnFermer);
		
		btnSuivant.addActionListener(new ActionListener(){

			@Override 
			public void actionPerformed(ActionEvent arg0) { 
				
				String licences= dir_nme.getText().toString().trim().replaceAll("'", "\""); 
				
				if(licences.isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Veuillez bien remplir tous les champs !");
				}else if(licences.trim().length()!=39) {
					JOptionPane.showMessageDialog(null, "Clé de licence incorrecte !");
				}else if(verif_licences(init, licences)==0){
					System.out.println("Clé licence: "+verif_licences(init, licences));
				}else {  
					 
					String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
					String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
					long fut=System.currentTimeMillis()+31536000000L;
					String query="UPDATE `licences` SET `debut`='"+String.valueOf(fut)+"', `autre`='"+id_ecol+"' WHERE lic='"+licences+"'";
					 
					
					if(init.update_(query, "licences", "", "")==0) {
						init.Alerter("Vous venez de valider votre licence pour les 365 prochains jours !");
						WelcomePage wp = new WelcomePage();
						wp.frmEducsoftWelcome.setVisible(true);
						frmEducsoftParamtrage.setVisible(false);
					}else {
						init.Alerter("Une erreur s'est produite! Veuillez réessayer ultérieurement !");
					}
					
				}
			}
			
		});
	
		
	}
	 
	
	protected int  verif_licences(Initialize init, String licences) {
		int fait=0;

		JSONArray infos = init.getLicence("lic='"+licences+"' and debut='ras'");
		if(infos==null) {
			JOptionPane.showMessageDialog(null,"Echec de la connection..\nImpossible d'utiliser cette licence ! Elle est soit incorrecte, soit déjà utilisée ! Veuillez réessayer...");
		}else {
			if(infos.toString().equals("[]"))
				JOptionPane.showMessageDialog(null,"Impossible d'utiliser cette licence ! Elle est soit incorrecte, soit déjà utilisée ! Veuillez réessayer...");
			else
				fait=1;
				
		}
		 
		return fait;
	}
	
	 
}
