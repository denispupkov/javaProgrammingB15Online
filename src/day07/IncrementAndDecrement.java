package day07;

public class IncrementAndDecrement {
    public static void main(String[] args) {


        int apple =10;

        apple=apple+1; //same
        apple+=1;  //same
        ++ apple; //same
        ++ apple;
        System.out.println(apple);
        -- apple;

        System.out.println(++apple);
        System.out.println("used ++ to increment and concatenate :" +            ++apple); //space between + and ++
        System.out.println("used ++ to increment and concatenate :" + (++apple)); // or use parenthesis


    }
}
