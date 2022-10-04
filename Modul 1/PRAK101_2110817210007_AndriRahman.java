package praktikum1;

import java.util.Scanner;

public class PRAK101_2110817210007_AndriRahman{
    public static void main(String[] args){
        String bln = null;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap : ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Tempat Lahir : ");
        String tempatLahir = scanner.next();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        int tanggalLahir = scanner.nextInt();
        
        System.out.print("Masukkan Bulan Lahir : ");
        int bulan = scanner.nextInt();
       
        if(bulan == 1){
            bln = "Januari";
        }else if(bulan == 2){
            bln = "Februari";
        }else if(bulan == 3){
            bln = "Maret";
        }else if(bulan == 4){
            bln = "April";
        }else if(bulan == 5){
            bln = "Mei";
        }else if(bulan == 6){
            bln = "Juni";
        }else if(bulan == 7){
            bln = "Juli";
        }else if(bulan == 8){
            bln = "Agustus";
        }else if(bulan == 9){
            bln = "September";
        }else if(bulan == 10){
            bln = "Oktober";
        }else if(bulan == 11){
            bln = "November";
        }else if(bulan == 12){ 
            bln = "Desember";
        }else{
            System.out.print("");
        }
        
        System.out.print("Masukkan Tahun Lahir : ");
        int tahun = scanner.nextInt();
        
        System.out.print("Masukkan Tinggi Badan : ");
        int tinggi = scanner.nextInt();
        
        System.out.print("Masukkan Berat Badan : ");
        float berat = scanner.nextFloat();
        
        System.out.println("\n==================================\n");
        System.out.println("Data telah ditambahkan,\nNama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + bln + " " + " " + tahun + "\nTinggi Badan " + tinggi + "cm dan Berat Badan " + berat + " kilogram." );
        System.out.println("=======================");
        System.out.println("Program by Andri Rahman (2110817210007)");
    }
}