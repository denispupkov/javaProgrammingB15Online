package day21;

public class SearchingInStringTwoCharacter {

    public static void main(String[] args) {

        String myName = "Denis Pupkov Denis Pupkov";

        int charCount = myName.length();
        //System.out.println("number of chars "+charCount);

        int lastCharIndex = charCount - 1;
        //System.out.println("last index "+lastCharIndex);

        // find index of all a char in case insensitive manner

        //String oneChar="";

        for (int i = 0; i <= myName.length() - 2; i++) {

            String currentChar = myName.substring(i, i + 2);

            if (currentChar.equalsIgnoreCase("pu")) {

                System.out.println("the index of pu or Pu is " + i);
            }
        }


    }
}
