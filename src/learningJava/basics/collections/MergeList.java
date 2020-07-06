/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.collections;

import java.util.*;
import static java.util.Arrays.asList;

/**
 * Demonstrate List Interface (List, ArrayList, LinkedList, Vector)
 * @author Namra Ansari
 */
public class MergeList {
    
    public static void main(String args[]){
        List<String> names = new ArrayList<>(asList("Jon","Mary","Tanya"));
        List<String> otherNames = new ArrayList<>(asList("Namra","Wieni"));
        names.addAll(otherNames);
        System.out.println(names);
        
    }
}
