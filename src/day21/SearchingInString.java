package day21;

public class SearchingInString {

    public static void main(String[] args) {

        String myName = "Denis Pupkov";

        int charCount = myName.length();
        //System.out.println("number of chars "+charCount);

        int lastCharIndex = charCount - 1;
        //System.out.println("last index "+lastCharIndex);

        // find index of all a char in case insensitive manner

        //String oneChar="";

        for (int i = 0; i <= myName.length() - 1; i++) {

            String currentChar = myName.substring(i, i + 1);

            if (currentChar.equalsIgnoreCase("p")) {

                System.out.println("the index of p or P is " + i);
            }
        }


    }
}
