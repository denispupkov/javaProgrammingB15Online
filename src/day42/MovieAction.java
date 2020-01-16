package day42;

public class MovieAction {

    public static void main(String[] args) {

        Movie m1 = new Movie();

        System.out.println("m1 = " + m1);

        Movie m2 = new Movie("Jocker", 2.2, "drama");
        Movie m3 = new Movie("Frozen", 1.5, "family");
        Movie m4 = new Movie("Pursuit of happines", 2.0, "drama");

        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);

        //I want to get the length of m2 separately so I can do some calculation

        //System.out.println("m2 = " + m2.name); don't have an access to read the value without getter method
        System.out.println("m2.getName() = " + m2.getName());

    }
}
