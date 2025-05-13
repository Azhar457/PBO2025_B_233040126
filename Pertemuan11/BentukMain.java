package Pertemuan11;

public class BentukMain {
    public static void main(String[] args) {
        Bentuk b1 = new Lingkaran(10);// Membuat objek Lingkaran dengan jari-jari 7
        // Menghitung luas lingkaran
        System.out.println("==Lingkaran==");
        System.out.println("Jari-jari: " + b1.getjari2());// Menggunakan method getJari2() untuk mendapatkan
                                                          // nilai jari2
        System.out.println("Luas: " + b1.Luas()); // Menggunakan method Luas() yang diimplementasikan pada
                                                  // class Lingkaran untuk Menghitung luas lingkaran
        System.out.println("==Tabung==");
        Bentuk b2 = new Tabung(10, 5); // Membuat objek Tabung dengan jari-jari 7 dan tinggi 10
        System.out.print("Jari-jari: " + b2.getjari2()); // Menggunakan method getJari2() untuk mendapatkan
                                                         // nilai jari2
        System.out.println(" Tinggi: " + ((Tabung) b2).getTinggi()); // Menggunakan method getTinggi() untuk
                                                                     // mendapatkan nilai tinggi
        System.out.println("Luas: " + b2.Luas()); // Menghitung luas tabung
        // Menggunakan method Luas() yang diimplementasikan pada class Tabung

        // Pertanyaan
        // 1. Sebutkan method abstrak yang terdapat di kelas abstrak Bentuk !
        // 2. Jelaskan apa perbedaannya method luas di kelas Bentuk dan di kelas
        // Lingkaran dan kelas Tabung!
        // 3. Jelaskan bagaimana jika method luas di kelas Tabung dihilangkan atau tidak
        // mengimplementasikannya!
        // 4. Buatlah kelas main sehingga outputnya seperti dibawah ini:
        // 5. Buatlah diagram kelas dari contoh program kelas abstrak!

        // Jawaban :
        // 1. Method abstrak yang terdapat di kelas abstrak Bentuk adalah method Luas()
        // 2. Perbedaan method luas di kelas Bentuk dan di kelas Lingkaran dan kelas
        // Tabung
        // adalah method luas di kelas Bentuk tidak memiliki body sedangkan method luas
        // di
        // kelas Lingkaran dan kelas Tabung memiliki body yang berisi rumus untuk
        // menghitung
        // luas lingkaran dan tabung
        // 3. Jika method luas di kelas Tabung dihilangkan atau tidak
        // mengimplementasikannya
        // maka akan terjadi error karena method luas di kelas Bentuk adalah method
        // abstrak
        // yang harus diimplementasikan pada class yang mewarisi class Bentuk
        // 4. Kelas main sudah dibuat di atas
        // 5. Diagram kelas dari contoh program ada di folder Pertemuan11
    }
}
