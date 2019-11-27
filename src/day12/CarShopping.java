package day12;

public class CarShopping {

    public static void main(String[] args) {

       // int corolla = 10000;
        // int tesla = 200000;
        int budget = 25000; // budget only requirement for Tesla
        int carPrice=30000;
        String carBrand = "corolla"; // corolla gonna be purchased in any price

        if (carBrand.equals("corolla") || (carBrand.equals("tesla") && carPrice<=budget)) {

            System.out.println("Lets Buy "+carBrand);
        }

        else {

            System.out.println("not what I'm looking for");
        }

    }
}
