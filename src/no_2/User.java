/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no_2;

/**
 *
 * @author dafae
 */
public class User extends Pengguna {
    
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
    }
}
