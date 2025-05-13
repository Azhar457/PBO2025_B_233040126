package Pertemuan11;

// Deklarasi interface bernama Kartu
// Interface ini mendefinisikan kontrak: jika class mengimplementasinya,
// maka class tersebut wajib mengimplementasikan semua method di bawah.
public interface Kartu {
    public boolean otentikasi(String pin);// otentikasi pin

    public String encode(String pin);// enkripsi pin
}