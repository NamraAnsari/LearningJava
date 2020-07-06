/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.maps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Namra Ansari
 */
public class CountLettersAndWords {
    
    public static Map letterOccurance(String s){
        Map<Character,Integer> letterCount = new HashMap();
        List<Character> chList = new LinkedList();
        Integer countLetter = null;
        for(int i = 0; i < s.length(); i++){
            Character ch = Character.valueOf(s.charAt(i));
            if(ch.equals(' ') == false){
                chList.add(ch);
            }
        }
        System.out.println(chList);
        for(char c : chList){
            countLetter = letterCount.get(c);
            if(countLetter == null){
                letterCount.put(c, 1);
            }
            else{
                letterCount.put(c,countLetter+1);
            }
        }
        return letterCount;
    }
    
    public static Map wordOccurance(String str){
        Map<String,Integer> wordCount = new HashMap<>();
        String[] words = str.split(" ");
        Integer count = null;
        for(String word : words){
            count = wordCount.get(word);
            if(count == null){
                wordCount.put(word,1);
            }
            else{
                wordCount.put(word,count+1);
            }
        }
        return wordCount;
    }
    
    public static void main(String args[]){
        String sentence = "This is a beautiful day . This boy has talent .";
        System.out.println(letterOccurance(sentence));
        System.out.println(wordOccurance(sentence));        
    }
}
