package day37;


import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {

    public static void main(String[] args) {

        //create an ArrayList of Integer and fill it up with 1-100

        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <=100 ; i++) {

            System.out.println("i"+i);
            nums.add(i);

        }
        System.out.println("nums = " + nums);

        //change all the odd numbers value to 0

        for (int i = 0; i <nums.size() ; i++) {

            if (nums.get(i)%2==1) {
                nums.set(i, 0);

            }

        }
        System.out.println("odd numbers replaced with 0 = " + nums);

        //insert 100 to 1st index

        nums.add(0,100);
        System.out.println("nums = " + nums);

        System.out.println("nums.indexOf(20) = " + nums.indexOf(20));

        List<Integer> lst2=new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

        //insert 100 right after 34 : we don't know where is 34
        System.out.println("lst2 = " + lst2);
        lst2.add(lst2.indexOf(34)+1, 100);
        System.out.println("lst2 = " + lst2);

        for (int i = 1; i <=5 ; i++) {

            lst2.add(0, 100);
            //lst2.add(lst2.indexOf(44) + i, 100);
        }

    }
}
