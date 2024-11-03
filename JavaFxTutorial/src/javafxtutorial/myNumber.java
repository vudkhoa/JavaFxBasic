/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxtutorial;


import javafx.beans.property.*;
public class myNumber {
    private DoubleProperty number = new SimpleDoubleProperty();

    public double getNumber() {
        return number.get();
    }
    
    public DoubleProperty numberProperty(){
        return number;
    }
    
    public void setNumber(double number){
        this.number.set(number);
    }
}
