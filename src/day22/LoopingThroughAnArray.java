package day22;

public class LoopingThroughAnArray {

    public static void main(String[] args) {


        int[] scores = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        int itemCount = scores.length; // NO () !!!! method has (), property HAS NOT ()!!!!!!
        int lastItemIndex = itemCount - 1;


        for (int i = 0; i < itemCount; i++) { // before assigning for loop we have to know the length of the loop

            System.out.println(scores[i]);

        }
        for (int j = lastItemIndex; j >= 0; j--) {

            System.out.println(scores[j]);

        }

    }
}

