package day43;

public class Coffee {

    private String name;
    private int caffeineLevel;
    private double price;

    public Coffee() {
        System.out.println("no args constructor");
    }

    public Coffee(String newName, int newCaffeineLevel, double price) {
        this.name = newName;
        this.caffeineLevel = newCaffeineLevel;
//        if (price>0) {
//            this.price = price;
//        }
//    else {
//        this.price=1;
//        }
        setPrice(price); //replaces the code above when we call setter into Constructor
    }

    public Coffee(String newName, int newCaffeineLevel) {
        this.name = newName;
        this.caffeineLevel = newCaffeineLevel;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 1;
        }
    }


    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }
}
