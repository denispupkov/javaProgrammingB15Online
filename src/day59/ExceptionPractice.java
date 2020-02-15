package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The start");
        String name = "Furkan";

        System.out.println(" Char at what index you wanna get from Furkan's name?");

        try {
            int targetIndex = scan.nextInt();

            System.out.println(name.charAt(targetIndex));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Message from getMessage method: " + e.getMessage());
            System.out.println("Enter between 0 and " + name.length());
        } catch (InputMismatchException bla) {
            System.out.println("input musmatch , enter number!!!");
            System.out.println("Here is what you get if you enter 0 " + name.charAt(0));
        }
        System.out.println("The end");
        //StringIndexOutOfBoundsException e1  = new StringIndexOutOfBoundsException();
        //System.out.println(e1.toString());


    }
}
