/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxtutorial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Main4_CheckBox extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Programing Languge");
        CheckBox box1 = new CheckBox("Java");
        CheckBox box2 = new CheckBox("Python");
        CheckBox box3 = new CheckBox("C#");
        box1.setSelected(true);
        Button button = new Button("Submit");
        button.setOnAction(e -> {
            String message = "Your languge: ";
            if (box1.isSelected())
                message += box1.getText();
            else if (box2.isSelected()) 
                message += box2.getText();
            else 
                message += box3.getText();
            System.out.println(message);
        });
        
        HBox layoutH = new HBox(10);
        layoutH.getChildren().addAll(box1, box2, box3);
        VBox layoutV = new VBox(10);
        layoutV.getChildren().addAll(label, layoutH, button);
        Scene scene = new Scene(layoutV, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
