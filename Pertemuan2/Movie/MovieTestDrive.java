package PBO.Pertemuan2.Movie;

class Movie {
   String tittle;
   String genre;
   int rating;
   
    void playit(){
       System.out.println("Playing the movie \n"
               + tittle +"\n"
               + genre + "\n"
               + rating);
   }
}
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie satu = new Movie();
        Movie dua = new Movie();
        Movie tiga = new Movie();
        
        satu.tittle = "Ayat - ayat cinta";
        satu.genre = "islami";
        satu.rating = 4;
        
        dua.tittle = "the davinci code";
        dua.genre = "misteri";
        dua.rating = 4;
        dua.playit();
        
        tiga.tittle = "Sang pencerah";
        tiga.genre = "islami";
        tiga.rating = 5;
    }
}
