package Pertemuan11;

public class Lingkaran extends Bentuk {
    public Lingkaran(int jari2) {
        super(jari2);
    }

    @Override
    public double Luas() {
        return PHI * jari2 * jari2;
    }
}
