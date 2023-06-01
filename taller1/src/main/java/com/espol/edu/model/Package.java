package com.espol.edu.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author johanjairgilcesreyes
 */
public class Package {

    private static double baseCost = 1000;
	public static Scanner sc = new Scanner(System.in);

    Destination destination;
    private int numberOfTravelers;
    int duration;
    double totalCost;

   
    public Package (Destination d, int numDays, int numTraveles) {
    	destination=d;
    	numberOfTravelers=numTraveles;
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
    	return 1;

    }
}
