/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

import java.math.BigDecimal;

/**
 * Demonstrate BigDecimal
 * @author Namra Ansari
 */
public class SimpleInterestRunner {
    public static void main(String args[]){
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.printf("The interest is = "+totalValue).println();
    }
}
