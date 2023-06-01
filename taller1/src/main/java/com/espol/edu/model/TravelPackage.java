package com.espol.edu.model;


import java.util.Scanner;
/**
 *
 * @author johanjairgilcesreyes
 */
public class TravelPackage {

    private static double baseCost = 1000;
    public static Scanner sc = new Scanner(System.in);  
    private Destination destination;
    private int numberOfTravelers;
    int duration;
    double totalCost;

   
    public TravelPackage (Destination d, int numDays, int numTraveles) {
    	destination=d;
    	numberOfTravelers=numTraveles;
    	if(numDays>80) throw new IllegalArgumentException();
    	duration= numDays;
    	totalCost+=baseCost;
    }
    public double getTotalCost() {
        totalCost += destination.getCost();

        if (numberOfTravelers > 4 && numberOfTravelers < 10) {
            totalCost = totalCost * 0.9;
        } else if (numberOfTravelers >= 10) {
            totalCost = totalCost * 0.8;
        }
        if(duration<7) totalCost+=200;
        if(duration>30 && numberOfTravelers==2)totalCost-=200;
        return totalCost;

    }
    
    public static double generateQuotePackage() {
    	System.out.println("Welcome to ECUDREAMS:");
    	System.out.println("To quote your vacations, please provide the follow information:");
    	System.out.println("Enter your destination:");
    	String destination = sc.nextLine();
    	Destination  destin = new Destination(destination);
    	System.out.println("Enter the number of the days:");
    	int numOfDays = sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter the number of the travelers:");
    	int numOfTravelers = sc.nextInt();
    	sc.nextLine();
        try{
            TravelPackage quote = new TravelPackage(destin, numOfDays, numOfTravelers);
            return quote.getTotalCost();
        }catch(IllegalArgumentException ex){
            System.err.println("We could not create your package of vacations");
            return -1;
        }
    	

    }
}
