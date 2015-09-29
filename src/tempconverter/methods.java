
package tempconverter;

import java.util.Scanner;


public class methods {
    
    double fahrenheit,
           celsius;
    int choice;
    
    //scanner package to get user input
    Scanner input = new Scanner(System.in);
    
    public void displayMessage(){
    System.out.println("Press 1 to convert Fahrenheit to Celsius,"
            + "or press 2 to convert Celsius to Fahrenheit");
    }
     
    public void setChoice(){
      choice = input.nextInt();  
    }
    
     public int getChoice(){
         return choice;
     }
     
     public void setUserTemp(){
         switch (choice){
             case 1: System.out.println("Enter the temperature in fahrenheit");
             fahrenheit = input.nextDouble();
             break;
             case 2: System.out.println("Enter the temperature in celsius");
             celsius = input.nextDouble();
             break;
         }
       
     } 
    public void conversion(){
        
      switch (choice){
          case 1: celsius = (fahrenheit-32)*5/9;
              System.out.println("The temperature in celsius is " +celsius);
              break;
          case 2: fahrenheit = (celsius*1.8)+32;
              System.out.println("The temperature in fahrenheit is "+fahrenheit);
              break;
         
      }
 }
}
