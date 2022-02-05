package PBO.Pertemuan5;
public class Cat extends Feline {
    String [] makanan = {"tikus", "ikan", "whiskas",""};
    @Override
    void makeNoise(){
        setPicture("KUCING");
        System.out.println("*****SUARA "+getPicture()+"*****");
        if (getHunger()<30) {
            System.out.println("ngeoong...! ngeoong");
        }else{
            System.out.println("miaw...! miaw...!");
        }
    }
    
    int makanan(){
    int makan = random(makanan.length);
    switch(makan){
        case 0:
            updateHunger(15);
            break;
        case 1:
            updateHunger(30);
            break;
        case 2:
            updateHunger(55);
            break;
        default:
            System.out.println("tidak mendapatkan makanan");
        }
    return makan;
    }
    @Override
    void eat(){
        System.out.println("*****MAKAN*****");
        System.out.println("Level hunger : " + getHunger());
        System.out.println("mencari makan...");
        setFood(makanan[makanan()]);
        System.out.println("menemukan "+ getFood());
        System.out.println("level hunger saat ini : " + getHunger());
    }
}
