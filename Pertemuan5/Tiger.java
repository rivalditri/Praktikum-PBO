package PBO.Pertemuan5;
public class Tiger extends Feline {
    String[] makanan = {"zebra", "rusa",""};
    
    @Override
    void makeNoise(){
        System.out.println("*****SUARA "+getPicture()+"*****");
        if (getHunger()<100) {
            System.out.println("krrr...krr...");
        }else{
            System.out.println("AAUUMM... AAUUMM...");
        }
    }
    private int makanan(){
        int makan = random(makanan.length);
        switch(makan){
            case 0:
                updateHunger(50);
                break;
            case 1:
                updateHunger(75);
                break;
            default:
                System.out.println("Tidak mendapatkan makanan");
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
