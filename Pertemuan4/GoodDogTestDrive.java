package PBO.Pertemuan4;
public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog pertama: " + one.getSize());
        System.out.println("Dog kedua: " + two.getSize());
        System.out.println(two);
        one.bark();
        two.bark();
    }
}
