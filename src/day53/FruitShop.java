package day53;

public class FruitShop {

    public static void main(String[] args) {

        Apple a1 = new Apple("Sweet", "red", "Fuji");
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        a1.getDigest();

        System.out.println("--------------------------");


        Fruit f1 = a1;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        //System.out.println("f1.type = " + f1.type); //f1 doesn't have type field from Fruit class
        f1.getDigest();
        f1 = new Orange("sour-sweet", "redish", 11); //f1 reassigned
        f1.getDigest();


        Apple f2 = new Apple("crispy but tastless", "hot red", "Gala");

        Fruit f3 = new Orange("sour", "orange", 12);

        Fruit f4 = new Orange("very sweet", "blood red", 10);

        //List<Fruit> allFruit = new ArrayList<>();

        Fruit[] myFruits = {f1, f2, f3, f4};

        for (Fruit each : myFruits) {
            each.getDigest();
        }


    }


}
