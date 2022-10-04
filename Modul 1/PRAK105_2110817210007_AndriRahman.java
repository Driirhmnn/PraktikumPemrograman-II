package praktikum1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PRAK105_2110817210007_AndriRahman {
    public static void main(String[] args) {
        double r, t, hasil;
        
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.print("Masukkan jari-jari : ");
        r = keyboard.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        t = keyboard.nextDouble();
        
        hasil = 3.14 * r * r * t;
        
        System.out.println("Volume tabung dengan jari-jari " + r + " cm " + "dan tinggi " + t + " cm ");
        System.out.println("adalah " + df.format(hasil) + " m3");
    }
}
