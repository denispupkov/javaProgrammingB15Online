package day54;

public class AnimalShow {

    public static void main(String[] args) {


        Dog d1 = new Dog();
        System.out.println("d1.name = " + d1.name);
        d1.play();
        d1.speak();

        Animal a1 = d1;
        a1.speak();

        Object o1 = d1;


        IndoorPet p1 = d1;
        p1.play();


    }
}
