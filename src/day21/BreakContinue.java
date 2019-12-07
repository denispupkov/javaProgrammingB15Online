package day21;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.println(i); //USELESS CODE BELOW
            if (i == 5) {
                break;
            }
            continue;  //USELESS CODE

        }

    }
}
