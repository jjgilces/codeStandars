package com.espol.edu.model;

/**
 *
 * @author johanjairgilcesreyes
 */
public class Destination {
	//variables of instance 
    private String name;// name of the destination
    private double cost;

    public Destination(String name) {
        this.name = name;
        if(name.equals("Paris")) cost=500;
        else if(name.equals("New York City")) cost=600;
        cost = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public boolean itsPopular(){
        return name.equals("Paris")|| name.equals("New York City");
    }
}
