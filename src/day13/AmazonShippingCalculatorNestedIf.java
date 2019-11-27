package day13;

public class AmazonShippingCalculatorNestedIf {

    public static void main(String[] args) {

        //System.out.println("Do you want shopping? ");

        boolean youWantToShop = true;
        String preference = "ONLINE";

        System.out.println("Do you want to shop?");

        if (youWantToShop == true) {                                     // first statement

            if (preference.equalsIgnoreCase("Store")) { // nested IF Statement!!!

                System.out.println("Going to STORE for shopping!");  //// nested IF Statement!!!
            } else {                                                   // nested IF Statement!!!

                System.out.println("going ONLINE for shopping");        // nested IF Statement!!!
            }

        } else {                                                          // first statement

            System.out.println("Good job! Stay home coding!");          // first statement

        }


    }
}
