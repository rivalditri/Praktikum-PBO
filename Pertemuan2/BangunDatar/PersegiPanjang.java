package PBO.Pertemuan2.BangunDatar;
public class PersegiPanjang {
    double panjang, lebar;
    
    void getLuas(){
        System.out.println("Panjang : " + panjang);
        System.out.println("lebar : " + lebar);
        double luas = panjang * lebar;
        System.out.println("Luas = " +luas);
    }
    
    void getKeliling(){
        double keliling = 2*(panjang+lebar);
        System.out.println("Keliling = " + keliling);
    }
    
    void printData(){
        System.out.println("=====Menghitung Luas dan"
                    + " Keliling Persegi Panjang=====");
        getLuas();
        getKeliling();
        System.out.println("");
    }
}


