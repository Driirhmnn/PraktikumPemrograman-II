package PRAK203_2110817210007_AndriRahman;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Pada baris ini terjadi eror karena kurang tanda ";"
        //p1.nama = "Roi"
        p1.nama = "Roi";
        
        //Pada baris ini terjadi eror karena variabel asal pada file Pegawai.java masih bertipe data char
        //Solusinya ubah tipe data asal pada file Pegawai.java menjadi String
        p1.asal = "Kingdom of Orvel";
        
        //Pada baris ini terjadi eror karena tidak ada method setJabatan
        //Solusinya buat method setJabatan pada Pegawai.java
        p1.setJabatan("Assasin");
        
        //karena value dari variabel umur belum ada maka, kita beri value
        //
        p1.umur = 17;
        
        //Pada baris ini tidak sesuai dengan output yang diinginkan, seharusnya "Nama:"
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //pada baris ini juga tidak sesuai dengan output yaitu kurang kata "tahun"
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
        
    }
}
