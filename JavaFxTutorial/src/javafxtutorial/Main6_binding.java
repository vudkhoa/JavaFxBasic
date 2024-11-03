package javafxtutorial;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Main6_binding {
    public static void main(String[] args) { 
        IntegerProperty a = new SimpleIntegerProperty(4);
        IntegerProperty b = new SimpleIntegerProperty();
        
        // Ràng buộc b = a 
        b.bind(a.add(3));
        
        a.setValue(12);
        System.out.println(b.getValue());
        
        a.setValue(20);
        System.out.println(b.getValue());
    }
}