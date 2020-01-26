package day47;

public class GasCar extends Car {

    int gasLevel;

    @Override
    public void start() {
        System.out.println("Gas car is starting");
    }

    @Override
    public void goForward() {
        System.out.println("Gas car going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Gas car going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Gas car turning to the " + direction);
    }
}
