import java.io.InputStream;

import javafx.scene.image.Image;

public class Carte {
    Parcelle centre;
    Parcelle nord;
    Parcelle sud;
    Parcelle est;    
    Parcelle ouest;
    Parcelle nordest;
    Parcelle nordouest;
    Parcelle sudest;
    Parcelle sudouest;
    
    int deg = 0;
    
    
    Zone zCentre;
    Zone zNord;
    Zone zSud;
    Zone zEst;
    Zone zOuest;    
    Zone zNordest;
    Zone zNordouest;
    Zone zSudest;
    Zone zSudouest;
    
    Etat etat;
    
    Etat eNord;
    Etat eSud;
    Etat eOuest;
    Etat eEst;
    Etat eNordouest;
    Etat eNordest;
    Etat eSudouest;
    Etat eSudest;
    Etat eCentre;
    
    Image image;

    public Carte() {
        this.est = null;
        nord = null;
        sud = null;
        ouest = null;
        centre = null;
        this.etat = null;

        eNord = null;
        eSud = null;
        eOuest = null;
        eEst = null;
        eNordouest = null;
        eNordest = null;
        eSudouest = null;
        eSudest = null;
        eCentre = null;
        Class<?> clazz = MyClass.class;
    	InputStream input = clazz.getResourceAsStream("/org/o7planning/javafx/icon/fond.jpg");
         image = new Image(input, 100, 100, false, true);
    }

    public Carte(Parcelle centre, Parcelle nord, Parcelle sud, Parcelle est, Parcelle ouest, Parcelle nordoust, Parcelle nordest, Parcelle sudouest, Parcelle sudost,String src) {
        this.centre = centre;
        this.nord = nord;
        this.sud = sud;
        this.est = est;
        this.ouest = ouest;
        this.sudouest = sudouest;
        this.sudest = sudest;
        this.nordest = nordest;
        this.nordouest = nordouest;
        this.etat = (Etat.non_place);

        eNord = Etat.non_place;
        eSud = Etat.non_place;
        eOuest = Etat.non_place;
        eEst = Etat.non_place;
        eNordouest = Etat.non_place;
        eNordest = Etat.non_place;
        eSudouest = Etat.non_place;
        eSudest = Etat.non_place;
        eCentre = Etat.non_place;
        
        Class<?> clazz = MyClass.class;
    	InputStream input = clazz.getResourceAsStream(src);
        image = new Image(input, 100, 100, false, true);

    }

    public Carte(Carte c) {
        this.centre = c.centre;
        this.nord = c.nord;
        this.sud = c.sud;
        this.est = c.est;
        this.ouest = c.ouest;
        this.etat = (Etat.non_place);

        eNord = c.eNord;
        eSud = c.eSud;
        eOuest = c.eOuest;
        eEst = c.eEst;
        eNordouest = c.eNordouest;
        eNordest = c.eNordest;
        eSudouest = c.eSudouest;
        eSudest = c.eSudest;
        eCentre = c.eCentre;
        
        this.image = c.image;

    }

    public void tournerHoraire() {
        Parcelle tempo = this.nord;
        this.nord = this.ouest;
        this.ouest = this.sud;
        this.sud = this.est;
        this.est = tempo;
        
        tempo = nordest;
        this.nordest = this.nordouest;
        this.nordouest = this.sudouest;
        this.sudouest = this.sudest;
        this.sudest = tempo;
        
        deg+=90;

        
     
        
    }

    public void tournerAntiHoraire() {
        Parcelle tempo = this.nord;
        this.nord = this.est;
        this.est = this.sud;
        this.sud = this.ouest;
        this.ouest = tempo;
        
        tempo = nordest;
        this.nordest = this.sudest;
        this.sudest = this.sudouest;
        this.sudouest = this.nordouest;
        this.nordouest = tempo;
        
        deg-=90;
        
    }

    public void Aff() {
        System.out.println("	" + nord + "		");
        System.out.println(ouest + "	" + centre + "	" + est);
        System.out.println("	" + sud + "\n");
    }
 
}



