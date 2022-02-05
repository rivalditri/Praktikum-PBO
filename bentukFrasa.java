package PBO;
public class bentukFrasa {
    public static void main(String[] args){
        //membuat 3 kumpulan kata-kata untuk dipilih, Silahkan menambah kata - kata anda
        String [] listKataSatu = {"rumah","sepedah","ayam","jam","baju","mobil","laptop","smarthpone"};
        String [] listKataDua = {"canggih","nyaman","enak","terbaru","besar","hitam","bagus","luas"};
        String [] listKataTiga = {"itu","diatas","milikmu","miliknya","di toko","baru","putih"};
        //cari berapa banyak kata di setiap list
        int jumlah1 = listKataSatu.length;
        int jumlah2 = listKataDua.length;
        int jumlah3 = listKataTiga.length;
        //mengenereta 3 bilangan random sesuai dengan banyaknya kata disetiap list
        String kata1 = (listKataSatu[getRandom(jumlah1, 0)]);
        String kata2 = (listKataDua[getRandom(jumlah2, 0)]);
        String kata3 = (listKataTiga[getRandom(jumlah3, 0)]);
        //penggabungan Frasa
        System.out.println("saya ingin memiliki "+kata1 +" "+ kata2 +" "+ kata3);
    }
    
    private static int getRandom(int awal, int akhir){
        int random = (int)(Math.random()*(akhir - awal)+awal);
        return random;
    }
}
