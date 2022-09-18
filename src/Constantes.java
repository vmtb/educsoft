
public class Constantes {
	static Initialize init=new Initialize();
	public Constantes() {
		// TODO Auto-generated constructor stub
	}
	
	public static final String fichier_pseudo= "id_ecl_eds.txt";
	public static final String fichier_key= "id_psdo.txt" ;
	public static final String fichier_ann= "annees.txt" ;
	public static final String current_classe= "current_classes.txt" ;
	public static final String current_trim= "current_trimestre.txt";
	public static final String ecole_name="ecole_name.txt";
	public static final String db_name="educsoft_database"; 
	public static final String db_user_name="root"; 
	public static final String db_pass=""; 
	public static final String db_url="localhost:3306"; 
	static String info_psdo=init.lire_le_fichier(Constantes.fichier_key);
	public static final String id_ecol= info_psdo.substring(0, info_psdo.indexOf('\t'));
	
	public static final String base_url="http://educsoft229.000webhostapp.com";  //"http://localhost/EducSoft";//
	

}
