package day10;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char operator = '+';

        System.out.println("Enter your operator");
        operator = scan.next().charAt(0);// SCANNER FOR CHAR VALUE!!!

        switch (operator) {
            case '+':
                operator = '+';
                System.out.println("Operator " + operator);
                break;

            case '-':
                operator = '-';
                System.out.println("Operator " + operator);
                break;

            case '*':
                operator = '*';
                System.out.println("Operator " + operator);
                break;
            case '/':
                operator = '/';
                System.out.println("Operator " + operator);
                break;

            default:
                System.out.println("Wrong Operator");
                break;

        }


    }

}