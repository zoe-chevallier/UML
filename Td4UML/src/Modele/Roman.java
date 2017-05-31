package Modele;

public class Roman extends Livre{
	@Override
	public String toString() {
		return "Roman [titre=" + titre + ", auteur=" + auteur  + "]";
	}

	private String prixLitteraire;
	
	public Roman(int num, String titre,String auteur, int nbPages, String prix){
		super(num, titre,auteur, nbPages);
		prixLitteraire = prix;
	}
	
	public String getPrixLitteraire(){
		return prixLitteraire;
	}
	
	public void setPrixLitteraire(String prix){
		prixLitteraire = prix;
	}

	@Override
	public void imprimer() {
		System.out.println("Imprime : " + toString());
		
	}
	
}
