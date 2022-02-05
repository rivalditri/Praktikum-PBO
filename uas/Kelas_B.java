package uas;

import javax.swing.JOptionPane;

public class Kelas_B extends Kelas {
    
    @Override
    public String getMatkul(int ke)
    {
        return matkul[ke];
    }
    
    @Override
    public void setSenin(int sms)
    {
        switch (sms) {
            case 1:
                matkul[0] = null;
                matkul[1] = jsem1[0];
                matkul[2] = jsem1[1];
                matkul[3] = jsem1[8];
                break;
            case 2:
                matkul[0] = null;
                matkul[1] = null;
                matkul[2] = null;
                matkul[3] = jsem2[9];
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mohon masukkan semester antara 1 dan 2 saja..!");
                break;
        }
    }
    @Override
    public void setSelasa(int sms)
    {
        switch (sms) {
            case 1:
                matkul[0] = null;
                matkul[1] = jsem1[3];
                matkul[2] = null;
                matkul[3] = jsem1[8];
                break;
            case 2:
                matkul[0] = null;
                matkul[1] = null;
                matkul[2] = null;
                matkul[3] = jsem2[9];
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mohon masukkan semester antara 1 dan 2 saja..!");
                break;
        }
    }
    @Override
    public void setRabu(int sms)
    {
        switch (sms) {
            case 1:
                matkul[0] = jsem1[7];
                matkul[1] = jsem1[5];
                matkul[2] = jsem1[2];
                matkul[3] = jsem1[8];
                break;
            case 2:
                matkul[0] = null;
                matkul[1] = null;
                matkul[2] = null;
                matkul[3] = jsem2[9];
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mohon masukkan semester antara 1 dan 2 saja..!");
                break;
        }
    }
    @Override
    public void setKamis(int sms)
    {
        switch (sms) {
            case 1:
                matkul[0] = null;
                matkul[1] = jsem1[6];
                matkul[2] = null;
                matkul[3] = jsem1[8];
                break;
            case 2:
                matkul[0] = null;
                matkul[1] = null;
                matkul[2] = null;
                matkul[3] = jsem2[9];
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mohon masukkan semester antara 1 dan 2 saja..!");
                break;
        }
    }
    @Override
    public void setJumat(int sms)
    {
        switch (sms) {
            case 1:
                matkul[0] = null;
                matkul[1] = jsem1[4];
                matkul[2] = null;
                matkul[3] = jsem1[8];
                break;
            case 2:
                matkul[0] = null;
                matkul[1] = null;
                matkul[2] = null;
                matkul[3] = jsem2[9];
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mohon masukkan semester antara 1 dan 2 saja..!");
                break;
        }
    }
    
    public static void main(String[] args) {
        Kelas_B b = new Kelas_B();
        b.setSenin(1);
            for (int j = 0; j < 3; j++) {
                System.out.println(b.getMatkul(j));
            }
        
        
    }
}
