package com.espol.edu.taller1;
import com.espol.edu.model.TravelPackage;

/**
 *
 * @author johanjairgilcesreyes
 */

public class Taller1 {
/**
 * @param args
* Main method.
*/
    public static void main(final String[] args) {

        double totalCost = TravelPackage.generateQuotePackage();
        System.out.println("The total cost of your travel its: ");
        System.out.println(totalCost);
    }
}
