/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

/**
 * if-else & for-loop
 * @author Namra Ansari
 */
public class MyNumberRunner {
    
    public static void main(String args[]){
        MyNumber myNumber = new MyNumber(6);
        System.out.println("Number is Prime?  "+myNumber.isPrime());
        System.out.println("Sum of Numbers upto N =  "+myNumber.sumUptoN());
        System.out.println("Sum of Divisors =  "+myNumber.sumOfDivisors());
        myNumber.printANumberTriangle();
    }
}
