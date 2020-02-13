package day58;

public class TryCatchFinally {

    public static void main(String[] args) {

        System.out.println("Before TRY CATCH");

        try {
            System.out.println("Hello from TRY BLOCK");
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Exception CAUGHT");
        }

        System.out.println("After try Catch");


        try {
            System.out.println("Hello from TRY BLOCK");
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Exception CAUGHT");
        } finally {
            System.out.println("Finally block . Runs if there is exception or no exception");
        }


    }
}
