package day41;

public class ProductDemo {

    public static void main(String[] args) {

        Product p1 = new Product();

        p1.setName("Banana");
        p1.setPrice(1.99);
        System.out.println("p1.getName() = " + p1.getName());
        System.out.println("p1.getPrice() = " + p1.getPrice());

        double myPrice = p1.getPrice();
        System.out.println("myPrice = " + myPrice);

        System.out.println("Hello world"); // to print "Hello World" type "hello world".sout

    }
}
