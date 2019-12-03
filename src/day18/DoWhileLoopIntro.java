package day18;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        //count from 1 to 5

        int x = 1;

        do {
            System.out.println(x);
            ++x;
        }
        while (x <= 10); //do while loop ends with semicolon

        int y = 10;

        System.out.println("------------------");//---------------------------------


        do {
            System.out.println(y);
            --y;
        }
        while (y > 0);
    }
}
