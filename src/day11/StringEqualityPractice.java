package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {


        System.out.println("Java".equals("java")); //false


        String myStr = "Java";
        System.out.println(myStr.equals("Java")); //true


        String yourStr = new String("Java");



        System.out.println("is my String same as your String?");

        System.out.println(myStr.equals(yourStr));

    }
}
