package PBO.UTS;

import javax.swing.JOptionPane;

public class Kelvin extends Suhu { 
    @Override
    double hitungSuhu(){
        double akhir = 0;
        switch(getToSuhu()){
            case "C":
                akhir = (getSuhuAwal() - 273.15);
                setSuhuAkhir(akhir);
                break;
            case "R":
                akhir = (4/5d)*(getSuhuAwal() - 273.15);
                setSuhuAkhir(akhir);
                break; 
            case "F":
                akhir = (9/5d)*(getSuhuAwal() - 273.15) + 32d;
                setSuhuAkhir(akhir);
                break;
            default:
                JOptionPane.showMessageDialog(null, 
                            "Masukkan satuan suhu awal dengan benar [C,R,F,K]",
                            "Warning", JOptionPane.ERROR_MESSAGE);  
                break;
        }
    return getSuhuAkhir();
    }
    @Override
    void tampil(){
        String akhir = getToSuhu();
        System.out.println("~*~*~*~*KONVERSI SUHU DARI K - "+akhir+"*~*~*~*~");
        System.out.println("Suhu awal(K) : " + getSuhuAwal() + "°K");
        System.out.println("Suhu akhir ("+ akhir +") : "+hitungSuhu()+"°"+akhir);
    }
}
