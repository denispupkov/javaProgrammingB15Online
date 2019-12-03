package day17;

import java.util.Scanner;

public class FullNameCorrector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fullName = "aRYa sTarK";
        System.out.println("Enter first and last name");
        fullName = scan.nextLine();


        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        String firstNameCorrected = firstName.toUpperCase().substring(0, 1) + firstName.toLowerCase().substring(1);
        String lastNameCorrected = lastName.toUpperCase().substring(0, 1) + lastName.toLowerCase().substring(1);

        System.out.println(firstNameCorrected + " " + lastNameCorrected);
    }
}
