package Pertemuan5;

public class GelasMain {
    public static void main(String[] args) {
		Gelas g1 = new Gelas("Hitam");
		Gelas g2 = new Gelas("Biru");

        TukarWarnaGelas(g1, g2);
        System.out.println("Warna Gelas 1: " + g1.getWarna());
        System.out.println("Warna Gelas 2: " + g2.getWarna());
	}

    static void TukarWarnaGelas(Gelas g1, Gelas g2) {
        Gelas gtemp = new  Gelas("Temp");
        gtemp.setWarna(g1.getWarna());
        g1.setWarna(g2.getWarna());
        g2.setWarna(gtemp.getWarna());
    }
}
