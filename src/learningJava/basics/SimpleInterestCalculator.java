/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

import java.math.BigDecimal;

/**
 *
 * @author Namra Ansari
 */
public class SimpleInterestCalculator {
    
    private BigDecimal principal;
    private BigDecimal interest;
    
    SimpleInterestCalculator(String principal, String interest){
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal("100"));
    }
    
    BigDecimal calculateTotalValue(int noOfYears){
        BigDecimal totalValue = this.principal.add(this.principal
                .multiply(this.interest)
                .multiply(new BigDecimal(noOfYears)));
        return totalValue;
    }
}
