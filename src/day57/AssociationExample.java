package day57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {

    String studentName;

    public Student (String studentName){
        this.studentName=studentName;
    }

    @Override
    public String toString() {
        return studentName;
    }

}

class School {
    String schoolName;
    List<Student> AllStudentsList;


public School (String schoolName, List<Student> allStudentsList) {
this.schoolName=schoolName;
this.AllStudentsList=allStudentsList;
}
public void AddNewStudent (Student student) {

    this.AllStudentsList.add(student);
}

public void AddNewStudent(Student[] students) {

    this.AllStudentsList.addAll(Arrays.asList(students));
}

    public void AddNewStudent(List<Student> listOfStudents) {

    this.AllStudentsList.addAll(listOfStudents);
}

    public String toString() {
        return "" + AllStudentsList;
    }

}




public class AssociationExample {

    public static void main(String[] args) {
        Student s1 = new Student("Jack Parrot");
        System.out.println("s1 = " + s1);
        System.out.println("s1.studentName = " + s1.studentName);
        Student s2 = new Student("Brett Pit");
        Student s3 = new Student("Tom Cruse");
        Student s4 = new Student("Michael Jackson");
        Student s5 = new Student("Madonna");

        List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
        System.out.println("list = " + list);

        School cybertek = new School("Cybertek",list);
        cybertek.AddNewStudent(new Student("Pink"));
        cybertek.AddNewStudent(new Student("Metallica"));

        Student [] students = {
                new Student("Gulnaz"),
                new Student("Rukshona")
        };
        cybertek.AddNewStudent(students);


        System.out.println(cybertek.AllStudentsList);
        //System.out.println(cybertek.schoolName);

        for (Student eachStudent : cybertek.AllStudentsList) {

            System.out.println(eachStudent);
        }

    }



}
