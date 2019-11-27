package day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);


        int age;

        System.out.println("what is your age?");
        age = scan.nextInt();


        if (age >= 18) {
            System.out.println("You are ready to vote"); }

        else {
                System.out.println("wait until you 18");
            }
        }
    }
