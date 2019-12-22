package day31;

public class WarmUp {

    public static void main(String[] args) {

        sayHelloWorld();
        sentence();
        System.out.println("__________________");
        sayHelloWorld();
        sentence();
        System.out.println("__________________");
        WarmUp.sentence(); // another way to call my method

        MethodIntro.sayHello(); //CALL METHOD FROM ANOTHER CLASS


    }

    public static void sayHelloWorld() {

        System.out.println("Hello \tWorld");
        System.out.println("Hello \nWorld");
        System.out.println("Hello \'World");
        System.out.println("Hello \"World");
        System.out.println("Hello \\World");

    }

    public static void sentence() {

        System.out.println("I like the book \"Java\" really");
        System.out.println("The movie name is : 'lord of the ring'   ");
        System.out.println("Hello\tWorld");
        System.out.println("Hello\nB15");

        System.out.print("This is regular print \n"); //this is how to use print next line function for print statement
        System.out.println("This is println");


    }

}

