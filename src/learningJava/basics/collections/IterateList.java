/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.collections;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterate over List using enhanced for-loop & Iterator
 * @author Namra Ansari
 */
public class IterateList {
    
    public static void main(String args[]){
        List<Integer> marks = new ArrayList<>(asList(34,78,90,65,40));
        
        // using enhanced for-loop
        System.out.println("Iterating using enhanced for-loop:");
        for(int mark:marks){
            System.out.println(mark);
        }
        System.out.println("Iterating using Iterator:");
        Iterator i = marks.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
