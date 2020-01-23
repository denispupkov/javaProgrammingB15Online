package day46;

public class JavaProgrammer extends Programmer {

    @Override
    void code() {
        super.code();
        System.out.println("I code Java");
    }

    @Override
    void test() {
        super.test();
        System.out.println("doRepl");
    }

    public void drinkCoffee() {
        System.out.println("drink coffee");
    }

    public void doJavaDeveloper() {
        System.out.println("Do development");
    }

}
