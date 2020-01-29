package day49;

public class IceCream extends Object implements Edible {

    @Override
    public void digest() {
        System.out.println("Digesting burger by chewing more");
    }


    @Override
    public void eat() {
        System.out.println("eat with spoon");
    }

    @Override
    public void drink() {
        System.out.println("drink it if it melted in the cup");
    }

    public static void main(String[] args) {

        IceCream i1 = new IceCream();

        i1.drink();
        i1.eat();
        System.out.println(i1.toString());
        i1.digest();
        Juicy.squeeze();//comes from INTERFACE as a static!


        //since Object class exists we can create object out of it
        //Object o1 = new Object();
    }

}
