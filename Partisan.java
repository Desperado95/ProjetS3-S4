public class Partisan<T extends Parcelle> {
	
	private Etat etat;
	private Zone z;
	
	public Partisan()
	{
		this.etat=(Etat.non_place);
	}

	public void pZone(Zone zone)
	{
		z=zone;
	}
}
