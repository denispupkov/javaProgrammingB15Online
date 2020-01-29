package day48;

public class BouncingParty {

    public static void main(String[] args) {

        Kangaroo b1 = new Kangaroo("Coco", 10);
        System.out.println("b1 = " + b1);
        b1.bounce();
        b1.eat();
        b1.carryChildInThePocket();
        b1.box();
//SuperType variableName = new SuperType(...); THIS WORKS

        Bouncible k1 = new Kangaroo("Toto", 6);
        k1.bounce();

        // List<Integer> lst = new ArrayList<>();


        Ball b2 = new Ball("Round", "blue");
        b2.bounce();

        System.out.println(Bouncible.GRAVITY);// static way to reach

    }
}
