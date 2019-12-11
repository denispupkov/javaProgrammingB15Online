package day23;
import java.util.Scanner;
public class Repr092 {

    public static void main(String[] args) {

                boolean exists = false;
                Scanner scan = new Scanner(System.in);
                String word = scan.next();

                if (word.length()<2) {
                    System.out.println(false);
                }

                else if ((word.substring(0,1).equalsIgnoreCase("j") && word.length()>1 ) ||
                        (word.substring(1,2).equalsIgnoreCase("j")) && word.length()>1) {
                    System.out.println(true);
                }
                else {
                    System.out.println(false);
                }
            }
        }

