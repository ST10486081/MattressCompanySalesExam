/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresscompanysalesexam;

/**
 *
 * @author Student
 */
public class Product {
    private String[] productNames;
    private int[] salesData;

    public Product(String[] productNames, int[] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
    }

    public int getTotalProductsSold() {
        int total = 0;
        for (int sales : salesData) {
            total += sales;
        }
        return total;
    }

    public double getAverageProductsSold() {
        if (salesData.length == 0) return 0.0;
        return (double) getTotalProductsSold() / salesData.length;
    }

    public String getMostPopularProduct() {
        if (salesData.length == 0) return "";
        int maxIndex = 0;
        for (int i = 1; i < salesData.length; i++) {
            if (salesData[i] > salesData[maxIndex]) {
                maxIndex = i;
            }
        }
        return productNames[maxIndex];
    }
}

    
   
    