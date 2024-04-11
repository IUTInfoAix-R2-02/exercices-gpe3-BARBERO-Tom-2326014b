package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        BorderPane borderpane = new BorderPane();

        // Création du menubar

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3 = new Menu("Help");

        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);

        //Sous menu

        MenuItem n1 = new MenuItem("New");
        MenuItem n2 = new MenuItem("Open");
        MenuItem n3 = new MenuItem("Save");
        MenuItem n4 = new MenuItem("Close");
        MenuItem n5 = new MenuItem("Cut");
        MenuItem n6 = new MenuItem("Copy");
        MenuItem n7 = new MenuItem("Paste");

        menu1.getItems().addAll(n1,n2,n3,n4);
        menu2.getItems().addAll(n5,n6,n7);



        // Création de la ligne de séparation
        Separator sep1 = new Separator();
        sep1.setOrientation(Orientation.HORIZONTAL);

        // Création du bandeau en bas de la fenêtre
        VBox bottomControls = new VBox();


        Label bas = new Label("Ceci est un label de bas de page");

        bottomControls.getChildren().addAll(sep1,bas);
        bottomControls.setAlignment(Pos.CENTER);



        VBox v1 = new VBox(10);
        Button b1 = new Button("Bouton 1");
        Button b2 = new Button("Bouton 2");
        Button b3 = new Button("Bouton 3");
        Text but = new Text("Boutons :");
        v1.getChildren().add(but);
        v1.getChildren().add(b1);
        v1.getChildren().add(b2);
        v1.getChildren().add(b3);

        HBox gauche = new HBox();
        gauche.getChildren().add(v1);
        Separator sep2 = new Separator(Orientation.VERTICAL);
        gauche.getChildren().add(sep2);




        borderpane.setTop(menuBar);
        borderpane.setLeft(gauche);
        borderpane.setBottom(bottomControls);
        v1.setAlignment(Pos.CENTER);



        GridPane gridpane = new GridPane();
        Label label = new Label();
        Text t1= new Text("Name:");
        TextField entreT1 = new TextField();

        TextField entreT2 = new TextField();
        Text t2 = new Text("Email:");

        TextField entreT3 = new TextField();
        Text t3 = new Text("Password:");

        gridpane.add(t1,0,0);
        gridpane.add(entreT1,1,0);

        gridpane.add(t2,0,1);
        gridpane.add(entreT2,1,1);

        gridpane.add(t3,0,2);
        gridpane.add(entreT3,1,2);

        gridpane.setVgap(10);
        gridpane.setHgap(10);
        Button sub = new Button("Submit");
        Button canc = new Button("Cancel");




        HBox mid = new HBox(10);
        mid.getChildren().addAll(sub,canc);
        mid.setAlignment(Pos.CENTER);

        VBox midd = new VBox(10);
        midd.getChildren().addAll(gridpane, mid);
        midd.setAlignment(Pos.CENTER);




        gridpane.setAlignment(Pos.CENTER);

        borderpane.setCenter(midd);






        // Ajout du conteneur à la scene
        Scene scene = new Scene(borderpane );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("VBox and HBox App");

        // Affichage de la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


