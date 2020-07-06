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
public class WhileNumberPlayer {

    private int limit;
    
    WhileNumberPlayer(int limit) {
        this.limit = limit;
    }

    void printSquaresUptoLimit() {
        int i = 1;
        while(i*i < this.limit){
            System.out.print((i*i)+" ");
            i++;
        }
        System.out.println();
    }

    void printCubesUptoLimit() {
        int i = 1;
        while(i*i*i < this.limit){
            System.out.print((i*i*i)+" ");
            i++;
        }
        System.out.println();
    }
    
    
}
