package Modele;

public class Dictionnaire extends Document{
	private String langue;
	
	@Override
	public String toString() {
		return "Dictionnaire [titre = " + titre + "langue = " + langue + "]";
	}

	public Dictionnaire(int num,String titre,String langue){
		super(num,titre);
		this.langue = langue;
	}
	
	public String getLangue(){
		return langue;
	}
	
	public void setLangue(String langue){
		this.langue = langue;
	}
}
