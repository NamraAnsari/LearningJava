/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.OOPS.abstractClass;

/**
 *
 * @author Namra Ansari
 */
public class AnimalRunner {
    
    public static void main(String args[]){
        Animal[] animals = {new Cat(), new Dog()}; 
        for(Animal animal: animals){
            animal.animalSound();
        }
    }
}
