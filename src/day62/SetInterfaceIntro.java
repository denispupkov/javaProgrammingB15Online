package day62;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceIntro {

    public static void main(String[] args) {

        Set<Integer> myNums = new HashSet<>(); //SET IGNORES DUBLICATES!!! HAS NO INDEX!!!
        //IT DOES NOT KEEP INSERTION ORDER

        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(10);
        myNums.add(10);

        System.out.println("myNums = " + myNums);


    }
}
