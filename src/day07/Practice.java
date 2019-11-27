package day07;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //Enter your code here
        String firstName;
        String lastName;
        String fullName;
        String email;
        String street;
        String state;
        String city;
        String address;
        String contacts;

        int age;
        int zipcode;

        double height;
        double weight;

        boolean isMarried;

        long workPhoneNumber;
        long personalPhoneNumber;

        Scanner scan=new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName=scan.next();

        System.out.println("Enter your last name");
        lastName=scan.next();

        System.out.println("Enter your email");
        email=scan.next();

        System.out.println("Enter your street");
        street=scan.next();
        scan.nextLine();

        System.out.println("Enter your city");
        city=scan.next();
        //scan.next();

        System.out.println("Enter your state");
        state=scan.next();

        System.out.println("Enter your zipcode");
        zipcode=scan.nextInt();
        //scan.next();

        System.out.println("Enter your work phone number");
        workPhoneNumber=scan.nextLong();

        System.out.println("Enter your work phone number");
        personalPhoneNumber=scan.nextLong();

        System.out.println("Enter your age");
        age=scan.nextInt();

        System.out.println("Enter your height");
        height=scan.nextDouble();

        System.out.println("Enter your weight");
        weight=scan.nextDouble();

        System.out.println("Are you married?");
        isMarried=scan.nextBoolean();

        contacts=("Contacts: work phone number - "+workPhoneNumber+", personal phone number - "
                +personalPhoneNumber+", email:\n"+email);
        fullName=("Full name:"+firstName+", "+lastName);
        address=("Address:"+street+", "+city+", "+state+" "+zipcode);


        System.out.println("Patient personal information");
        System.out.println(fullName);
        System.out.println(address);
        System.out.println(contacts);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("Married?: "+isMarried);
    }
}
