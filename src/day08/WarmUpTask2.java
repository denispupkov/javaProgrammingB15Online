package day08;
import java.util.Scanner;
public class WarmUpTask2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Guess my favorite number");
        int myFavoriteNumber = scan.nextInt();
        if ( myFavoriteNumber==300) { //don't use single equal, only ==!!!

            System.out.println("You are right");
        }
        else {
            System.out.println("you are not my best friend");
        }
    }
}
