package day33;

public class BirthYearToAge {

    public static void main(String[] args) {

        System.out.println(yourAge(1985));


    }

    public static int yourAge(int bornYear) {

        int currentYear = 2019;
        int yearOfBirth = 0;
        int yourCurrentAge = 0;


        yourCurrentAge = currentYear - bornYear;
        if (yourCurrentAge > 100 || yourCurrentAge < 0) {
            return 0; //return; works as a break if we don't return any value in method
        } else {

        }

        return yourCurrentAge;
    }
}

