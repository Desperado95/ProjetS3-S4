

import javafx.scene.control.Label;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;

import java.io.InputStream;
import java.util.ArrayList;

import javafx.scene.paint.Color;
/*
public class JFx extends Application {

    public static void main(String[] args) {
        {
        	Application.launch(JFx.class, args);
        }
    }
    
    @Override
    public void start(Stage primaryStage) {
    	primaryStage.setTitle("Accueil");
        Group r= new Group();
        Scene s= new Scene(r, 500, 300, Color.LIGHTBLUE);
        Button btn = new Button();
        btn.setLayoutX(50);
        btn.setLayoutY(100);
        btn.setText("Les Règles");
        r.getChildren().add(btn);
        Button jouer = new Button();
        jouer.setLayoutX(50);
        jouer.setLayoutY(50);
        jouer.setText("JOUER");
        r.getChildren().add(jouer);
        Button quitter = new Button();
        quitter.setLayoutX(50);
        quitter.setLayoutY(150);
        quitter.setText("Quitter");
        r.getChildren().add(quitter);  
        Class<?> clazz = MyClass.class;
        InputStream input = clazz.getResourceAsStream("/org/o7planning/javafx/icon/accueil.jpg");
        Image image = new Image(input, 300, 150, false, true);
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setLayoutX(150);
        imageView.setLayoutY(25);
        r.getChildren().add(imageView); 
        primaryStage.setScene(s);
        primaryStage.show();
        btn.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
            	Stage stage = new Stage();
            	stage.setTitle("Règles du jeu");
                Group root = new Group();
                Scene scene = new Scene(root, 900, 600, Color.LIGHTBLUE);
                Class<?> clazz = MyClass.class;
                InputStream input = clazz.getResourceAsStream("/org/o7planning/javafx/icon/regles.jpg");
                Image image = new Image(input, 400, 200, false, true);
                ImageView imageView = new ImageView();
                imageView.setImage(image);
                imageView.setLayoutX(225);
                imageView.setLayoutY(0);
                Label reg = new Label();
                reg.setLayoutX(0);
                reg.setLayoutY(200);
                reg.setText(" LE BUT DU JEU \r\n" +
                		" Les joueurs posent, à tour de rôle, les cartes de paysage sur la table pour créer des chemins, des villes, des prés et des abbayes.\r\n Ils peuvent placer leurs partisans sur les cartes pour gagner des points.\r\n Les points peuvent être obtenus pendant la partie ou à la fin et on ne peut donc pas connaître l'heureux vainqueur avant l'évaluation finale.\r\n" + 
                		"\r\n" + 
                		" DÉROULEMENT DU JEU\r\n" + 
                		" Les participants jouent à tour de rôle en suivant le sens des aiguille d'une montre.\r\n A chaque tour, ils doivent réaliser les actions suivantes en respectant l'ordre indiqué ci-dessous.\r\n" + 
                		"\t- 1 Ils doivent piocher une carte de paysage et la poser sur la table.\r\n" + 
                		"\t- 2 Ils peuvent prendre l'un de leur partisans et le placer sur la carte qu'il viennent de poser sur la table.\r\n" + 
                		"\t- 3 Si grâce à cette carte, ils réussissent à achever des chemins, des villes, ou des abbayes, ils doivent les évaluer et compter les points correspondants.\r\n");
                        
                Button b = new Button();
                b.setLayoutX(50);
                b.setLayoutY(500);
                b.setText("Retour");
                root.getChildren().add(b);
                root.getChildren().add(imageView);
                root.getChildren().add(reg);
                stage.setScene(scene);
                stage.show();
                b.setOnAction(new EventHandler<ActionEvent>() {

                    public void handle(ActionEvent event) {
                    	stage.close();
                    }
                });

            }
        });

        quitter.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
            	primaryStage.close();
            }
        });
        
        jouer.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
            	primaryStage.close();
            	Stage sta = new Stage();
            	sta.setTitle("Paramètres");
                Group group= new Group();
                Scene sce= new Scene(group, 500, 300, Color.LIGHTBLUE);
                
                Button valider = new Button();
                valider.setLayoutX(400);
                valider.setLayoutY(100);
                valider.setText("Valider");
                
                Label nb = new Label();
                nb.setLayoutX(50);
                nb.setLayoutY(50);
                nb.setText("Nombre de joueur :");
                
                ObservableList<String> options = FXCollections.observableArrayList(
                	        "2",
                	        "3",
                	        "4"
                	    );
                final ComboBox cb = new ComboBox(options);
                cb.setLayoutX(200);
                cb.setLayoutY(50);
                
                Label type = new Label();
                type.setLayoutX(50);
                type.setLayoutY(150);
                type.setText("Type de partie :");
                
                ObservableList<String> opt = FXCollections.observableArrayList(
                	        "Courte (36 cartes)",
                	        "Normal (72 cartes)"
                	    );
                final ComboBox cob = new ComboBox(opt);
                cob.setLayoutX(200);
                cob.setLayoutY(150);
                
                group.getChildren().add(type);
                group.getChildren().add(cob);
                group.getChildren().add(nb);
                group.getChildren().add(valider);
                group.getChildren().add(cb);
                sta.setScene(sce);
                sta.show();
                
                valider.setOnAction(new EventHandler<ActionEvent>() {

                    public void handle(ActionEvent event) {
                    	if(cob.getValue()!=null && cb.getValue()!=null)
                    	{
	                    	sta.close();
	                    	Stage joueur = new Stage();
	                    	joueur.setTitle("Paramètre Joueur(s)");
	                        Group groupJ= new Group();
	                        Scene sceneJ= new Scene(groupJ, 500, 300, Color.LIGHTBLUE);
	                        VBox vbvb = new VBox();
	                        //ArrayList<TextField> array = new ArrayList<TextField>();
	                        for(int i = 0;i<Integer.parseInt((String)cb.getValue()); i++ )
	                        {
	                        	HBox hbhb = new HBox();
	                        	Label l = new Label();
	                        	l.setText("Joueur " + (1+i) + " : ");
	                        	TextField t = new TextField();
	                        	t.setText("Nom");
	                        	ObservableList<String> o = FXCollections.observableArrayList(
	                        	        "Rouge",
	                        	        "Bleu",
	                        	        "Vert",
	                        	        "Jaune"
	                        	    );
	                        	final ComboBox col = new ComboBox(o);
	                   
	                        	//array.add(t);
	                        	hbhb.getChildren().add(l);
	                        	hbhb.getChildren().add(t);
	                        	hbhb.getChildren().add(col);
	                        	vbvb.getChildren().add(hbhb);
	                        }
	                        Button butt = new Button();
	                        butt.setText("Calcul");
	                       
	                        vbvb.getChildren().add(butt);
	                        groupJ.getChildren().add(vbvb);
	                       
	                        
	                        joueur.setScene(sceneJ);
	                        joueur.show();
	                    }
                    }
                });
            }
        });
    }
}*/


