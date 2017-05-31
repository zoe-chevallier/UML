package Modele;
import java.util.ArrayList;
import java.util.Collections;

public class Etagere {
	private ArrayList<Document> listeDocuments;
	private int nbDocMax;
	
	public Etagere(int nbDocMax){
		listeDocuments = new ArrayList<Document>();
		this.nbDocMax = nbDocMax;
	}
	
	public ArrayList<Document> getListeDocuments(){
		return listeDocuments;
	}
	
	public void setListeDocuments(ArrayList<Document> l){
		listeDocuments = l;
	}
	
	public int getNbDocMax(){
		return nbDocMax;
	}
	
	public void setNbDocMax(int n){
		nbDocMax = n;
	}
	
	public void ajoutDocument(Document doc){
		if (listeDocuments.size() < nbDocMax){
			listeDocuments.add(doc);
			System.out.println("Vous avez bien ajouté le livre");
			doc.setEtagere(this);
		}
		else
			System.out.println("Vous n'avez plus de place dans cette étagère");
	}
	
	public void afficheDocuments(){
		System.out.println("Documents dans l'étagère: ");
		for (Document doc : listeDocuments)
			System.out.println(doc.toString());
		System.out.println( );
	}
	
	public void rechercherDocument(String auteur){
		boolean trouve = false;
		ArrayList<Livre> livres = new ArrayList<Livre>();
		for (Document doc : listeDocuments){
			if (doc instanceof Livre){
				livres.add((Livre) doc);
				}
		}
		for (Livre l : livres){
			if (l.getAuteur() == auteur){
				System.out.println("Il existe au moins un livre de l'auteur " + auteur + ":");
				System.out.println(l.toString());
				trouve = true;
				break;
			}
		}
		if (!trouve)
			System.out.println("Il n' y a pas de document de l'auteur " + auteur);	
		System.out.println();
	}
	
	public void trieEtagere(){
		Collections.sort(listeDocuments, new ComparateurDoc());
	}
	
}
