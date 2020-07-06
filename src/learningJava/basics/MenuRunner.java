/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

import java.util.Scanner;

/**
 * nested if-else vs switch-case
 * @author Namra Ansari
 */
public class MenuRunner {
    
    public static void main(String args[]){
        
        int number1;
        int number2;
        int operation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1:  ");
        number1 = scanner.nextInt();
        System.out.print("Enter Number 2:  ");
        number2 = scanner.nextInt();
        System.out.print("1. Add\n2. Subtract\n3. Multiply\n4. Divide\nEnter Operation:  ");
        operation = scanner.nextInt();
        System.out.println("Number 1: "+number1+"\nNumber 2: "+number2+"\nOperation: "+operation);
        System.out.println("Doing operaion using nested If-Else:");
        operationUsingNestedIfElse(number1, number2, operation);
        System.out.println("Doing operaion using Switch-Case:");
        operationUsingSwitch(number1, number2, operation);
    }
        
    private static void operationUsingNestedIfElse(int number1, int number2, int operation){
        if(operation == 1){
            System.out.println("Addition:  "+(number1 + number2));
        } else if(operation == 2){
            System.out.println("Subtraction:  "+(number1 - number2));
        } else if(operation == 3){
            System.out.println("Product:  "+(number1 * number2));
        } else if(operation == 4){
            System.out.println("Division:  "+(number1 / number2));
        }else{
            System.out.println("Wrong operation entered...");
        }
    }

    private static void operationUsingSwitch(int number1, int number2, int operation) {
        switch(operation){
            case 1: 
                System.out.println("Result:  "+(number1 + number2));
                break;
            case 2: 
                System.out.println("Result:  "+(number1 - number2));
                break;
            case 3: 
                System.out.println("Result:  "+(number1 * number2));
                break;
            case 4: 
                System.out.println("Result:  "+(number1 / number2));
                break;
            default:
                System.out.println("Wrong operation entered...");
                break;
        }
    }
}
