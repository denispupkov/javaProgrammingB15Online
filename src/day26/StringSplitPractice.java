package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {

        String students = "Abbos, Zulyar,Zhiberk,Hasan,Muge, Orhan,Susan";
        //spell the name of each person in this format: A-b-b-o-s-....

        students = students.replace(" ", "");
        System.out.println(students);

        String[] studentsArray = students.split(",");


        System.out.println(Arrays.toString(studentsArray));


        for (int x = 0; x < studentsArray.length; x++) {

            String name = studentsArray[x];
            System.out.println("Spelling " + name);
            for (int i = 0; i < name.length(); i++) {

                System.out.print(name.charAt(i) + "-");

            }
            System.out.println();
        }
    }


}
