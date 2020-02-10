package day55.association2;

import java.util.List;

public class CourseX {

    String topic;
    List<Student> studentList;

    public CourseX(String topic, List<Student> studentList) {
        this.topic = topic;
        this.studentList = studentList;


    }

    public void addStudent(Student s) {

        studentList.add(s);
    }

    public void addStudent(Student s1, int ID) {
        studentList.add(s1);
    }

    @Override
    public String toString() {
        return "CourseX{" +
                "topic='" + topic + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
