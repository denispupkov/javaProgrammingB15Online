package day30;

public class CarInventory {

    public static void main(String[] args) {

       /*
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "Oldsmobile-Achieva",
                "Honda-Civic",
        */


        String[] cars = {"Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "Oldsmobile-Achieva",
                "Honda-Civic"};

        String[] splitted = new String[8];

        int chevyCount = 0;
        int civicCount = 0;

        for (String eachCar : cars) {
            if (eachCar.toLowerCase().startsWith("chevrolet")) {

                chevyCount++;
            }
            if (eachCar.toUpperCase().contains("CIVIC")) {
                civicCount++;
            }

        }
        System.out.println("chevyCount = " + chevyCount);
        System.out.println("civic = " + civicCount);

    }
}