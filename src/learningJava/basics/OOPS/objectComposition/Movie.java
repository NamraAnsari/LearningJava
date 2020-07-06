/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.OOPS.objectComposition;

import java.util.ArrayList;

/**
 *
 * @author Namra Ansari
 */
public class Movie {
    
    private int id;
    private String name;
    private String writer;
    private ArrayList<Review> reviews = new ArrayList<Review>();
//    private Review reviews;
    
    public Movie(int id, String name, String writer){
        this.id = id;
        this.name = name;
        this.writer = writer;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }
    
//    public void addReview(Review review){
//        this.reviews = review;
//    }
    
    @Override
    public String toString(){
        return String.format("Movie ID - %d, Movie Name - %s, Writer - %s\n Reviews - %s",
                id,name,writer,reviews);
    }
}