import javafx.scene.control.Label;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class JFx extends Application { 
	public Partie partie = new Partie();
  
    @Override 
    public void start(Stage primaryStage) { 
        final GridPane grid = new GridPane(); 

        ArrayList<ImageView> iw = new ArrayList<ImageView>();
	    ArrayList<ImageViewBis> vid = new ArrayList<ImageViewBis>();
	    ArrayList<Carte> carvid = new ArrayList<Carte>();
	       
    	int x= -1;
    	int j=-1;
    	for(int i = 0; i<72;i++)
    	{
    		for(int y=0; y<72;y++)
    		{
    			if(partie.plat.plat[i][y]!=null)
    			{
    				x+=1;
			    	iw.add(new ImageView());
			        iw.get(x).setImage(partie.plat.plat[i][y].image);
			        grid.add(iw.get(x), i, y); 
			        System.out.println(x);
			        if(partie.plat.plat[i+1][y]==null) {j+=1;vid.add(new ImageViewBis(new ImageView(),i+1,y));carvid.add(new Carte((i+1),y));vid.get(j).iw.setImage(carvid.get(j).image);grid.add(vid.get(j).iw, i+1, y);}
			        if(partie.plat.plat[i-1][y]==null) {j+=1;vid.add(new ImageViewBis(new ImageView(),i-1,y));carvid.add(new Carte((i-1),y));vid.get(j).iw.setImage(carvid.get(j).image);grid.add(vid.get(j).iw, i-1, y);}
			        if(partie.plat.plat[i][y+1]==null) {j+=1;vid.add(new ImageViewBis(new ImageView(),i,y+1));carvid.add(new Carte(i,(y+1)));vid.get(j).iw.setImage(carvid.get(j).image);grid.add(vid.get(j).iw, i, y+1);}
			        if(partie.plat.plat[i][y-1]==null) {j+=1;vid.add(new ImageViewBis(new ImageView(),i,y-1));carvid.add(new Carte(i,(y-1)));vid.get(j).iw.setImage(carvid.get(j).image);grid.add(vid.get(j).iw, i, y-1);}

    			}
    			
    		}
	    }



    	for(ImageViewBis img:vid)
    	{
    		img.iw.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
	
	            public void handle(ActionEvent event) {
	            	partie.plat.ajouter(partie.joue.carte, img.x, img.y);
	            }
	        });
    	}
        grid.setGridLinesVisible(false);
        
        // 
        grid.getColumnConstraints().setAll( 
                new ColumnConstraints(75, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE),  
                new ColumnConstraints(75, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE)); 
        grid.getColumnConstraints().get(0).setHgrow(Priority.ALWAYS); 
        grid.getColumnConstraints().get(1).setHgrow(Priority.ALWAYS); 
        // 
        grid.getRowConstraints().setAll( 
                new RowConstraints(25, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE),  
                new RowConstraints(25, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE),  
                new RowConstraints(25, Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE)); 
        grid.getRowConstraints().get(0).setVgrow(Priority.NEVER); 
        grid.getRowConstraints().get(1).setVgrow(Priority.NEVER); 
        grid.getRowConstraints().get(2).setVgrow(Priority.ALWAYS);
        
        
    	Group root= new Group();
        HBox hb = new HBox();

        hb.setTranslateX(10);
        hb.setTranslateY(500);
        
        
        Carte c = partie.joue.carte;
        VBox vb = new VBox();
        ImageView carte = new ImageView();
        carte.setImage(c.image);
        carte.setTranslateX(30);
        carte.setTranslateY(480);
        Button buttt = new Button();
        buttt.setText("Rotate right");
                buttt.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
            	 c.tournerHoraire();
            	 carte.setRotate(c.deg);    
            }
        });
        
        Button butttt = new Button();
        butttt.setText("Rotate left");
        butttt.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
            	c.tournerAntiHoraire();
            	 carte.setRotate(c.deg);    
            }
        });

        
        
        hb.getChildren().setAll(buttt,butttt);
        vb.getChildren().setAll(carte,hb);
        
        // 
        root.getChildren().setAll(vb,grid); 
        Scene scene = new Scene(root, 1000, 650, Color.LIGHTBLUE); 
        primaryStage.setTitle("Carcassonne"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    } 
  
    public static void main(String[] args) { 
        launch(args); 
    } 
}    
