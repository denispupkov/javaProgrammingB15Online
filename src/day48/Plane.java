package day48;

//we build relationship between class and interface
//using implement keyword

public class Plane implements Flyable {


    String name;
    int capacity;
    int speed;


    @Override
    public void fly() {

        System.out.println("Plane is flying");

    }

    public static void main(String[] args) {

        Plane p1 = new Plane();
        p1.fly();

        //anything static we can access in static way
        //including the static field of interface

        System.out.println(Flyable.HAVE_WING);

    }


}
