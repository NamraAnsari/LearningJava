/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Calculator using conditional statements
 * @author Namra Ansari
 */
public class DoWhileCalc {
    
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice, a = 0, b = 0;
        do{
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit\nEnter Choice (1-5) :");
            choice = Integer.parseInt(br.readLine());
            if(choice > 0 && choice <5){
                System.out.println("Enter 2 numbers :");
                a = Integer.parseInt(br.readLine());
                b = Integer.parseInt(br.readLine());
            }
            switch(choice){
                case 1: System.out.println("Result: "+(a+b)); break;
                case 2: System.out.println("Result: "+(a-b)); break;
                case 3: System.out.println("Result: "+(a*b)); break;
                case 4: System.out.println("Result: "+(a/b)); break;
                case 5: break;
                default: System.out.println("Invalid Choice..."); break;
            }
        }while(choice < 5);
        System.out.println("Bye...");
    }
}
