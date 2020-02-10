package day55;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
//        c1.addNum(100);
        c1.addNum(100) //WE CAN CHAINING (BUILDER PATTERN!!!) addNum and MinusNum methods!
                .addNum(200)
                .addNum(100)
                .minusNum(50)
                .minusNum(25)
                .displayFinalResult();//calling method to display final result

        // System.out.println(c1.result);
//        c1 = c1.addNum(100);
//        c1 = c1.addNum(200);
//        c1 = c1.addNum(100);


    }

}