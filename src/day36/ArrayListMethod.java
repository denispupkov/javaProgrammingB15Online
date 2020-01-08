package day36;

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {

        ArrayList<Long> lst =new ArrayList<>();

        //CRUD - create, read, update, delete

        lst.add(12L);
        lst.add(100L);
        lst.add(500L);
        lst.add(200L);
       // lst.add("fjkhbskjvbskjds");

        System.out.println("lst = " + lst);

        //counting items inside Arraylist using .size()
        System.out.println("lst.size() = " + lst.size());

        //getting first item inside ArrayList
        System.out.println("lst.get(0) = " + lst.get(0));

        //get the sum of items
       long sum=0;
        for (int i = 0; i <lst.size() ; i++) {

            sum=sum+lst.get(i);
        }
        System.out.println("sum = " + sum);

        Long max =lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i)>max) {

                max=lst.get(i);

        }
        }
        System.out.println("max = " + max);

    }


}
