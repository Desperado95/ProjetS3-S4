import java.util.ArrayList;

public class Zone {
	
	private Parcelle type; 
	private ArrayList<Carte> cartes;
	private boolean termine;
	private int point;

	
	public Zone(Parcelle type, int point)
	{
		this.cartes=new ArrayList<Carte>();
		this.type=type;
		this.termine=false;
		this.point=point;
	}
	
	public void terminer()
	{
		this.termine=true;
	}
	
	public void ajouterCarte(Carte carte)
	{
		cartes.add(carte);
	}
}
