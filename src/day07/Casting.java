package day07;

public class Casting {

    public static void main(String[] args) {

        //int num = 10;
        double bigNum = 10;
        System.out.println(bigNum);

        // int num =12.99; //compiler error
        int num = (int) 12.99; //do casting from double to int

        System.out.println(num);

        long earthToMoon = 123456;

        int earthToMoon_Int = (int) earthToMoon;

        System.out.println(earthToMoon_Int);




    }
}
