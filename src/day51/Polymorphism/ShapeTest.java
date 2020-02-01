package day51.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        //s1.draw();
        //s2.draw();
        //s3.draw();

        List<Shape> lst = new ArrayList<>();
        // List<Shape> shapeList = Arrays.asList(s1,s2,s3,s2,s1);//we cannot add or remove items using this way
        lst.add(s1);
        lst.add(s2);
        lst.add(s3);

        for (Shape eachShape : lst) {
            eachShape.draw();


        }
        System.out.println("----------------");

        Shape[] allShapes = {s1, s2, s3, new Triangle(), new Rectangle()};
        for (Shape each : allShapes) {
            each.draw();
        }

    }
}
