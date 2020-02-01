package day49;

public abstract class Shape implements Drawable {

    String name;
    double area;

    public Shape() {

    }

    public Shape(String name) {
        this.name = name;
        //this.area = area;
    }

    public abstract void calculateArea();


}
