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
			if(zNord==z) {zNord=this;}
			if(zSud==z) {zsud=this;}
			if(zEst==z) {zEst=this;}
			if(zOuest==z) {zOuest=this;}
		}
	}
	
	public abstract int compterPoint();
}
