package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListWithReturnType {

    public static void main(String[] args) {

        //System.out.println("nums = " + nums);

        System.out.println( getListFrom1ToFinalNumber(7));
        System.out.println(getListFrom1ToFinalNumber(2));
        System.out.println(getListFrom1ToFinalNumber(20));
    }
public static List <Integer> getListFrom1ToFinalNumber (int finalNumber) {


    List<Integer> nums = new ArrayList<>();
    for (int numbers =1; numbers<=finalNumber; numbers++) {

        nums.add(numbers);

    }
    return nums;
    }

}
