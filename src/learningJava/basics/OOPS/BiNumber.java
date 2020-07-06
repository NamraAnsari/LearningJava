/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.OOPS;

/**
 *
 * @author Namra Ansari
 */
public class BiNumber {
    
    private int number_1;
    private int number_2;
    
    BiNumber(int number_1, int number_2){
        this.number_1 = number_1;
        this.number_2 = number_2;
    }
    
    int add(){
        return(this.number_1 + this.number_2);
    }
    
    int multiply(){
        return(this.number_1 * this.number_2);
    }
    
    void doubLe(){
       this.number_1 *= 2;
       this.number_2 *= 2;
    }
    
    int getNumber_1(){
        return this.number_1;
    }
    
    int getNumber_2(){
        return this.number_2;
    }
}
