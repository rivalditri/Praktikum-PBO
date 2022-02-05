package PBO.UTS;
public class Suhu {
    private double suhuAwal;
    private double suhuAkhir;
    private String fromSuhu;
    private String toSuhu;

    public double getSuhuAwal() {
        return suhuAwal;
    }

    public void setSuhuAwal(double suhuAwal) {
        this.suhuAwal = suhuAwal;
    }
    
    public double getSuhuAkhir() {
        return suhuAkhir;
    }

    public void setSuhuAkhir(double suhuAkhir) {
        this.suhuAkhir = suhuAkhir;
    }

    public String getFromSuhu() {
        return fromSuhu;
    }

    public void setFromSuhu(String fromSuhu) {
        this.fromSuhu = fromSuhu;
    }

    public String getToSuhu() {
        return toSuhu;
    }

    public void setToSuhu(String toSuhu) {
        this.toSuhu = toSuhu;
    }
    
    double hitungSuhu(){
        return getSuhuAkhir();
    }
    
    void tampil(){
        System.out.println("##########KONVERSI SUHU##########");
        System.out.println("Suhu Awal : " + getSuhuAwal());
        System.out.println("Suhu Akhir : " + getSuhuAkhir());
    }
}
