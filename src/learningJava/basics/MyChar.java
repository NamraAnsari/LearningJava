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
public class MyChar {

    private char c;
    
    public MyChar(char c) {
        this.c = c;
    }

    boolean isVowel() {
        if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'||c == 'A'||c == 'E'
                ||c == 'I'||c == 'O'||c == 'U')
            return true;
        return false;
    }
    
    boolean isConsonant() {
        if(isAlphabet() == true && isVowel() != true)
            return true;
        return false;
    }

    boolean isNumber() {
        if(c >= 48 && c <= 57)
            return true;
        return false;
    }

    boolean isAlphabet() {
        if((c >= 97 && c <= 122)||(c >= 65 && c <= 90))
            return true;
        return false;
    }

    public static void printLowerCaseAlphabets() {
        for(char ch = 'a'; ch <= 'z'; ch++)
            System.out.println(ch);
    }

    public static void printUpperCaseAlphabets() {
        for(char ch = 'A'; ch <= 'Z'; ch++)
            System.out.println(ch);
    }
    
    
    
}
