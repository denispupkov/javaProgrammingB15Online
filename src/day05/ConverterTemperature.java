package day05;

import java.util.Scanner;

public class ConverterTemperature {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        //(32°F − 32) × 5/9 = 0°C

        System.out.println("What is the temp in F? ");

        double fahreinheit = scan.nextDouble();

        double celsius = (5.0/9)*(fahreinheit-32);

        System.out.println("fahrenheit "+fahreinheit+ " is "+celsius+" in celsius");

    }
}
