package day31;


import java.util.*;

class Repl127 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        System.out.print("[");
        for (int i=0; i<words.length; i++) {
            //for (int j=0; j<words[i].length; j++) {

           // System.out.println(Arrays.toString(words).charAt(i)+""+Arrays.toString(words).charAt(words[i].length()-1));
            System.out.print((words[i]).charAt(0)+""+(words[i]).charAt(words[i].length()-1));
        if (i!=words.length-1) {
            System.out.print(", ");
        }

        }
        System.out.println("]");

    }
}