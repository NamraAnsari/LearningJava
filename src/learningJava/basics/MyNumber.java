/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

/**
 *
 * @author Namra Ansari
 */
public class MyNumber {
    
    private int number;

    MyNumber(int number) {
        this.number = number;
    }

    boolean isPrime() {
        if(this.number == 2)
            return true;
        else
            for(int i=2; i <= this.number/2; i++){
                if(this.number%i == 0){
                   return false;
                }
            }
        return true;
    }

    int sumUptoN() {
        int sum = 0;
        for(int i=1; i <= this.number; i++){
            sum += i;
        }
        return sum;
    }

    int sumOfDivisors() {
        int divisor = 0;
        for(int i = 1; i <= this.number; i++){
            if(this.number%i == 0){
                divisor += i;
            }
        }
        return divisor;
    }

    void printANumberTriangle() {
        for(int i = 1; i <= this.number; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
