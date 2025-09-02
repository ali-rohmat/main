/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

/**
 *
 * @author Ali Rohmat
 */
class Vehicle{
private String vin;
    public String getVin() { 
        return vin;
    }
    public void setvin(String vin) {
        this.vin = vin;
    }
}
class Speed{ 
private double max;
    public double getMax() { 
        return max;
    }
    public void setMax(double max){
        this.max= max;
    }
}
class Van extends Vehicle {
private Speed speed;
    public Speed getSpeed() {
        return speed;
    }
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
    public void print() {
        System.out.println("Vin: "+this.getVin()+", Max Speed: " +speed.getMax());
    }
}