package day55;

public class Casting {

    public static void main(String[] args) {

        int x = 10;
        long y = x;
        byte b = (byte) x;//casting required

        Object o = new Dog("Chiwava"); //this is upcasting from Dog obj to Object
//o.bark();
        Dog d = (Dog) o; //using downcasting from Object o to Dog

        d.bark();

    }
}
