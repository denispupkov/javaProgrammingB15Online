package day16;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any searching keyword ");
        String searchKeyword = scan.nextLine();
        String tabTitle = searchKeyword + " - Google Search";
        System.out.println(tabTitle);

        if (tabTitle.startsWith(searchKeyword) && tabTitle.endsWith(" - Google Search")) {
            System.out.println("test has passed");
        } else {
            System.out.println("test failed");
        }

    }
}
