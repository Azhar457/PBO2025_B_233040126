package Pertemuan11;

public interface Kartu {
    public boolean otentikasi(String pin);// otentikasi pin
    public String encode (String pin);// enkripsi pin
}