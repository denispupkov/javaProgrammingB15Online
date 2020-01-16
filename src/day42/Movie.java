package day42;

public class Movie {

    private String name;
    private double length;
    private String type;

    //write a constructor to set all the fields value

    public Movie() {
        System.out.println("Empty Movie");
    }

    public Movie(String name, double length, String type) { //automatically generated Constructor
        this.name = name;
        this.length = length;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
