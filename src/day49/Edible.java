package day49;

public interface Edible {

    //in interface any field are automatically public static final!!!!
    //ALL fields names are CAPITAL!!!
    public static final boolean IS_HUMAN_FOOD = true;

    // ITS AUTOMATICALLY PUBLIC ABSTRACT EVEN IF IT IS NOT MENTIONED
    public abstract void eat();

    public abstract void drink();
    //public abstract void digest();//when one method added after creating subClasses it starts failing

    //default method was added since java 8 to provide implementation to not break
    //existing classes and have option to use it as is or override
    //DEFAULT EXISTS ONLY IN INTERFACE!!!!!!
    //DEFAULT HERE IS NOT(!!!) AN ACCESS MODIFIER!!!!
    public default void digest() {
        System.out.println("you implement the code yourself");
    }


}
