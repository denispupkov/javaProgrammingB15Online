package day49;

public abstract class Vehicle {

    int year;
    String model;

    public Vehicle() {

    }

    public Vehicle(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public abstract void start();

    public void goForward() {
        System.out.println("vehicle going forward");
    }
}
