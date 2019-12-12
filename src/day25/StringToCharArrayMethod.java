package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {

        String name = "Denis";

        char[] nameChar = new char[name.length()];
//        nameChar[0]=name.charAt(0);
//        nameChar[1]=name.charAt(1);
//        nameChar[2]=name.charAt(2);
//        nameChar[3]=name.charAt(3);
//        nameChar[4]=name.charAt(4);

        for (int i = 0; i < name.length(); i++) {
            nameChar[i] = name.charAt(i);
        }

        System.out.println("Arrays.toString(nameChar) = " + Arrays.toString(nameChar));


        for (int x = 0; x < nameChar.length; x++) {


        }
    }
}
