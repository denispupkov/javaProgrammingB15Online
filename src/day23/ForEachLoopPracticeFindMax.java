package day23;

public class ForEachLoopPracticeFindMax {

    public static void main(String[] args) {

        long[] salaries = {70000L, 180000L, 50000L, 90000L, 100000L};

        long max = salaries[0];

        for (long salary : salaries) {

            if (salary > max) {
                max = salary;
            }

        }
        // System.out.println("salaries = " + salaries);

        System.out.println("max = " + max);
        ;


    }
}
