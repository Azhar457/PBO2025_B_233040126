package Pertemuan11;

public abstract class Bentuk {
    protected double PHI = 3.14; //PHI dengan tipe data double dan nilai 3.14 serta protected yang menandakan bahwa
    // variabel ini hanya bisa diakses oleh class ini dan class yang mewarisi class ini
    protected int jari2; // jari2 dengan tipe data int dan protected yang menandakan bahwa
    // variabel ini hanya bisa diakses oleh class ini dan class yang mewarisi class ini
    // Constructor Bentuk
    public Bentuk(int jari2) {
        super();
        this.jari2 = jari2;
    }

    // method abstract Luas() yang tidak memiliki body
    // method ini harus diimplementasikan pada class yang mewarisi class Bentuk
    // method ini digunakan untuk menghitung luas
    // method ini tidak memiliki body karena method ini adalah method abstract
    public abstract double Luas();

    // method getJari2() untuk mendapatkan nilai jari2
    public int getjari2() {
        return jari2;
    }

    // method setJari2() untuk mengubah nilai jari2
    public void setjari2(int jari2) {
        this.jari2 = jari2;
    }



}

