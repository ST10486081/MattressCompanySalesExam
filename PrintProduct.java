/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresscompanysalesexam;

/**
 *
 * @author Student
 */
public class PrintProduct {
    private Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    public void printTotalProductSales() {
        System.out.println("Total Products Sold: " + product.getTotalProductsSold());
    }

    public void printAverageProductSales() {
        System.out.println("Average Products Sold: " + product.getAverageProductsSold());
    }

    public void printMostPopularProductSale() {
        System.out.println("Most Popular Product: " + product.getMostPopularProduct());
    }
}

