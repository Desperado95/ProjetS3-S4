
public class Carte {
    private Parcelle centre;
    private Parcelle nord;
    private Parcelle sud;
    private Parcelle est;
    private Parcelle ouest;
    private Etat etat;


    public Carte() {
        centre = Parcelle.ville;
        nord = Parcelle.ville;
        sud = Parcelle.ville;
        est = Parcelle.ville;
        ouest = Parcelle.ville;
        this.etat = (Etat.non_place);
    }


    public Carte(Parcelle centre, Parcelle nord, Parcelle sud, Parcelle est, Parcelle ouest) {
        this.centre = centre;
        this.nord = nord;
        this.sud = sud;
        this.est = est;
        this.ouest = ouest;
        this.etat = (Etat.non_place);
    }

    public Carte(Carte carte) {
        this.centre = carte.centre;
        this.nord = carte.nord;
        this.sud = carte.sud;
        this.est = carte.est;
        this.ouest = carte.ouest;
        this.etat = carte.etat;
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

}
