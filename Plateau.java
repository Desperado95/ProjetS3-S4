
public class Plateau {

	Carte[][] plat;
	
	Plateau(Carte c){
		plat = new Carte[72][72];
		plat[35][35]=c;
	}
	
	Boolean ajouter(Carte c,int x, int y) {
		boolean nord=false;
		boolean sud=false;
		boolean ouest=false;
		boolean est=false;
		
		if(plat[x][y]!=null)
		{
			System.out.println("1");
			return false;
			
		}
		else
		{	if(plat[x+1][y]!=null)
			{
				if(plat[x+1][y].ouest==c.est)
				{
					System.out.println("2 valentin was here");
					return false;
				}
			}
		else {
			
		}
			 if(plat[x-1][y]!=null) 
			{
				if(plat[x-1][y].est==c.ouest)
				{
					System.out.println("3");
					return false;
				}
			}
			 if(plat[x][y+1]!=null) 
			{
				if(plat[x][y+1].nord==c.sud)
				{
					System.out.println("4");
					return false;
				}
			}
			 if(plat[x][y-1]!=null) 
			{
				if(plat[x][y-1].sud==c.nord)
				{
					System.out.println("5");
					return false;
				}
			}
				System.out.println("6");
				plat[x][y]=c;
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
