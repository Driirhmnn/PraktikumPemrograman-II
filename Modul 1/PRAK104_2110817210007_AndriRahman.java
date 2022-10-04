package praktikum1;

import java.util.Scanner;

public class PRAK104_2110817210007_AndriRahman {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int andi = 0, budi = 0;
        
        System.out.print("Kartu Andi : ");
        int andi1 = keyboard.nextInt();
        int andi2 = keyboard.nextInt();
        int andi3 = keyboard.nextInt();
        
        System.out.print("Kartu Budi : ");
        int budi1 = keyboard.nextInt();
        int budi2 = keyboard.nextInt();
        int budi3 = keyboard.nextInt();
        
        if(andi1 > budi1){
            andi++;
        }else if(andi1 == budi1){
            
        }else{
            budi++;
        }
        
        if(andi2 > budi2){
            andi++;
        }else if(andi2 == budi2){
            
        }else{
            budi++;
        }
        
        if(andi3 > budi3){
            andi++;
        }else if(andi3 == budi3){
            
        }else{
            budi++;
        }
        
        if(andi > budi){
            System.out.println("Andi Menang");
        }else if(andi == budi){
            System.out.println("Draw");
        }else{
            System.out.println("Budi Menang");
        }
    }
}
