package day19;

public class MonkeySongFullVersion {

    public static void main(String[] args) {

        int monkeyBoys = 3;
        int monkeyGirls = 2;
        while (monkeyBoys >= 1 || monkeyGirls>=1) {

            System.out.println(monkeyBoys + " little monkeys jumping on the bed,\n" +
                    "One fell down and bumped his head,\n" +
                    "Mama called the doctor and the doctor said,\n" +
                    "No more monkeys jumping on the bed!");
            --monkeyBoys;


            System.out.println(monkeyGirls + " little monkeys jumping on the bed,\n" +
                    "One fell down and bumped her head,\n" +
                    "Mama called the doctor and the doctor said,\n" +
                    "No more monkeys jumping on the bed!");
            --monkeyGirls;
        }
        {
            System.out.println("Put those monkeys right to bed!");


        }
    }
}


