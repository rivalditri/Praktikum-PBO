package PBO.Pertemuan5;
public class Wolf extends Canine{
    String [] makanan = {"rusa", "babi hutan","babi hutan", "kelinci", ""};
    @Override
    void makeNoise(){
        System.out.println("*****SUARA " + getPicture()+"*****");
        if (getHunger()<55) {
            System.out.println("woof... woof....!");
        }else {
            System.out.println("auuuwww....!!");
        }
    }
    private int makanan(){
        int makan = random(makanan.length);
        switch(makan){
            case 0:
                updateHunger(80);
                break;
            
            case 1:
                updateHunger(50);
                break;
            
            case 2:
                updateHunger(50);
                break;
            
            case 3:
                updateHunger(20);
                break;
                
            default:
                System.out.println("tidak mendapatkan makanan");
        }
        return makan;
    }
    @Override
    void eat(){
        System.out.println("level hunger : " + getHunger());
        System.out.println("mencari makanan...");
        setFood(makanan[makanan()]);
        System.out.println("menemukan "+ getFood());
        System.out.println("level hunger saat ini : " + getHunger());
    }
}
