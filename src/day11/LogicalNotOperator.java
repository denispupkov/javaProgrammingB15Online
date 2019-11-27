package day11;

public class LogicalNotOperator {

    public static void main(String[] args) {

        // LOGICAL NOT OPERATOR ! used to negate the boolean
        // IT CANNOT BE USED WITH ANY OTHER DATA TYPE OTHER THAN BOOLEAN

        System.out.println(true);
        System.out.println(false);
        System.out.println(! true); // its like flipping the coin - opposite value - false
        System.out.println(! false); // its like flipping the coin - opposite value - true

        boolean isRecording = false;

        System.out.println(! isRecording);
        System.out.println(isRecording);

        System.out.println("result of (7>5) is: "+(7>5));
        System.out.println("result of !(7>5) is: "+!(7>5));

        int x = 10;

        System.out.println("result of x>10 is "+(x>10));
        System.out.println("result of !x>10 is "+!(x>10));
    }
}
