package PRAK203_2110817210007_AndriRahman;

//Pada baris ini terjadi eror karena penamaan public class salah karena tidak sama dengan nama file .java
//public class employee {
public class Pegawai{
    public String nama;
    //Pada baris ini tidak eror pada file ini namun menjadi penyebab eror pada syntax return.asal dan untuk file Soal3Main.java pada syntax p1.asal = "Kingdom of Orvel";
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    
    public String getNama() {
        return nama;
    }
    
   public String getAsal(){
       return asal;
   }
    
   
   //Pada baris ini eror karena tidak ada pedeklarasian variabel j
    /*public void setJabatan() {
        this.jabatan = j;
    }*/
   public void setJabatan(String j){
       this.jabatan = j;
   }
}
