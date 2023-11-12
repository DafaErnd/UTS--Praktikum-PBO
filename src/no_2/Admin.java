/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no_2;
import java.util.Scanner;

/**
 *
 * @author dafae
 */
public class Admin extends Pengguna {
    
    private String judul;
    private String genre;
    Scanner input = new Scanner(System.in);
    
    
    //Method Untuk Melihat Daftar Buku
    @Override
    void melihat(){
        System.out.println("=== DAFTAR BUKU ===");
        System.out.println("=== GENRE ===");
        System.out.println("=============");
        System.out.println("=== NON FIKSI ===");
        System.out.println("1. Filosofi Teras");
        System.out.println("2. Madilog");
        System.out.println("1. The Lean Start ");
        System.out.println("");
        System.out.println("=== FIKSI ===");
        System.out.println("1. Laut Bercerita");
        System.out.println("2. Namaku Alama");
        System.out.println("1. Pulang");
        System.out.println("");
    }
    
    //Method Untuk Menambahkan Buku
    @Override
    public void menambahkan(){
        System.out.print("Masukkan Judul :");
        judul = input.nextLine();
        System.out.print("Masukkan Genre :");
        genre = input.nextLine();
        System.out.println("Buku Telah Berhasil Ditambahkan");
        System.out.println("");
    }
    
    //Method Untuk Menghapus Buku
    @Override
    public void menghapus(){
        System.out.print("Masukkan Judul :");
        judul = input.nextLine();
        System.out.print("Masukkan Genre :");
        genre = input.nextLine();
        System.out.println("Buku Telah Berhasil Dihapus");
        System.out.println("");
    }
}
