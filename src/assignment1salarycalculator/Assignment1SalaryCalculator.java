/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author gubotdev
 */
public class Assignment1SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator();
        sc.monthlyAfterTax(37.59, 145000);
        sc.calcHourlyWage(420069);
    }
}
