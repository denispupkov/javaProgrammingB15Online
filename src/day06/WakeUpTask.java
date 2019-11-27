package day06;

import java.util.Scanner;

public class WakeUpTask {
    public static void main(String[] args) {


        double regularPrice;
        double salePrice;
        double discountPercentage;

        Scanner scan = new Scanner(System.in);

        System.out.println("what is the regular price?");
        regularPrice = scan.nextDouble();

        System.out.println("what is discount?");
        discountPercentage = scan.nextDouble();
        salePrice=regularPrice-(regularPrice*discountPercentage);

        System.out.println("you got this deal for "+salePrice+"$");

    }
}
