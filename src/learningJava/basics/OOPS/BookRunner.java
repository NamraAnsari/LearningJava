/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.OOPS;

/**
 * Demonstrate basic OOPS (state & behavior)
 * @author Namra Ansari
 */
public class BookRunner {
    
    public static void main(String[] args){
        
        Book artOfComputerProgramming = new Book(100);
        Book effectiveJava = new Book(500);
        Book cleanCode = new Book();
        
        //assigning different values to instance variable for different instances
//        artOfComputerProgramming.noOfCopies = 100;
//        effectiveJava.noOfCopies = 500;
//        cleanCode.noOfCopies = 800;
        
//        artOfComputerProgramming.setNoOfCopies(100);
//        effectiveJava.setNoOfCopies(500);
//        cleanCode.setNoOfCopies(800);
        
        System.out.println("Art Of Programming - "+artOfComputerProgramming.getNoOfCopies());
        System.out.println("Effective Java - "+effectiveJava.getNoOfCopies());
        System.out.println("Clean Code - "+cleanCode.getNoOfCopies());
        
        artOfComputerProgramming.increaseNoOfCopies(20);
        effectiveJava.decreaseNoOfCopies(200);
        
        System.out.println("Art Of Programming - "+artOfComputerProgramming.getNoOfCopies());
        System.out.println("Effective Java - "+effectiveJava.getNoOfCopies());
    }
}
