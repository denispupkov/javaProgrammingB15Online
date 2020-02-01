package day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {

    public static void main(String[] args) {

        Person p1 = new Person("Den", 22);
        Person p2 = new Person("Bek", 22);
        Person p3 = new Person("Asema", 18);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));

        //providing an object directly without creating an object
        int result = p2.compareTo(new Person("John", 27));
        System.out.println("result = " + result);

        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("John Snow", 27));
        System.out.println("lst = " + lst);


        //anything that we sort must be a type of comparible
        Collections.sort(lst);
        System.out.println("lst = " + lst);


        //compare p1 and p2 by age

//        if(p1.age>p2.age) {
//            System.out.println(1);
//        }
//        else if (p2.age>p1.age) {
//            System.out.println(-1);
//        }
//    else if (p1.age==p2.age) {
//            System.out.println(0);
//        }
    }
}
