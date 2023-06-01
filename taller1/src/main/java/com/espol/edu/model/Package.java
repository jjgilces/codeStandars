/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.edu.model;

import java.util.ArrayList;

/**
 *
 * @author johanjairgilcesreyes
 */
public class Package {

    double baseCost = 1000;
    Destination destination;
    ArrayList<String> travelers;
    int duration;
    double totalCost;

    public Package(Destination destination, ArrayList<String> travelers) {
        this.destination = destination;
        if(travelers.size()>80)            
            throw new IllegalArgumentException("Se ha excedido el límite máximo de personas por paquete.");
        this.travelers = travelers;
        this.totalCost += baseCost;
    }

    public double getTotalCost() {
        totalCost += destination.getCost();
        int qTraveleres = travelers.size();
        if (qTraveleres > 4 && qTraveleres < 10) {
            totalCost = totalCost * 0.9;
        } else if (qTraveleres >= 10) {
            totalCost = totalCost * 0.8;
        }
        if(duration<7) totalCost+=200;
        if(duration>30 && qTraveleres==2)totalCost-=200;
        return totalCost;

    }
}
