
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ali Rohmat
 */
public class perbaikan {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
    String line = br.readLine();
    int angka = Integer.parseInt(line);
    System.out.println("Hasil: " + (10 / angka));
} catch (FileNotFoundException e) {
    System.out.println("File tidak ditemukan: " + e.getMessage());
} catch (NumberFormatException e) {
    System.out.println("Format angka tidak valid: " + e.getMessage());
} catch (ArithmeticException e) {
    System.out.println("Terjadi pembagian dengan nol.");
} catch (IOException e) {
    System.out.println("Kesalahan I/O: " + e.getMessage());
}

    }
}
