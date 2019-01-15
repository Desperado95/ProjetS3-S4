
public class Carte {
    Parcelle centre;
    Parcelle nord;
    Parcelle sud;
    Parcelle est;
    Parcelle ouest;
    Parcelle nordest;
    Parcelle nordouest;
    Parcelle sudest;
    Parcelle sudouest;
    Etat etat;
    Etat eNord;
    Etat eSud;
    Etat eOuest;
    Etat eEst;
    Etat eNordouest;
    Etat eNordest;
    Etat eSudouest;
    Etat eSudest;
    Etat eCentre;

    public Carte() {
        this.est = null;
        nord = null;
        sud = null;
        ouest = null;
        centre = null;
        this.etat = null;

        eNord = null;
        eSud = null;
        eOuest = null;
        eEst = null;
        eNordouest = null;
        eNordest = null;
        eSudouest = null;
        eSudest = null;
        eCentre = null;
    }

    public Carte(Parcelle centre, Parcelle nord, Parcelle sud, Parcelle est, Parcelle ouest, Parcelle nordoust, Parcelle nordest, Parcelle sudouest, Parcelle sudost) {
        this.centre = centre;
        this.nord = nord;
        this.sud = sud;
        this.est = est;
        this.ouest = ouest;
        this.sudouest = sudouest;
        this.sudest = sudest;
        this.nordest = nordest;
        this.nordouest = nordouest;
        this.etat = (Etat.non_place);

        eNord = Etat.non_place;
        eSud = Etat.non_place;
        eOuest = Etat.non_place;
        eEst = Etat.non_place;
        eNordouest = Etat.non_place;
        eNordest = Etat.non_place;
        eSudouest = Etat.non_place;
        eSudest = Etat.non_place;
        eCentre = Etat.non_place;

    }

    public Carte(Carte c) {
        this.centre = c.centre;
        this.nord = c.nord;
        this.sud = c.sud;
        this.est = c.est;
        this.ouest = c.ouest;
        this.etat = (Etat.non_place);

        eNord = c.eNord;
        eSud = c.eSud;
        eOuest = c.eOuest;
        eEst = c.eEst;
        eNordouest = c.eNordouest;
        eNordest = c.eNordest;
        eSudouest = c.eSudouest;
        eSudest = c.eSudest;
        eCentre = c.eCentre;

    }

    public void tournerHoraire() {
        Parcelle tempo = this.nord;
        this.nord = this.ouest;
        this.ouest = this.sud;
        this.sud = this.est;
        this.est = tempo;
    }

    public void tournerAntiHoraire() {
        Parcelle tempo = this.nord;
        this.nord = this.est;
        this.est = this.sud;
        this.sud = this.ouest;
        this.ouest = tempo;
    }

    public void Aff() {
        System.out.println("	" + nord + "		");
        System.out.println(ouest + "	" + centre + "	" + est);
        System.out.println("	" + sud + "\n");
    }
 
}



