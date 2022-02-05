package PBO.UTS;
import java.util.Scanner;
import javax.swing.*;
public class TestDrive {
    public static void main(String[] args) {
        Suhu fromR = new Reamur();
        Suhu fromC = new Celcius();
        Suhu fromF = new Farenheit();
        Suhu fromK = new Kelvin();
        Scanner input = new Scanner(System.in);
        
        System.out.println("##########KONVERSI SATUAN SUHU##########");
        System.out.println("SATUAN SUHU \n"
                + "1. Reamur (R)\n"
                + "2. Celcius (C)\n"
                + "3. Farenheit (F)\n"
                + "4. Kelvin (K)");
        while(true){
            System.out.println("\n#####INPUT NILAI & SATUAN#####");
            System.out.print("Suhu Awal : ");
            double awal = input.nextDouble();
            System.out.print("Satuan suhu awal : ");
            String fromSuhu = input.next();
            System.out.print("Konversi ke satuan : ");
            String toSuhu = input.next();
            switch(fromSuhu){
                case "C":
                    fromC.setSuhuAwal(awal);
                    fromC.setFromSuhu(fromSuhu);
                    fromC.setToSuhu(toSuhu);
                    fromC.tampil();
                    break;
                case "R":
                    fromR.setSuhuAwal(awal);
                    fromR.setFromSuhu(fromSuhu);
                    fromR.setToSuhu(toSuhu);
                    fromR.tampil();
                    break;
                case "F":
                    fromF.setSuhuAwal(awal);
                    fromF.setFromSuhu(fromSuhu);
                    fromF.setToSuhu(toSuhu);
                    fromF.tampil();
                    break;
                case "K":
                    fromK.setSuhuAwal(awal);
                    fromK.setFromSuhu(fromSuhu);
                    fromK.setToSuhu(toSuhu);
                    fromK.tampil();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Masukkan satuan suhu awal dengan benar [C,R,F,K]",
                            "Warning", JOptionPane.ERROR_MESSAGE);  
                    break;
            }
            int repeat = JOptionPane.showConfirmDialog(null, "Ingin Mengkonversi nilai lagi?", "REPEAT", JOptionPane.YES_NO_OPTION);
            if (repeat == 1) {
                break;
            }
        }
    }
}
