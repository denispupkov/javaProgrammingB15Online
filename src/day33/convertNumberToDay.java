package day33;

public class convertNumberToDay {
    public static void main(String[] args) {


        System.out.println(dayOfTHeWeek(6));


    }

    public static String dayOfTHeWeek(int day) {

        int dayCode = 0;
        String dayName = "";

        if (dayCode == 1) {

            dayName = "Monday";
        }
        if (dayCode == 2) {

            dayName = "Tuesday";
        }
        if (dayCode == 3) {

            dayName = "Wednesday";
        }
        if (dayCode == 4) {

            dayName = "Thursday";
        }
        if (dayCode == 5) {


            dayName = "Friday";
        }

        if (dayCode == 6) {


            dayName = "Saturday";
        }

        if (dayCode == 7) {

            dayName = "Sunday";
        }

        return dayName;


    }


}








