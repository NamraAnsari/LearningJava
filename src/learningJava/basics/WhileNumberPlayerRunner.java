/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

/**
 * Demonstrate while-loops
 * @author Namra Ansari
 */
public class WhileNumberPlayerRunner {
    
    public static void main(String args[]){
        
        WhileNumberPlayer wnp = new WhileNumberPlayer(10);
        wnp.printSquaresUptoLimit();
        wnp.printCubesUptoLimit();
    }
}
