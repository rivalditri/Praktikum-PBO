package PBO;
import javax.swing.JOptionPane;
public class BilanganFix {
    public static void main(String[] args) {
        //menjalankan program dengan memanggil method askUser
        askUser();
    }
//membuat method askUser    
    private static void askUser(){
        String choice = JOptionPane.showInputDialog("bilangan apa yang ingin anda tampilkan?"   //menanyakan pilihan user
            + "\nGanjil"
            + "\nGenap"
            + "\nKelipatan 2"
            + "\nKelipatan 3");
    //check apakah yang diinputkan user sesuai pilihan
        check(choice);
    //menanyakan interval awal dan akhir melalui JOption    
        String min = JOptionPane.showInputDialog("Masukkan interval awal");
        String max = JOptionPane.showInputDialog("Masukkan interval akhir");
    //mengkonversi nilai string Joption ke Integer    
        int awal = Integer.parseInt(min);
        int akhir = Integer.parseInt(max);
    //percabangan berdasarkan input yang dimasukkan user melalui JOption pertama    
        switch(choice){
            case"ganjil":                   //jika yang dimasukkan ganjil maka
                printGanjil(awal, akhir);   //method printGanjil akan dipanggil dengan argumen nilai interval awal dan akhir
                break;
            case"genap":
                printGenap(awal, akhir);
                break;
            case"kelipatan2":
                print2(awal, akhir);
                break;
            case"kelipatan3":
                print3(awal, akhir);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Jangan menggunakan Huruf kapital");
                askUser();
        }
            
    }
//membuat method check dengan parameter cek untuk memeriksa apakah input user sesuai dengan pilihan
//ganjil , genap , kelipatan 2 , kelipatan3    
    private static void check(String cek){
    //jika benar maka program dijalankan    
        if (cek.equalsIgnoreCase("ganjil") || cek.equalsIgnoreCase("genap")
            || cek.equalsIgnoreCase("kelipatan2") || cek.equalsIgnoreCase("kelipatan3")) {
            System.out.println("===== data bilangan "+ cek + " =====" );
        }
        //jika input user tidak sesuai dengan pilihan maka akan tampil message berikut
        else{
            JOptionPane.showMessageDialog(null, "error..! data not found");
            JOptionPane.showMessageDialog(null, "Mohon jangan menggunakan spasi");
        //dan ini untuk melakukan perulangan pertanyaan kepada user
        //user akan ditanya lagi pilihan bilangan apa lagi sampai user memasukkan input yang sesuai pilihan
            askUser();
        }
        
    }
    private static void printGanjil(int awal, int akhir){
        for (int i =awal ; i <= akhir; i++) {       //melakukan perulangan dari nilai batas awal sampai batas akhir
            if (i%2 == 1) {                         //jika sisa hasil bagi i dengan 2 ada sisa maka nilai i akan dimunculkan
                System.out.print(i +"\t");
                if (i%5 == 0) {                     //membuat baris baru setiap kelipatan 5
                    System.out.println("");
                }
            }
        }
        System.out.println("");
      }  
    
    private static void printGenap(int awal, int akhir){    //fungsinya sama dengan printganjil hanya saja ini genap
        for (int i = awal; i <= akhir; i++) {
            if (i%2 == 0) {                                 //jika i dibagi 2 tidak bersisa maka itu adalah genap
                System.out.print(i + "\t");                 //dan nilai i akan dimunculkan
                if (i%10 == 0) {                            //setiap kelipatan 10 membuat baris baru
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }
    
    private static void print2(int awal, int akhir){        //sama dengan genap
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
    
    private static void print3(int awal, int akhir){        //sama saja
        for (int i = awal; i <= akhir; i++) {
            if (i%3 == 0) {                                 //hanya berbeda disini ini untuk tiap kelipatan 3 saja
                System.out.print(i +"\t");
                if(i%15 == 0){
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }
}
