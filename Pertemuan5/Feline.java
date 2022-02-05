package PBO.Pertemuan5;
public class Feline extends Animal {
    @Override
    void roam(){
        setBoundaries_x(300);
        setBoundaries_y(400);
        setLocation_x(random(getBoundaries_x()));
        setLocation_y(random(getBoundaries_y()));
        System.out.println("*****JALAN - JALAN*****");
        System.out.println("jalan jalan dari (0,0) ke lokasi (" + getLocation_x()+","+getLocation_y()+")");
    }
}
