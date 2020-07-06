/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.collections;

import static java.util.Arrays.asList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Namra Ansari
 */
public class ListtoSet {
    
    public static void main(String args[]){
        List<Character> characters = asList('A','Z','A','B','P','F','N','F');
        Set<Character> sortedAlphabets = new TreeSet();
        sortedAlphabets.addAll(characters);
        System.out.println(sortedAlphabets);
        Set<Character> alphabets = new LinkedHashSet();
        alphabets.addAll(characters);
        System.out.println(alphabets);        
//        for(char character: characters){
//            if(alphabets.contains(character)){
//                
//            }
//        }
    }
}
