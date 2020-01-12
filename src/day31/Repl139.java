package day31;

import java.util.Scanner;

class Repl139 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {
        int cnt = 0;
        for (int i = 0; i < info.length(); i++) {

            if (info.substring(0, info.length() - 1).equals(",")) {
                cnt++;
            }
        }

        String[] result = new String[cnt];
        //your code here
        result = info.split(",");

        System.out.println("person name: " + result[0] + " last name: " + result[1] + "age: " + result[2]);

    }//end person

}