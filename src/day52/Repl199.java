package day52;

import java.util.ArrayList;
import java.util.List;

public class Repl199 {

    public static void main(String[] args) {

        String targetWord = "hi";
        List<String> lst = new ArrayList();
        lst.add("hi");
        lst.add("hey");
        lst.add("hi");
        lst.add("yo");
        int size = lst.size();


        for (int i = 0; i < lst.size(); i++) {

            if (lst.get(i).equals(targetWord)) {
                lst.remove(i);
                i--;
            }
        }
        System.out.println("lst = " + lst);
    }
}





