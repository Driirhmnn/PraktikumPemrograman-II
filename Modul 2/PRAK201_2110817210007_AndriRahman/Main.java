package PRAK201_2110817210007_AndriRahman;

public class Main {
    
    public static void main(String[] args) {
        Mangga Arumanis = new Mangga("Arumanis", 0.3f, 13, 5000);
        Mangga Manalagi = new Mangga("Manalagi", 0.5f, 17, 7500);
        Mangga Madu = new Mangga("Madu", 0.375f, 12, 6500);
        
        Arumanis.show();
        Manalagi.show();
        Madu.show();
    }
}
