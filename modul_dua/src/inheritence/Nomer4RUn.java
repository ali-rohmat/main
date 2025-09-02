/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritence;

/**
 *
 * @author Ali Rohmat
 */
public class Nomer4RUn {
    public static void main(String[] args) {
        Programmer p = new Programmer("Ali", 7000, "Java");
        SeniorProgrammer sp = new SeniorProgrammer("Budi", 10000, "Python", 5);
        Manager m = new Manager("Citra", 15000, 10);

        p.showInfo();
        sp.showInfo();
        m.showInfo();
    }
}
