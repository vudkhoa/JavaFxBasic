/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxtutorial;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Main extends Application{
    Button button;
    public static void main(String[] args){
        launch(args);
    }
       
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");
        // Button
        button = new Button();
        button.setText("Say Hello World");
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("I am Java");
            }
        });    
        // Stack Pane -> Xếp chồng lên nhau
        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }  
}
