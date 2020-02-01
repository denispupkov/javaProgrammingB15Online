package day49;

public class Square extends Shape {

    int length;

    public Square(String name, int length) {

        super(name);
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println(length * 2);

    }

    @Override
    public void draw() {
        System.out.println("drawing square with color " + COLOR);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }


}
