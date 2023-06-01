/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.espol.edu.taller1;

import com.espol.edu.model.TravelPackage;

/**
 *
 * @author johanjairgilcesreyes
 */
public class Taller1 {

    public static void main(String[] args) {
        double totalCost=TravelPackage.generateQuotePackage();
        System.out.println("The total cost of your travel its: ");
        System.out.println(totalCost);
    }
}
    