package day31;

public class CallingOneMethodInsideAnother {

    public static void main(String[] args) {

        finallyAwake(); //combined method
        drinkCoffee();
        drinkCoffee();
        wakeUp();

    }

    public static void finallyAwake() {

        wakeUp();
        drinkCoffee();
    }

    public static void wakeUp() {

        System.out.println("wake up");
    }

    public static void drinkCoffee() {

        System.out.println("drink coffee");
    }
}


