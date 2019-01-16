import java.util.ArrayList;

public class ZoneAbbaye extends Zone {


    public ZoneAbbaye() {
        this.cartes = new ArrayList<Carte>();
        this.type = Parcelle.abbaye;
        this.termine = false;
        this.point = this.compterPoint();
        this.partisans = new ArrayList<Partisan>();
    }


    public int compterPoint() {
        int cpt = 0;
        for (Carte c : cartes) {
            cpt += 1;
        }
        return cpt;
    }

}
