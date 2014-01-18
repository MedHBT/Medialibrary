import java.util.LinkedList;
import java.util.List;


public class BiblioList extends Bibliotheque {
	
	List list = new LinkedList() ;
	public void add(Ouvrage ouvrage) {
		list.add(ouvrage) ;
	}
	
	public void remove(int cote) {
		  for(int i=0 ; i<list.size() ; i++) {
		      Ouvrage ouvrage = (Ouvrage)list.get(i) ;
		      if(ouvrage.getCote() == cote)
		         list.remove(ouvrage) ;
		  }
	}
	
	public String toString() {
		  String buf = "" ;
		  for(int i=0 ; i<list.size() ; i++) {
		      buf = buf + "\n" + list.get(i).toString() ;
		  }
		  return buf ;
	}
	
	public int number() {
		  return list.size() ;
    }
	
	
	





}
