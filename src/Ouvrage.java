import java.util.Date;


public class Ouvrage {
	private static int nombre ;
    private int cote ;
    Date dateEmprunt;
    
	public Ouvrage() {
		cote = nombre++;
	}
	public int getCote() {
		return cote;
	}
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
	public String toString() {
		if(dateEmprunt != null)
			return "Ouvrage [cote=" + cote + ", dateEmprunt=" + dateEmprunt + "]";
		else
			return "Ouvrage [cote=" + cote + ", disponible" + "]";
	}

}
