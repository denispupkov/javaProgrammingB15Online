package day21;

public class SearchingInStringThreeCharacter {

    public static void main(String[] args) {

        String myName = "Denis Pupkov Denis Pupkov  Berkov Sukov";
        int count = 0;
        int charCount = myName.length();
        //System.out.println("number of chars "+charCount);

        int lastCharIndex = charCount - 1;
        //System.out.println("last index "+lastCharIndex);

        // find index of all a char in case insensitive manner

        //String oneChar="";

        for (int i = 0; i <= myName.length() - 3; i++) {

            String currentChar = myName.substring(i, i + 3);

            if (currentChar.equalsIgnoreCase("kov")) {

                System.out.println("the index of kov or Kov is " + i);
                count++;
            }
        }


        System.out.println("Repeated " + count + " times ");


    }
}
