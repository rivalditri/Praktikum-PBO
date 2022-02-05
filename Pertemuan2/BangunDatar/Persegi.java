package PBO.Pertemuan2.BangunDatar;
public class Persegi {
    double sisi;
    
    void getLuas (double sisi){
        System.out.println("panjang sisi : " + sisi);
        double luas = sisi*sisi;
        System.out.println("Luas = " + luas);
    }
    
    void getKeliling (double sisi){
        double keliling = 4*sisi;
        System.out.println("Keliling = " + keliling);
    }
    
    void printData(){
        System.out.println("=====Menghitung Luas dan "
                          + "Keliling Persegi=====");
        getLuas(sisi);
        getKeliling(sisi);
        System.out.println("");
    }
}
