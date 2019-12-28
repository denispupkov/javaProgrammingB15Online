package day30;

public class Repl123 {

    public static void main(String[] args) {

        int size = 0;
        int cm = 1;
        for (int i = 1; i <= 10; i++) {


            if (i > 0 && i < 4) {
                cm = 1;
                size += cm;

            } else if (i >= 4 && i <= 10) {
                cm = 2;
                size += cm;
            }


            System.out.println("year " + i + " - growth " + cm + " cm");
            System.out.println("tree size: " + size + "cm");
        }
    }
}
