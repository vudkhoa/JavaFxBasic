package ComboBox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class SampleController implements Initializable {
    @FXML
    public ComboBox<String> comboBox;
    
    @FXML
    public Label label;
          
    
    ObservableList<String> list = FXCollections.observableArrayList("Java", "C#", "Python");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        comboBox.setItems(list);
    }    
    
    public void comboBoxChanged(ActionEvent e) { 
        label.setText(comboBox.getValue());
    }
    
}
