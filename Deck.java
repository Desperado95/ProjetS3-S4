import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

	ArrayList<Carte> lsCarte;
	private int contient;
	private int capacity;
	
	public Deck() {
		lsCarte = new ArrayList<Carte>();
		capacity = 72;
		contient = 0;
	}
	
	public Boolean AddCarte(Carte c) {
		if (capacity > contient)
		{
			lsCarte.add(c);
			contient = contient+1;
			return true;
		}
			return false;
	}
	
	public Carte Draw() {
		contient=contient-1;
		return  lsCarte.get(1);
	}
	
	public void melanger(){
        Collections.shuffle(lsCarte);
    }
	
	public void Aff() {
		int i =1;
		for(Carte c : lsCarte)
		{
			System.out.println(i++ +"_____________________");
			c.Aff();
		}
	}
}
