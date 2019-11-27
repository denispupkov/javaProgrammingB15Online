package day07;

import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String firstName="Denis";
        String lastName="Pupkov";
        String company="PTechnologies";

        System.out.println("enter your first name, last name, company separated by space");
        firstName =scan.next();
        lastName =scan.next();
        company =scan.next();


        String email=firstName+"_"+lastName+"@"+company+".com";

        System.out.println("My name is "+firstName+" "+lastName+" and I work for "+company+"\n and my e-mail is "+email);


    }
}
