package day44.sub;

import day44.Vehicle;

public class Car extends Vehicle {

    int mileage;

    public static void main(String[] args) {

        Car c1 = new Car();
//we dont have an acceess to Vehicle methods because all fields has default access modifier
        c1.mileage = 39637;
        System.out.println("c1.mileage = " + c1.mileage);
        c1.setYear(2016);
        System.out.println("c1.getYear() = " + c1.getYear());
        c1.make = "Corolla";
        System.out.println("c1.make = " + c1.make);


    }


}


