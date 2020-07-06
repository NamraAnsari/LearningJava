/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.OOPS.objectComposition;

/**
 *
 * @author Namra Ansari
 */
class Review {
    
    private int id;
    private String desc;
    private int rating;
    
    public Review(int id, String desc, int rating){
        this.id = id;
        this.desc = desc;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    @Override
    public String toString(){
        return id+" "+desc+" "+rating+" ";
    }
}
