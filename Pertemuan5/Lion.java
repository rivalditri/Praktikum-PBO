package PBO.Pertemuan5;
public class Lion extends Feline{
    String [] makanan = {"Rusa", "anak rusa", "babi hutan", "sapi", "kerbau", "anak kerbau","",""};
    @Override
    void makeNoise(){
        System.out.println("*****SUARA " +getPicture()+"*****");
        if (getHunger()<30) {
            System.out.println("krrr... krr...");
        }else if(getHunger()<100){
            System.out.println("aauumm... auum...");
        }else{
            System.out.println("grooarrr... groaarrr...!");
        }
    }
    private int makanan(){
        int makan = random(makanan.length);
        switch(makan){
            case 0:
                updateHunger(50);
                break;
            case 1:
                updateHunger(25);
                break;
            case 2:
                updateHunger(70);
                break;
            case 3:
                updateHunger(60);
                break;
            case 4:
                updateHunger(55);
                break;
            case 5:
                updateHunger(25);
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
