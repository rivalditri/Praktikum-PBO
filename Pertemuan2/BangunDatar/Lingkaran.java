package PBO.Pertemuan2.BangunDatar;
public class Lingkaran {
    double jari;
    String nama;
    
    void getLuas(){
        System.out.println("jari-jari : " + jari);
        double luas = Math.PI *jari *jari;
        System.out.println("Luas = " + luas);
    }
    
    void getKeliling(){
        double keliling = Math.PI * jari *2;
        System.out.println("Keliling = " + keliling);
    }
    
    void printData(){
        System.out.println("=====Menghitung Luas dan "
                            + "Keliling lingkaran=====");
        getLuas();
        getKeliling();
        System.out.println("");
    }
}

