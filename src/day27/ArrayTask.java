package day27;

public class ArrayTask {

    public static void main(String[] args) {

        int[] scores = {100, 897, 654, 32, 1231, 224, 56, 7, 10, 2, 3, 4};

        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {

            if (min > scores[i]) {
                min = scores[i];


            }

        }
        System.out.println("min = " + min);


        int secondMin = scores[0];
        for (int x = 0; x < scores.length; x++) {
            if (scores[x] == min) {
                continue;
            }
            if (secondMin > scores[x]) {
                secondMin = scores[x];


            }

        }

        System.out.println("secondMin = " + secondMin);
    }
}
