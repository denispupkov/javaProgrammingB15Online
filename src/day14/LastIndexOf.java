package day14;

public class LastIndexOf {

    public static void main(String[] args) {

        String name ="Game of Java";

        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf(" "));
        System.out.println(name.lastIndexOf("Ga"));
        System.out.println(name.lastIndexOf("Kawa"));



        if (name.indexOf("Kawa")>-1) {

            System.out.println("Kawa FOUND");
        }
        else {

            System.out.println("NO KAWA");
        }
    }
}
