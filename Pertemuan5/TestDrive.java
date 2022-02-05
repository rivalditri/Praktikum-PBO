package PBO.Pertemuan5;
import javax.swing.JOptionPane;
public class TestDrive {
    public static void main(String[] args) {
        
        Animal [] a = new Animal[6];
        a[0] = new Lion();
        a[1] = new Cat();
        a[2] = new Tiger();
        a[3] = new Hippo();
        a[4] = new Dog();
        a[5] = new Wolf();
        
        String [] picture = {"SINGA", "KUCING", "HARIMAU", "KUDA NIL", "ANJING", "SERIGALA"};
        for (int i = 0; i < a.length; i++) {
            a[i].setPicture(picture[i]);
            System.out.println("\n~*~*~*~*~*"+a[i].getPicture()+"~*~*~*~*~*");
            a[i].roam();
            
            while(true){
                a[i].eat();
                int jawab = JOptionPane.showConfirmDialog(null, "cari makan lagi?");
                if (jawab==1) {
                    break;
                }
            }
            a[i].makeNoise();
            a[i].sleep();
        }
    }
}
