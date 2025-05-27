package Pertemuan13;

public class Lingkaran extends Bentuk {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungVolume() {
        return 0; // Lingkaran tidak punya volume
    }
}