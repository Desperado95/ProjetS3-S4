import java.util.ArrayList;

public abstract class Zone {
	
	protected ArrayList<Carte> cartes;
	protected boolean termine;
	protected int point;
	protected String type;

	
	
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
