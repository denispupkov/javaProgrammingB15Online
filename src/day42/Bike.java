package day42;

public class Bike {

    int gear;
    int speed;

    //constructor is a block of code that has the same name as class name
    // and has no return type
    //the only time you can call this is when object is being created!!!
    // it helps to create the object with initial value (not empty!!!)

    public Bike() {
        System.out.println("message from constructor");
        gear = 1;
    }

    public Bike(int newGear) {
        this.gear = newGear;
    }

    public Bike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public Bike(String str) {
        System.out.println("Accept String");
    }
}
