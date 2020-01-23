package day45;

public class Electronic {

    String brand;
    static boolean useElecticity = true;


    public void showBrand() {
        System.out.println("brand = " + brand);
    }

    public static void displayUseElectricity() {
        System.out.println("displaying useElecticity = " + useElecticity);
    }


}
