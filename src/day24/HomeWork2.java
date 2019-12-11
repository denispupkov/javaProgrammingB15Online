package day24;

public class HomeWork2 {
    public static void main(String[] args) {

        String[] groceryItems ={"apple","banana","grape","strawberry","blueberry","kiwi"};
        float[] itemPrices={ 1.99F, 0.99F, 4.65F, 3.89F, 3.88F, 2.88F};


        String oneItem="";
       // for (String n:groceryItems) {

           //System.out.print(n+", ");

            for (int i = 0; i<groceryItems.length; i++) {
                if (i%2!=0) {
                    oneItem=groceryItems[i];
                    System.out.println(oneItem);
                }

            }

        for (int i = groceryItems.length-1; i>=0; i--) {
            System.out.println(groceryItems[i]);
        }




        }


        }







