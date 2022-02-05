package PBO.UTS;
import javax.swing.JOptionPane;
public class Celcius extends Suhu{
    @Override
    double hitungSuhu(){
        double akhir =0;
        switch(getToSuhu()){
            case "R":
                akhir = (4/5d)*getSuhuAwal();
                setSuhuAkhir(akhir);
                break;
            case "F":
                akhir = ((9/5d)*getSuhuAwal()) + 32d;
                setSuhuAkhir(akhir);
                break; 
            case "K":
                akhir = getSuhuAwal() + 273.15;
                setSuhuAkhir(akhir);
                break;
            default:
                JOptionPane.showMessageDialog(null, 
                            "Masukkan satuan suhu akhir dengan benar [C,R,F,K]",
                            "Warning", JOptionPane.ERROR_MESSAGE);  
                break;
        }
    return getSuhuAkhir();
    }
    @Override
    void tampil(){
        String akhir = getToSuhu();
        System.out.println("~*~*~*~*KONVERSI SUHU C - "+akhir+"*~*~*~*~");
        System.out.println("Suhu awal(C) : " + getSuhuAwal() + "°C");
        System.out.println("Suhu akhir ("+ akhir +") : "+hitungSuhu()+"°"+akhir);
    }
}
