package day21;

public class decidingWhenToStop {

    public static void main(String[] args) {

        String msg = "Hello World";

        int charCount = msg.length();
        // n - is number of characters to print
        int n = 4;                        // UNIVERSAL FORMULA FOR2,3,4 and so on CHARACTERS

        for (int i = 0; i <= charCount - n; i++) {  // UNIVERSAL FORMULA FOR2,3,4 and so on CHARACTERS

            System.out.println(msg.substring(i, i + n));  // UNIVERSAL FORMULA FOR2,3,4 and so on CHARACTERS

        }

    }
}
