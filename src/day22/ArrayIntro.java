package day22;

public class ArrayIntro {

    public static void main(String[] args) {

        int[] scores = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;


        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        scores[1] = 99;
        System.out.println(scores[1]);

        int[] numbers = new int[3];
        System.out.println(numbers[0]); //by default empty int array has 0 in each element
        System.out.println(numbers[1]); //by default empty int array has 0 in each element
        System.out.println(numbers[2]); //by default empty int array has 0 in each element


        byte[] data = new byte[4];
        data[0] = 9;
        data[1] = 7;
        data[2] = 5;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);

        data[2] = 22;

        System.out.println(data[2]);

    }
}
