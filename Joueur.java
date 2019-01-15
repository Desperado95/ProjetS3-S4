import java.util.ArrayList;

public class Joueur {
    protected String nom;
    protected int point;
    protected Couleur couleur;
    protected ArrayList<Partisan> partisans;
    protected Carte carte;

    public Joueur(String nom, int point, Couleur couleur) {
        this.nom = nom;
        this.point = point;
        this.couleur = couleur;
        this.carte = new Carte();
        partisans = new ArrayList<>(partisans);
        for (int i = 0; i < 5; i++) {
            partisans.add(new Partisan());
        }
    }


    public void piocher(Deck deck) {
        carte = new Carte(deck.lsCarte.get(0));
        deck.lsCarte.remove(0);
    }

    /*Le methode de mettre un partisant sur la carte ce qui est dans le main*/
    public void mettreLesPions() {
        if (!partisans.isEmpty()) {
        	
        }
    }


}
