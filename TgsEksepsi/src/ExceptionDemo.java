/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ali Rohmat
 */
import java.io.*;
import java.net.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Membaca file
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String data = br.readLine();
            
            // Kirim ke server
            Socket socket = new Socket("localhost", 8080);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(data);
            
            br.close();
            socket.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (UnknownHostException e) {
            System.out.println("Host tidak dikenali: " + e.getMessage());
        } catch (SocketException e) {
            System.out.println("Masalah socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Kesalahan I/O: " + e.getMessage());
        }
    }
}

