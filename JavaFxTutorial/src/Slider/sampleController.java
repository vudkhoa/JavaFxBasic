/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Slider;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class sampleController implements Initializable {
    @FXML
    Slider slider;
    @FXML
    TextField textField;
    static final double INIT_VALUE = 50;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO 
        slider.setValue(50);
        textField.setText(String.valueOf(INIT_VALUE));
        slider.setMax(100);
        textField.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
    }    
    
}
