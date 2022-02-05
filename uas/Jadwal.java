package uas;
public class Jadwal {
    Kelas a = new Kelas_A();
    Kelas b = new Kelas_B();
    Kelas c = new Kelas_C();
    Kelas d = new Kelas_D();
    private final String [][] content = new String[6][4];
    
    public String getContentJadwal(int hari, int jam)
    {
    return content[hari][jam];
    }
    
    public void setSenin(String kelas) {
        a.setSenin(1);
        b.setSenin(1);
        c.setSenin(1);
        d.setSenin(1);
        switch(kelas){
            case "A":
                for (int i = 0; i < 4; i++) {
                    content[1][i] = a.getMatkul(i);
                }
                break;
            case "B":
                for (int i = 0; i < 4; i++) {
                    content[1][i] = b.getMatkul(i);
                }
                break;
            case "C":
                for (int i = 0; i < 4; i++) {
                    content[1][i] = c.getMatkul(i);
                }
                break;
            case "D":
                for (int i = 0; i < 4; i++) {
                    content[1][i] = d.getMatkul(i);
                }
                break;
        }
    }
    
    public void setSelasa(String kelas) {
        a.setSelasa(1);
        b.setSelasa(1);
        c.setSelasa(1);
        d.setSelasa(1);
        switch(kelas){
            case "A":
                for (int i = 0; i < 4; i++) {
                    content[2][i] = a.getMatkul(i);
                }
                break;
            case "B":
                for (int i = 0; i < 4; i++) {
                    content[2][i] = b.getMatkul(i);
                }
                break;
            case "C":
                for (int i = 0; i < 4; i++) {
                    content[2][i] = c.getMatkul(i);
                }
                break;
            case "D":
                for (int i = 0; i < 4; i++) {
                    content[2][i] = d.getMatkul(i);
                }
                break;
        }
    }
    
    public void setRabu(String kelas) {
        a.setRabu(1);
        b.setRabu(1);
        c.setRabu(1);
        d.setRabu(1);
        switch(kelas){
            case "A":
                for (int i = 0; i < 4; i++) {
                    content[3][i] = a.getMatkul(i);
                }
                break;
            case "B":
                for (int i = 0; i < 4; i++) {
                    content[3][i] = b.getMatkul(i);
                }
                break;
            case "C":
                for (int i = 0; i < 4; i++) {
                    content[3][i] = c.getMatkul(i);
                }
                break;
            case "D":
                for (int i = 0; i < 4; i++) {
                    content[3][i] = d.getMatkul(i);
                }
                break;
        }
    }
    public void setKamis(String kelas) {
        a.setKamis(1);
        b.setKamis(1);
        c.setKamis(1);
        d.setKamis(1);
        switch(kelas){
            case "A":
                for (int i = 0; i < 4; i++) {
                    content[4][i] = a.getMatkul(i);
                }
                break;
            case "B":
                for (int i = 0; i < 4; i++) {
                    content[4][i] = b.getMatkul(i);
                }
                break;
            case "C":
                for (int i = 0; i < 4; i++) {
                    content[4][i] = c.getMatkul(i);
                }
                break;
            case "D":
                for (int i = 0; i < 4; i++) {
                    content[4][i] = d.getMatkul(i);
                }
                break;
        }
    }
    public void setJumat(String kelas) {
        a.setJumat(1);
        b.setJumat(1);
        c.setJumat(1);
        d.setJumat(1);
        switch(kelas){
            case "A":
                for (int i = 0; i < 4; i++) {
                    content[5][i] = a.getMatkul(i);
                }
                break;
            case "B":
                for (int i = 0; i < 4; i++) {
                    content[5][i] = b.getMatkul(i);
                }
                break;
            case "C":
                for (int i = 0; i < 4; i++) {
                    content[5][i] = c.getMatkul(i);
                }
                break;
            case "D":
                for (int i = 0; i < 4; i++) {
                    content[5][i] = d.getMatkul(i);
                }
                break;
        }
    }
    
}
