package day20;

public class ReversingAString {

    public static void main(String[] args) {

        String name = "Denis Pupkov";
        String reverseName = "";

        int lastCharIndex = name.length() - 1;
        for (int i = lastCharIndex; i >= 0; i--) {

            char currentChar = name.charAt(i);
            reverseName = reverseName + currentChar;

        }
        System.out.println(reverseName);
    }
}
