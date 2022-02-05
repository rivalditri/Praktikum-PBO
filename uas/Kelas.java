package uas;
abstract class Kelas{
    Semester sem1 = new Semester1();
    Semester sem2 = new Semester2();
    String[] jsem1 = sem1.getMatkul();
    String[] jsem2 = sem2.getMatkul();
    protected String matkul[] = new String[4];
    
    abstract String getMatkul(int ke);
    abstract void setSenin(int sms);
    abstract void setSelasa(int sms);
    abstract void setRabu(int sms);
    abstract void setKamis(int sms);
    abstract void setJumat(int sms);
    
}
