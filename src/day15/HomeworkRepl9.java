package day15;

import java.util.Scanner;

public class HomeworkRepl9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter URL in format www.blackfriday.com");
        String url = scan.nextLine();

        System.out.println("First index of . is " + url.indexOf(".") +
                " last index of . is " + url.lastIndexOf("."));
        System.out.println("The domain is " + url.substring(url.indexOf(".") + 1, url.lastIndexOf(".")));

    }
}
