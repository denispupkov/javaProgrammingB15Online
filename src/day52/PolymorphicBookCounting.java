package day52;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBookCounting {

    public static void main(String[] args) {


        Book b1 = new PaperBook("Game Of Thrones", "Akbar", 1);
        Book b2 = new AudioBook("Agile", "Me", 2);
        Book b3 = new PaperBook("Karlson", "Sam", 2);
        Book b4 = new AudioBook("Throe", "Zeus", 1.5);

        List<Book> bookList = Arrays.asList(b1, b2, b3, b4);
        int pCount = 0;
        for (Book each : bookList) {
            //each.displayBookInfo();
            String className = each.getClass().getSimpleName();
            //System.out.println(each.getClass().getSimpleName());
            System.out.println("className = " + className);
            if (className.equals("PaperBook")) {
                ++pCount;
            }

        }
        System.out.println("pCount = " + pCount);
    }
}