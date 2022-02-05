package PBO.Pertemuan2.BangunDatar;

public class TestDrive {
    public static void main(String[] args) {
        PersegiPanjang bangun1 = new PersegiPanjang();
        bangun1.panjang = 4;
        bangun1.lebar = 5;
        bangun1.printData();
        
        Persegi bangun2 = new Persegi();
        bangun2.sisi = 5;
        bangun2.printData();
        
        Lingkaran bangun3 = new Lingkaran ();
        bangun3.jari = 14;
        bangun3.printData();
    }
}
