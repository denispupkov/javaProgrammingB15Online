package day08;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int speedLimit = 60;
        int yourCurrentSpeed = 55;
        boolean amISpeeding=yourCurrentSpeed>speedLimit; //inside the parenthesis we can put only boolean statement
                                                            // true or false
        if (amISpeeding) {

            System.out.println("Pull Over! ");
            System.out.println("Get ticket by the police");
            System.out.println("taken away some points on your licence");
            System.out.println("Go to court");
        }
            else {
                System.out.println("go shopping!");
                System.out.println("buy ice-cream!");
                System.out.println("enjoy your day!");
            }
            System.out.println("The end");
        }



    }

