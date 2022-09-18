import java.sql.Date;
import java.text.SimpleDateFormat;
 

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initialize init=new Initialize();
		init.ecrire("monpremierfichier.txt", "GBEDE");
		
		String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
		//String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
		//info_psdo= init.lire_le_fichier("id_psdo.txt");
		//String pseudo= info_psdo.substring(info_psdo.indexOf('\t')+1);
		//System.out.println("Pseudo: "+pseudo+"\nKey: "+id_ecol);
		//System.out.print(inferieur("MEYISSO Pascal", "EZIN Mechak"));
		SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");
		long fut=31536000000L;
		System.out.println("jdbc:mysql://"+Constantes.db_url+"/"+Constantes.db_name);
	}
	
	public static boolean inferieur(String s1,String s2) {
		String s1p= s1.trim().toLowerCase();
		String s2p= s2.trim().toLowerCase();
		int faible=s2p.length();
		if(s1p.length()<s2p.length())
			faible=s1p.length();
		boolean ans=false;
		int pti=0;
		for(int i=0; i<faible;  i++) {
			if(s1p.charAt(i)<s2p.charAt(i)) {
				ans=true; 
				break;
			}else if(s1p.charAt(i)>s2p.charAt(i)) {
				ans=false;
				break;
			}else
				pti++;
		}
		if(pti==faible) {
			if(faible==s1p.length())
				ans=false;
			else
				ans=true;
		}
		return ans;
		
	}
	

}
