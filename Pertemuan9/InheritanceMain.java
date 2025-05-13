package Pertemuan9;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("123456", "Budi", "Jakarta");
        System.out.println("NIM: " + mhs.getNrp());
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Alamat: " + mhs.getAlamat());
        
    }
}