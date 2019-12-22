package day31;

public class CalculatorV2 {

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 10;
        char operator = '-';

        calculate(num1, num2, operator);


    }

    public static void calculate(int num1, int num2, char operator) {


        switch (operator) {

            case '+': {

                System.out.println(num1 + num2);
                break;
            }

            case '-': {

                System.out.println(num1 - num2);
                break;
            }
            case '*': {

                System.out.println(num1 * num2);
                break;
            }
            case '/': {

                System.out.println(num1 / num2);
                break;

            }
            default:
                System.out.println("Invalid operator");
        }

    }

}
