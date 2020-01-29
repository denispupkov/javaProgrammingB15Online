package day48;

public class Repl191 {

    public static void main(String[] args) {

        String input = "denis";
        String result = "";
        int cnt = 0;
        char s = '0';

        //String rev="";

        for (int i = input.length() - 1; i >= 0; i--) {

            result = result + "" + input.charAt(i);
        }
        System.out.println(result);
        System.out.println("s = " + s);
    }
}

