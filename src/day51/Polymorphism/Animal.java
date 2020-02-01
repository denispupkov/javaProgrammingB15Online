package day51.Polymorphism;

public class Animal {

    public void makeNoise() {
        System.out.println("general animal noice");

    }
}

class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("WOOFFF");
    }

}

class Horse extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("NEINEII");


    }
}