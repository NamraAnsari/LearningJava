/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

/**
 * Iterating String
 * @author Namra Ansari
 */
public class CountZero {
    
    public static void main(String args[]){
        
        System.out.println("Total zero in the given stream is:  "+count0("0001001111000011111110"));
        printEachCharacter("This is sample sentence");
    }
    public static int count0(String stream){
        int count = 0;
        for(int i = 0; i < stream.length(); i++){
            Character ch = Character.valueOf(stream.charAt(i));
            if(ch.equals('0')){
                count++;
            }
        }
        return count;
    }
    public static void printEachCharacter(String sentence){
        for(int i = 0; i < sentence.length(); i++){
            System.out.println(sentence.charAt(i));
        }
    }
}
