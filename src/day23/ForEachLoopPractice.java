package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        long[] salaries = {70000L, 80000L, 50000L, 90000L, 100000L};

        //long eachPrint=salaries[];

        for (long print : salaries) { //PRINT EVERYTHING USING FOR EACH


            if (print <= 80000L) {
                continue;                    //PRINT ONLY MORE THAN 80K USING CONTINUE

            }
            System.out.println("salaries = " + print);
        }

        for (long print : salaries) {

            System.out.println();
        }


    }

}

