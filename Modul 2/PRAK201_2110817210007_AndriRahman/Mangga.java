package PRAK201_2110817210007_AndriRahman;

public class Mangga {
    String nama;
    float berat;
    int jumlah;
    int harga;
    
    //Konstruktor
    public Mangga(String nama, float berat, int jumlah, int harga) {
        this.nama = nama;
        this.berat = berat;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    
    //Method
    public void show (){
        System.out.println("Nama Mangga : " + nama);
        System.out.println("Berat : " + berat + " Kg");
        System.out.println("Jumlah Beli : " + jumlah);
        System.out.println("Total Berat : " + berat*jumlah + " Kg");
        System.out.println("Total Harga : Rp. " + harga*jumlah);
        System.out.println("\n==================================\n");
    }
}
