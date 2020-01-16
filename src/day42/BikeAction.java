package day42;

public class BikeAction {
    public static void main(String[] args) {

        Bike b1 = new Bike("abc"); // 1 constructor
        Bike b2 = new Bike();// 2 constructor

        //i dont want empty gear
        //i want the bake come with gear set to 1

        System.out.println("b1.gear = " + b1.gear);
        System.out.println("b2.gear = " + b2.gear);


        Bike b3 = new Bike(4);// 3 constructor
        System.out.println("b3.gear = " + b3.gear);

        // I want  bike with both speed and gear set to the value I specify

        Bike b4 = new Bike(3, 55); //creating object with preset value using 4 constructor

        System.out.println("b4.gear = " + b4.gear);
        System.out.println("b4.speed = " + b4.speed);
    }
}
