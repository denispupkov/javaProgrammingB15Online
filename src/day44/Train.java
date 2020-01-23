package day44;

public class Train extends Vehicle { //"extends" command  transfers all methods, fields from Vehicle

    int wagonCount;

    public void makeChoChoSound() {

        System.out.println("CHOOO CHOOOOOO");
    }

    public static void main(String[] args) {

        Train t1 = new Train();
        t1.makeChoChoSound();
        t1.make = "Thomas";
        //t1.year=1999; //private is not inherited
        System.out.println(t1.getYear());
        t1.start();
        t1.goForward();

    }

}
