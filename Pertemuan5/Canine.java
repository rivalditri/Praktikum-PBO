package PBO.Pertemuan5;
public class Canine extends Animal{
    @Override
    void roam(){
        setBoundaries_x(600);
        setBoundaries_y(800);
        setLocation_x(random(getBoundaries_x()));
        setLocation_y(random(getBoundaries_y()));
        System.out.println("*****JALAN - JALAN*****");
        System.out.println("otw cari temen nih sob");
        System.out.println("woke dah ketemu "+random(10)+ " pasukan nih gass");
        System.out.println("jalan jalan dari (0,0) ke lokasi (" + getLocation_x()+","+getLocation_y()+")");
    }
}
