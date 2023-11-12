/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no_2;
import java.util.Scanner;
/**
 *
 * @author dafae
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String ident;
        String aksi;
        
        Admin admin = new Admin();
        Buku buku = new Buku();
        User user = new User();
       
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Anda Masuk Sebagai? (Admin/User) ");
        ident = sc.nextLine();
        
        if("Admin".equalsIgnoreCase(ident)){
            while(true){
                System.out.println("=== Menu Admin ===");
                System.out.println("1. Lihat Daftar Buku");
                System.out.println("2. Tambah Buku");
                System.out.println("3. Hapus Buku");
                System.out.println("4. Keluar");
                System.out.println("Pilih Aksi : ");
                aksi = sc.nextLine();
                
                if(aksi.equalsIgnoreCase("1")){
                    admin.melihat();
                }else if (aksi.equalsIgnoreCase("2")){
                    admin.menambahkan();
                }else if (aksi.equalsIgnoreCase("3")){
                    admin.menghapus();
                }else if (aksi.equalsIgnoreCase("4")){
                    System.exit(0);
                }else{
                    System.out.println("Pilihan Tak Tersedia");
                }
            }
        }else if("User".equalsIgnoreCase(ident)){
            user.melihat();
        }else{
            System.out.println("Pilihan Anda Tak Tersedia");
        }
        
    }
    
}
