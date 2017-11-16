/* Name:        Edwin Maldonado
 * Date:        11/15/2017
 * Chapter:     5
 * Challenge:   13
 * Page:        347-348
 * Purpose:     A celcius and fahrenheit table
 */
package degreetable;

import java.util.Scanner;

public class DegreeTable {

   
    public static void main(String[] args) {
        // Variables
        Scanner keyboard = new Scanner(System.in);
        double fTemp;
        double valueLow;
        double valueUp;
        
        // Get input from the user
        System.out.print("Enter a lower value: ");
        valueLow = keyboard.nextDouble();
        System.out.print("Enter a upper value: ");
        valueUp = keyboard.nextDouble();
        
        // Validation to make sure the high value is higher than the low
        while (valueLow >= valueUp) {
            System.out.println("Invalid. Make sure your upper value is greater "
                    + "than your lower value.");
               System.out.print("Enter a lower value: ");
                valueLow = keyboard.nextDouble();
                System.out.print("Enter a upper value: ");
                valueUp = keyboard.nextDouble();
        }
        
        //Table
        System.out.println("Celcius      " + "Fahrenheit ");
        System.out.println("-----------------------");
        
        
        // Formula for F=(9/5*C)+32
        for (double celTemp = valueLow; celTemp <= valueUp; celTemp++) {
            fTemp = ((9/5) * celTemp) + 32;
        
            System.out.printf("%+3.2fC       " , celTemp);
            System.out.printf("%+3.2fF\n" , fTemp);
        }
    }
    
}
