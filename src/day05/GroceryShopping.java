package day05;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What the price of bananas per pound?");
        double priceBanana = scan.nextDouble();
        System.out.println("How many pounds of bananas do you want to buy?");
        double poundsBanana = scan.nextDouble();

        System.out.println("What the price of tomato per pound?");
        double priceTomato = scan.nextDouble();
        System.out.println("How many pounds of tomatoes do you want to buy?");
        double poundsTomato = scan.nextDouble();

        System.out.println("What the price of potato per pound?");
        double pricePotato = scan.nextDouble();
        System.out.println("How many pounds of potato do you want to buy?");
        double poundsPotato = scan.nextDouble();

        System.out.println("You got "+poundsBanana+" pounds of bananas with price "+priceBanana+" per pound and your total is "+poundsBanana*priceBanana);
        System.out.println("You got "+poundsTomato+" pounds of bananas with price "+priceTomato+" per pound and your total is "+poundsTomato*priceTomato);
        System.out.println("You got "+poundsPotato+" pounds of bananas with price "+pricePotato+" per pound and your total is "+poundsPotato*pricePotato);

        double totalBanana=poundsBanana*priceBanana;
        double totalTomato=poundsTomato*priceTomato;
        double totalPotato=poundsPotato*pricePotato;
        double grandTotal=totalBanana+totalTomato+totalPotato;

        System.out.println("Your grand total for this shopping is "+grandTotal+" dollars");
    }
}
