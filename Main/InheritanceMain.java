package Main;
import Pertemuan9.*;
public class InheritanceMain {
    public static void main(String[] args) {
        Customer cust = new Customer("00001", "Andi", "Bandung");
        System.out.println("Member ID: " + cust.getMemberId());
        System.out.println("Nama: " + cust.getNama());
        System.out.println("Alamat: " + cust.getAlamat());
        System.out.println("====================================");
        Employee emp = new Employee("E123", 500000, cust.getNama(), cust.getAlamat());
        System.out.println("Nik: " + emp.getNik());
        System.out.println("Gaji: " + emp.getGaji());
        System.out.println("Nama: " + emp.getNama());
        System.out.println("Alamat: " + emp.getAlamat());
        System.out.println("====================================");
    }
}