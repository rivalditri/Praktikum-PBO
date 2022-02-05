package PBO.Pertemuan3;

public class tes {
    public static void main(String[] args) {
        String[] islands = new String[4];
        int[] index = new int[4];
         
        islands[0] = "kagean";
        islands[1] = "Bangka Belitung";
        islands[2] = "Natuna";
        islands[3] = "Biak";
        
        index[0] =1;
        index[1] =3;
        index[2] =0;
        index[3] =2;
        
        int y = 0;
        int ref;
        while(y < 4){
            ref = index[y];
            System.out.print("Pulau = ");   
            System.out.println(islands[ref]);
            y++;
        }
        
//        3 - 10 -1 - 8 - 4 - 5 - 11 - 9 - 7 - 2 - 6
       
        
    }
}
