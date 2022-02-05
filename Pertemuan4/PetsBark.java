package PBO.Pertemuan4;
public class PetsBark {
    public static void main(String[] args) {
        //buatlah array objek yang dapat menampung 10 objek
        GoodDog[] pets = new GoodDog[10];
        //perulangan objek
        for (int i = 0; i <=pets.length; i++) {
            //deklarasi objek
            try {
            pets[i] = new GoodDog();
            //mendapatkan angka random 1-100
            int random = (int)(Math.random()*100);
            //menentukan size secara random
            pets[i].setSize(random);
            System.out.println("peliharan ke-"+ (i+1) + " berukuran :" + pets[i].getSize() );
            pets[i].bark();
            } catch(Exception e){
                System.out.println("Error on " + e);
            }
        }   
    }
    
    
}
