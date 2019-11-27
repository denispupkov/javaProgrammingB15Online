package day08;

public class MultibranchIfStatement {

    public static void main(String[] args) {

        int currentSpeed = 80;
        //int speedLimit= 60;

        if (currentSpeed>80) {
            System.out.println("jail");
        }
        else if (currentSpeed>70) {
            System.out.println("reckless driving");
        }
        else if (currentSpeed>60) {
            System.out.println("warning");
        }
        else {
            System.out.println("keep driving");
        }
    }
}
