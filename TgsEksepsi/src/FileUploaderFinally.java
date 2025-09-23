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

public class FileUploaderFinally {
    public static void main(String[] args) {
        String filePath = "data.txt";
        String serverHost = "localhost";
        int serverPort = 8080;

        BufferedReader br = null;
        Socket socket = null;
        PrintWriter out = null;

        try {
            br = new BufferedReader(new FileReader(filePath));
            socket = new Socket(serverHost, serverPort);
            out = new PrintWriter(socket.getOutputStream(), true);

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
            System.out.println("Masalah socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Kesalahan I/O: " + e.getMessage());
        } finally {
            // Menutup resource secara manual
            try {
                if (br != null) br.close();
                if (out != null) out.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                System.out.println("Gagal menutup resource: " + e.getMessage());
            }
        }
    }
}
