/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxtutorial;

import java.util.Optional;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Main2 extends Application {
    Button button;
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Alert Example");
        button = new Button();
        button.setText("Close");
        button.setOnAction(e -> {
            // Alert hộp thoại
            // INFORMATION: thông bao đơn giản
            // WARNING: Cảnh báo
            // CONFIRMATION: Yêu cầu xác nhận 
            // ERROR: Báo lỗi
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Alert Information");
            alert.setContentText("choose your option");
            
            ButtonType buttonTypeYes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
            ButtonType buttonTypeNo = new ButtonType("No", ButtonBar.ButtonData.NO);
            ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
            
            // Set các nút, nếu không: -> Ok, Cancel
            alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo, buttonTypeCancel);
            
            // Hiển thị hộp thoại and đợi ng dùng nhấp vào 
            Optional<ButtonType> result = alert.showAndWait();
            
            if (result.get() == buttonTypeYes)
                System.out.println("Code for yes");
            else if (result.get().getButtonData() == ButtonBar.ButtonData.NO) 
                System.out.println("Code for no");
            else 
                System.out.println("Code for cancel");
            
            String message = result.get().getText();
            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("Notification");
            alert1.setContentText(message);
            alert1.show();
            
        });
        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
