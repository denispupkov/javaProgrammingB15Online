package day43;

import day42.Movie;

public class MovieActions {
    public static void main(String[] args) {


        Movie m1 = new Movie("Everest", 2.5, "Drama");
        Movie m2 = new Movie("Cinderella", 1.5, "Family");


        printMovieInformation(m1);
        printMovieInformation(m2);
        printShorterDurationMovieName(m1, m2);

//Integer i1 = Integer.valueOf(12);
        Movie result = getJockerMovieObject();
        System.out.println("name is " + result.getName());


    }


    public static void printMovieInformation(Movie movieObj) {
        //TODO YOUR CODE HERE


        System.out.println("The Movie name is " + movieObj.getName());
        System.out.println("is " + movieObj.getLength() + " hour long");
        System.out.println("and it genre is " + movieObj.getType());

    }

    public static void printShorterDurationMovieName(Movie movieObj1, Movie movieObj2) {

        if (movieObj1.getLength() < movieObj2.getLength()) {
            System.out.println(movieObj1.getName() + " is shorter");
        } else {
            System.out.println(movieObj2.getName() + " is shorter");
        }

    }


    public static Movie getJockerMovieObject() {
        Movie j = new Movie("Joker", 2.5, "drama");
        return j;
    }
}

