package praktikum4.soal1;

/**
 *
 * @author User
 */
public class Buku {
    public String judul;
    public String penulis;
    public int tahun;
    
    public Buku(String j, String p, int t) {
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
    }

    public void display(){
        System.out.println("\nDetail Buku:");
        System.out.println("Judul adalah " + judul);
        System.out.println("penulis adalah " + penulis);
        System.out.println("Tahun Terbit adalah " + tahun);
    }
}
