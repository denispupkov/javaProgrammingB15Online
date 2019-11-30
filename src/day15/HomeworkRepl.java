package day15;

import java.util.Scanner;

public class HomeworkRepl {
public static void main(String[] args) {

// String task1="mhgfhjgfjhg";

// if (task1.length()>1) {

   // System.out.print(task1.charAt(0));
    //System.out.print(task1.charAt(1));
//}
//else if (task1.equals("")) {
 //   System.out.println("empty String");
//}

//else {
  //  System.out.print(task1.charAt(0));
   // System.out.print(task1.charAt(0));

//}

//String tabTitle ="- Google Search";
//String searchKeyword="";

    Scanner scan = new Scanner (System.in);

   // System.out.println("Enter any searching keyword ");
   // searchKeyword=scan.next();
   // tabTitle=searchKeyword+" - Google Search";
  //  System.out.println(tabTitle);

    //if (tabTitle.startsWith(searchKeyword)) {
    //    System.out.println("test has passed");
    //}
    //else {
    //    System.out.println("test failed");
   // }



    String fullName="";

    System.out.println("Enter full name");
    fullName=scan.nextLine();

    System.out.print(fullName.charAt(0));
    System.out.println(fullName.charAt(fullName.indexOf(" ")+1));

    }
}
