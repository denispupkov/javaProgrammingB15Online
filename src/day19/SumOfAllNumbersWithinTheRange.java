package day19;

public class SumOfAllNumbersWithinTheRange {

    public static void main(String[] args) {

        int sum = 0;

        //sum=sum+1; //1
        //sum=sum+2; //3
        //sum=sum+3; //6
        //sum=sum+4; //10
        //sum=sum+5; //15
        // sum = sum+i

        for (int i = 1; i <= 10; i++) {

            sum = sum + i;
            System.out.println(sum);
        }
        // this place for print statement to show only final result
    }
}
