package day23;

public class WarmUpArray {

    public static void main(String[] args) {

        int[] box = {3, 4, 5, 6, 7, 8, 9};

        for (int i = box.length - 1; i >= 0; i--) {


            System.out.println(box[i]);

        }

        int lastItem = box.length;

        System.out.println("last item is " + box[box.length - 1]);

        System.out.println("Middle Item = " + box[box.length / 2]);

        int sum = 0;
        for (int i = 0; i < box.length; i++) {
            sum = sum + box[i];

        }
        System.out.println("the sum is " + sum);

        System.out.println("the average is " + sum / box.length);

        int max = 0;

        for (int i = 0; i < box.length - 1; i++) {

            if (box[i] > box[i + 1]) {

                max = box[i];
            } else {
                max = box[i + 1];
            }
        }

        System.out.println("max number is " + max);


        int min = 0;

        for (int x = box.length - 1; x > 0; x--) {

            if (box[x] < box[x - 1]) {

                min = box[x];
            } else {
                min = box[x - 1];
            }
        }
        System.out.println("min number is " + min);


    }
}