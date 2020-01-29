package day49;

public class Tesla extends Vehicle implements Autonomus, Chargeble {

    int horsePower;
    String model;


    public Tesla(int year, String model, int horsePower) {
        super(year, model);
        this.horsePower = horsePower;

    }

    @Override
    public void selfDrive() {
        System.out.println("tesla is self driving");
    }

    @Override
    public void start() {
        System.out.println("tesla is starting");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", year=" + year + " model " + model +
                '}';
    }
}
