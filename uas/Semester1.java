package uas;

public class Semester1 extends Semester{
    private final String matkul[] = {"Pancasila","Bahasa Indonesia",
        "Matematika Diskrit","Computer Science",
        "Filsafat Ilmu","Kalkulus","Algoritma & Pemrograman",
        "prak algoritma & pemrograman", "PKPBA"};
    private String kegiatan[];
    
    @Override
    public void setKegiatan(){
    kegiatan[0] = "kegiatan ta'lim";
    }
    
    @Override
    public String [] getMatkul(){
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


