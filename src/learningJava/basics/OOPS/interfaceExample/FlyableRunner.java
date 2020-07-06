/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.OOPS.interfaceExample;

/**
 * Demonstrate interface
 * @author Namra Ansari
 */
public class FlyableRunner {
    
    public static void main(String args[]){
        Flyable[] flyingObject = {new Bird(), new Aeroplane()};
        for(Flyable obj: flyingObject){
            obj.fly();
        }
    }
}
