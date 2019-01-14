import java.util.ArrayList;

public class ZoneAbbaye extends Zone {

  
	public ZoneAbbaye()
	{
		this.cartes=new ArrayList<Carte>();
		this.type=Parcelle.abbaye;
		this.termine=false;
		this.point=this.compterPoint();
	}
	
	
	    public int compterPoint() {


	    return 0;
    }
	
}
