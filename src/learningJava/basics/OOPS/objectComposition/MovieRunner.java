/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.OOPS.objectComposition;

/**
 * Demonstrating Object Composition
 * @author Namra Ansari
 */
public class MovieRunner {
    
    public static void main(String args[]){
        
        Movie movie = new Movie(123,"Titanic","ABC");
        movie.addReview(new Review(10,"Great Movie",5));
        System.out.println(movie);
        movie.addReview(new Review(101,"Awesome",5));
        System.out.println(movie);
    }
}
