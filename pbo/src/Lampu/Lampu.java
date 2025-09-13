/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lampu;

/**
 *
 * @author Ali Rohmat
 */
public class Lampu implements InterfaceLampu {
    int StatusLampu;
    
    public void hidupkan(){
        if(StatusLampu == KEADAAN_MATI){
            StatusLampu = KEADAAN_HIDUP;
            System.out.println("HIDUPKAN LAMPU! --> Lampu Hidup ");
        } else{
            System.out.println("HIDUPKAN LAMPU! --> Lampu sudah hidup");
        }
    }
    
    public void matikan(){
        if(StatusLampu == KEADAAN_HIDUP){
            StatusLampu = KEADAAN_MATI;
            System.out.println("MATIKAN LAMPU! --> Lampu Mati ");
        } else{
            System.out.println("MATIKAN LAMPU! --> Lampu sudah Mati");
        }
    }
    
    
}
