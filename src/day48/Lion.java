package day48;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Mammals {
    @Override
    public void drinkMilk() {
        System.out.println("LION drinks milk");

    }

    @Override
    public void makeNoise() {
        System.out.println("LION SAY ROARRRRRR");
    }

    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        Animal a1 = new Lion(); //!!!!!!!!!!!!!!! GENERALIZE
        a1.makeNoise();

        List<Integer> lst = new ArrayList<>();
    }
}
