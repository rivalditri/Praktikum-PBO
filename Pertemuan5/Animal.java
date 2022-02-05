package PBO.Pertemuan5;
public class Animal {
    private String picture;         //instance variable untuk menampung nama hewan
    private String food;            //instance variable untuk menampung jenis makanannya
    private int hunger = 0;         //level hunger untuk semua hewan
    private int boundaries_x = 0;   //batas lokasi koordinat -x hewan dapat berkeliaran
    private int boundaries_y = 0;   //batas lokasi koordinat -y hewan dapat berkeliaran
    private int location_x = 0;     //lokasi koordinat -x hewan berkeliaran
    private int location_y = 0;     //lokasi koordinat -y hewan berkeliaran

    
    
    public int random(int interval){        //untuk mendapatkan nilai random
    return (int)(Math.random()*interval);
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String p) {
        picture = p;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String f) {
        food = f;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger() {
        hunger = 0;
    }
    
    public void updateHunger(int makan){
        hunger += makan;
    }

    public int getBoundaries_x() {
        return boundaries_x;
    }

    public void setBoundaries_x(int x) {
        boundaries_x = x;
    }

    
    public int getBoundaries_y() {
        return boundaries_y;
    }

    public void setBoundaries_y(int y) {
        boundaries_y = y;
    }
    
    public int getLocation_x() {
        return location_x;
    }

    public void setLocation_x(int x) {
        location_x = x;
    }

    public int getLocation_y() {
        return location_y;
    }

    public void setLocation_y(int y) {
        location_y = y;
    }
    
void makeNoise(){                   //secara umum semua hewan bersuara bum bum jika tidak di override di subclass
    System.out.println("bum bum bum...!");
}

void eat(){
    hunger += 20;                   //kalau makan level hunger bertambah 20
}

void sleep(){                       //method tidur untuk semua jenis hewan
    System.out.println("*****TIDURR*****");
    System.out.println("dah lah cape tidur");
    System.out.println("zzz..! zz..!");
}

void roam(){                        //method jalan jalan untuk HIPPO karena hanya HIPPO yang merujuk ke method ini
    setBoundaries_x(400);
    setBoundaries_y(400);
    System.out.println("bergerak dari (" + getLocation_x() + "," + getLocation_y()+")");
    setLocation_x(random(getBoundaries_x()));
    setLocation_y(random(getBoundaries_y()));
    System.out.println("menuju lokasi (" + getLocation_x() + "," + getLocation_y()+")" );
}
}


