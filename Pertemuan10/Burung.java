package Pertemuan10;

public class Burung extends Hewan implements Flyable {
	private String nama;
	private String warna;

	public Burung(String nama, String warna) {
		this.nama = nama;
		this.warna = warna;
	}

    @Override
	public void suara() {
		System.out.println("Wut, Wut");
	}

	@Override
	public void makan() {
		System.out.println("Biji");
	}

	// Implementasi metode Flyable
	@Override
	public void terbang() {
		System.out.println(nama + " sedang terbang.");
	}

	@Override
	public void mendarat() {
		System.out.println(nama + " mendarat.");
	}

	@Override
	public void terbangTinggi() {
		System.out.println(nama + " terbang tinggi.");
	}

	@Override
	public void terbangRendah() {
		System.out.println(nama + " terbang rendah.");
	}

	@Override
	public void terbangCepat() {
		System.out.println(nama + " terbang cepat.");
	}

	@Override
	public void terbangLambat() {
		System.out.println(nama + " terbang lambat.");
	}

	// Getter dan Setter
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getWarna() {
		return warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}
}
