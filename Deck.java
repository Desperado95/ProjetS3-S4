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

    private void RemplirDeck() {
        Carte c1 = new Carte(Parcelle.Parcelle.chemin, Parcelle.plaine, Parcelle.Parcelle.chemin, Parcelle.plaine, Parcelle.Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        int i = 9;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c1);
        }
        Carte c2 = new Carte(Parcelle.Parcelle.chemin, Parcelle.ville, Parcelle.Parcelle.chemin, Parcelle.Parcelle.chemin, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine);
        i = 3;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c2);
        }
        Carte c3 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.chemin);
        i = 2;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c3);
        }
        Carte c4 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.chemin, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville);
        i = 1;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c4);
        }
        Carte c5 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville);
        i = 1;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c5);
        }
        Carte c6 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.plaine);
        i = 3;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c6);
        }
        Carte c7 = new Carte(Parcelle.chemin, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine);
        i = 3;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c7);
        }
        Carte c8 = new Carte(Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 8;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c8);
        }
        Carte c9 = new Carte(Parcelle.ville, Parcelle.plaine, Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 4;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c9);
        }
        Carte c10 = new Carte(Parcelle.plaine, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 5;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c10);
        }
        Carte c11 = new Carte(Parcelle.plaine, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.plaine, Parcelle.ville, Parcelle.plaine, Parcelle.plaine);
        i = 2;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c11);
        }
        Carte c12 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville);
        i = 3;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c12);
        }
        Carte c13 = new Carte(abbaye, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 4;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c13);
        }
        Carte c14 = new Carte(Parcelle.ville, Parcelle.plaine, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 2;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c14);
        }
        Carte c15 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 3;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c15);
        }
        Carte c16 = new Carte(Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville);
        i = 2;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c16);
        }
        Carte c17 = new Carte(Parcelle.chemin, Parcelle.ville, Parcelle.plaine, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 4;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c17);
        }
        Carte c18 = new Carte(Parcelle.chemin, Parcelle.ville, Parcelle.chemin, Parcelle.plaine, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 3;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c18);
        }
        Carte c19 = new Carte(Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville);
        i = 1;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c19);
        }
        Carte c20 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville);
        i = 2;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c20);
        }
        Carte c21 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville);
        i = 1;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c21);
        }
        Carte c22 = new Carte(Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 1;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c22);
        }
        Carte c23 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine);
        i = 2;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c23);
        }
        Carte c24 = new Carte(Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.Parcelle.plaine);
        i = 3;
        for (int y = 0; y < i; y++) {
            deck.AddCarte(c24);
        }
    }

    public Boolean AddCarte(Carte c) {
        if (capacity > contient) {
            lsCarte.add(c);
            contient = contient + 1;
            return true;
        }
        return false;
    }

    public Carte Draw() {
        contient = contient - 1;
        return lsCarte.get(1);
    }

    public void melanger() {
        Collections.shuffle(lsCarte);
    }

    public void Aff() {
        int i = 1;
        for (Carte c : lsCarte) {
            System.out.println(i++ + "_____________________");
            c.Aff();
        }
    }
}
