package PBO.UTS;

import javax.swing.JOptionPane;

public class Reamur extends Suhu {
    @Override
    double hitungSuhu(){
        double akhir =0;
        switch(getToSuhu()){
            case "C":
                akhir = (5/4d)*getSuhuAwal();
                setSuhuAkhir(akhir);
                break;
            case "F":
                akhir = ((9/4d)*getSuhuAwal()) + 32d;
                setSuhuAkhir(akhir);
                break; 
            case "K":
                akhir = ((5/4d)*getSuhuAwal()) + 273.15;
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
        System.out.println("~*~*~*~*KONVERSI SUHU DARI R - "+akhir+"*~*~*~*~");
        System.out.println("Suhu awal(R) : " + getSuhuAwal() + "°R");
        System.out.println("Suhu akhir ("+ akhir +") : "+hitungSuhu()+"°"+akhir);
    }
}
