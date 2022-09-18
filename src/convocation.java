import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class convocation {

	 JDialog frame;
	private static String code="";

	/**
	 * Launch the application.
	 */ 
	
	public static void demarre(String[] args) {
		code= args[0];
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					convocation window = new convocation();
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
	public convocation() {
		initialize(); 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JDialog();
		frame.setResizable(false);
		frame.setUndecorated(false);
		
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBackground(Color.PINK);
		frame.setBounds(100, 100, 605, 468);

		frame.getContentPane().setLayout(null);


		frame.setIconImage((new ImageIcon(this.getClass().getResource("/LOGOO.png")).getImage()));
		JLabel lblNoteDeLa = new JLabel();
		lblNoteDeLa.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNoteDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoteDeLa.setOpaque(false);
		lblNoteDeLa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNoteDeLa.setBounds(10, 41, 558, 58); 
		lblNoteDeLa.setText("<HTML><UL>Note de la convocation (N'oubliez pas de  sp\u00E9cifier la date et l'heure)</HTML></UL>");
		frame.getContentPane().add(lblNoteDeLa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 571, 239);
		frame.getContentPane().add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setPreferredSize(new Dimension(571, 500));
		scrollPane.setViewportView(textPane);
		
		JButton btnFermer = new JButton("FERMER");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnFermer.setBounds(20, 398, 85, 21);
		frame.getContentPane().add(btnFermer);
		Initialize init= new Initialize();
		JButton btnEnvoyer = new JButton("ENVOYER");
		btnEnvoyer.setBounds(446, 398, 85, 21);
		frame.getContentPane().add(btnEnvoyer);
		btnEnvoyer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textPane.getText().toString().trim().isEmpty())
					init.Alerter("Convocation vide");
				else {
					String convoc= textPane.getText().toString().replaceAll("'", "\"");
					String create= "CREATE TABLE convocations_ (code VARCHAR(255), frm VARCHAR (255), convocation TEXT, date VARCHAR (255), autre TEXT)";
					String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
					String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
					
					String date = String.valueOf(System.currentTimeMillis());
					String query= "INSERT INTO `convocations_` (`code`, `frm`, `convocation`, `date`, `autre`)"
						+ " VALUES ('"+code+"','"+id_ecol+"','"+convoc+"','"+date+"','ras')";
				
					System.out.println("\nINSERTION\n"); 
					if(init.inserer_(query, "convocations_", create, "autre", "Convocation envoyée avec succès !", "Une erreur s'est produite dans l'envoi de la convocation!")==0) {
						frame.dispose();;	
					}
				}
			}
		});
		
	}
}
