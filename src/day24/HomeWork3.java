package day24;

public class HomeWork3 {

    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] itemPrices = {1.99F, 0.99F, 4.65F, 3.89F, 3.88F, 2.88F};

        for (int i = 0; i < groceryItems.length; i++) {

            if (groceryItems[i].equalsIgnoreCase("strawberry")) {

                System.out.println("Index of Strawberry is " + i);

            }
        }
        int berryCount = 0;
        for (int x = 0; x < groceryItems.length; x++) {

            if (groceryItems[x].contains("berry")) {

                berryCount += 1;

            }
        }
        System.out.println("Number of word berry is " + berryCount);

        int numberOfCharacters = 0;
        for (int i = 0; i < groceryItems.length; i++) {

            numberOfCharacters += groceryItems[i].length();

        }
        System.out.println("number of all characters " + numberOfCharacters);


        int evenCharacterCount = 0;
        for (int i = 0; i < groceryItems.length; i++) {

            if (groceryItems[i].length() % 2 == 0) {

                evenCharacterCount += 1;
            }
        }
        System.out.println("number of even number character items " + evenCharacterCount);

        for (int i = 0; i < groceryItems.length; i++) {

            if (groceryItems[i].substring(groceryItems.length - 2).equalsIgnoreCase("e")) {

                System.out.println("the item " + i + " has letter e at the end");

            }
        }
        for (int i = 0; i < groceryItems[i].length(); i++) {

            // String result=groceryItems[i].substring(groceryItems.length-4,groceryItems.length-1);
            String resultChar = groceryItems[i].charAt(groceryItems.length - 4) + ""
                    + groceryItems[i].charAt(groceryItems.length - 3) + "" + groceryItems[i].charAt(groceryItems.length - 2);
            System.out.println("the last 3 letters of " + i + " is " + resultChar);
            {
                //System.out.println(resultChar);
                // System.out.println("the item " + i + " the last 3 letters are ");
            }


        }
    }


}
