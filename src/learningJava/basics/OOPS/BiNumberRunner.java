/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.OOPS;

/**
 * Demonstrate OOPS (constructor & methods)
 * @author Namra Ansari
 */
public class BiNumberRunner {
    
    public static void main(String args[]){
        
        BiNumber binumber = new BiNumber(2,3);
        System.out.println(binumber.add());
        System.out.println(binumber.multiply());
        binumber.doubLe();
        System.out.println(binumber.getNumber_1());
        System.out.println(binumber.getNumber_2());
        
    }
}
