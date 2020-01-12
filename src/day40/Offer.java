package day40;

public class Offer {

    String company;
    String location;
    double salary;
    boolean isFullTime;


    public void displayOfferDetails() {

        System.out.println("Name of the company - " + company);
        System.out.println("Location - " + location);
        System.out.println("Salary - " + salary);
        System.out.println("Is it full time? - " + isFullTime);

    }

    public void turnToFullTime() {
        if (isFullTime == false) {
            isFullTime = true;
        }
//change the location of the object to the location user passed


    }

    public void changeLocation(String newLocation) {

        location = newLocation;


    }
//write the method to accept all parameters to change all info about

    public void changeAllInfo(String newCompany, String newLocation, double newSalary, boolean newIsFullTime) {

        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;
    }

    //checks salary >100000
    public boolean isOne100KOffer() {

        return salary >= 100000;
    }

    public String toString() { //name toString helps to print directly
        String str = "Name of the company" + company + " Location - " +
                location + "Salary - " + salary + "Is it full time? - " + isFullTime;

        return str;
    }

}