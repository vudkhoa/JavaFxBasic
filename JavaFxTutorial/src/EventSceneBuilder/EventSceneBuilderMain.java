package EventSceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Admin
 */
public class EventSceneBuilderMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("eventSceneBuilder.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        }
        catch (Exception e) {
            System.out.println("Not found!");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
