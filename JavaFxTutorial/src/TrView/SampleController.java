/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package TrView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class SampleController implements Initializable {

    @FXML
    private TreeView<String> treeView;  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Tạo các node cho TreeView
        TreeItem<String> root = new TreeItem<>("Root");
        TreeItem<String> JavaFxTutorial = new TreeItem<>("JavaFxTutorial");
        TreeItem<String> Source_Packages = new TreeItem<>("Source Packages");
        TreeItem<String> EventSceneBuilder = new TreeItem<>("EventSceneBuilder");
        TreeItem<String> TView = new TreeItem<>("TreeView");
        TreeItem<String> connectSceneBuilder = new TreeItem<>("connectSceneBuilder");
        TreeItem<String> css_format = new TreeItem<>("css_format");
        TreeItem<String> javafxtutorial = new TreeItem<>("javafxtutorial");
        TreeItem<String> SampleController = new TreeItem<>("SampleController.java");
        TreeItem<String> sample_css = new TreeItem<>("sample.css");
        TreeItem<String> sample_fxml = new TreeItem<>("sample.fxml");
        
        // Thêm các node con vào các node cha
        TView.getChildren().addAll(SampleController, sample_css, sample_fxml);
        Source_Packages.getChildren().addAll(EventSceneBuilder, TView, connectSceneBuilder, css_format, javafxtutorial);
        JavaFxTutorial.getChildren().add(Source_Packages);
        root.getChildren().add(JavaFxTutorial);
        
        // Thiết lập root cho TreeView và mở rộng root
        treeView.setRoot(root);
        root.setExpanded(true);
    
        treeView.setShowRoot(false);
        
        // Thêm listener để in ra tên node được chọn
        treeView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                System.out.println(newValue.getValue());
            }
        });
    }
}
