package com.espol.edu.model;


import java.util.Scanner;
/**
 *
 * @author johanjairgilcesreyes
 */
public final class TravelPackage {
/**
* The attributes of the class are declared.
*/
    private static double baseCost = 1000;
    /**
    * A variable is declared to receive data by console.
    */
    private static Scanner sc = new Scanner(System.in);
    /**
    * Destination type attribute is declared.
    */

    private Destination destination;
    /**
    * Attribute is declared to define the number of Travelers.
    */

    private int numberOfTravelers;
    /**
    * Attribute is declared to define the travel duration.
    */

    private int duration;
    /**
    * Attribute is declared to define the total cost.
    */
    private double totalCost;
    /**
     * Attribute is declared to define the duration of 7 days.
     */
    private int maxDuration = 7;
    /**
     * Part one of message to generate a Package.
     */
    private static String message1 = "To quote your vacations";
    /**
     * Part two of message to generate a Package.
     */
    private static String message2 = ", please provide the follow information:";
    /**
     * Full message to generate a Package.
     */
    private static String finalMessage = message1 + message2;
    /**
     * TravelPackage constructor.
     */
    private TravelPackage(final Destination d,final int numDays,final int numTraveles){
    	destination = d;
    	numberOfTravelers = numTraveles;
    	if (numDays > 80){
    		throw new IllegalArgumentException();
    	}
    	duration =  numDays;
    	totalCost += baseCost;
    }
    /**
     * @return double
     * Method to get the total cost.
     */
    public double getTotalCost() {
        totalCost += destination.getCost();

        if (numberOfTravelers > 4 && numberOfTravelers < 10) {
            totalCost = totalCost * 0.9;
        } else if (numberOfTravelers >= 10) {
            totalCost = totalCost * 0.8;
        }
        if (duration < maxDuration) {
        	totalCost += 200;
        	}
        if(duration > 30 && numberOfTravelers == 2) {
        	totalCost -= 200;
        }
        return totalCost;

    }
    /**
     * @return double
     * Method to generate a qoute package.
     */
    public static double generateQuotePackage() {
    	System.out.println("Welcome to ECUDREAMS:");
    	System.out.println(finalMessage);
    	System.out.println("Enter your destination:");
    	String destination = sc.nextLine();
    	Destination  destin = new Destination(destination);
    	System.out.println("Enter the number of the days:");
    	int numOfDays = sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter the number of the travelers:");
    	int numOfTravelers = sc.nextInt();
    	sc.nextLine();
        try {
            TravelPackage quote = new TravelPackage(destin, numOfDays, numOfTravelers);
            return quote.getTotalCost();
        } catch (IllegalArgumentException ex) {
            System.err.println("We could not create your package of vacations");
            return -1;
        }


    }
}
