/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mattresscompanysalesexam;

/**
 *
 * @author Student
 */
public interface IProducts {
    int GetTotalProductsSold(int [][] productSales);
    double GetAverageProductsSold( int [] productSales);
    String GetMostPopularProduct( int []productSales);
}
