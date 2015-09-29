/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import java.lang.reflect.Method;

/**
 *
 * @author shaun
 */
public class TempConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create the new object
        methods obj1 = new methods();
        //call the objects display method
        obj1.displayMessage();
        //call 
        obj1.setChoice();
        //get temp from user
        obj1.setUserTemp();
        //then make conversion
        obj1.conversion();
                
    }
    
}
