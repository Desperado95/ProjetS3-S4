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

    public void RemplirDeck() {
        Carte c1 = new Carte(Parcelle.chemin, Parcelle.plaine, Parcelle.chemin, Parcelle.plaine, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/9a.jpg");
        int i = 9;																			//9a
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c1));
        }
        Carte c2 = new Carte(Parcelle.chemin, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/3a.jpg");
        i = 3;																				//3a
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c2));
        }
        Carte c3 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.chemin,"/org/o7planning/javafx/icon/2a.jpg");
        i = 2;																				//2a
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c3));
        }
        Carte c4 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.chemin, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville,"/org/o7planning/javafx/icon/1a.jpg");
        i = 1;																				//1a
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c4));
        }
        Carte c5 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville,"/org/o7planning/javafx/icon/1b.jpg");
        i = 1;																				//1b
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c5));
        }
        Carte c6 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.plaine,"/org/o7planning/javafx/icon/3b.jpg");
        i = 3;																				//3b
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c6));
        }
        Carte c7 = new Carte(Parcelle.chemin, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/3c.jpg");
        i = 3;																				//3c
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c7));
        }
        Carte c8 = new Carte(Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/8a.jpg");
        i = 8;																				//8a
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c8));
        }
        Carte c9 = new Carte(Parcelle.ville, Parcelle.plaine, Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/4a.jpg");
        i = 4;																				//4a
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c9));
        }
        Carte c10 = new Carte(Parcelle.plaine, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/5a.jpg");
        i = 5;																				//5a
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c10));
        }
        Carte c11 = new Carte(Parcelle.plaine, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.plaine, Parcelle.ville, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/2b.jpg");
        i = 2;																				//2b
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c11));
        }
        Carte c12 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville,"/org/o7planning/javafx/icon/3d.jpg");
        i = 3;																				//3d
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c12));
        }
        Carte c13 = new Carte(Parcelle.abbaye, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/4b.jpg");
        i = 4;																				//4b
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c13));
        }
        Carte c14 = new Carte(Parcelle.ville, Parcelle.plaine, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/2c.jpg");
        i = 2;																				//2c
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c14));
        }
        Carte c15 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/3e.jpg");
        i = 3;																				//3e
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c15));
        }
        Carte c16 = new Carte(Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville,"/org/o7planning/javafx/icon/2d.jpg");
        i = 2;																				//2d
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c16));
        }
        Carte c17 = new Carte(Parcelle.chemin, Parcelle.ville, Parcelle.plaine, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/4c.jpg");
        i = 4;																				//4c
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c17));
        }
        Carte c18 = new Carte(Parcelle.chemin, Parcelle.ville, Parcelle.chemin, Parcelle.plaine, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/2f.jpg");
        i = 3;																				//2f
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c18));
        }
        Carte c19 = new Carte(Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville,"/org/o7planning/javafx/icon/1c.jpg");
        i = 1;																				//1c
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c19));
        }
        Carte c20 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville,"/org/o7planning/javafx/icon/2e.jpg");
        i = 2;																				//2e
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c20));
        }
        Carte c21 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville, Parcelle.ville,"/org/o7planning/javafx/icon/1d.jpg");
        i = 1;																				//1d
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c21));
        }
        Carte c22 = new Carte(Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/1e.jpg");
        i = 1;																				//1e
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c22));
        }
        Carte c23 = new Carte(Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/2f.jpg");
        i = 2;																				//2f
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c23));
        }
        Carte c24 = new Carte(Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.ville, Parcelle.ville, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine,"/org/o7planning/javafx/icon/3g.jpg");
        i = 3;																				//3g
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(c24));
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

    public boolean isEmpty() {
        return lsCarte.isEmpty();
    }


    public void complirDeckMini() {
        capacity = 32;
        ArrayList<Carte> tmp = new ArrayList<Carte>();
        melanger();
        for (int i = 0; i < capacity; i++) {
            tmp.add(lsCarte.get(i));
        }
        lsCarte = new ArrayList<Carte>(tmp);
        contient = lsCarte.size();
    }
}
