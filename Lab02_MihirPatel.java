/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

import java.awt.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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
        primaryStage.setTitle("Java Games");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 250, 300);
        
        StackPane middle = new StackPane();
        Label top = new Label("Random Game");
        Label bottom = new Label("Waiting..");
        Label lblimage = new Label();
        
        root.setTop(top);
        root.setBottom(bottom);
        middle.getChildren().add(lblimage);
        root.setCenter(middle);
        
        primaryStage.setScene(scene);
        primaryStage.show();   
    }  
}
