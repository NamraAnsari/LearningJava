/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.OOPS.interfaceExample;

/**
 *
 * @author Namra Ansari
 */
public class Aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("with fuel");
    }
    
}
