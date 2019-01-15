import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

	ArrayList<Carte> lsCarte;
	private int contient;
	private int capacity;
	
	public Deck() {
		lsCarte = new ArrayList<Carte>();
		capacity = 72;
		contient = 0;
		RemplirDeck();
	}
	
	private RemplirDeck()
	{
		Carte c1 = new Carte(Parcelle.chemin, Parcelle.plaine, Parcelle.chemin, Parcelle.plaine, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        int i = 9;
        for (int y = 0; y < i; y++) {
            AddCarte(c1);
        }
        Carte c2 = new Carte(Parcelle.chemin, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(c2);
        }
        Carte c3 = new Carte(ville, ville, chemin, chemin, ville, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte(c3);
        }
        Carte c4 = new Carte(ville, ville, chemin, ville, ville);
        i = 1;
        for (int y = 0; y < i; y++) {
            AddCarte(c4);
        }
        Carte c5 = new Carte(ville, ville, plaine, ville, ville);
        i = 1;
        for (int y = 0; y < i; y++) {
            AddCarte(c5);
        }
        Carte c6 = new Carte(ville, ville, chemin, chemin, ville);
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(c6);
        }
        Carte c7 = new Carte(chemin, ville, chemin, chemin, chemin);
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(c7);
        }
        Carte c8 = new Carte(chemin, chemin, chemin, plaine, plaine);
        i = 8;
        for (int y = 0; y < i; y++) {
            AddCarte(c8);
        }
        Carte c9 = new Carte(ville, plaine, chemin, chemin, chemin);
        i = 4;
        for (int y = 0; y < i; y++) {
            AddCarte(c9);
        }
        Carte c10 = new Carte(plaine, ville, plaine, plaine, plaine);
        i = 5;
        for (int y = 0; y < i; y++) {
            AddCarte(c10);
        }
        Carte c11 = new Carte(plaine, ville, plaine, plaine, ville);
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte(c11);
        }
        Carte c12 = new Carte(ville, ville, plaine, ville, ville);
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(c12);
        }
        Carte c13 = new Carte(abbaye, plaine, plaine, plaine, plaine);
        i = 4;
        for (int y = 0; y < i; y++) {
            AddCarte(c13);
        }
        Carte c14 = new Carte(ville, plaine, chemin, plaine, plaine);
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte(c14);
        }
        Carte c15 = new Carte(ville, ville, plaine, plaine, ville);
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(c15);
        }
        Carte c16 = new Carte(ville, plaine, plaine, ville, ville);
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte(c16);
        }
        Carte c17 = new Carte(chemin, ville, plaine, chemin, chemin);
        i = 4;
        for (int y = 0; y < i; y++) {
            AddCarte(c17);
        }
        Carte c18 = new Carte(chemin, ville, chemin, plaine, chemin);
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(c18);
        }
        Carte c19 = new Carte(ville, plaine, plaine, ville, ville);
        i = 1;
        for (int y = 0; y < i; y++) {
            AddCarte(c19);
        }
        Carte c20 = new Carte(ville, ville, chemin, chemin, chemin);
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte(c20);
        }
        Carte c21 = new Carte(ville, ville, ville, ville, ville);
        i = 1;
        for (int y = 0; y < i; y++) {
            AddCarte(c21);
        }
        Carte c22 = new Carte(ville, chemin, chemin, chemin, chemin);
        i = 1;
        for (int y = 0; y < i; y++) {
            AddCarte(c22);
        }
        Carte c23 = new Carte(ville, ville, plaine, plaine, ville);
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte(c23);
        }
        Carte c24 = new Carte(plaine, plaine, plaine, ville, ville);
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(c24);
        }
	}
	
	public Boolean AddCarte(Carte c) {
		if (capacity > contient)
		{
			lsCarte.add(c);
			contient = contient+1;
			return true;
		}
			return false;
	}
	
	public Carte Draw() {
		contient=contient-1;
		return  lsCarte.get(1);
	}
	
	public void melanger(){
        Collections.shuffle(lsCarte);
    }
	
	public void Aff() {
		int i =1;
		for(Carte c : lsCarte)
		{
			System.out.println(i++ +"_____________________");
			c.Aff();
		}
	}
}
