package Pertemuan13;

public class Tabung extends Bentuk {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    @Override
    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}