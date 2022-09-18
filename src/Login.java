import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JDialog;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javafx.scene.image.ImageView;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import java.awt.Color;
import com.jgoodies.forms.layout.FormSpecs;
import com.mysql.jdbc.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.border.TitledBorder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

public class Login {

	 JDialog frmEducsoft;
	private JPasswordField passwordField;
	static Login window;
	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Login();
					window.frmEducsoft.setVisible(true);
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
					window = new Login();
					window.frmEducsoft.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEducsoft = new JDialog();
		frmEducsoft.setUndecorated(false);
		frmEducsoft.setMaximumSize(new Dimension(2147483647, 1147483647));
		frmEducsoft.setModal(true);
		frmEducsoft.setFont(new Font("Dialog", Font.BOLD, 14));
		frmEducsoft.setBackground(Color.LIGHT_GRAY);
		frmEducsoft.setResizable(false);
		frmEducsoft.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		frmEducsoft.setContentPane(new JLabel(new ImageIcon(this.getClass().getResource("/ES FN.png"))));
		frmEducsoft.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmEducsoft.getContentPane().setLayout(null);
		
		
		JPanel panel1 = new JPanel();
		panel1.setOpaque(false);
		panel1.setBounds(0, 0, 272, 676);
		panel1.setLayout(null); 
		frmEducsoft.getContentPane().add(panel1);
		frmEducsoft.getContentPane().setBounds(400, 75,  732, 637);
		
		JLabel lblVibecroInc = new JLabel("");
		lblVibecroInc.setVerticalAlignment(SwingConstants.TOP);
		lblVibecroInc.setBounds(0, 227, 272, 676);
		lblVibecroInc.setBackground(Color.LIGHT_GRAY);
		lblVibecroInc.setIcon(new ImageIcon(this.getClass().getResource("LOGO ES 1~1.png")));
		panel1.add(lblVibecroInc);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(272, 0, 732, 637);
		frmEducsoft.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenue sur votre système de gestion scolaire !");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.BOLD, 25));
		lblNewLabel.setBounds(72, 62, 593, 86);
		panel.add(lblNewLabel);
		
