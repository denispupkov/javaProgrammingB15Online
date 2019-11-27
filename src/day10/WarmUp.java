package day10;

import java.util.Scanner;

public class WarmUp {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int myNumber=1;
        String myAnswer="";

        System.out.println("Enter the number");
        myNumber=scan.nextInt();



        if (myNumber%5==0) {
            myAnswer="Fizz Number";
            //System.out.println("My value is "+myAnswer);
        }
        else {
            myAnswer="Not Fizz Number";
            //System.out.println("My value is "+myAnswer);
        }
        System.out.println("My number is "+myNumber+" it is "+myAnswer);
    }
}
