
public class BiblioTab extends Bibliotheque {
	private int Nmax = 100;
	private static int numberElement = 0;
	Ouvrage tab[ ] = new Ouvrage[Nmax];
	
	public void add(Ouvrage ouvrage){
		if(numberElement<Nmax){
			tab[numberElement] = ouvrage;
			numberElement++;
		}
		else{
			System.out.println("Bibliotheque plaine");
		}
	}
	public void remove(int cote) {
		int i;
		for (i = 0; i <numberElement && tab[i].getCote() != cote;i++)
			;/*{
			if (tab[i].getCote() == cote) {
				Ouvrage temp[] = new Ouvrage[numberElement];
				for (int j = 0; j < i; j++) {
					temp[j] = tab[j];
					}
				for (int k = i; (k > i) && (k < numberElement); k++) {
					temp[k-1] = tab[k];
			
			            }
			tab = temp;
			}
		}*/
		//if(i < numberElement) {
			for(; i < numberElement-1; i++)
				tab[i] = tab[i+1];
		//}
			numberElement--;
		//}

	}
	public String toString(){
		  String buf = "" ;
		  for(int i=0 ; i<numberElement ; i++) {
		      buf = buf + "\n" + tab[i].toString() ;
		  }
		  return buf ;
	}
	public int number(){
		return numberElement;
	}

}
