package PBO.Pertemuan3;
import javax.swing.JOptionPane;
public class jadwalKuliah {
    String nama;    //instance primitive variable
    String hari [] = {"SENIN", "SELASA", "RABU", "KAMIS", "JUMAT"};
    //nilainya didapet dari method setJadwal
    String[][] mataKuliah = new String[5][4];
    //nilai jam kuliah udah di tentuin
    String[] jamKuliah = {"06.00 - 09.00","09.30 - 11.30", "12.00 - 14.00", "14.00 - 17.00"};
    
    public void setJadwal(){
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null,"jadwal hari : " + hari[i]);
            for (int j = 0; j < 4; j++) {
                mataKuliah[i][j] = JOptionPane.showInputDialog
                                  (hari[i] +"\nmasukkan Mata Kuliah ke-" + (j+1));
            }
        }
    }
    
    
    public void printJadwal(){
        int jawab = JOptionPane.showConfirmDialog(null, 
                    "apakah anda ingin menampilkan jadwal?", 
                    "confirm Dialogue", JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            System.out.println("*-*-*-Jadwal " + nama + " Semester 1-*-*-*");
            for (int i = 0; i < 5; i++) {
                System.out.println(hari[i]);
                for (int j = 0; j < 4; j++) {
                    System.out.println(jamKuliah[j] + " : " + mataKuliah[i][j]);
                }
            }
        }
    }
}
    

class testDrive{
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("berapa banyak orang yang ingin membuat jadwal?");
        int jumlah = Integer.parseInt(input);
        jadwalKuliah[] orang = new jadwalKuliah[jumlah];
        
        for (int i = 0; i < orang.length; i++) {
          orang[i] = new jadwalKuliah();
          orang[i].nama = JOptionPane.showInputDialog("Nama Pemilik Jadwal :");
          orang[i].setJadwal();
          orang[i].printJadwal();
        }
    }
}

