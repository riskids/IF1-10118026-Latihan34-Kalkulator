/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan34kalkulator;

import java.util.Scanner;

/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deksripsi Program : Program ini berisi program kalkulator sederhana yang 
 * berbasis objek oriented
 */
public class Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Kalkulator hitung = new Kalkulator();
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.printf("Masukkan Angka ke-1 : ");
        hitung.value1 = scanner.nextDouble();
        System.out.printf("Masukkan Angka ke-2 : ");
        hitung.value2 = scanner.nextDouble();
        System.out.println("");
        
        System.out.println("Hasil Pertambahan : " + hitung.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + hitung.kurangBilangan());
        System.out.println("Hasil Perkalian : " + hitung.kaliBilangan());
        System.out.println("Hasil Pembagian : " + hitung.bagiBilangan());
        System.out.println("Hasil Sisa : " + hitung.sisaBilangan());
    }
    
}
