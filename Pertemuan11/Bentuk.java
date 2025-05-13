package Pertemuan11;

public abstract class Bentuk {
    protected double PHI = 3.14;
    protected int jari2;

    public Bentuk(int jari2) {
        super();
        this.jari2 = jari2;
    }
    public abstract double Luas();
    public int getjari2() {
        return jari2;
    }

    public void setjari2(int jari2) {
        this.jari2 = jari2;
    }



}

