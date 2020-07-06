/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 *
 * @author Namra Ansari
 */
class Student {
    
    private String name;
    private int[] listOfMarks;
    
    public Student(String name, int[] listOfMarks){
        this.name = name;
        this.listOfMarks = listOfMarks;
    }
    
    int getNumberOfMarks() {
        return this.listOfMarks.length;
    }

    int getSumOfMarks() {
        int sum = 0;
        for(int mark:this.listOfMarks){
            sum = sum + mark;
        }
        return sum;
    }

    int getMaximumMarks() {
        int max = 0;
        Arrays.sort(this.listOfMarks);
        max = this.listOfMarks[this.listOfMarks.length - 1];
        return max;
    }

    int getMinimumMarks() {
        int min = 0;
        Arrays.sort(this.listOfMarks);
        min = this.listOfMarks[0];
        return min;
    }

    BigDecimal getAverageMarks() {
        BigDecimal avg;
        try{
            avg = new BigDecimal(this.getSumOfMarks()).divide(new BigDecimal(this.getNumberOfMarks()));
        }catch(Exception e){
            avg = new BigDecimal(this.getSumOfMarks()).divide(new BigDecimal(this.getNumberOfMarks()),3,RoundingMode.HALF_UP);
        }
        return avg;
    }
    
}
