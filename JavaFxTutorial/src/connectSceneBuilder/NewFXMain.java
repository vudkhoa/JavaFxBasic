/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package connectSceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
            primaryStage.setTitle("Hello World");  // Đặt tiêu đề cho cửa sổ
            primaryStage.setScene(new Scene(root, 400, 600));  // Gán Scene với kích thước cụ thể cho Stage
            primaryStage.show();  // Hiển thị Stage
        } catch (Exception e) {
            e.printStackTrace();  // Bắt và in ra lỗi nếu không tải được FXML
        }
    }
    
    public static void main(String[] args) { 
        launch(args);
    }
}
