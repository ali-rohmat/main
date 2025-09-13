/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author Ali Rohmat
 */
public class Rectangle extends Shape implements Drawable {
    
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void Draw() {
        System.out.println("Menggambar persegi panjang dengan lebar " + width + " dan tinggi " + height);
    }
    
}
