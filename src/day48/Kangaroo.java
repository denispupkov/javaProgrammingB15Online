package day48;

public class Kangaroo implements Bouncible, BoxerWithBellyPouch {

    String name;
    int jumpDistance;

    @Override //comes from Bellypouch
    public void box() {

    }

    @Override
    public void carryChildInThePocket() {//comes from BellyPouch

    }


    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    public void eat() {

        System.out.println("Kangaroo with name " + name + " is eating");
    }


    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    @Override
    public void bounce() {

        System.out.println("This " + name + " can jump " + jumpDistance
                + " meters forward and it would be nice to have " + GRAVITY + " gravity");


    }


}
