package day58;

public class CheckExceptionDemo {

    public static void main(String[] args) {


        System.out.println("Checked Exception in next line");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("exception was caught");
        }
        System.out.println("After Thread.sleep");
    }
}
