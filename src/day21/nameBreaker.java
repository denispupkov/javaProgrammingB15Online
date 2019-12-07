package day21;

public class nameBreaker {

    public static void main(String[] args) {

        String name = "Denis Pupkov";

        for (int i = 0; i < name.length(); i++) {

            char currentChar = name.charAt(i);

            if (currentChar == 'p' || currentChar == 'P') {

                System.out.println("found IT!");
                break;

            }
            System.out.println(currentChar);

        }


    }


}