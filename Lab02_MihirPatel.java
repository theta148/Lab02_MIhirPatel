/*
 * Click https://github.com/theta148/Lab02_MIhirPatel
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.image.*;
import java.util.Random;         
/**
 *
 * @author 6316704
 */
public class Lab02_MihirPatel extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        Random random = new Random();
        int min = 101;
        int max = 120;
        
        int num = random.nextInt(min, max + 1);
        
        primaryStage.setTitle("Java Games");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 250, 300);
        
        StackPane middle = new StackPane();
        Label top = new Label("Random Game");
        Label bottom = new Label("Waiting..");
        Label lblimage = new Label();
        
        Image img = new Image("file:images/" + num + ".jpg");
        
        lblimage.setGraphic(new ImageView(img));
        
        root.setTop(top);
        root.setBottom(bottom);
        middle.getChildren().add(lblimage);
        root.setCenter(middle);
        
        primaryStage.setScene(scene);
        primaryStage.show();   
    }  
}
