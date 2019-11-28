package day15;

public class SubStringPractice {

    public static void main(String[] args) {

        String movie = "Lord Of The Ring";

        String wordOf = movie.substring(5,7); // start from index 5 and end RIGHT BEFORE index 7
        System.out.println("wordOf = " + wordOf);

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        int startingPoint = movie.indexOf(" ") +1;
        int endingPoint = movie.length();

        System.out.println("second word till last: "+movie.substring(startingPoint,endingPoint));

        String secondWordTillLast = movie.substring(5,16);
        System.out.println("second Till Last: " +secondWordTillLast);

        String wordLordOf = movie.substring(0,7);
        System.out.println("wordLordOf = " + wordLordOf);

        String secondToLast = movie.substring(5); //skip second parameter to work till the end

        //ring of the lord

        String ring = movie.substring(12);
        String word_Of = movie.substring(5,7);
        String word_The = movie.substring(8,11);
        String word_Lord = movie.substring(0,4);

        System.out.println(ring+" "+word_Of+" "+word_The+" "+word_Lord); //first way

        System.out.println(movie.substring(12,16) + " " + movie.substring(8,11) + " " + movie.substring(5,7) +
                " " + movie.substring(0,4)) ; //second way



    }
}
