package day20;

public class GetTwoSiblingChar {

    public static void main(String[] args) {

        String name = "Ayra";

        int charCount = name.length();

        int x = 0;
        int lastCharIndex = charCount - 1;


        for (x = 0; x <= lastCharIndex - 2; x += 1) {

            System.out.println(name.substring(x, x + 3));
        }


    }
}
