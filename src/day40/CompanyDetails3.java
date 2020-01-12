package day40;

public class CompanyDetails3 {
    public static void main(String[] args) {

        Offer company3 = new Offer();
        company3.company = "Tesla";
        company3.location = "San Francisco";
        company3.salary = 62900;
        company3.isFullTime = false;
        company3.displayOfferDetails();
        System.out.println();

        company3.displayOfferDetails();
        company3.turnToFullTime();
        company3.changeLocation("DC");
        company3.displayOfferDetails();

        company3.changeAllInfo("Amazon", "Virginia", 222000, true);
        //company3.displayOfferDetails();

        boolean result = company3.isOne100KOffer(); //if salary >100000 change location to Atlanta

        if (result == true) {

            company3.changeLocation("Atlanta");
        }
        company3.displayOfferDetails();

        company3.toString();

        System.out.println("calls toString method authomatically bacause in Offer method ctreated toString method \n" + company3);
    }


}
