package day49;

public class Burger implements Edible, Juicy { //IMPLEMENTS FOR INTERFACE, EXTENDS FOR ABSTRACT!!!!!

    public Burger() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("eat burger and drink soda");
    }


    @Override
    public void melt() {
        System.out.println("Juicy burger is melting");
    }
}
