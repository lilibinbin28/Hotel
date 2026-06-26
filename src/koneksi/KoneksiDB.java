/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDB {

    private static Connection koneksi;

    public static Connection getKoneksi() {

    try {

        if (koneksi == null) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/db_hotel_231011400089";
            String user = "root";
            String password = "";

            koneksi = DriverManager.getConnection(url, user, password);

            System.out.println("Koneksi Berhasil");
        }

    } catch (Exception e) {

        System.out.println("Koneksi Gagal");
        e.printStackTrace(); // tambahkan ini

    }

    return koneksi;
}
}
