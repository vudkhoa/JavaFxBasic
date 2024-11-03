/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxtutorial;

import java.util.Optional;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Pair;

/**
 *
 * @author Admin
 */
public class Main3 extends Application {
    
    public static void main(String[] args) { 
        launch(args);
    }
    
    @Override 
    public void start(Stage primaryStage) {
        // Tạo hộp thoại
        Dialog<Pair<String, String>> dialog  = new Dialog<>();
        dialog.setTitle("Login Dialog");
        dialog.setHeaderText("Sign Up");
        
        ButtonType loginButtonType = new ButtonType("Login", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL); 
        
        // GridPane: Layout Container: sắp xếp dạng lứi, gồm: rows, columns
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));
        
        TextField userName = new TextField();
        // Text tự biến mất
        userName.setPromptText("Username");
        PasswordField password = new PasswordField();
        password.setPromptText("Password");
        
        // column -> row
        grid.add(new Label("Username:"), 0, 0);
        grid.add(userName, 1, 0);
        grid.add(new Label("Password:"), 0, 1);
        grid.add(password, 1, 1);
        
        Node loginButton = dialog.getDialogPane().lookupButton(loginButtonType);
        // setDisable: tắt -> gán true
        loginButton.setDisable(true);
        
        userName.textProperty().addListener((observable, oldValue, newValue) -> {
            loginButton.setDisable(newValue.trim().isEmpty());
        });
        // Thêm grid vừa tạo vào pane
        dialog.getDialogPane().setContent(grid);
        
        // Chuyển kết quả
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(userName.getText(), password.getText());
            }
            return null;
        });
        
        Optional<Pair<String, String>> result = dialog.showAndWait();
        // Chuẩn kiểu dữ liệu hiện tại
        result.ifPresent(userNamepassword -> {
            System.out.println("Username: " + userNamepassword.getKey() + " Password: " + userNamepassword.getValue());
        });
    }
}
