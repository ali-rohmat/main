/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritence;

/**
 *
 * @author Ali Rohmat
 */
class Employee{
    float salary = 40000;
}

public class Programmer extends Employee {

    public Programmer(String ali, int par, String java) {
    }
    int Bonus = 10000;
    public static void main(String[] args) {
        Programmer p = new Programmer("Ali", 7000, "Java");
        System.out.println("Programmer Salary is " + p.salary);
        System.out.println("Bonus Of Programmer is " + p.Bonus);
    }
    
}
