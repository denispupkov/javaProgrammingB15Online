package day21;

public class LoopControlStatement {

    public static void main(String[] args) {

        // break
        // continue

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            break;
//        }

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
//-------------------------------------------------
        int sum = 0;

        for (int x = 1; x <= 10; x++) {

            System.out.println("current sum " + sum);
            System.out.println("if I add " + x + " dollar, it would be " + (sum + x));
            if (sum + x > 12) { //HERE IS THE KEY CODE sum+x TO BREAKING OUT THE LOOP BEFORE REACHING 40
                //and than row 38 add value if row 28 satisfies

                break;
                // System.out.println("final sum is = " + sum);

            }


            sum = sum + x;   // add the sum after we make sure it did not over 40
        }
        // System.out.println("accumulating sum from 1 to 10 = " + sum);

    }
}
