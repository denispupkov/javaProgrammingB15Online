package day31;

public class MethodIntro {

    public static void main(String[] args) {


        System.out.println("Begin");
        System.out.println("------------");
        MethodIntro.sayHello();
        System.out.println("------------");
        sayHello();
        System.out.println("------------");
        sayHello();
        System.out.println("------------");
        System.out.println("THE END");
    }

    // DO NOT CREATE A METHOD INSIDE MAIN METHOD!!!!!!!!!!!!!!!!!!!!
    public static void sayHello() {
        System.out.println("Hello World");
        System.out.println("My name is Denis");
        System.out.println("I love Java");


    }

}
