package day39;

public class SplitPractice {

    public static void main(String[] args) {


        String itemDetails = "iPhone 6s,449,18.71";
        String[] itemSplitArr = itemDetails.split(",");

        String name = itemSplitArr[0];
        System.out.println("name = " + name);

        double price = Double.parseDouble(itemSplitArr[1]);
        System.out.println("price = " + price);

        double monthly = Double.parseDouble(itemSplitArr[2]);
        System.out.println("monthly = " + monthly);

        System.out.println("item name " + Double.parseDouble(itemDetails.split(",")[0])); //one shot split and parsing
        System.out.println("item price " + Double.parseDouble(itemDetails.split(",")[1]));//one shot split and parsing
        System.out.println("item monthly " + Double.parseDouble(itemDetails.split(",")[2]));//one shot split and parsing


    }
}