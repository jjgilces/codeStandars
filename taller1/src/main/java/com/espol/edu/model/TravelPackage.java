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
    private static Scanner scanner = new Scanner(System.in);
    /**
    * Destination type attribute is declared.
    */

    public Destination destination;
    /**
    * Attribute is declared to define the number of Travelers.
    */

    public  int numberOfTravelers;
    /**
     * Attribute is declared to define vacation package..
     */

     public int packageVacation;
    /**
    * Attribute is declared to define the travel duration.
    */

    public  int duration;
    /**
    * Attribute is declared to define the total cost.
    */
    public double totalCost;
    /**
     * Attribute is declared to define the duration of 7 days.
     */
    public int maxDuration = 7;
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
    private TravelPackage(final Destination destinationValue, final int numTravelDays, final int numTraveles, final int packageOption) {
        destination = destinationValue;
        numberOfTravelers = numTraveles;
        final int maxNumDay = 80;
        if (numTravelDays > maxNumDay) {
            throw new IllegalArgumentException();
        }
        duration = numTravelDays;
        totalCost += baseCost;
        packageVacation = packageOption;
    }
    /**
     * @return double
     * Method to get the total cost.
     */
    public double getTotalCost() {
        double cost = baseCost + destination.getCost();
        final int minimumTravelers = 4;
        final int maximumTravelers = 10;
        final double discount1 = 0.9;
        final double discount2 = 0.8;
        final int maxDuration = 7;
        final double extraCost = 200;
        final double discount3 = 200;
        
        if (numberOfTravelers > minimumTravelers && numberOfTravelers < maximumTravelers) {
            cost = cost * discount1;
        } else if (numberOfTravelers >= minimumTravelers) {
            cost = cost * discount2;
        }
        
        if (duration < maxDuration) {
            cost += extraCost;
        }
        
        if (duration > 30 && numberOfTravelers == 2) {
            cost -= discount3;
        }
        
        return cost;
    }
    
  

    /**
     * @return double
     * Method to generate a qoute package.
     */
    public static double generateQuotePackage() {
    	System.out.println("Welcome to ECUDREAMS:");
    	System.out.println(finalMessage);
    	System.out.println("Enter your destination:");
    	final String destination = scanner.nextLine();
    	final Destination  destin = new Destination(destination);
    	System.out.println("Enter the number of the days:");
    	final int numOfDays = scanner.nextInt();
    	scanner.nextLine();
    	System.out.println("Enter the number of the travelers:");
    	final int numOfTravelers = scanner.nextInt();
    	scanner.nextLine();
    	System.out.println("Enter the vacation package ");
    	System.out.println("1. All-Inclusive Package - $200 per traveler");
    	System.out.println("2. Adventure Activities Package - $150 per traveler");
    	System.out.println("3. Spa and Wellness Package - $100 per traveler");
    	final int packageOption = scanner.nextInt();
    	scanner.nextLine();
    	double totalCostTravel = 0;
    	try {
            final TravelPackage quote = new TravelPackage(destin, numOfDays, numOfTravelers, packageOption);
            totalCostTravel = quote.getTotalCost();
        } catch (IllegalArgumentException ex) {
            System.err.println("We could not create your package of vacations");
        }
    	return totalCostTravel;

    }
}
