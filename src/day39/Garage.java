package day39;

public class Garage {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.color = "white";
        car1.year = 2019;
        car1.goForward();

        System.out.println("car1.make = " + car1.make);
        System.out.println("car1.year = " + car1.year);
        System.out.println("------------------------");

        Car car2 = new Car();
        car2.make = "Nissan";
        car2.model = "Murano";
        car2.color = "black";
        car2.year = 2015;
        car2.goForward();


        System.out.println("car2 = " + car2.make);
        System.out.println("car2.year = " + car2.year);

        car2.year = 2020;

        System.out.println("car2.year = " + car2.year);

        car2.color = car1.color;

    }
}
