package day31;

public class AdultChecker {

    public static void main(String[] args) {

        int age = 15;

        checkEligibility(19);
        checkEligibility(23);
        checkEligibility(13);
        checkEligibility(age);
    }

    public static void checkEligibility(int age) {

        // int age =15;

        if (age > 18) {

            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible");
        }

    }


}
