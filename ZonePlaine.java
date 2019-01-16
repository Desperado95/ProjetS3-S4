import java.util.ArrayList;

public class ZonePlaine extends Zone {

    public ZonePlaine() {
        this.cartes = new ArrayList<Carte>();
        this.type = Parcelle.plaine;
        this.termine = false;
        this.point = this.compterPoint();
        this.partisans=new ArrayList<Partisan>();
    }


    @Override
    public int compterPoint() {
        int c = 0;

        return c;
    }
}
