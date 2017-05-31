package Modele;
import java.util.ArrayList;

public class Bibliotheque {
	private ArrayList<Etagere> listeEtagere;
	
	public Bibliotheque(){
		listeEtagere = new ArrayList<Etagere>();
	}
	
	public void setListeEtagere(ArrayList<Etagere> l){
		this.listeEtagere = l;
	}
	
	public ArrayList<Etagere> getListeEtagere(){
		return listeEtagere;
	}
	
	public void ajoutEtagere(Etagere etagere){
		listeEtagere.add(etagere);
	}
	 
	
	
}
