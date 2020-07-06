/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.generics;

import java.util.ArrayList;

/**
 *
 * @author Namra Ansari
 */
public class MyCustomList<T> {

    ArrayList<T> someList = new ArrayList<>();
    
    void addElement(T element) {
      someList.add(element);
    }

    T get(int i) {
        return someList.get(i);
    }
    
    public String toString(){
        return someList.toString();
    }
}
