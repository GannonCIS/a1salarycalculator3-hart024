/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author seanh
 */
public class SalaryCalculator {
    int yearlyHours = (52*40);
    
   public double calcHourlyWage(int salary){
       double hourlyWage = (salary/yearlyHours);
       return hourlyWage;
   }
   
   public double calcSalary(int hourlyRate){
       double salary = (hourlyRate*yearlyHours);
       return salary;
   }
   
   public double calcTaxes(double perc, int salary){
       double taxAmount = (.01)*(perc) * salary;
       return taxAmount; 
   }

   public double monthlyAfterTax(double perc, int salary){
       double monthlyIncome = (salary/12);
       System.out.println(monthlyIncome);
       double monthlyAfterTax = (monthlyIncome - (.01*perc*monthlyIncome));
       return monthlyAfterTax;
   }
   
}
