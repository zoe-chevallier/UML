package Modele;

public class Manuel extends Livre{
	@Override
	public String toString() {
		return "Manuel [titre=" + titre + ", auteur=" + auteur + ", niveauScolaire = " + niveauScolaire + "]";
	}

	private int niveauScolaire;
	
	public Manuel(int num, String titre,String auteur, int nbPages, int niveau){
		super(num, titre, auteur, nbPages);
		niveauScolaire = niveau;
		
	}
	public void setNiveauScolaire(int n){
		niveauScolaire = n;
	}
	
	public int getNiveauScolaire(){
		return niveauScolaire;
	}
	
	@Override
	public void imprimer() {
		System.out.println("Imprime : " + toString());
		
	}
}
