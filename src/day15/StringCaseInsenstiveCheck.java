package day15;

public class StringCaseInsenstiveCheck {

    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println("is Arya Stark contains ST?"+name.contains("st"));

        String upperCaseName = name.toUpperCase();
        System.out.println("upperCaseName contains ST or NOT?"+upperCaseName.contains("ST"));

        String lowerCaseName = name.toLowerCase();
        System.out.println("lowercase contains st or not?"+lowerCaseName.contains("st"));

        //------------------------------- another way to solve UpperCase LowerCase check

        // name.toLowerCase().contains("st") -SOLUTION
        System.out.println(name.toLowerCase().contains("st"));

        //System.out.println(name.length().toUppercase()); - WRONG COMMAND!!! (number length cannot be in UpperCase)



    }
}
