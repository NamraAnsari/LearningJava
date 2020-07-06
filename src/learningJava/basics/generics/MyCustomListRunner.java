/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.generics;

/**
 *
 * @author Namra Ansari
 */
public class MyCustomListRunner {
    
    public static void main(String args[]){
        MyCustomList<String> mcl = new MyCustomList<>();
        mcl.addElement("Element 1");
        mcl.addElement("Element 2");
        System.out.println(mcl);
        System.out.println(mcl.get(0));
        MyCustomList<Integer> mcl1 = new MyCustomList<>();
        mcl1.addElement(1);
        mcl1.addElement(2);
        System.out.println(mcl1);
        System.out.println(mcl1.get(0));
    }
}
