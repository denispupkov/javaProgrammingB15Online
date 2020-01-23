package day42;

import java.util.ArrayList;
import java.util.List;

public class MovieAction {

    public static void main(String[] args) {

        Movie m1 = new Movie();

        System.out.println("m1 = " + m1);

        Movie m2 = new Movie("Jocker", 2.2, "drama");
        Movie m3 = new Movie("Frozen", 1.5, "family");
        Movie m4 = new Movie("Pursuit of happines", 2.0, "drama");
        Movie m5 = new Movie("Titanic", 3.1, "drama");
        Movie m6 = new Movie("Mad Max", 1.4, "action");

        Movie m7 = new Movie("King Kong", 2.4, "horror");
        Movie m8 = new Movie("Home Alone", 1.8, "family");
        Movie m9 = new Movie("Harry Potter", 3.0, "adventure");
        Movie m10 = new Movie("What Happens in Vegas", 1.9, "comedy");
        Movie m11 = new Movie("Wall-e", 1.45, "fantasy");







        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);

        //I want to get the length of m2 separately so I can do some calculation

        //System.out.println("m2 = " + m2.name); don't have an access to read the value without getter method
        System.out.println("m2.getName() = " + m2.getName());

        List<Movie> yourFavoriteMovieLst = new ArrayList<>();

        yourFavoriteMovieLst.add(m2);
        yourFavoriteMovieLst.add(m3);
        yourFavoriteMovieLst.add(m4);
        yourFavoriteMovieLst.add(m5);
        yourFavoriteMovieLst.add(m6);
        yourFavoriteMovieLst.add(m7);
        yourFavoriteMovieLst.add(m8);
        yourFavoriteMovieLst.add(m9);
        yourFavoriteMovieLst.add(m10);
        yourFavoriteMovieLst.add(m11);

        System.out.println("yourFavoriteMovieLst = " + yourFavoriteMovieLst);


    }
}

