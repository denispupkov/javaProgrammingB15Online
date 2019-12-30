package day35;

public class ExtractStringNumbers {

    public static void main(String[] args) {

        String sentence = "I bought 3 tomato and the price was 3.14 each";

        String[] arrayString = sentence.split(" ");

        //int num1 = Integer.parseInt(arrayString[3]);
        //double num2 = Double.parseDouble(arrayString[9]);
        int count = Integer.parseInt(arrayString[2]);
        String priceString =arrayString[arrayString.length-2];
        double price =Double.parseDouble(priceString);
        System.out.println("total price is "+(count*price));
    }


    }

