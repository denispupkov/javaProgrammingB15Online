package day40;

import java.util.ArrayList;

public class CompanyDetails2 {


    public static void main(String[] args) {

        ArrayList<Offer> offerList = new ArrayList<>();


        Offer company1 = new Offer();

        company1.company = "General Motors";
        company1.location = "Chicago";
        company1.salary = 85500;
        company1.isFullTime = true;
        company1.displayOfferDetails();
        System.out.println();

        Offer company2 = new Offer();

        company2.company = "Ford";
        company2.location = "Alabama";
        company2.salary = 77900;
        company2.isFullTime = true;
        company2.displayOfferDetails();
        System.out.println();

        Offer company3 = new Offer();

        company3.company = "Tesla";
        company3.location = "San Francisco";
        company3.salary = 62900;
        company3.isFullTime = false;
        company3.displayOfferDetails();
        System.out.println();

        Offer company4 = new Offer();

        company4.company = "BMW";
        company4.location = "Los Angeles";
        company4.salary = 125000;
        company4.isFullTime = true;
        company4.displayOfferDetails();
        System.out.println();

        Offer company5 = new Offer();

        company5.company = "Kia";
        company5.location = "Tampa";
        company5.salary = 50900;
        company5.isFullTime = false;
        company5.displayOfferDetails();
        System.out.println();


        //add 2K to the Tesla offer

        company3.salary = company1.salary + 2000;

        System.out.println("New Tesla salary = " + company3.salary);

        //set the salary value of company 4 offer object to sum of all the offers

        company4.salary = company1.salary + company2.salary + company3.salary + company5.salary;
        company4.displayOfferDetails();


//turn company 5 from part time to full time and print
        company5.turnToFullTime();
        company5.displayOfferDetails();


        //change location

        company4.changeLocation("DC");
        company4.displayOfferDetails();
    }
}