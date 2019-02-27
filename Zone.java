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
	
	public void fusioner(Zone z) {
		for(Carte c : z.cartes) {
			ajouterCarte(c);
			if(c.zNord==z) {c.zNord=this;}
			if(c.zSud==z) {c.zSud=this;}
			if(c.zEst==z) {c.zEst=this;}
			if(c.zOuest==z) {c.zOuest=this;}
		}
		for(Partisan p : z.partisans)
		{
			partisans.add(p);
		}
	}
	
	public abstract int compterPoint();
}
