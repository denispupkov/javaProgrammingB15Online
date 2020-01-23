package day45;

public class Apple extends Fruit {

    public Apple() {

        //I want to reuse the functionality of super class "fruit"

        super("test");// take only one matched by paramethers constructor from Fruit

        //IF THERE IS NO super() in sub class it will take FIRST from the top CONSTRUCTOR FROM Fruit
    }

    public static void main(String[] args) {

        Apple a1 = new Apple();
    }

}
