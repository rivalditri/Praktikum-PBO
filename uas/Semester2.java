package uas;
public class Semester2 extends Semester {
    private final String matkul[] = {"Elektronika Digital", "Prak Elektronika Digital", 
        "Pemrograman Berorientasi Objek", "Sejarah Peradaban Islam","Prak PBO","Linear Aljabar",
        "Statistik","Teosofi","Kewarganegaraan, pkpba"};
    private String [] kegiatan;

    @Override
    public void setKegiatan() {
        kegiatan[0] = "ta'lim";
    }
    
    @Override
    public String[] getMatkul() {
        return matkul; 
    }
    
    public String getMatkul(int ke)
    {
    return matkul[ke];
    }
    
    @Override
    public String[] getKegiatan() {
        return kegiatan;
    }

}
