package day52.polymorphism;

public class ShapePolymorphism {

    public static void main(String[] args) {

        // Circle s1 = new Circle("penny",5);
        //Shape s1 = new Circle("penny",5);
        Object s1 = new Circle("penny", 5);
        // Drawable s1 = new Circle("penny",5);
//only the reference type decide what you can access with that variable
        //   s1.draw();
        //   s1.draw();

        System.out.println(s1.getClass().getSimpleName()); //THIS IS HOW TO KNOW THE NAME OF THE OBJECT!!!!!!

    }

    //create a method that accept any Shape and print out the calculated area
    public static void printAnyShapeArea(Shape anyShape) {


    }


}
