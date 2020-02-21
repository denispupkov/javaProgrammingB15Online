package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates2 {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states BEFORE = " + states);
        states.remove("GA");
        System.out.println("states AFTER = " + states);
        //remove all the sates with letter A (we cannot use FOR EACH FOR DELETING ITEMS!!!)
//Iterator has 3 methods hasNext() next() remove() works together
        Iterator<String> stIter = states.iterator();

        while (stIter.hasNext()) {
            String each = stIter.next();
            if (each.contains("A")) {
                System.out.println("removing = " + each);
                stIter.remove();//REMOVEING USING ITERATOR FUNCTION

            }

            System.out.println("states = " + states);

            // System.out.println("stIter.next() = " + stIter.next());
            System.out.println("stIter = " + stIter.hasNext());
        }


        states.removeIf(each -> each.contains("Y")); //LAMBDA EXAMPLE!!!!
        System.out.println("stIter = " + states);
    }
}
