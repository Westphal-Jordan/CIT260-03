/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package galtolit;
  /*
     Try This 1 - 1
   
     This program converts gallons to liters.
   
     Call this program GalToLit.java
  */
public class GalToLit {
   public static void main(String[] args) {
      double gallons; // holds the number of gallons
      double liters; // holds conversions to liters
      
      gallons = 10; // start with 10 gallons 
      liters = gallons * 3.7854; // convert to liters
      
      System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
