import java.util.ArrayList;

public class Partie {

	public ArrayList<Joueur> joueurs;
	public Plateau plat;
	public Deck d;

	public Partie() {
		joueurs = new ArrayList<Joueur>();
		d = new Deck();
		plat = new Plateau(d.Draw());
	}

}
