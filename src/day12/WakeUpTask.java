package day12;

import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        String weatherNow="";


        System.out.println("Enter your weather condition");
        weatherNow=scan.next();


        if (weatherNow.equals("Sunny")) {

            System.out.println("code in Sunny weather");
        }
        else if (weatherNow.equals("Rainy")) {

            System.out.println("code in Rainy weather");
        }

        else if (weatherNow.equals("Cloudy")) {

            System.out.println("code in Cloudy weather");
        }
        else if (weatherNow.equals("Snowy")) {
            System.out.println("code in Snowy weather");
        }

        else {

            System.out.println("rain or shine just keep coding anyway'");
        }

    }
}
