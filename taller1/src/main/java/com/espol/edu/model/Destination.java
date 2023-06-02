package com.espol.edu.model;

/**
 *
 * @author johanjairgilcesreyes
 */
public class Destination {
/**
* Attribute of name.
*/
    private String name;
    /**
     * Attribute of cost.
     */
    private double cost;
    /**
     * Constructor of Destination.
     */
    public Destination(String name) {
        this.name = name;
        if (name.equals("Paris")) {
        	cost=500;
        	}
        else if(name.equals("New York City")) cost=600;
        cost = 0;
    }
    /**
     * @return
     * Method to get the Name.
     */
    public String getName() {
        return name;
    }
    /**
     * @param name
     * Method to set the Name.
     */
    public void setName(final String name){
        this.name = name;
    }
    /**
     * @return
     * Method to get the Cost.
     */
    public double getCost() {
        return cost;
    }
    /**
     * @param cost
     * Method to get the Cost.
     */
    public void setCost(final double cost) {
        this.cost = cost;
    }
    /**
     * @return boolean
     * Method to determine if it is a popular destination.
     */
    public boolean itsPopular() {
        return name.equals("Paris") || name.equals("New York City");
    }
}
