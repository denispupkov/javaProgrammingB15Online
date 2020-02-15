package day57;

class circle {

    public double radius;

    public circle(double radius) {
        this.radius = radius;

    }

    @Override
    public boolean equals(Object O) {

        //circle c =(circle)O;

        if (O instanceof circle)
            if (radius == ((circle) O).radius)
                return true;
        return false;
    }
}


public class TestCircle {
    public static void main(String[] args) {

        circle c1 = new circle(4);
        circle c2 = new circle(4);

        System.out.println(c1.equals(c2));


        circle c4 = new circle(7);
        circle c5 = new circle(8);

        System.out.println(c4.equals(c5));
    }

}
