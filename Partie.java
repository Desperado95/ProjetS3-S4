public class Partie {

	public ArrayList<Joueur> joueurs;
	public Plateau plat;
	public Deck d;
	public Partie() {
		joueurs = new ArrayList<Joueur>();
		d = new Deck();
		plat = new Plateau(d.Draw());
	}

	
	public void jouer() {
		while(!d.isEmpty)
		{
			tour();
		}
	}
	
	public void tour() {
		for(Joueur j : joueurs)
		{
			if(!d.isEmpty) {
				tourJoueur(j);
			}
			else {
				break;
			}
		}
	}
	
	public void tourJoueur(Joueur j) {
		Carte c= d.Draw();
		j.c = c;
		plat.Ajouter();
		
	}
}
