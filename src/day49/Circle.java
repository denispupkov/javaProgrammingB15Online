package day49;

public class Circle extends Shape {

    int radius;


    public Circle(String name, int length) {

        super(name);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * (radius * radius));
    }

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
