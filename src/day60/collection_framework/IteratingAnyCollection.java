package day60.collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {

    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 22, 88, 13));

        Iterator<Integer> myIter = nums.iterator();
        System.out.println("myIter.hasNext() = " + myIter.next());
        System.out.println("myIter.hasNext() = " + myIter.next());
        System.out.println("myIter.hasNext() = " + myIter.next());
        System.out.println("myIter.hasNext() = " + myIter.next());
        System.out.println("myIter.hasNext() = " + myIter.next());

        myIter.remove();
        System.out.println(myIter.next());

    }
}
