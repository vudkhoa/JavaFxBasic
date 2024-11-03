/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package menu;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class SampleController {
    public void action(ActionEvent event) { 
        // Dừng Javafx
        Platform.exit();
        // Java Virtual Machine
        System.exit(0);
    }
}
