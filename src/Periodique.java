
public class Periodique extends Ouvrage{
	private String nom;
	private int numero;
	private String periodicite;
	public Periodique(String nom, int numero, String periodicite) {
		super();
		this.nom = nom;
		this.numero = numero;
		this.periodicite = periodicite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPeriodicite() {
		return periodicite;
	}
	public void setPeriodicite(String periodicite) {
		this.periodicite = periodicite;
	}
	
	public String toString() {
		return "Periodique [nom=" + nom + ", numero=" + numero
				+ ", periodicite=" + periodicite + ", "
				+ super.toString() + "]";
	}
	
	

}
