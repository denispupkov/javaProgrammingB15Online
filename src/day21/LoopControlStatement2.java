package day21;

public class LoopControlStatement2 {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {

            // skipping all odd or even numbers using CONTINUE method
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }


    }
}
