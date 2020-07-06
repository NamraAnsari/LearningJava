/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demonstrate do-while loop
 * @author Namra Ansari
 */
public class Cube {
    
    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = -1;
        do{
            if(num > 0){
                System.out.println("Cube is =  "+(num*num*num));
            }
            System.out.println("Enter Number:  ");
            num = Integer.parseInt(br.readLine());
        }while(num > 0);
        System.out.println("Bye...");
    }
}
