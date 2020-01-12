package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAllMethodPractice {

    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();

        num1.add(123);
        num1.add(100);
        num1.add(223);
        num1.add(133);
        num1.add(125);
        num1.add(122);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(2000);
        num2.add(1000);

        num1.addAll(num2);

        num2.addAll(Arrays.asList(100, 200, 300, 400));
        System.out.println("num2 = " + num2);


        ArrayList<Integer> num3 = new ArrayList<>();

        num3.add(123);
        num3.add(100);
        num3.add(223);
        num3.add(133);
        num3.add(125);
        num3.add(122);
        System.out.println("num3 before removing 100 and 133 = " + num3);
        num3.removeAll(Arrays.asList(100, 133));

        System.out.println(" num3 after removing 100 and 133 = " + num3);

        num3.removeAll(Arrays.asList(100, 133));

        System.out.println(" num3 after SECOND removing 100 and 133 = " + num3);

        num3.removeAll(Arrays.asList(100, 122)); //removed only what have found

        System.out.println(" num3 after THIRD removing 100 and 133 = " + num3);

        num3.removeAll(Arrays.asList(100, 133));

        System.out.println(" num3 after FOURTH removing 100 and 133 = " + num3);


    }
}
