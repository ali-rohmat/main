/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author Ali Rohmat
 */
public class main {
    public static void main(String[] args) {
        Shape circle = new Circle(7); // radius = 7
        Shape rectangle = new Rectangle(5, 10); // width = 5, height = 10

        // Casting agar bisa panggil method draw()
        Drawable d1 = (Drawable) circle;
        Drawable d2 = (Drawable) rectangle;

        // Circle
        System.out.println("Luas Lingkaran: " + circle.getArea());
        d1.Draw();

        // Rectangle
        System.out.println("Luas Persegi Panjang: " + rectangle.getArea());
        d2.Draw();
    }
}
