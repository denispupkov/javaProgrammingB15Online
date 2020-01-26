package day47;

public class Garage {

    public static void main(String[] args) {

        ElectricCar c1 = new ElectricCar();
        //Car c1 = new ElectricCar(); CAN'T CREATE an OBJECT OUT OF ABSTRACT CLASS!!!!
        c1.start();
        c1.goForward();
        c1.goBackward();
        c1.turn("Right");

        GasCar g1 = new GasCar();
        g1.start();
        g1.goForward();
        g1.goBackward();
        g1.turn("Back");

    }
}
