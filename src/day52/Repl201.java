package day52;

import java.util.ArrayList;

public class Repl201 {

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(4);
        lst.add(-6);
        lst.add(3);
        lst.add(-8);
        lst.add(0);
        lst.add(4);
        lst.add(3);
        // (4, -6, 3, -8, 0, 4, 3);
        System.out.println(appendPosSum(lst));
    }
    //create your method below


    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> lst) {
        ArrayList<Integer> positive = new ArrayList<>();

        for (int i = 0; i < 7; i++) {

            if (lst.get(i) > 0) {
                positive.add(lst.get(i));

            }

        }

        int sum = 0;
        for (int each : positive) {
            sum += each;
        }
        positive.add(sum);
        return positive;
    }
}

