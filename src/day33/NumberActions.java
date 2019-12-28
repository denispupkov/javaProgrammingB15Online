package day33;

public class NumberActions {

    public static void main(String[] args) {

        System.out.println(getSumFrom1toX(10));


        System.out.println(buildGotEmail("John", "Snow"));

        String fullName = "Susan Cure";

        String part1 = fullName.split(" ")[0]; //THIS IS HOW TO SPLIT STRING
        String part2 = fullName.split(" ")[1];

        String herEmail = buildGotEmail(part1, part2);
        System.out.println("herEmail = " + herEmail);
        ;


    }

    public static int getSumFrom1toX(int number) {

        int finalNumber = 0;

        for (int i = 1; i <= number; i++) {
            finalNumber += i;

        }
        return finalNumber;

    }

    public static String buildGotEmail(String first, String last) {

        String firstName = "";
        String lastName = "";
        String email = "";

        email = first.charAt(0) + last + "@gmail.com";

        return email;
    }


}
