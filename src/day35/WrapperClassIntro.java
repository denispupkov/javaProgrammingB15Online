package day35;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int x = 10;

        Integer x1 = new Integer (12); // not recommended way to create Integer Object
        Integer x2 = Integer.valueOf(10);
        Integer x3 = Integer.valueOf("10");

        byte bValue = x2.byteValue(); //turn int into byte object
        System.out.println("bValue = " + bValue);

        double dValue =x2.doubleValue();//turn int into double object
        System.out.println("dValue = " + dValue);

    }
}
