package day43;

public class StarbuckUtil {

    public static void main(String[] args) {

        Coffee c = new Coffee("Blonde", 5, 1.6);
        printCoffeeInfo(c);
        String myString = new String("Hello");
        printStringInfo(myString);

        Coffee c1 = new Coffee();
        printCoffeeInfo(c1);
        printCoffeeInfo(new Coffee("Intensito", 10));


    }

    public static void printCoffeeInfo(Coffee co) {

        System.out.println("This coffee is: " + co.getName());
        System.out.println("price is = " + co.getPrice());
        System.out.println("Caffeine level is " + co.getCaffeineLevel());
    }

    public static void printStringInfo(String str) {

        System.out.println("first character is  " + str.charAt(0));
        System.out.println("last character is  " + str.charAt(str.length() - 1));
    }

}
