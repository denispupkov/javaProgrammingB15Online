package day40;

import java.util.ArrayList;

public class CompanyDetails {

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

        offerList.add(company1);
        offerList.add(company2);
        offerList.add(company3);
        offerList.add(company4);
        offerList.add(company5);

        //System.out.println("------------------------" + offerList);// we can't use print like this

        for (Offer each : offerList) { //first option
            each.displayOfferDetails();
        }

        System.out.println("---------------2nd---------------");

        for (int i = 0; i < offerList.size(); i++) { //second option

            Offer each = offerList.get(i);
            each.displayOfferDetails();
        }

        System.out.println("--------------3rd----------------");
        for (int i = 0; i < offerList.size(); i++) {
            offerList.get(i).displayOfferDetails(); //third option

        }
    }
}