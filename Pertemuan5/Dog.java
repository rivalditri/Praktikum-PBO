package PBO.Pertemuan5;
public class Dog extends Canine{
    String [] makanan = {"tulang", "daging","sisa makanan","ikan",""};
    @Override
    void makeNoise(){
        System.out.println("*****SUARA "+getPicture()+"*****");
        if (getHunger()<30) {
            System.out.println("kaing... kaing...!");
        }else if(getHunger()<75){
            System.out.println("woof...! woof...!");
        }else{
            System.out.println("GUUK...! GUUK.!");
        }
    }
    
    private int makanan(){
        int makan = random(makanan.length);
        switch(makan){
            case 0:
                updateHunger(40);
                break;
            case 1:
                updateHunger(60);
                break;
            case 2:
                updateHunger(20);
                break;
            case 3:
                updateHunger(30);
                break;
            default:
                System.out.println("tidak mendapatkan makanan");
        }
        return makan;
    }
    @Override
    void eat(){
        System.out.println("*****MAKAN*****");
        System.out.println("level hunger : " + getHunger());
        System.out.println("mencari makanan...");
        setFood(makanan[makanan()]);
        System.out.println("menemukan "+ getFood());
        System.out.println("level hunger saat ini : " + getHunger());
    }
}
