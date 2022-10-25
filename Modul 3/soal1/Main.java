package praktikum3.soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Instansiasi
        Dadu dadu = new Dadu();
        
        //Input dadu
        int inputUser = input.nextInt();
        
        dadu.setInput(inputUser);
        
        dadu.acakNilai();
        dadu.cetakDadu();
    }
}
