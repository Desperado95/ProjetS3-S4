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
    public void mettreLesPions(int i) {
        public void mettreLesPions () {
            if (!partisans.isEmpty()) {
                switch (i) {
                    case 1:
                        if (carte.eNordouest != Etat.disable) {
                            carte.eNordouest = Etat.place;
                            parcourirPlace();
                        }
                    case 2:
                        if (carte.eNord != Etat.disable) {
                            carte.eNord = Etat.place;
                            parcourirPlace();
                        }
                    case 3:
                        if (carte.eNordest != Etat.disable) {
                            carte.eNordest = Etat.place;
                            parcourirPlace();
                        }
                    case 4:
                        if (carte.eEst != Etat.disable) {
                            carte.eEst = Etat.place;
                            parcourirPlace();
                        }
                    case 5:
                        if (carte.eSudest != Etat.disable) {
                            carte.eSudest = Etat.place;
                            parcourirPlace();
                        }
                    case 6:
                        if (carte.eSud != Etat.disable) {
                            carte.eSud = Etat.place;
                            parcourirPlace();
                        }
                    case 7:
                        if (carte.eSudouest != Etat.disable) {
                            carte.eSudouest = Etat.place;
                            parcourirPlace();
                        }
                    case 8:
                        if (carte.eOuest != Etat.disable) {
                            carte.eOuest = Etat.place;
                            parcourirPlace();
                        }
                    case 9:
                        if (carte.eCentre != Etat.disable) {
                            carte.eCentre = Etat.place;
                            parcourirPlace();
                        }


                }
            }
        }

        /* Parcourir tousles états,est ce qu'il exist un état == placé*/

        public void parcourirPlace () {
            if (carte.eNord == Etat.place)
                carte.eNord = Etat.non_place;
            if (carte.eSud == Etat.place)
                carte.eSud = Etat.non_place;
            if (carte.eOuest == Etat.place)
                carte.eOuest = Etat.non_place;
            if (carte.eEst == Etat.place)
                carte.eEst = Etat.non_place;
            if (carte.eNordouest == Etat.place)
                carte.eNordouest = Etat.non_place;
            if (carte.eNordest == Etat.place)
                carte.eNordest = Etat.non_place;
            if (carte.eSudouest == Etat.place)
                carte.eSudouest = Etat.non_place;
            if (carte.eSudest == Etat.place)
                carte.eSudest = Etat.non_place;
            if (carte.eCentre == Etat.place)
                carte.eCentre = Etat.non_place;
        }


    }


}
