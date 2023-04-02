/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;
import java.util.Scanner;

/**
 *
 * @author fauzi
 */
public class main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        boolean repeat = true;
        
        while(repeat){
            System.out.println("SELAMAT DATANG DI BERSI HOTEL!");
            System.out.println("==================================");
            System.out.println("1. KAMAR STANDAR (Rp200.000/Malam)");
            System.out.println("2. KAMAR PREMIUM (Rp300.000/Malam)");
            System.out.println("3. KAMAR DELUXE (Rp400.000/Malam)");
            System.out.print("Pilih Tipe Kamar : ");
            int tipekamar = scan.nextInt();
        
            scan.nextLine();
        
            System.out.print("Masukkan Nama Pemesan : ");
            String nama = scan.nextLine();
        
            System.out.print("Lama Menginap(Malam) : ");
            int malam = scan.nextInt();
        
            System.out.println("");
            System.out.println("======================");
            System.out.println("");
        
            hotel reservasi = new hotel(nama,malam,tipekamar);
            System.out.println(reservasi);
            
            System.out.print("Apakah Ingin Melakukan Reservasi Lagi? (y/n): ");
            String pilih = scan.next();
            
            repeat = pilih.equalsIgnoreCase("y");
            
        }
          
    }
    
}
