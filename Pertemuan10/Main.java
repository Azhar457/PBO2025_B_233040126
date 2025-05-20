package Pertemuan10;

public class Main {
    public static void main(String[] args) {
        Burung burung = new Burung("Merpati", "Putih");

        System.out.println("Nama: " + burung.getNama());
        System.out.println("Warna: " + burung.getWarna());

        burung.suara();
        burung.makan();
        burung.terbang();
        burung.terbangTinggi();
        burung.terbangRendah();
        burung.terbangCepat();
        burung.terbangLambat();
        burung.mendarat();
    }
}
