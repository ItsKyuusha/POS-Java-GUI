/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.javagui;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Kyuusha
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek koneksi menggunakan konstruktor default
        KoneksiMysql koneksi = new KoneksiMysql();
        
        // Mendapatkan koneksi
        Connection con = koneksi.getConnection();
        
        // Mengecek apakah koneksi berhasil atau gagal
        if (con != null) {
            System.out.println("Koneksi berhasil ke database: " + koneksi.dbn);
        } else {
            System.out.println("Gagal terkoneksi ke database.");
        }

        // Cek jika koneksi sukses, kita coba menutupnya
        try {
            if (con != null) {
                con.close();
                System.out.println("Koneksi berhasil ditutup.");
            }
        } catch (SQLException e) {
            System.out.println("Error saat menutup koneksi: " + e.getMessage());
        }
    }
}
