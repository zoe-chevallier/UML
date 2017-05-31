package Modele;
import java.util.ArrayList;
import java.util.Collections;

public class Etagere implements Imprimable{
	private ArrayList<Document> listeDocuments;
	private int nbDocMax;
	
	/**
	 * Constructeur de la classe Etagere
	 * @param nbDocMax
	 */
	public Etagere(int nbDocMax){
		listeDocuments = new ArrayList<Document>();
		this.nbDocMax = nbDocMax;
	}
	/**
	 * Accesseur listeDocument
	 * @return
	 */
	public ArrayList<Document> getListeDocuments(){
		return listeDocuments;
	}
	
	/**
	 * Accesseur liste Document
	 * @param l
	 */
	public void setListeDocuments(ArrayList<Document> l){
		listeDocuments = l;
	}
	
	/**
	 * Accesseur nombre de documents maximum dans l'�tag�re
	 * @return
	 */
	public int getNbDocMax(){
		return nbDocMax;
	}
	/**
	 * Accesseur nombre de documents maximum dans l'�tag�re
	 * @param n
	 */
	public void setNbDocMax(int n){
		nbDocMax = n;
	}
	
	/**
	 * Permet d'ajouter un document dans l'�tag�re
	 * @param doc document � ajouter
	 */
	public void ajoutDocument(Document doc){
		if (listeDocuments.size() < nbDocMax){
			listeDocuments.add(doc);
			System.out.println("Vous avez bien ajout� le livre");
			doc.setEtagere(this);
		}
		else
			System.out.println("Vous n'avez plus de place dans cette �tag�re");
	}
	/**
	 * Permet d'afficher les documents pr�sents dans l'�tag�re
	 */
	public void afficheDocuments(){
		System.out.println("Documents dans l'�tag�re: ");
		for (Document doc : listeDocuments)
			System.out.println(doc.toString());
		System.out.println( );
	}
	/**
	 * Permet de rechercher s'il existe un document de l'auteur donn� en param�tre
	 * @param auteur
	 */
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
	/**
	 * Permet de trier les documents pr�sents dans l'tag�re par ordre alphab�tique (pour les titres)
	 */
	public void trieEtagere(){
		Collections.sort(listeDocuments, new ComparateurDoc());
	}
	@Override
	public void imprimer() {
		for (Document doc : listeDocuments){
			if (doc instanceof Livre)
				System.out.println("Imprime " + doc.toString());
		}
		
	}
	
}
