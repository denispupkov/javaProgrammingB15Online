package day51.Polymorphism;

public class AnimalShow {

    public static void main(String[] args) {


        Dog d1 = new Dog();
        //we are referring dog object using animal reference
        Animal a1 = new Dog();
        a1.makeNoise();
        a1 = new Horse();
        a1.makeNoise();

        Animal a2 = new Horse();
        a2.makeNoise();

        Dog d2 = new Dog();
        Animal a3 = d2;


    }
}
