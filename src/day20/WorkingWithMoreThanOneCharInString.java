package day20;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args) {


//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(2,4));
//        System.out.println(name.substring(4,6));
//        System.out.println(name.substring(6,8));
//       int x =0;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));

        String name = "Gokyuzum";
        int charCount = name.length();

        int x = 0;
        int lastCharIndex = charCount - 1;


        for (x = 0; x <= lastCharIndex - 1; x += 2) {

            System.out.println(name.substring(x, x + 2));
        }

    }
}
