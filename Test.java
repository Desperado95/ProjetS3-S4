public class Test {


	public static void main(String[] args) {
		Parcelle plaine = Parcelle.plaine;
		Parcelle chemin = Parcelle.chemin;
		Parcelle abbaye = Parcelle.abbaye;
		Parcelle ville = Parcelle.ville;

		Deck deck = new Deck();

		//Carte(centre, nord, sud, est, ouest)
		Carte c1 = new Carte(Parcelle.chemin, Parcelle.plaine, Parcelle.chemin, Parcelle.plaine, Parcelle.chemin);int i=9;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c1);
		}
		Carte c2 = new Carte(Parcelle.chemin, Parcelle.ville, Parcelle.chemin, Parcelle.chemin, Parcelle.plaine);i=3;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c2);
		}
		Carte c3 = new Carte( ville, ville, chemin, chemin, ville);i=2;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c3);
		}
		Carte c4 = new Carte(ville,ville,chemin,ville,ville);i=1;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c4);
		}
		Carte c5 = new Carte(ville,ville,plaine,ville,ville);i=1;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c5);
		}
		Carte c6 = new Carte(ville,ville,chemin,chemin,ville);i=3;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c6);
		}
		Carte c7 = new Carte(chemin,ville,chemin,chemin,chemin);i=3;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c7);
		}
		Carte c8 = new Carte(chemin,chemin,chemin,plaine,plaine);i=8;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c8);
		}
		Carte c9 = new Carte(ville,plaine,chemin,chemin,chemin);i=4;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c9);
		}
		Carte c10 = new Carte(plaine,ville,plaine,plaine,plaine);i=5;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c10);
		}
		Carte c11 = new Carte(plaine,ville,plaine,plaine,ville);i=2;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c11);
		}
		Carte c12 = new Carte(ville,ville,plaine,ville,ville);i=3;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c12);
		}
		Carte c13 = new Carte(abbaye,plaine,plaine,plaine,plaine);i=4;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c13);
		}
		Carte c14 = new Carte(ville,plaine,chemin,plaine,plaine);i=2;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c14);
		}
		Carte c15 = new Carte(ville,ville,plaine,plaine,ville);i=3;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c15);
		}
		Carte c16 = new Carte(ville,plaine,plaine,ville,ville);i=2;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c16);
		}
		Carte c17 = new Carte(chemin,ville,plaine,chemin,chemin);i=4;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c17);
		}
		Carte c18 = new Carte(chemin, ville, chemin,plaine,chemin);i=3;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c18);
		}
		Carte c19 = new Carte(ville, plaine, plaine, ville, ville);i=1;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c19);
		}
		Carte c20 = new Carte(ville, ville, chemin, chemin, chemin);i=2;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c20);
		}
		Carte c21 = new Carte(ville,ville,ville,ville,ville);i=1;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c21);
		}
		Carte c22 = new Carte(ville,chemin,chemin,chemin,chemin);i=1;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c22);
		}
		Carte c23 = new Carte(ville,ville,plaine,plaine,ville);i=2;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c23);
		}
		Carte c24 = new Carte(plaine,plaine,plaine,ville,ville);i=3;
		for(int y=0;y<i;y++)
		{
			deck.AddCarte(c24);
		}

		deck.Aff();
		deck.melanger();
		deck.Aff();
		System.out.println("fin Test");
	}

}
