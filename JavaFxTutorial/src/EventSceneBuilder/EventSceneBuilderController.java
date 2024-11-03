/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package EventSceneBuilder;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class EventSceneBuilderController {   
    @FXML
    private TextField height;
    
    public void Submit(ActionEvent event) { 
        String h = height.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Chiều cao của bạn là: " + h + "cm" );
        alert.show();
    }
}
