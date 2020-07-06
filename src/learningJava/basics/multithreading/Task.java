/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Namra Ansari
 */

class SubTask1 extends Thread{
    public void run(){
        System.out.println("Sub Task 1 started");
        for(int i = 101; i<= 199; i++){
            System.out.println(i);
        }
        System.out.println("Sub Task 1 completed");
    }
}

class SubTask2 implements Runnable{
    public void run(){
        System.out.println("Sub Task 2 started");
        for(int i = 201; i<= 299; i++){
            System.out.println(i);
        }
        System.out.println("Sub Task 2 completed");
    }
}

public class Task {
    
    public static void main(String args[]){
        
        SubTask1 task1 = new SubTask1();
        task1.setPriority(10);
        Thread t2 = new Thread(new SubTask2());
        task1.start();
        try {
            task1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        System.out.println("Sub Task 3 started");
        for(int i = 301; i<= 399; i++){
            System.out.println(i);
        }
        System.out.println("Sub Task 3 completed");
    }
    
}
