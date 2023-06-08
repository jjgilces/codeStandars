package com.espol.edu.taller1;
import com.espol.edu.model.TravelPackage;

/**
 *
 * @author johanjairgilcesreyes
 */

public final class Taller1 {

    private Taller1() {
        // Private constructor to prevent instantiation
    }

    /**
     * Calculates the total cost of a travel package.
     *
     * @return the total cost of the travel package
     */
    public static double calculateTotalCost() {
        return TravelPackage.generateQuotePackage();
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        final double totalCost = calculateTotalCost();
        System.out.println("The total cost of your travel is: ");
        System.out.println(totalCost);
    }
}
