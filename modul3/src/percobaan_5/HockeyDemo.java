/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan_5;

/**
 *
 * @author Ali Rohmat
 */
public class HockeyDemo implements Hockey, Event {
public void setHomeTeam(String name) {
System.out.println("Home team: "+ name);
}
public void setVisitingTeam (String name) {}
public void homeGoalScored() {}
public void visitingGoalScored() {}
public void endOfPeriod(int period) {}
public void overtimePeriod(int ot) {}
public static void main(String[] args) {
    HockeyDemo hockeyDemo = new HockeyDemo();
    hockeyDemo.setHomeTeam("India");
    hockeyDemo.organize();
}

    public void organize() {
        System.out.println("Match organized");
    }
}
