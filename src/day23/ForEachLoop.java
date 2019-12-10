package day23;

public class ForEachLoop {

    public static void main(String[] args) {

        double[] prices = {99.23, 11.99, 100.23, 99.99, 56.34};

        for (int x = 0; x < prices.length; x++) { //VERSION 1

            double eachPrice = prices[x];
            System.out.println("eachPrice = " + eachPrice);

        }
        System.out.println("--------------------------");

        for (double eachPrice : prices) { // VERSION 2 FOR EACH LOOP ONLY FOR ARRAYS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

            System.out.println("eachPrice = " + eachPrice);
        }

    }
}
