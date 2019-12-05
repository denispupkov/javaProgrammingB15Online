package day20;

public class FindDogInASentence {

    public static void main(String[] args) {

        String msg = "I like dog , dogs are cute , dogs are friendly";

        int lastCharIndex = msg.length() - 1;

        for (int x = 0; x <= lastCharIndex - 2; x++) {

            String current3chars = msg.substring(x, x + 3);
            //System.out.println(msg.substring(x,x+3));

            if (current3chars.equals("Dog")) {
                System.out.println("BINGO!!! AT " + x);
            }

        }


    }

}