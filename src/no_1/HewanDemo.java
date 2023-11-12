/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no_1;

import java.util.Scanner;



/**
 *
 * @author dafae
 */
public class HewanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();
        String jhewan;
                
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jenis Hewan (Kucing/Anjing) : ");
        jhewan = input.nextLine();
        System.out.println("");
        
        if("Kucing".equalsIgnoreCase(jhewan)){
            kucing.bersuara();
            System.out.println("Kucing Merupakan Hewan Mamalia!");
        }else if ("Anjing".equalsIgnoreCase(jhewan)){           
            anjing.bersuara();
            System.out.println("Anjing Merupakan Hewan Mamalia!");
        }
    }
    
}
