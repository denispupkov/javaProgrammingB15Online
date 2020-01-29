package day49;

//Interface can achieve loosely coupling between implementing classes
// for example when we say flyable it could be all fliable - plane, insects, superman
public interface Juicy {

    public abstract void melt();

    //another type of method Interface can have STATIC METHOD
    //it must have a body, and provides utility methods
    //IT DOES NOT BELONG TO ANY CLASS

    public static void squeeze() {

        System.out.println("static squizzing");
    }


}
