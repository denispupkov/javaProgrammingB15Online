package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyFruit {

    public static void main(String[] args) {

        Apple a1 = new Apple("Sweet", "red", "Fuji");
        Fruit f1 = a1;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        f1.getDigest();
        f1 = new Orange("sour-sweet", "redish", 11); //f1 reassigned
        f1.getDigest();


        Apple f2 = new Apple("crispy but tastless", "hot red", "Gala");

        Fruit f3 = new Orange("sour", "orange", 12);

        Fruit f4 = new Orange("very sweet", "blood red", 10);

        //List<Fruit> allFruit = new ArrayList<>();

        Fruit[] myFruits = {a1, f1, f2, f3, f4};

        for (Fruit each : myFruits) {
            each.getDigest();
        }

        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(a1, f1, f2, f3, f4));

        for (Fruit each : fruitList) {
            System.out.println("each.toString() = " + each.toString());
            System.out.println("each.getClass().getSimpleName() = "
                    + each.getClass().getSimpleName());//COMES FROM REFLECTION API
        }
    }

}
