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
public class Book {
    //state, instance variable
//    int noOfCopies;
    private int noOfCopies;    //member variable
    
    // constructor - used to define initial state
    // doesnot have return type, have a same name as that of class
    Book(){
        this(100);
    }
    
    Book(int noOfCopies){
        this.noOfCopies = noOfCopies;
    }
    
    //behavior, method, action
    void setNoOfCopies(int noOfCopies){
        if(noOfCopies>0)
            this.noOfCopies = noOfCopies;
    }
    
    int getNoOfCopies(){
        return this.noOfCopies;
    }
    
    void increaseNoOfCopies(int howMuch){
        if(howMuch>0)
            this.noOfCopies += howMuch;
    }
    
    void decreaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies -= howMuch);
    }
}
