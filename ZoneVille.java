import java.util.ArrayList;

public class ZoneVille extends Zone {
    public ZoneVille() {
        this.cartes = new ArrayList<Carte>();
        this.type = Parcelle.ville;
        this.termine = false;
        this.point = this.compterPoint();
        this.partisans=new ArrayList<Partisan>();
    }


    @Override
    public int compterPoint() {
      int score = 0;
    	for(Carte c : cartes)
    	{
    		score+=2;
    	}
    	return score;
    }
}
