import java.util.ArrayList;

public class ZoneVille extends Zone {
    public ZoneVille() {
        this.cartes = new ArrayList<Carte>();
        this.type = Parcelle.ville;
        this.termine = false;
        this.point = this.compterPoint();
    }


    @Override
    public int compterPoint() {
       return 0;
    }
}
