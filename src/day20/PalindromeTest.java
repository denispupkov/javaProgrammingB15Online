package day20;

public class PalindromeTest {

    public static void main(String[] args) {

        // level, kayak, elle, madam, aziza - palindrome words

        String name = "kayak";

        String reversedName = "";
        System.out.println("original name" + name);

        for (int x = name.length() - 1; x >= 0; x--) {

            reversedName = reversedName + name.charAt(x);

        }

        System.out.println("reversedName = " + reversedName);
        // HOMEWORK MAKE IT CASE/SPACE INCENTIVES (about space between 2 words)
        if (name.equalsIgnoreCase(reversedName)) {

            System.out.println("Palindrome test Passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
