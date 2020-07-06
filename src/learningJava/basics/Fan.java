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
class Fan {
    
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;
    
    public Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }
    
    public void switchOn(){
        this.isOn = true;
        this.setSpeed((byte)5);
    }
    
    public void switchOff(){
        this.isOn = false;
        this.setSpeed((byte)0);
    }
    
    public void setSpeed(byte speed){
        this.speed = speed;
    }
    
    public String toString(){
        return String.format("make - %s\nradius - %.2f\ncolor - %s\nisOn - %b\nspeed - %d", make,radius,color,isOn,speed);
    }
}
