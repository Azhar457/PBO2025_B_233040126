package Pertemuan9;

public class Employee extends Orang {
    private String Nik;
    private Integer gaji;

    public Employee(String nik, Integer gaji, String nama, String alamat) {
        super(nama, alamat);
        setNik(nik);
        setGaji(gaji);
    }
    
    public void setNik(String nik) {
        this.Nik = nik;
    }
    public String getNik() {
        return Nik;
    }
    public void setGaji(Integer gaji) {
        this.gaji = gaji;
    }
    public Integer getGaji() {
        return gaji;
    }
}