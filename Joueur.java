public class Joueur {
    protected String nom;
    protected int point;
    protected Couleur couleur;
    protected Partisan[] partisans;
    protected Carte carte;

    public Joueur(String nom, int point, Couleur couleur) {
        this.nom = nom;
        this.point = point;
        this.couleur = couleur;
        partisans = new Partisan[5];
        this.carte = new Carte();
    }


    public void piocher(Deck deck) {
        carte = new Carte(deck.lsCarte.get(0));
        deck.lsCarte.remove(0);
    }


}
