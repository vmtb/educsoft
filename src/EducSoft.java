import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class EducSoft {

	private JDialog frame;
	private Initialize init = new Initialize();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EducSoft window = new EducSoft();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EducSoft() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JDialog();
		frame.setResizable(false);
		frame.setBounds(400, 75, 785, 528);
		frame.getContentPane().setLayout(null);

		frame.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));

		Image im= new ImageIcon(this.getClass().getResource("/logo VIbecro 2.png")).getImage();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(259, 353, 270, 126);
		frame.getContentPane().add(lblNewLabel);

		Image im2= new ImageIcon(this.getClass().getResource("/LOGO ES 1.png")).getImage();
		Image img2=im2.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(img2));
		
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(0, 0, 787, 528);
		frame.getContentPane().add(label_4);
		
		Image img=im.getScaledInstance(label_4.getWidth(), label_4.getHeight(), Image.SCALE_SMOOTH);
		label_4.setIcon(new ImageIcon(img));
		
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
	
		 
		if(init.lire_le_fichier("connecte.txt").equals("connecte")) {
			if(info_psdo.equals("")) {
				Login inscription= new Login();
				frame.setVisible(false);
				inscription.frmEducsoft .setVisible(true);			
			}else {
				String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
				
				String sql2= "CREATE TABLE ecoles_info (id_ecl VARCHAR(255),promotions VARCHAR(255),matieres VARCHAR (255),autre VARCHAR (255))";
				//String sql3= "SELECT * FROM ecoles_info WHERE id_ecole= '"+id_ecol+"'";
				String cr= "CREATE TABLE utilisateurs (email VARCHAR(255),password VARCHAR(40),pseudo VARCHAR(255),id_ecole VARCHAR (255))";
				
				JSONArray jso= init.getUsersInfos("utilisateurs", "id_ecole= '"+id_ecol+"'", cr);
				 
				if(jso!=null) {
					if(!jso.toString().equals("[]")) {
						JSONArray js= init.getEcolesInfos("ecoles_info", "id_ecl= '"+id_ecol+"'", sql2);
									
								if(js!=null) {
									if(js.toString().equals("[]")&&init.lire_le_fichier(Constantes.ecole_name).equals("")) {
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
					
															frame.setVisible(false);
															
														}else {
					
															Menu_classes inscription= new Menu_classes();
															inscription.frmEducsoftWelcome.setVisible(true);
					
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
					}else {

						Login inscription= new Login();
						inscription.frmEducsoft.setVisible(true);
						frame.setVisible(false);
					}
				}else {

					Login inscription= new Login();
					inscription.frmEducsoft.setVisible(true);
					frame.setVisible(false);
				}
				
			}
			
		} else {
				Login inscription= new Login();
				inscription.frmEducsoft.setVisible(true);
				frame.setVisible(false);
			
		}
		
		
	}

}
