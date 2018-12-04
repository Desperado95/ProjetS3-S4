import java.util.ArrayList;

public abstract class Zone {
	
	private ArrayList<Carte> cartes;
	private boolean termine;
	private int point;

	
	
	public void terminer()
	{
		this.termine=true;
	}
	
	public void ajouterCarte(Carte carte)
	{
		cartes.add(carte);
	}
	
	public abstract int compterPoint();
}
