/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics;

/**
 * All class is a child of Object class (overriding toString() method of Object class)
 * @author Namra Ansari
 */
public class FanRunner {
    
    public static void main(String args[]){
        
        Fan fan = new Fan("MF 1",23.799,"white");
        System.out.println(fan+"\n=============switched on==================");
        fan.switchOn();
        System.out.println(fan+"\n=============speed: 4=====================");
        fan.setSpeed((byte)4);
        System.out.println(fan+"\n=============switched off=================");
        fan.switchOff();
        System.out.println(fan+"\n==========================================");
    }
}
