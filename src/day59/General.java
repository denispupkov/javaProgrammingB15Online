package day59;

public class General {

    public static void main(String[] args) {

        //Object o = new String ("abc");
        System.out.println("the start");
        String str = "";

        try {
            System.out.println(str.charAt(0));
            System.out.println("end of try");
        } catch (NullPointerException bla) {
            System.out.println("no object here");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("This is the rest of exceptions");
        }
        System.out.println("The end");


    }
}
