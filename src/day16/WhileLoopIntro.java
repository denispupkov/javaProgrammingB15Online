package day16;

public class WhileLoopIntro {

    public static void main(String[] args) {

        int count = 0;

        System.out.println("Hello World!");
        ++count;

        System.out.println("Hello World!");
        ++count;

        System.out.println("Hello World!");
        ++count;

        System.out.println("Hello World!");
        ++count;

        System.out.println("Hello World!");
        ++count;

        System.out.println("You printed Hello World " + count + " times");

        //----------------------------------------

        int cnt = 0;
        while (cnt <= 5) {
            System.out.println("Coding!");
            ++cnt;
        }
        System.out.println("you printed Coding " + cnt + " times");
    }
}
