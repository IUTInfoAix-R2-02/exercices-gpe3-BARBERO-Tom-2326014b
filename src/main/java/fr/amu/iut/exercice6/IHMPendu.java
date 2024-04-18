package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class IHMPendu extends Application {


    private int tentativesRestantes;
    Label tentativesRestes;
    private Button devinerButton = new Button("Devinez");

    ImageView imageView;

    private void updateTentativesLabel(Label tentativesRestes) {
        tentativesRestes.setText("Tentatives restantes : " + tentativesRestantes);
    }



    public String fctMot(Dico dico,char car, String mot, String motcache, Label lab ){
            if(dico.getPositions(car, mot).isEmpty()){
                return motcache;
            }
            else{
                String nvMot="";
                ArrayList<Integer> ind=dico.getPositions(car, mot);
                for(int i=0;i< ind.size();i+=1){
                    int indice = ind.get(i);
                    for(int it=0;it< ind.size();it+=1) {
                        nvMot = motcache.substring(0, indice) + car + motcache.substring(indice + 1, motcache.length());
                        motcache=nvMot;
                    }

                }
                lab.setText(nvMot);
                return nvMot;
            }
        }


    Dico dico = new Dico();
    String motChoisi=dico.getMot();
    Text mot = new Text(motChoisi);
    TextField champt = new TextField();

    String motCache="";
    Label motCa = new Label(motCache);
    Button button = new Button();
    Button buttona = new Button("a");
    Button buttonb = new Button("b");
    Button buttonc = new Button("c");
    Button buttond = new Button("d");
    Button buttone = new Button("e");
    Button buttonf = new Button("f");
    Button buttong = new Button("g");
    Button buttonh = new Button("h");
    Button buttoni = new Button("i");
    Button buttonj = new Button("j");
    Button buttonk = new Button("k");
    Button buttonl = new Button("l");
    Button buttonm = new Button("m");
    Button buttonn = new Button("n");
    Button buttono = new Button("o");
    Button buttonp = new Button("p");
    Button buttonq = new Button("q");
    Button buttonr = new Button("r");
    Button buttons = new Button("s");
    Button buttont = new Button("t");
    Button buttonu = new Button("u");
    Button buttonv = new Button("v");
    Button buttonw = new Button("w");
    Button buttonx = new Button("x");
    Button buttony = new Button("y");
    Button buttonz = new Button("z");

    EventHandler v =  actionEvent -> {
        Button b = (Button) actionEvent.getSource();
        String nom=b.getText();
        char let=nom.charAt(0);

        motCache=fctMot(dico,let,motChoisi,motCache,motCa);
        if(dico.getPositions(let, motChoisi).isEmpty()){
            System.out.println("raté");
        }
        else{
            System.out.println("Bon");
        }
    };
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane=new Pane();
        pane.setStyle("-fx-background-color: #AFEEEE;");

        mot.relocate(220,250);


        champt.relocate(160,400);

        for(int i=0; i<motChoisi.length(); i+=1) {
            motCache+="_";
        }


        System.out.println(motChoisi);

        motCa.relocate(200,250);

        button.relocate(100,100);


        buttona.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonb.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonc.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttond.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttone.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonf.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttong.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonh.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttoni.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonj.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonk.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonl.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonm.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttono.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonp.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonq.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonr.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttons.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttont.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonu.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonv.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonw.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonx.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttony.addEventHandler(MouseEvent.MOUSE_CLICKED,v);
        buttonz.addEventHandler(MouseEvent.MOUSE_CLICKED,v);

        HBox touche = new HBox();
        touche.getChildren().addAll(buttona,buttonb,buttonc,buttond,buttone,buttonf,buttong,buttonh,buttoni,buttonj,buttonk,buttonl,buttonm,buttonn,buttono,buttonp,buttonq,buttonr,buttons,buttont,buttonu,buttonv,buttonw,buttonx,buttony,buttonz);

            System.out.println(motCache);
            motCa.setText(motCache);







        pane.getChildren().add(button);
        pane.getChildren().add(motCa);
        pane.getChildren().add(champt);
        pane.getChildren().add(touche);


        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Jeu du pendu");
        primaryStage.setWidth(500);
        primaryStage.setHeight(550);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
