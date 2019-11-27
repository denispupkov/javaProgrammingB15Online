package day10;

public class MultiBranchPractice {

    public static void main(String[] args) {

        System.out.println("welcome to McDonalds, what can I get for you?");

        int Burger = 11;
        int FrenchFry = 21;
        int Nuggets = 31;
        int IceCream = 41;
        int Coke = 51;
        String order = "";
        int itemNumber = 21;

        if (itemNumber == 11) {
            System.out.println("You have selected 11 ");
            order = "Burger";
        } else if (itemNumber == 21) {
            System.out.println("You have selected 21 ");
            order = "FrenchFry";
        } else if (itemNumber == 31) {
            System.out.println("You have selected 31 ");
            order = "Nuggets";
        } else if (itemNumber == 21) {
            System.out.println("You have selected 41 ");
            order = "IceCream";
        } else if (itemNumber == 21) {
            System.out.println("You have selected 51 ");
            order = "Coke";
        }
    else {
            System.out.println("Wrong Number");
            order="Uknown";
        }
        System.out.println("your order is "+order);
    }
}