import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private int nbCartes;
    ArrayList<Carte> carte;

    public Deck() {
        this.carte = new ArrayList<Carte>();
        nbCartes = 0;
    }

    public Deck(ArrayList<Carte> carte) {
        this.carte = carte;
        nbCartes = carte.size();
    }


    public void melanger() {
        Collections.shuffle(carte);
    }

    public int getNbCarte() {
        return nbCartes;
    }

}
