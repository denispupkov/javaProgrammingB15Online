package day36;

public class MethodWithParamether {

    public static void main(String[] args) {

        int num=7;
        addOneHundred(25);
        addOneHundred(new Integer(100));
        addOneHundred(num);

        int num2 = 10;
        addOneHundred(num2);

    }
public static void addOneHundred (int x) {

        x=x+100;
        System.out.println(x);

}


}
