/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritence;

/**
 *
 * @author Ali Rohmat
 */
// Superclass
class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

// Single Inheritance
class Programmer extends Employee {
    String language;

    public Programmer(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Language: " + language);
    }
}

// Multilevel Inheritance
class SeniorProgrammer extends Programmer {
    int experience;

    public SeniorProgrammer(String name, int salary, String language, int experience) {
        super(name, salary, language);
        this.experience = experience;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Experience: " + experience + " years");
    }
}

// Hierarchical Inheritance
class Manager extends Employee {
    int teamSize;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Team size: " + teamSize);
    }
}



