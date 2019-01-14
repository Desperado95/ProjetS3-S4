import java.util.ArrayList;

public class ZonePlaine extends Zone {

    public ZonePlaine() {
        this.cartes = new ArrayList<Carte>();
        this.type = Parcelle.plaine;
        this.termine = false;
        this.point = this.compterPoint();
    }


    @Override
    public int compterPoint() {
        return 0;
    }
}
