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

public class FileUploader {
    public static void main(String[] args) {
        String filePath = "data.txt";
        String serverHost = "localhost";
        int serverPort = 8080;

        try (
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            Socket socket = new Socket(serverHost, serverPort);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                out.println(line);
            }
            System.out.println("File berhasil dikirim ke server.");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (UnknownHostException e) {
            System.out.println("Host server tidak dikenali: " + e.getMessage());
        } catch (SocketException e) {
            System.out.println("Koneksi socket bermasalah: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Kesalahan I/O: " + e.getMessage());
        }
    }
}
