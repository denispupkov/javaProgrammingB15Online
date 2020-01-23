package day45;

public class Phone extends Electronic {

    double size;
    double price;

    public static void main(String[] args) {


        Phone p1 = new Phone();
        p1.size = 12;
        p1.price = 399;
        p1.brand = "Apple";
        p1.showBrand();

        Electronic.displayUseElectricity();//both classes have it
        Phone.displayUseElectricity();//static way to call method
        p1.displayUseElectricity();

        System.out.println(Electronic.useElecticity);
        System.out.println(Phone.useElecticity);


    }
}
