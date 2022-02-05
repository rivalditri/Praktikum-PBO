
package PBO.Pertemuan3;

/**
 *
 * @author WINDOWS 10
 */
public class Dog {
    String name;
    
    public static void main(String[] args) {
        //buat objek dan akses
        Dog dog1 = new Dog();       //deklarasi dan inisialisasi objek baru
        dog1.name = "Ciko";         //akses instance variable name dan beri nama Ciko
        dog1.bark();                //akses method bark pada kelas dog
        
        
        //buat array dog
        Dog[] anjing = new Dog[3];  //buat objek reference variable dengan jumlah array3
        anjing[0] = new Dog();      //membuat objek baru pada array index 0
        anjing[1] = new Dog();      //membuat objek baru pada array index 1
        anjing[2] = dog1;           //insialisasi bahwa array index 2 adalah 
                                    //sama dengan objek reference variable dog1
        
        //akses objek menggunakan referensi array
        anjing[0].name = "Dalma";       //nama pada objek index 0 = dalma
        anjing[1].name = "Doggy";       //nama pada objek index 1 = doggy
        
        //coba cetak nama anjing terakhir namanya siapa?
        System.out.println("nama anjing terakhir");
        System.out.println(anjing[2].name);     //mengakses nama pada objek yang terletak
                                                //pada array index - 2
        
        //loop array dan semua anjing menggonggong
        int x = 0;
        while(x < anjing.length){
            anjing[x].bark();
            x++;
        }
    }
    
    public void bark(){
            System.out.println(name +" bersuara guk-guk!!");
    }
}
