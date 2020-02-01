package day49;

public class TestShapes {

    public static void main(String[] args) {

        Square s1 = new Square("square", 12);
        s1.calculateArea();
        s1.draw();

        Circle c1 = new Circle("Circle", 4);
        c1.calculateArea();
        c1.draw();


    }
}
