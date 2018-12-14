public class Deck {
    String nbCartes;
    ArrayList<Carte> carte;

    public Deck() {
        this.carte = new ArrayList<Carte>();
        nbCartes = null;
    }

    public Deck(Carte carte) {
        this.carte = carte;
        nbCartes = carte.size();
    }
    
    
    public void melanger(){
        
    }
    
    public int getNbCarte(){
        
    }


}
