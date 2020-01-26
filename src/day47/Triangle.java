package day47;

public class Triangle extends Shape {

    int base;
    int hights;

    public Triangle(int base, int hights) {
        super("my triangle");
        this.base = base;
        this.hights = hights;
    }

    @Override
    public void calculateArea() {
        area = (base * hights) / 2;
    }

//    @Override
//    public String toString() {
//        return null;


    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", hights=" + hights +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

