import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    String nbCartes;
    ArrayList<Carte> carte;

    public Deck() {
        this.carte = new ArrayList<Carte>();
        nbCartes = null;
    }

    public Deck(ArrayList<Carte> carte) {
        this.carte = carte;
        nbCartes = String.valueOf(carte.size());
    }


    public void melanger(){
        Collections.shuffle(carte);
    }

    public String getNbCarte(){
        return nbCartes;
    }


}
