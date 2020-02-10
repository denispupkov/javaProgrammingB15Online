package day55.association2;

import java.util.ArrayList;
import java.util.List;

public class CourseXRunner {

    public static void main(String[] args) {


        List<Student> myLst = new ArrayList<>();
        myLst.add(new Student("Muge", 101));
        myLst.add(new Student("Mfff", 102));
        myLst.add(new Student("Mggg", 103));
        myLst.add(new Student("Mhhh", 104));
        myLst.add(new Student("Mjjj", 105));
        myLst.add(new Student("Mnnn", 106));

        CourseX java = new CourseX("Has-A", myLst);
        System.out.println("java = " + java);

    }
}