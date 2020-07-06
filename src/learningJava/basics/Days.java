/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

import java.util.Scanner;

/**
 * Demonstrate switch-case
 * @author Namra Ansari
 */
public class Days {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day (0-6):  ");
        int dayNumber = scanner.nextInt();
        System.out.print("Enter Month (1-12):  ");
        int monthNumber = scanner.nextInt();
        boolean weekday = isWeekDay(dayNumber);
        String month = determineNameOfMonth(monthNumber);
        String day = determineNameOfDay(dayNumber);
        System.out.println("Is Week Day: "+weekday+"\nMonth:  "+month+"\nDay:  "+day);
    }

    private static boolean isWeekDay(int dayNumber) {
//        if(dayNumber >= 1 && dayNumber <= 5)
//            return true;
//        return false;
        switch(dayNumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
//                return false;
            case 0:
                return false;
            default: 
                return false;
        }
    }

    private static String determineNameOfMonth(int monthNumber) {
        switch(monthNumber){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month...";
        }
    }

    private static String determineNameOfDay(int dayNumber) {
    switch(dayNumber){
        default:
            return "Invalid Day...";
        case 0:
            return "Sunday";
        case 1:
            return "Monday";
        case 2:
            return "Tuesday";
        case 3:
            return "Wednesday";
        case 4:
            return "Thursday";
        case 5:
            return "Friday";
        case 6:
            return "Saturday";
    } 
    }
}
