/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningJava.basics.OOPS.inheritance;

/**
 *
 * @author Namra Ansari
 */
public class Employee extends Person {
    
    private String title;
    private String employer;
    private char grade;
    private int salary;
    
    public Employee(String name, String phone, String email, String title, String employer, char grade, int salary){
        super(name,phone,email);
        this.title = title;
        this.employer = employer;
        this.grade = grade;
        this.salary = salary;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String toString(){
        return String.format("Name: %s, Phn number: %s, Email: %s, Title: %s, "
                + "Employer: %s, Grade: %c, Salary: %d", this.getName(), this.getPhone(),this.getEmail(),
                this.getTitle(), this.getEmployer(),this.getGrade(),this.getSalary());
    }
}
