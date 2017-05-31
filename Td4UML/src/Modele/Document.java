package Modele;

public abstract class Document {
	protected int numeroEnregistrement;
	protected String titre;
	protected Etagere etagere;
	
	public Document(int num,String titre){
		numeroEnregistrement = num;
		this.titre = titre;
	}
	
	public void setNumeroEnregistrement(int num){
		numeroEnregistrement = num;
	}
	
	public void setTitre(String titre){
		this.titre = titre;
	}
	
	public int getNumeroEnregistrement(){
		return numeroEnregistrement;
	}
	
	public String getTitre(){
		return titre;
	}

	public void setEtagere(Etagere e){
		etagere = e;
	}
	
	public Etagere getEtagere(){
		return etagere;
	}
	
	public String toString() {
		return "Document [ titre=" + titre + "]";
	}
}
