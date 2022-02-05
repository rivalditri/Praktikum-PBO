package PBO.Pertemuan5;
public class Hippo extends Animal{
    String [] makanan = {"rumput", "buah-buahan", "kacang-kacangan","alang-alang",""};
    @Override
    void makeNoise(){
        System.out.println("*****SUARA "+getPicture()+ "*****");
        if (getHunger()<50) {
            System.out.println("nguoo.. nguoo..!");
        }
        else{
            System.out.println("roaar...! roaarr..!");
        }
    }
    
    private int makanan(){
        int makan = random(makanan.length);
        switch(makan){
            case 0:
                updateHunger(60);
                break;
            case 1:
                updateHunger(50);
                break;
            case 2:
                updateHunger(20);
                break;
            case 3:
                updateHunger(15);
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
