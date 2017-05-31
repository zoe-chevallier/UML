package Modele;

public class Revue extends Document{
	@Override
	public String toString() {
		return "Revue [titre=" + titre + ", mois = " + mois + ", annee=" + annee	+ "]";
	}
	private int mois;
	private int annee;
	
	public Revue(int num, String titre,int mois, int annee){
		super(num, titre);
		this.mois = mois;
		this.annee = annee;
	}
	
	public int getMois(){
		return mois;
	}
	
	public int getAnnee(){
		return annee;
	}
	
	public void setMois(int m){
		mois = m;
	}
	public void setAnnee(int a){
		annee = a;
	}
}
