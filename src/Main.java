import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

	public static void main(String[] args){
		
		  System.out.println("----------------------------------------------");
		  System.out.println("-------------Test pour BiblioTab--------------");
		  System.out.println("----------------------------------------------");
		  Ouvrage o1, o2, o3, o4 ;
		  o1 = new Livre("La petite fille au tambour", "John Le Carre", "Seuil") ;
		  o2 = new Periodique("Picsou",500,"Hebdomadaire");
		  o3 = new CD("Triller","Micheal Jackson");
		  o4 = new Livre("En attendant le vote des betes sauvages","Amadou Kourouma","Seuil") ;
		  
		  Bibliotheque biblio1 = new BiblioTab() ;
		  biblio1.add(o1) ;
		  biblio1.add(o2) ;
		  biblio1.add(o3) ;
		  biblio1.add(o4) ;
		  System.out.println(biblio1.toString()) ;
		  String dateString1 = "2011-01-18 15:50:00.0";
		  Date date1 = null;
		  try {
			date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(dateString1);
		  } catch (ParseException e) {
			  e.printStackTrace();
		  }
		  o2.setDateEmprunt(date1);
		  biblio1.remove(o1.getCote()) ; 
		  biblio1.remove(o3.getCote()) ; 
		  System.out.println(biblio1.toString()) ;
		  
		  System.out.println("----------------------------------------------");
		  System.out.println("-------------Test pour BiblioList-------------");
		  System.out.println("----------------------------------------------");
		  
		  Ouvrage o5, o6, o7, o8 ;
		  o5 = new Livre("La petite fille au tambour", "John Le Carre", "Seuil") ;
		  o6 = new Periodique("Picsou",500,"Hebdomadaire");
		  o7 = new CD("Triller","Micheal Jackson");
		  o8 = new Livre("En attendant le vote des betes sauvages","Amadou Kourouma","Seuil") ;
         
		  Bibliotheque biblio2 = new BiblioList() ;
		  biblio2.add(o5) ;
		  biblio2.add(o6) ;
		  biblio2.add(o7) ;
		  biblio2.add(o8) ;
		  System.out.println(biblio2.toString()) ;
		  String dateString2 = "2011-01-18 15:50:00.0";
		  Date date2 = null;
		  try {
			date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(dateString2);
		  } catch (ParseException e) {
			  e.printStackTrace();
		  }
		  o6.setDateEmprunt(date2);
		  biblio2.remove(o5.getCote()) ; 
		  biblio2.remove(o7.getCote()) ; 
		  System.out.println(biblio2.toString()) ;


	}

}
