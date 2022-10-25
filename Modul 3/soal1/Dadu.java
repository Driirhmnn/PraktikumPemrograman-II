package praktikum3.soal1;

import java.util.LinkedList;

public class Dadu {
    private int inputUser;
    int total;
    
    //Enkapsulasi
    void setInput (int input){
        this.inputUser = input;
    }
    
    //Instansiasi Obj LinkedList
    LinkedList<Integer> ObjDadu = new LinkedList<Integer>();
    
    //Method acak nilai
    void acakNilai(){
        for(int i = 1; i <= this.inputUser; i++){
            int nilaiAcak = 1 + (int) (Math.random()*6);
            ObjDadu.add(nilaiAcak);
            this.total = this.total + nilaiAcak;
        }
    }
    
    void cetakDadu(){
        for(int i = 1; i <=this.inputUser; i++){
            System.out.println("Dadu ke -" + i + " bernilai " + ObjDadu.get(i-1));
        }
        System.out.println("Total nilai dadu keseluruhan " + this.total);
    }
}