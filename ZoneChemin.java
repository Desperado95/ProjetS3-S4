import java.util.ArrayList;

public class ZoneChemin extends Zone {
    public ZoneChemin() {
        this.cartes = new ArrayList<Carte>();
        this.type = Parcelle.chemin;
        this.termine = false;
        this.point = this.compterPoint();
        this.partisans=new ArrayList<Partisan>();
    }


    @Override
    public int compterPoint() {
        return 0;
    }
}
