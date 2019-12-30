package day23;
import java.util.Scanner;
public class Repr099 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence and number");
    String str = scan.next();
    int n =scan.nextInt();
    String trimmed = str.substring(0,n);
        System.out.println("trimmed word is "+trimmed);
        System.out.println("number of chars are "+n);
    int count =1;

        for (int i = 0; i <str.length()-n ; i++) {

            if (str.substring(i, i+n).equals(trimmed)) {
                //System.out.println(false);
            count++;
            }

            }

       if (count<=1) {
           System.out.println(false);
       }
       else if (count>1){
           System.out.println(true);
       }

        System.out.println("count "+count);
    }
}


