/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.OOPS.inheritance;

/**
 * Demonstrating inheritance
 * @author Namra Ansari
 */
public class PersonRunner {
    
    public static void main(String args[]){
        
        Employee employee = new Employee("Namra","123-456-7890","namra@abc.edu.in","Programmer","Hazel",'A',15000);
//        employee.setName("Namra");
//        employee.setPhone("123-456-7890");
//        employee.setEmail("namra@abc.edu.in");
//        employee.setTitle("Programmer");
//        employee.setEmployer("Hazel");
//        employee.setGrade('A');
//        employee.setSalary(15000);
        System.out.println(employee);
        
    }
}
