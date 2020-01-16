package day41;

public class Product {

    private String name;
    private double price;


    // we can generate getters and setters by using "generate" function clicking right click
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //    public String getName() {
//        return this.name;  //word "this" means it belongs to the same method !!!!!!!!!!!!!!!!
//    }
//
//    public void setName(String newName) {
//        name = newName;
//    }
//
//    public double getPrice() {
//        return this.price;
//    }
//
//    public void setPrice(double price) {
//        if (price > 0) {
//            this.price = price; //word "this" means it belongs to the same method !!!!!!!!!!!!!!!!
//        }
//    }
}