package day47;

//I don't need to create an object using this class
//I only want this class to be super class to provide
//reusable fields and methods for subclasses
//this class is designed to be a super class
public abstract class Car {

    int year;
    String brand;

    //abstract can have abstract method
    //it does not have body, DOES NOT {}
    //it ends with ;
    //it is meant to be overridden to provide body
    public abstract void start();

    public abstract void goForward();

    public abstract void goBackward();

    public abstract void turn(String direction);

    public void doCarThing() {
        System.out.println("non abstract method can be in abstract class");
    }

    public static void doStaticThing() {
        System.out.println("we can have it");
    }
}
