package Pertemuan13;

public class Polymorphism {
    public static void main(String[] args) {
        Bentuk[] daftarBentuk = new Bentuk[4];
        daftarBentuk[0] = new Lingkaran(7);
        daftarBentuk[1] = new Lingkaran(10);
        daftarBentuk[2] = new Tabung(7, 10);
        daftarBentuk[3] = new Tabung(10, 15);
        
        for (Bentuk b : daftarBentuk) {
            System.out.println("Luas: " + b.hitungLuas());
            System.out.println("Volume: " + b.hitungVolume());
            System.out.println("-----");
        }
    }
}