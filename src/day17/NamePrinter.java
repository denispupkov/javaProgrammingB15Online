package day17;

public class NamePrinter {

    public static void main(String[] args) {

        String name = "Denis";
        //int x = 0;
        int number = name.length() - 1;
        while (number >= 0) {


            System.out.println(name.charAt(number));
            --number;


        }
    }
}