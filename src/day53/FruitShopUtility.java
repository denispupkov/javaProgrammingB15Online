package day53;

public class FruitShopUtility {

    public static void main(String[] args) {

        Apple f1 = new Apple("crispy but tastless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        // displayFruit(f1);
        //displayFruit(f2);
        digestBetter(f2);

        System.out.println("getFavoriteByType(1) = " + getFavoriteByType(1));
        System.out.println("getFavoriteByType(2) = " + getFavoriteByType(2));
        System.out.println("getFavoriteByType(3) = " + getFavoriteByType(3));

    }


    //static because we gonna use in the same class
    public static void displayFruit(Fruit anyFruit) {

        System.out.println("Displaying Fruits\n" + anyFruit);


        Fruit x = getMyFavoriteFruit();
        x.getDigest();
        System.out.println("x = " + x);


    }

    public static void digestBetter(Fruit moreFruit) {

        moreFruit.getDigest();
        moreFruit.getDigest();
        moreFruit.getDigest();
        moreFruit.getDigest();


    }

    public static Fruit getMyFavoriteFruit() {

        Fruit f = new Apple("sweet", "green", "ginger");
        return f;
    }

    public static Fruit getFavoriteByType(int type) {

        if (type == 1) {
            return new Apple("sweet", "green", "ginger");
        } else if (type == 2) {
            return new Orange("sour", "orange", 12);
        } else {
            return null;
        }
    }

}
