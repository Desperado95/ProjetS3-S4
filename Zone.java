import java.util.ArrayList;

public abstract class Zone {
	
	protected ArrayList<Carte> cartes;
	protected ArrayList<Partisan> partisans;
	protected boolean termine;
	protected int point;
	protected Parcelle type;
	
	public void terminer()
	{
		this.termine=true;
	}
	
	public void ajouterCarte(Carte carte)
	{
		cartes.add(carte);
	}
	
	public void ajouterPartisan(Partisan par)
	{
		partisans.add(par);
	}
	
	public abstract int compterPoint();
}
