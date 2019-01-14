
public class Carte {
    Parcelle centre;
    Parcelle nord;
    Parcelle sud;
    Parcelle est;
    Parcelle ouest;
    Etat etat;
    InputStream image;
    
    public Carte() {
        this.est = null;
        nord = null;
        sud = null;
        ouest = null;
        centre = null;
        this.etat = null;
        this.image = null;
    }

    public Carte(Parcelle centre, Parcelle nord, Parcelle sud, Parcelle est, Parcelle ouest, InputStream i) {
        this.centre = centre;
        this.nord = nord;
        this.sud = sud;
        this.est = est;
        this.ouest = ouest;
        this.etat = (Etat.non_place);
        this.image = i;
    }

    public Carte(Carte c) {
        this.centre = c.centre;
        this.nord = c.nord;
        this.sud = c.sud;
        this.est = c.est;
        this.ouest = c.ouest;
        this.etat = (Etat.non_place);
        this.image = c.image;
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
