/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxtutorial;

public class Main5_property {
    public static void main(String[] args) {
        myNumber example = new myNumber();
        example.numberProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(observable);
            System.out.println(oldValue);
            System.out.println(newValue);
        }); 
        
        // Mỗi lần thay đổi là 1 lần thực hiện event
        example.setNumber(100);
        example.setNumber(10);
    }
}