package day59;

public class ThrowingExceptionProgrammatically {

    public static void main(String[] args) {


        //NullPointerException e1 = new NullPointerException();
        NullPointerException e2 = new NullPointerException("Back to Earth!");
        System.out.println(e2.getMessage());
//how do I programmatically throw exception myself we use throw keyword followed by exception object

        throw e2;
    }

}
