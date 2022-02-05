package uas;

import javax.swing.JOptionPane;
//CLASS UNTUK MENGATUR JADWAL KELAS A
public class Kelas_A extends Kelas {
    //METHOD OVERRIDE UNTUK MENDAPATKAN VALUE MATKUL KELAS A
    
    @Override
    public String getMatkul(int ke)
    {
        return matkul[ke];
    }
    //METHOD OVERRIDE UNTUK MENGATUR JADWAL KELAS A PADA HARI SENIN
    @Override
    public void setSenin(int sms)
    {
        //PERCABANGAN SEMESTER 1 DAN 2
        switch (sms) {
            //JADWAL PADA SEMESTER 1
            //URUTAN INDEX JADWAL SEMESTER 1
            //0 = PANCASILA | 1 = BI | 2 = MATDIS | 3 = ITCS | 4 = FILSAFAT
            //5 = KALKULUS | 6 = ALPRO | 7 = PRAK ALPRO | 8 = PKPBA
            case 1:
                matkul[0] = jsem1[0];       //SET JAM PERTAMA PADA HARI SENIN
                matkul[1] = jsem1[1];       //SET JAM KEDUA PADA HARI SENIN
                matkul[2] = jsem1[2];
                matkul[3] = jsem1[8];
                break;
            case 2:
                matkul[0] = null;     //SET NULL KARENA PADA SEMESTER 2 MEMILIH SKS SENDIRI
                matkul[1] = null;
                matkul[2] = null;
                matkul[3] = jsem2[9]; //DEFAULT JADWAL JAM TERAKHIR SELALU PKPBA
                break;
        }
    }
    @Override
    public void setSelasa(int sms)
    {
        switch (sms) {
            case 1:
                matkul[0] = jsem1[3];
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
    @Override
    public void setRabu(int sms)
    {
        switch (sms) {
            case 1:
                matkul[0] = jsem1[5];
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
    public void setKamis(int sms)
    {
        switch (sms) {
            case 1:
                matkul[0] = jsem1[7];
                matkul[1] = null;
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
                matkul[1] = null;
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
}
