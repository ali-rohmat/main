/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author Ali Rohmat
 */
interface InterfaceAC {
    public static final int AC_MATI = 0;
    public static final int AC_HIDUP = 1;
    public static final int AC_HOT = 2;
    public static final int AC_COOL = 3 ;
    
    public abstract void hidupkan();
    public abstract void matikan();  
    public abstract void panaskan();  
    public abstract void dinginkan();  
    
}
