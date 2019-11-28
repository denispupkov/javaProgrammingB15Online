package day15;

public class WarmUpTest {

    public static void main(String[] args) {

        String name ="Denis";

         if (name.length()<4) {


             System.out.println("Short name");
        }

         else if (name.length()>=4 && name.length()<=11) {

             System.out.println("Medium name");
         }

         else {
             System.out.println("Longer name");

         }

             if (name.contains("a") || name.contains("e")) {

             System.out.println("name contains a or e");
         }
         else {

             System.out.println("I don't have a or e in my name");
         }


        System.out.print(name.charAt(4));
        System.out.print(name.charAt(3));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(0));

         }
    }

