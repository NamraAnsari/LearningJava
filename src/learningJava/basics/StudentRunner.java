/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

/**
 * Demonstrate Array
 * @author Namra Ansari
 */
public class StudentRunner {
    
    public static void main(String args[]){
        String name = "Namra";
        int[] listOfMarks = {56,23,84,12,90,45,70};
        Student student = new Student(name, listOfMarks);
        System.out.println("The number of marks:  "+student.getNumberOfMarks());
        System.out.println("The sum of marks:  "+student.getSumOfMarks());
        System.out.println("The maximum marks:  "+student.getMaximumMarks());
        System.out.println("The minimum marks:  "+student.getMinimumMarks());
        System.out.println("The average marks:  "+student.getAverageMarks());


    }
}
