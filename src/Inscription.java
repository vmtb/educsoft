import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.json.JSONArray;

import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class Inscription {

 JDialog frame;
	private JPasswordField conf_mp;

	/**
	 * Launch the application.
	 */
	public static void demarre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inscription window = new Inscription();
					window.frame.setVisible(true);
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
					Inscription window = new Inscription();
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
	public Inscription() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void initialize() {
		frame = new JDialog();
		frame.setUndecorated(false);
		frame.setMaximumSize(new Dimension(2147483647, 1147483647));
		frame.setModal(true);
		frame.setFont(new Font("Dialog", Font.BOLD, 14));
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setResizable(false);
		frame.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		
		frame.setContentPane(new JLabel(new ImageIcon(this.getClass().getResource("/ES FN.png"))));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		

		JPanel panel1 = new JPanel();
		panel1.setOpaque(false);
		panel1.setBounds(0, 0, 272, 676);
		panel1.setLayout(null); 
		frame.getContentPane().add(panel1);
		
		JLabel lblVibecroInc = new JLabel("");
		lblVibecroInc.setVerticalAlignment(SwingConstants.TOP);
		lblVibecroInc.setBounds(0, 227, 272, 676);
		lblVibecroInc.setBackground(Color.LIGHT_GRAY);
		lblVibecroInc.setIcon(new ImageIcon(this.getClass().getResource("LOGO ES 1~1.png")));
		panel1.add(lblVibecroInc);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(272, 0, 732, 637);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSCRIPTION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.BOLD, 25));
		lblNewLabel.setBounds(72, 62, 593, 86);
		panel.add(lblNewLabel);
		
		JPanel panel2= new JPanel();
		panel2.setForeground(new Color(255, 255, 255));
		panel2.setOpaque(false);
		panel2.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 4, true), "Informations g\u00E9n\u00E9rales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel2.setBounds(24,144,657, 433);
		panel.add(panel2);
		panel2.setLayout(null);
		
		
		JLabel user_name= new JLabel("Adresse \u00E9lectronique:");
		user_name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		user_name.setBounds(10, 55, 361, 86);
		panel2.add(user_name);
		
		JLabel password= new JLabel("Mot de Passe:");
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password.setBounds(10, 125, 136, 86);
		panel2.add(password);
		
		JTextField adre = new JTextField();
		adre.setBounds(286, 85, 361, 35);
		panel2.add(adre);
		
		JPasswordField mp_ = new JPasswordField();
		mp_.setBounds(286, 151, 361, 35);
		panel2.add(mp_);
		
	
		
		JButton btnSinscrire = new JButton(" Retour");
		btnSinscrire.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), null));
		btnSinscrire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login inscription= new Login();
				inscription.demarre();
				frame.dispose();
			}
		});
		btnSinscrire.setBounds(22, 383, 85, 21);
		panel2.add(btnSinscrire);
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.setBounds(548, 383, 85, 21);
		panel2.add(btnFermer);
		
		JLabel lblConfirmerLeMot = new JLabel("Confirmer le mot de Passe:");
		lblConfirmerLeMot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConfirmerLeMot.setBounds(10, 186, 269, 86);
		panel2.add(lblConfirmerLeMot);
		
		conf_mp = new JPasswordField();
		conf_mp.setBounds(286, 213, 361, 35);
		panel2.add(conf_mp);
		
		JLabel lblClDactivation = new JLabel("Cl\u00E9 d'activation:");
		lblClDactivation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblClDactivation.setBounds(10, 251, 269, 86);
		panel2.add(lblClDactivation);
		
		JTextField licen = new JTextField();
		licen.setAlignmentY(2.0f);
		licen.setText("VXB-XXXX-XXXX-XXXX-XX-XXXX-XXXX-XXXX-BX");
		licen.setBounds(286, 278, 361, 35);
		panel2.add(licen);
		
		JLabel lblCopyrightVibecro = new JLabel("Copyright 2019, VIBECRO Inc Tous droits r\u00E9serv\u00E9s");
		lblCopyrightVibecro.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblCopyrightVibecro.setForeground(Color.WHITE);
		lblCopyrightVibecro.setBounds(455, 614, 542, 13);
		panel.add(lblCopyrightVibecro);
 
		
		JButton btnSeConnecter = new JButton("S'INSCRIRE");
		btnSeConnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String email= adre.getText().toString().trim();
				String mp = mp_.getText().toString();
				String conf_m=  conf_mp.getText().toString();
				String licences= licen.getText().toString().trim();
				System.out.println(mp+"\n"+conf_m);
				if(email.isEmpty()|| email.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Champ \"adresse électronique\" vide !");
				}else if(!email.contains("@")|| email.startsWith("@")) {
					JOptionPane.showMessageDialog(null, "Votre email n'existe pas !");
				}else if( mp.isEmpty()|| mp.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Champ \"mot de passe\" vide !");
				}else if(mp.length()<6) {
					JOptionPane.showMessageDialog(null, "Le \"mot de passe\" doit contenir au moins 6 caractères !");
				}else if(conf_m.isEmpty()||conf_m.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Veuillez confirmer votre mot de passe!");
				}else if(!mp.equals(conf_m)) {
					JOptionPane.showMessageDialog(null, "Les mots de passe ne correspondent pas !");
				}else if(licences.trim().length()!=39) {
					JOptionPane.showMessageDialog(null, "Clé de licence incorrecte !");
				}else {
					Inscrire(email, mp, licences);
				}
			}
		});
		btnSeConnecter.setBounds(249, 337, 142, 35);
		panel2.add(btnSeConnecter);
		
		
	//	frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\UTILISATEUR\\Desktop\\VIBECRO CORP\\LOGO ES 1.png"));
		frame.setTitle("EducSoft ");
		frame.setBounds(100, 100, 1003, 676);
		
	}

	protected void Inscrire(String email, String mp, String licences) {
		Initialize init=new Initialize();
		String sal="CREATE TABLE utilisateurs(email VARCHAR(255),password VARCHAR(40),pseudo VARCHAR(255),id_ecole VARCHAR (255))";
		JSONArray json= init.getUsersInfos("utilisateurs", "email='"+email+"'", sal);
		
		if(json!=null&&!json.toString().equals("[]")) {
			JOptionPane.showMessageDialog(null,"Impossible de créer ce compte car il existe déjà !");
		}else if(verif_licences(init, licences)==0){
			System.out.println("Clé licence: "+verif_licences(init, licences));
		}else {
			String safe_em=email;
			String pseudo= createPseudo(safe_em);
			String id_ecol= create_id_ecole();
			String query= "INSERT INTO `utilisateurs`(`email`, `password`, `pseudo`, `id_ecole`) "
					+ "VALUES ('"+email+"','"+mp+"','"+pseudo+"','"+id_ecol+"')";
			if(init.inserer_(query, "utilisateurs", sal, "email", "Compte crée avec succès !", "Echec de la création du compte ! Une erreur inconnue s'est produite...\n Veuillez réessayer...")==0) {
				JOptionPane.showMessageDialog(null, "Votre pseudo est: "+pseudo+"\nVous devez le garder en sécurité !");
				long fut=System.currentTimeMillis()+31536000000L;
				String sqll="UPDATE `licences` SET `debut`='"+String.valueOf(fut)+"', `autre`='"+id_ecol+"' WHERE lic='"+licences+"'";

				init.update_(sqll, "licences", "", "");
				init.ecrire("id_psdo.txt", id_ecol+"\t"+pseudo);
				init.ecrire("connecte.txt", "inscrire");
				init.ecrire("params1.txt", "par");
				Parametrage inscription= new Parametrage();
				frame.dispose();
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSED));
				inscription.demarre();
				
			} 
		}
		
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
	
	protected String createPseudo(String email) {
		return email.substring(0, email.indexOf("@"));
	}

	protected String create_id_ecole() {
		long time= System.currentTimeMillis();
		String debut= "key_ecl_";
		Random r= new Random();
		int hasard= r.nextInt();
		int compt= 0;
		return debut+compt+"_"+hasard+"_"+time;
	}
	
	
	
}
