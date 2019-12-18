package day29;

import java.util.Arrays;

public class FillingUpArrayWithString {
    public static void main(String[] args) {


        String iLoveJava = "I Love Java";
        String[] iLoveJavaArray = new String[300];

//        iLoveJavaArray[0]="I Love Java";
//        iLoveJavaArray[1]="I Love Java";
//        iLoveJavaArray[2]="I Love Java";

        for (int i = 0; i < iLoveJavaArray.length; i++) {
            iLoveJavaArray[i] = (i + 1 + ". I Love Java");

        }
        System.out.println("iLoveJavaArray = " + Arrays.toString(iLoveJavaArray));

        String[] strArr2 = new String[5]; //this is empty string
        String str = new String("ABC"); //this is string with value abc


    }
}
