package Pertemuan11;

public class KartuElektronik implements Kartu {
    private String kodeBank; // Kode Bank tipe data String dan private
    private String pin; // PIN Kartu Elektronik tipe data String dan private


    // Constructor
    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    
    @Override // Method otentikasi
    public boolean otentikasi(String pinInput) {
        if (pin.equals(pinInput))
            return true;
        else
            return false;
    }

    @Override // Method encode
    public String encode(String pin) {
       return null;
    }

}
