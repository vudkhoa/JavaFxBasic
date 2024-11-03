/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxtutorial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Main1 extends Application {
    Stage window;
    Scene scene1, scene2;
    public static void main(String[] args) {
        launch(args);
    }
    @Override 
    public void start(Stage primaryStage) {
        window = primaryStage;
        // Scene1
        Label label = new Label("Welcom to JavaFX");
        Button button1 = new Button("Go to course 1");
        button1.setOnAction(event -> {
            window.setScene(scene2);
        });
        // VBox sắp xếp từ trên xuống
        VBox layout1 = new VBox();
        layout1.getChildren().addAll(label, button1);
        scene1 = new Scene(layout1, 300, 200);
        
        // Scene2
        Button button2 = new Button("Go back");
        button2.setOnAction(event -> {
            window.setScene(scene1);
        });
        // StackPane chồng
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 200, 300);
        
        window.setScene(scene1);
        window.show();
    }
}
