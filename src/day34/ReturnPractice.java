package day34;

public class ReturnPractice {

    public static void main(String[] args) {
        printMin4CharacterLengthName("Den");
        printMin4CharacterLengthName("Denis");


    }


public static void printMin4CharacterLengthName (String name) {

        if (name.length()<4) {
            System.out.println("INVALID NAME");

            return;
        }

    System.out.println(name);
}
}
