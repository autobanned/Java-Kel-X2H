/* Tugas Ahir Kelompok 7 Pemrograman 2
*  Dibuat oleh Kel.11 X2H: Zefri.Andy 
*  Copyright X2H-Unindra 2021 
*  This program is free software; you can redistribute it and/or modify
*/ 
import java.io.*;
import javax.swing.*;
import java.util.Scanner;



public class KasirPuskesmas{ 
    public static void main (String[]args) 
        throws Exception {
            Scanner scan = new Scanner(System.in);
            Scanner opt = new Scanner(System.in);
            
            int harga = 0;
            int h1 = 8000, h2 = 12000, h3 = 15000, h4 = 8000, h5 = 2000, h6 = 15000, h7 = 10000, h8 = 20000 ;
            int admin = 3000;
            String tujuan;
            System.out.println(" ____________________");
            System.out.println("| Metode Pembayaran |");
            System.out.println("|___________________|");
            System.out.println("|1. Bayar Mandiri   |");
            System.out.println("|2. BPJS            |");
            System.out.println("|___________________|");
            System.out.println("");
            int metode = scan.nextInt();
            
            switch(metode){
            case 1:
            System.out.println(" _____________________________________________");
            System.out.println("| Daftar Harga Berobat Puskesmas Sukasuka |");
            System.out.println("|_________________________________________|");
            System.out.println("|      Nama         |      Harga          |");
            System.out.println("|1. Dokter Umum     |   Rp 8000,00        |");
            System.out.println("|2. Dokter Gigi     |   Rp 12000,00       |");
            System.out.println("|3. Dokter Anak     |   Rp 15000,00       |");
            System.out.println("|4. Dokter KIA      |   Rp 8000,00        |");
            System.out.println("|5. Posyandu        |   Rp 2000,00        |");
            System.out.println("|6. Laboratorium    |   Rp 15000,00       |");
            System.out.println("|7. Surat Keterangan|   Rp 10000,00       |");
            System.out.println("|8. Konseling       |   Rp 20000,00       |");
            System.out.println("|___________________|_____________________|");
            System.out.println("");
            

            for (String i = "T"; i.equals("T")||i.equals("t"); ) {
                System.out.println("_____________________________________");
                System.out.print("Masukkan Nomor yang anda pilih : ");
                int inNomor = scan.nextInt();
                System.out.println("_____________________________________");

                if (inNomor == 1) {
                    tujuan = " Dokter Umum ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = harga + h1 + admin;
                } else if (inNomor == 2) {
                    tujuan = " Dokter Gigi ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = harga + h2 + admin;
                }   
                else if (inNomor == 3) {
                    tujuan = " Dokter Anak ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = harga + h3 + admin;
                } else if (inNomor == 4) 
                {
                    tujuan = " Dokter KIA ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = harga + h4 + admin;
                }
                else if (inNomor == 5) {
                    tujuan = " Posyandu ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = harga + h5 + admin;
                }
                else if (inNomor == 6) {
                    tujuan = " Laboratorium ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = harga + h6 + admin;
                }
                else if (inNomor == 7) {
                    tujuan = " Surat Keterangan ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = harga + h7 + admin;
                }
                else if (inNomor == 8) {
                    tujuan = " Konseling ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = harga + h8 + admin;
                }
                else {
                    System.out.println("Nomor yang dipilih tidak ada di Daftar Harga.");
                }


                System.out.println("Lanjut ke Pembayaran? Y/T");
                i = scan.next();
                
            }
        System.out.println("_____________________");
        System.out.println("Total pembayaran sebesar " +harga+".");
        System.out.println("Terimakasih atas kunjungannya.");
        break;
        
        case 2:
            System.out.println(" _____________________________________________");
            System.out.println("| Daftar Harga Berobat Puskesmas Sukasuka |");
            System.out.println("|_________________________________________|");
            System.out.println("|      Nama         |      Harga          |");
            System.out.println("|1. Dokter Umum     |   Rp 8000,00        |");
            System.out.println("|2. Dokter Gigi     |   Rp 12000,00       |");
            System.out.println("|3. Dokter Anak     |   Rp 15000,00       |");
            System.out.println("|4. Dokter KIA      |   Rp 8000,00        |");
            System.out.println("|5. Posyandu        |   Rp 2000,00        |");
            System.out.println("|6. Laboratorium    |   Rp 15000,00       |");
            System.out.println("|7. Surat Keterangan|   Rp 10000,00       |");
            System.out.println("|8. Konseling       |   Rp 20000,00       |");
            System.out.println("|___________________|_____________________|");
            System.out.println("");
            /*int harga = 0;
            int h1 = 8000, h2 = 12000, h3 = 15000, h4 = 8000, h5 = 2000, h6 = 15000, h7 = 10000, h8 = 20000 ;
            int admin = 3000;
            /*String tujuan;*/

            for (String i = "T"; i.equals("T")||i.equals("t"); ) {
                System.out.println("_____________________________________");
                System.out.print("Masukkan Nomor yang anda pilih : ");
                int inNomor = scan.nextInt();
                System.out.println("_____________________________________");

                if (inNomor == 1) {
                    tujuan = " Dokter Umum ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = 0* (harga + h1 + admin);
                } else if (inNomor == 2) {
                    tujuan = " Dokter Gigi ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = 0* (harga + h2 + admin);
                }   
                else if (inNomor == 3) {
                    tujuan = " Dokter Anak ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = 0* (harga + h3 + admin);
                } else if (inNomor == 4) 
                {
                    tujuan = " Dokter KIA ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = 0* (harga + h4 + admin);
                }
                else if (inNomor == 5) {
                    tujuan = " Posyandu ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = harga + h5 + admin;
                }
                else if (inNomor == 6) {
                    tujuan = " Laboratorium ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = 0* (harga + h6 + admin);
                }
                else if (inNomor == 7) {
                    tujuan = " Surat Keterangan ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = 0 * (harga + h7 + admin);
                }
                else if (inNomor == 8) {
                    tujuan = " Konseling ";
                    System.out.println("Pilihan anda nomor " +inNomor + tujuan);
                    harga = 0* (harga + h8 + admin);
                }
                else {
                    System.out.println("Nomor yang dipilih tidak ada di Daftar Harga.");
                }


                System.out.println("Lanjut ke Pembayaran? Y/T");
                i = scan.next();
                
            }
        System.out.println("_____________________");
        System.out.println("Total pembayaran sebesar " +harga+".");
        System.out.println("Terimakasih atas kunjungannya.");
        break;
        default:
            System.out.println("Maaf, nomor yang dimasukan tidak sesuai");
    }
    }
    
}
