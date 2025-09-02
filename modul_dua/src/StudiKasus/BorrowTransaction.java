/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudiKasus;

/**
 *
 * @author Ali Rohmat
 */
class BorrowTransaction {
    private User user;
    private Material material;
    private String dueDate;

    public BorrowTransaction(User user, Material material, String dueDate) {
        this.user = user;
        this.material = material;
        this.dueDate = dueDate;
    }

    public String getDueDate() { return dueDate; }
    public void setDueDate(String dueDate) { this.dueDate = dueDate; }

    public void showTransaction() {
        System.out.println(user.getUserID() + " borrowed " 
            + material.getTitle() + ", due: " + dueDate);
    }
}

