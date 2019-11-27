package day14;

public class TrimAndIsEmpty {

    public static void main(String[] args) {

        String message ="   Repl is Coming !  ";

        System.out.println(message.length());
        message = message.trim();  //cut spaces on left and right sides but NOT IN BETWEEN
        //System.out.println(message.trim());
        System.out.println(message.length());

        System.out.println(message.isEmpty()); // check String wether is empty or not

    }
}
