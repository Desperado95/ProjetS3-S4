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
		RemplirDeck();
	}
	
	private RemplirDeck()
	{
		
        int i = 9;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(Parcelle.chemin, Parcelle.plaine, Parcelle.chemin, Parcelle.plaine, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine););
        }
        
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(Parcelle.chemin, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine););
        }
    
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte( new Carte(ville, ville, chemin, chemin, ville, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine, Parcelle.plaine););
        }
        
        i = 1;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, ville, chemin, ville, ville););
        }
        
        i = 1;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, ville, plaine, ville, ville););
        }
       
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, ville, chemin, chemin, ville););
        }
       
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte( new Carte(chemin, ville, chemin, chemin, chemin););
        }
        
        i = 8;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(chemin, chemin, chemin, plaine, plaine););
        }
        
        i = 4;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, plaine, chemin, chemin, chemin););
        }
         
        i = 5;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(plaine, ville, plaine, plaine, plaine););
        }
        
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(plaine, ville, plaine, plaine, ville););
        }
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, ville, plaine, ville, ville););
        }
       
        i = 4;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(abbaye, plaine, plaine, plaine, plaine););
        }
       
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, plaine, chemin, plaine, plaine););
        }
        
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, ville, plaine, plaine, ville););
        }
        
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, plaine, plaine, ville, ville););
        }
        
        i = 4;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(chemin, ville, plaine, chemin, chemin););
        }
       
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(chemin, ville, chemin, plaine, chemin););
        }
        
        i = 1;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, plaine, plaine, ville, ville););
        }
      
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte(  new Carte(ville, ville, chemin, chemin, chemin););
        }
        
        i = 1;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, ville, ville, ville, ville););
        }
        
        i = 1;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, chemin, chemin, chemin, chemin););
        }
        
        i = 2;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(ville, ville, plaine, plaine, ville););
        }
       
        i = 3;
        for (int y = 0; y < i; y++) {
            AddCarte(new Carte(plaine, plaine, plaine, ville, ville););
        }
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
	public boolean isEmpty() {
		return lsCarte.isEmpty();
		}
}
