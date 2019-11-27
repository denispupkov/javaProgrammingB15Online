package day13;

public class AmazonShippingCalculator {

    public static void main(String[] args) {

        String memberType=" member";
        //int shippingPrice=25;
        int shippingFee=0;
        double amount =15.99d;

        if (memberType.equalsIgnoreCase("Prime member")) {
            System.out.println("You qualified for Free Shipping");
            System.out.println("your final price is "+amount);

        }
        else if (!memberType.equalsIgnoreCase("Prime member") && amount>25) {

            System.out.println("Not a Prime Member but your order is more than 25 ");
            System.out.println("You got free shipping on amount "+amount);
        }


        else {

            System.out.println("Do you wanna sign up for prime membership?");
            shippingFee=5;
            amount+=shippingFee;
            System.out.println("Your final amount is "+amount);
        }


    }
}
