package Pertemuan5;

public class MataKuliahMain {
    public static void main(String[] args) {
        // Create Objek MataKuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemograman Berorientasi Objek", "B", 3);

        // Tampilkan Daftar Mata Kuliah
        System.out.println("--------- Daftar Mata Kuliah --------");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        MataKuliah[] mk = {mk1, mk2, mk3};
        double ipk = MataKuliah.hitungIPK(mk);
        System.out.println("--- Nilai IPK ---");
        System.out.println("IPK: " + ipk);
    }
}
