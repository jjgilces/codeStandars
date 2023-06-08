// Package declaration
package com.espol.edu.model;

/**
 * The Destination class represents a travel destination.
 * 
 * @author johanjairgilcesreyes
 */
public class Destination {
	/**
     * Constructor for the Destination class.
     * 
     * @param PARIS The name of the destination.
     */
	    private static final String PARIS = "Paris";
	    /**
	     * Constructor for the Destination class.
	     * 
	     * @param NEW_YORK_CITY The name of the destination.
	     */
	    private static final String NEW_YORK_CITY = "New York City";
	    /**
	     * Constructor for the Destination class.
	     * 
	     * @param name The name of the destination.
	     */
	    
	    private String name;
	    /**
	     * Constructor for the Destination class.
	     * 
	     * @param cost The name of the destination.
	     */
	    private int cost;

	    /**
	    
	     * 
	     * @function Destination
	     */
	    public Destination(String name) {
	        this.name = name;

	        // Check if the name is "Paris"
	        if (PARIS.equals(name)) {
	            cost = 500; // Set the cost to 500
	        }
	        // Check if the name is "New York City"
	        else if (NEW_YORK_CITY.equals(name)) {
	            cost = 600; // Set the cost to 600
	        }
	        // For other names, set the cost to 0
	        else {
	            cost = 0; // Set the cost to 0
	        }
	    }

	    /**
	     * Get the name of the destination.
	     * 
	     * @return The name of the destination.
	     */
	    public String getName() {
	        return name;
	    }

	    /**
	     * Set the name of the destination.
	     * 
	     * @param name The name of the destination.
	     */
	    public void setName(final String name) {
	        this.name = name;
	    }

	    /**
	     * Get the cost of the destination.
	     * 
	     * @return The cost of the destination.
	     */
	    public int getCost() {
	        return cost;
	    }
    
    /**
     * Set the cost of the destination.
     * 
     * @param cost The cost of the destination.
     */
    public void setCost(final double cost) {
        this.cost = cost;
    }
    
    /**
     * Check if the destination is popular.
     * A destination is considered popular if its name is "Paris" or "New York City".
     * 
     * @return True if the destination is popular, false otherwise.
     */
    public boolean isPopular() {
        return "Paris".equals(name) || "New York City".equals(name);
    }
    
}
