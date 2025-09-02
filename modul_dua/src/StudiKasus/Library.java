/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudiKasus;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali Rohmat
 */
class Library {
    private List<User> users = new ArrayList<>();
    private List<Material> materials = new ArrayList<>();

    public void addUser(User u) { users.add(u); }
    public void addMaterial(Material m) { materials.add(m); }

    public void showMaterials() {
        System.out.println("=== Library Materials ===");
        for (Material m : materials) {
            System.out.println("- " + m.getTitle());
        }
    }
}
