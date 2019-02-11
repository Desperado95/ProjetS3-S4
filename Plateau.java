
public class Plateau {

	Carte[][] plat;
	
	Plateau(Carte c){
		plat = new Carte[72][72];
		plat[35][35]=c;
	}
	
	Boolean ajouter(Carte c,int x, int y) {
		boolean nord = false;
		boolean sud = false;
		boolean ouest = false;
		boolean est = false;
		boolean abbaye = false;
		
		if(plat[x][y]!=null)
		{
			System.out.println("1");
			return false;
		}
		else
		{	if(plat[x+1][y]!=null)
			{
			est = true;
				if(plat[x+1][y].ouest!=c.est)
				{
					System.out.println("2");
					return false;
				}
			}
			else {
			
			}
			if(plat[x-1][y]!=null) 
			{
				ouest = true;
				if(plat[x-1][y].est!=c.ouest)
				{
					System.out.println("3");
					return false;
				}
			}
			if(plat[x][y+1]!=null) 
			{
				nord = true;
				if(plat[x][y+1].nord!=c.sud)
				{
					System.out.println("4");
					return false;
				}
			}
			if(plat[x][y-1]!=null) 
			{
				sud = true;
				if(plat[x][y-1].sud!=c.nord)
				{
					System.out.println("5");
					return false;
				}
			}
				System.out.println("6");
				plat[x][y]=c;
				
				if(c.centre == Parcelle.abbaye) {
					zCentre = creerZone(c,c.centre);
					abbaye=true;
				}
				
				if(nord == false) {c.zNord = creerZone(c,c.nord);}
				else {plat[x][y+1].c.zNord}
				if(sud == false) {c.zSud = creerZone(c,c.sud);}
				else {}
				if(est == false){c.zEst = creerZone(c,c.est);}
				else {}
				if(ouest == false) {c.zOuest = creerZone(c,c.ouest);}
				else {}
				
				return true;
			
		}
		
	}
	
	
	Zone creerZone(Carte c,Parcelle p){//abbaye,plaine,chemin,ville;
		if(p==abbaye)
		{
			Zone z = new ZoneAbbaye();
		}
		else if(p==plaine){
			Zone z = new ZonePlaine();
		}
		else if(p==chemin){
			Zone z = new ZoneChemin();
		}
		else {
			Zone z = new ZoneVille();
		}
		z.ajouterCarte(c);
		
		return z;
	}
	
	void afficher(){
		Carte c;
		for(int i=0;i<72;i++) 
		{
			System.out.print(i);
			for(int y=0;y<72;y++) 
			{
				
				if(plat[i][y]==null) {
				System.out.print("|		vide		|");
				}
				else
				{
					c =plat[i][y];
					System.out.print(c.nord +"|"+plat[i][y].ouest+"|"+plat[i][y].est+"|"+plat[i][y].sud);
				}
			}
			System.out.println();
		}
	}
}
