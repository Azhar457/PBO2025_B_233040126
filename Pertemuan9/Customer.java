package Pertemuan9;

public class Customer extends Orang {
    private String MemberId;
    
    public Customer(String MemberId, String nama, String alamat) {
        super(nama, alamat);
        setMemberId(MemberId);
    }

    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    public String getMemberId() {
        return MemberId;
    }
}