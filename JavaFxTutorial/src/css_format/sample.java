/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package css_format;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class sample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         try {
            Parent root = FXMLLoader.load(this.getClass().getResource("sample.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("sample.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Bắt và in ra lỗi nếu không tải được FXML
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
