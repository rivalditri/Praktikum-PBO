package PBO.UTS;

import javax.swing.JOptionPane;

public class Farenheit extends Suhu{
    @Override
    double hitungSuhu(){
        double akhir =0;
        switch(getToSuhu()){
            case "C":
                akhir = (5/9d)*(getSuhuAwal()-32d);
                setSuhuAkhir(akhir);
                break;
            case "R":
                akhir = (4/9d)*(getSuhuAwal()-32d);
                setSuhuAkhir(akhir);
                break; 
            case "K":
                akhir = (5/9d)*(getSuhuAwal()-32d) + 273.15;
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
        System.out.println("~*~*~*~*KONVERSI SUHU DARI F - "+akhir+"*~*~*~*~");
        System.out.println("Suhu awal(F) : " + getSuhuAwal() + "°F");
        System.out.println("Suhu akhir ("+ akhir +") : "+hitungSuhu()+"°"+akhir);
    }
}
