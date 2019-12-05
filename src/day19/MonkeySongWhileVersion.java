package day19;

public class MonkeySongWhileVersion {

    public static void main(String[] args) {

        //int totalMonkeys = 5;

        for (int totalMonkeys=5; totalMonkeys >= 1; totalMonkeys--) {

            if (totalMonkeys % 2 != 0 && totalMonkeys!=1) {

                System.out.println(totalMonkeys + " little monkeys jumping on the bed,\n" +
                        "One fell down and bumped his head,\n" +
                        "Mama called the doctor and the doctor said,\n" +
                        "No more monkeys jumping on the bed!");
                //--totalMonkeys;

            }
            else if (totalMonkeys % 2 == 0 && totalMonkeys!=1) {

                System.out.println(totalMonkeys + " little monkeys jumping on the bed,\n" +
                        "One fell down and bumped her head,\n" +
                        "Mama called the doctor and the doctor said,\n" +
                        "No more monkeys jumping on the bed!");
               // --totalMonkeys;

            }
            else
            {
                System.out.println("1 little monkey jumping on the bed,\n" +
                        "One fell down and bumped his head,\n" +
                        "Mama called the doctor and the doctor said,\n" +
                        "Put those monkeys right to bed");
                //--totalMonkeys;


            }
        }
    }
}


