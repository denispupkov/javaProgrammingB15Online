package day07;

public class PreincrementAndPostIncrement {

    public static void main(String[] args) {

        // pre-increment ++score
        // post increment score++
        // pre-decrement --score
        // post decrement score--

        int apple =8;

        apple++;
        System.out.println(apple);

        //System.out.println(++apple); //print increased value right away

        System.out.println(apple++); //print before increasing the value
        System.out.println(apple); // print increased value

        int score =50;

        System.out.println(++score);
        System.out.println(score++);
        System.out.println(score);

        System.out.println(--score);
        System.out.println(score--);
        System.out.println(score);

    }
}
