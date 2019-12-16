package day26;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {

        int[] scores = {156, 101, 76, 187, 87, 110};

        int max = scores[0];
        int count = 0;


        for (int i = 0; i < scores.length; i++) {

            if (scores[i] > 100) {
                ++count;
            }

        }

        if (count > 0) {

            System.out.println("YES WE HAVE " + count + " NUMBERS MORE THAN 100");
        } else {
            System.out.println("THERE IS NO NUMBERS >100");
        }
        count = 0;


        for (int eachNum : scores) {

            if (eachNum < 100) {
                System.out.println("eachNum>100 = " + eachNum);
                count++;
            }
        }
        System.out.println("count = " + count);


    }
}
