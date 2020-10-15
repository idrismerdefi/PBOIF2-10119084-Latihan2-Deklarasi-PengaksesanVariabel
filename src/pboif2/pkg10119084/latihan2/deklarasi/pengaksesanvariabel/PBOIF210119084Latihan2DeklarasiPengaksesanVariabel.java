/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan2.deklarasi.pengaksesanvariabel;

/**
 *
 * @author 
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program  Deklarasi Pengaksesan Variabel
 */
public class PBOIF210119084Latihan2DeklarasiPengaksesanVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14;
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
         
        //menampilkan hasil
        System.out.println();
        System.out.println("Isi Variabel nilai = " + nilaiInt );
        System.out.println("Isi Variabel PHI = " + PHI);
        System.out.println("Isi Variabel Logika =  " + nilaiLogika);
        System.out.println("Isi Variabel Karakter = " + nilaiKarakter);
    }
    
}
