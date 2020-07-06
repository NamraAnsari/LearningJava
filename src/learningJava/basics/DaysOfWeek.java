/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

/**
 * Variations in for-loop
 * @author Namra Ansari
 */
public class DaysOfWeek {
    
    public static void main(String args[]){
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int longest = 0;
        for(String d:days){
            for(String day:days){
                if(day.length() > longest){
                    longest = day.length();
                }
            }
            if(d.length() == longest){
                System.out.println("Longest day of the week :  "+d);
//                break;
            }
        }
        
        System.out.println("Days of the Week in reverse is :");
        for(int i = days.length -1; i >= 0; i--){
            System.out.println(days[i]);
        }
    }
}
