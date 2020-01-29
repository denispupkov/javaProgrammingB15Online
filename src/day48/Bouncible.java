package day48;

public interface Bouncible {


    //public static final double GRAVITY = 9.81; / 1 way
    double GRAVITY = 9.81;//2 way

    //THIS IS EXCLUSIVE FEATURE FOR INRERFACE!!!!!!!!
    //public abstract void bounce(); 1 way!
    void bounce();//2 way!

    //every member in interface automatically public
    // if no access modifier is given
    // all the method with no body automatically public abstract
}
