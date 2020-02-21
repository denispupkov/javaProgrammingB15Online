package day61;

import java.util.LinkedList;
import java.util.List;

public class List_LInkedListImplementation {

    public static void main(String[] args) {


        List<String> lst = new LinkedList<>();
        lst.add("Zeynep");
        lst.add("Ershat");
        lst.add("Kamira");
        lst.add("Sabira");

        System.out.println("lst = " + lst);

        lst.remove("Ershat");
        System.out.println("lst = " + lst);
    }
}
