package Controleur;

import Modele.Bibliotheque;
import Modele.Etagere;
import Modele.Manuel;
import Modele.Revue;
import Modele.Roman;

public class main {

	public static void main(String[] args) {
		Bibliotheque bibliotheque = new Bibliotheque();
		
		Etagere etagere = new Etagere(4);
		bibliotheque.ajoutEtagere(etagere);
		
		Roman l1 = new Roman(1,"Hello","Zoé", 56, null);
		Roman l2 = new Roman(2,"Goodbye", "Adja", 75, "Goncourt");
		Manuel l3 = new Manuel(3,"UML pour les nuls", "prof", 89, 3);
		
		Revue r1 = new Revue(4,"Hzfedbq", 8, 1997);
		
		
		etagere.ajoutDocument(l1);
		etagere.ajoutDocument(r1);
		etagere.ajoutDocument(l3);
		etagere.ajoutDocument(l2);
		
		etagere.afficheDocuments();
		
		etagere.rechercherDocument("Hello");
		etagere.rechercherDocument("Adja");
		
		etagere.trieEtagere();
		etagere.afficheDocuments();

	}

}
