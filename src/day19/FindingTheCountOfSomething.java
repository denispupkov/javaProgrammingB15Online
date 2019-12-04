package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        // from 1-100 print out all the numbers that can be divided by 15 without remainder
        int counter = 0;


        // if (num%15==0) {
        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {

                System.out.println(i);
                ++counter;
            }

        }

        System.out.println("Count of numbers that could be devidid by 15: " + counter);


        //how many 'p' characters in the string
        int i = 0;
        int countOfChar = 0;
        String name = "Cucumber";


        for (i = 0; i < name.length(); i++) {

            System.out.println(name.charAt(i));

            if (name.charAt(i) == 'u') {
                System.out.println("BINGO");
                ++countOfChar;
            }
        }

        System.out.println("Number of Characters is " + countOfChar);


    }
}
