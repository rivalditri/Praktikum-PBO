package PBO;
import javax.swing.JOptionPane;
public class bilangan {

    private static String interact;
    private static String inAwal;
    private static String inAkhir;
    public static void main(String  [] args) {
//deklarasi var        
    int intAwal;
    int intAkhir;
    boolean kondisi;
//input angka user
//konversi int
    intAwal = Integer.parseInt(inAwal);
    intAkhir = Integer.parseInt(inAkhir);
//percabangan user

    switch (interact){
        case "ganjil":
            System.out.println("=====Bilangan ganjil dari " +intAwal+ " sampai "+intAkhir+" adalah");
            printGanjil(intAwal, intAkhir);
            kondisi =false;
                break;
        case "genap":
            System.out.println("=====Bilangan genap dari " +intAwal+ " sampai "+intAkhir+" adalah");
            printGenap(intAwal, intAkhir);
            kondisi = false;
                break;
        case "kelipatan 2":
            System.out.println("=====Bilangan kelipatan 2 dari " +intAwal+ " sampai "+intAkhir+" adalah");
            print2(intAwal, intAkhir);
            kondisi = false;
                break;
        case "kelipatan 3":
            System.out.println("=====Bilangan kelipatan 3 dari " +intAwal+ " sampai "+intAkhir+" adalah");
            print3(intAwal, intAkhir);
            kondisi = false;
                break;
        default:
            JOptionPane.showMessageDialog(null, "data tidak ditemukan! mohon jangan menggunakan huruf kapital");
            kondisi = true;
    
    }
}
    private static void askUser(boolean kondisi){
        while(kondisi){
        interact = JOptionPane.showInputDialog("bilangan apa yang ingin anda tampilkan?"
            + "\nGanjil"
            + "\nGenap"
            + "\nKelipatan 2"
            + "\nKelipatan 3");
        inAwal = JOptionPane.showInputDialog("Masukkan interval batas awal");
        inAkhir = JOptionPane.showInputDialog("Masukkan interval batas akhir");   
        }
    }
    private static void printGanjil(int awal, int akhir){
        for (int i =awal ; i <= akhir; i++) {
            if (i%2 == 1) {
                System.out.print(i +"\t");
                if (i%5 == 0) {
                    System.out.println("");
                }
            }
        }
        System.out.println("");
      }  
    
    private static void printGenap(int awal, int akhir){
        for (int i = awal; i <= akhir; i++) {
            if (i%2 == 0) {
                System.out.print(i + "\t");
                if (i%10 == 0) {
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }
    
    private static void print2(int awal, int akhir){
        for (int i = awal; i <= akhir; i++) {
            if (i%2 == 0) {
                System.out.print(i + "\t");
                if (i%10 == 0) {
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }
    
    private static void print3(int awal, int akhir){
        for (int i = awal; i <= akhir; i++) {
            if (i%3 == 0) {
                System.out.print(i +"\t");
                if(i%15 == 0){
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }

}