		JPanel panel2= new JPanel();
		panel2.setForeground(new Color(255, 255, 255));
		panel2.setOpaque(false);
		panel2.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 4, true), "Connexion", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel2.setBounds(55,169,588, 355);
		panel.add(panel2);
		panel2.setLayout(null);
		
		
		JLabel user_name= new JLabel("Pseudo:");
		user_name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		user_name.setBounds(10, 55, 361, 86);
		panel2.add(user_name);
		
		JLabel password= new JLabel("Mot de Passe:");
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password.setBounds(10, 125, 136, 86);
		panel2.add(password);
		
		JTextField textPane = new JTextField();
		textPane.setBounds(145, 80, 361, 35);
		panel2.add(textPane);
		
		JPasswordField textPane_1 = new JPasswordField();
		textPane_1.setBounds(145, 151, 361, 35);
		panel2.add(textPane_1);
		
		JButton btnSeConnecter = new JButton("SE CONNECTER");
		btnSeConnecter.setBounds(253, 233, 142, 35);
		panel2.add(btnSeConnecter);
		
		btnSeConnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String psdo= textPane.getText().toString();
				String mp= textPane_1.getText().toString();
				if(psdo.equals("")||psdo.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Pseudo vide");
				}else if(mp.equals("")||mp.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Veuillez saisir votre mot de passe");
				}else {

					Initialize init= new Initialize();
					String sql2= "CREATE TABLE utilisateurs (email VARCHAR(255),password VARCHAR(40),pseudo VARCHAR(255),id_ecole VARCHAR (255))";
					
					JSONArray json= init.getUsersInfos("utilisateurs", "pseudo='"+psdo+"' and password='"+mp+"'", sql2);
					
					if(json==null) {
						JOptionPane.showMessageDialog(null, "Echec de la connection... Veuillez revoir vos données !");
					}else {
						if(json.toString().equals("[]")) {
							init.Alerter("Echec de l'identification ! Veuillez revoir vos données !");
							return;
						}
						
						JOptionPane.showMessageDialog(null, "Connection réussie !");
						for(int i=0;i<json.length(); i++) {
							if(i!=json.length()-1)
								continue;

							String id_ecol; 
							try {
								id_ecol = json.getJSONObject(i).getString("id_ecole");
								
								init.ecrire("id_ecl_eds.txt", psdo);
								init.ecrire("id_psdo.txt", id_ecol+"\t"+psdo);
								suite(id_ecol, frmEducsoft);
								frmEducsoft.dispatchEvent(new WindowEvent(frmEducsoft, WindowEvent.WINDOW_CLOSED));
								frmEducsoft.dispose();
							} catch (JSONException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} 
					}
				 
				}
				
				
			}
		});
		
		JButton btnSinscrire = new JButton(" S'inscrire");
		btnSinscrire.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, null));
		btnSinscrire.setBounds(31, 308, 85, 21);
		panel2.add(btnSinscrire);
		
		btnSinscrire.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Inscription inscription= new Inscription();
				inscription.frame.setVisible(true);
				frmEducsoft.dispose();
			}
			
		});
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.setBounds(477, 308, 85, 21);
		panel2.add(btnFermer);
		
		btnFermer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				

				frmEducsoft.dispose();
				
				
			}
			
		});
		
		JLabel lblCopyrightVibecro = new JLabel("Copyright 2019, VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblCopyrightVibecro.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblCopyrightVibecro.setForeground(Color.WHITE);
		lblCopyrightVibecro.setBounds(455, 614, 542, 13);
		panel.add(lblCopyrightVibecro);
		 
		
		
		
		
		
		
		//frmEducsoft.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\UTILISATEUR\\Desktop\\VIBECRO CORP\\LOGO ES 1.png"));
		frmEducsoft.setTitle("EducSoft ");
		frmEducsoft.setBounds(100, 100, 1003, 676);
	}
	
	public void suite(String id_ecol, JDialog frame) {

		Initialize init=new Initialize();
		String sql2= "CREATE TABLE ecoles_info (id_ecl VARCHAR(255),promotions VARCHAR(255),matieres VARCHAR (255),autre VARCHAR (255))";
		JSONArray js= init.getEcolesInfos("ecoles_info", "id_ecl= '"+id_ecol+"'", sql2);
		String sql3= "SELECT * FROM ecoles_info WHERE id_ecl= '"+id_ecol+"'";
		
		if(js!=null) {
			if(js.toString().equals("[]")) {

				Parametrage inscription= new Parametrage();
				inscription.frmEducsoftParamtrage.setVisible(true);
				frame.setVisible(false);
				return;
			}
			JSONArray infos = init.getLicence("autre= '"+id_ecol+"'");
			System.out.println("INFOS: "+infos.toString());
			if(infos==null) {

				init.Alerter_warn("Vous devez activer votre EducSoft !", "Attention");

				Licences inscription= new Licences();
				inscription.frmEducsoftParamtrage.setVisible(true);
				frame.setVisible(false);
				
			} else {
					for(int i=0;i<infos.length(); i++) {
						if(i!=infos.length()-1)
							continue;
						JSONObject ob;
						try {
							ob = infos.getJSONObject(i);
							String debut= ob.getString("debut");
							if(!debut.equals("ras")) {
								long fut= Long.parseLong(debut);
								long now= System.currentTimeMillis();
								if(now>=fut) {

									Licences inscription= new Licences();
									inscription.frmEducsoftParamtrage.setVisible(true);
									frame.setVisible(false);
									init.Alerter_warn("Votre licence est expirée.. Vous devez activer votre EducSoft !", "Attention");
								}else {
									long ecart= fut-now;
									if(init.lire_le_fichier(Constantes.fichier_ann).equals("")) {
											
										WelcomePage inscription= new WelcomePage();
										inscription.frmEducsoftWelcome.setVisible(true);

										init.ecrire("connecte.txt", "connecte");
										frame.setVisible(false);
										
									}else {

										Menu_classes inscription= new Menu_classes();
										inscription.frmEducsoftWelcome.setVisible(true);

										init.ecrire("connecte.txt", "connecte");
										frame.setVisible(false);
									}
									if(ecart<=5184000000L) {
										int jour = (int) ((int) ecart/86400000L);
										if(jour==1||jour==0) {
											int heure= (int) (ecart/(1000*3600));
											if(heure==1) {
												init.Alerter_warn("Avertissement... Votre licence s'expire dans "+heure+" heure ! ", "Info Licence!");
											}else if(heure<1) {
												int minutes= (int) (ecart/(1000*60));
												init.Alerter_warn("Avertissement... Votre licence s'expire dans "+minutes+" minute(s) ! ", "Info Licence!");
											}else {
												init.Alerter_warn("Avertissement... Votre licence s'expire dans "+heure+" heures ! ", "Info Licence!");
											}
										}else
											init.Alerter_warn("Avertissement... Votre licence s'expire dans "+jour+" jours ! ", "Info Licence!");
									}

								}
							}else {
								init.Help();
								frame.setVisible(false);
							}

						} catch (JSONException e) {
							e.printStackTrace();
						}
					}
			}
		}else {
			Parametrage inscription= new Parametrage();
			inscription.frmEducsoftParamtrage.setVisible(true);
			frame.setVisible(false);
		}
	}
}
