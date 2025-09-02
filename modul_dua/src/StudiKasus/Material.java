/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudiKasus;

/**
 *
 * @author Ali Rohmat
 */
class Material {
    private String title;

    public Material(String title) { this.title = title; }

    public String getTitle() { return title; }
}

class Book extends Material {
    public Book(String title) { super(title); }
}

class Journal extends Material {
    public Journal(String title) { super(title); }
}

