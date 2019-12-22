package day31;

public class Repl123 {

    public static void main(String[] args) {

/*
year 1 - growth 1 cm
tree size: 1cm
year 2 - growth 1 cm
tree size: 2cm
year 3  - growth 1 cm
tree size:3cm
year 4 - growth 2 cm
tree size: 5cm
year 5 - growth 2 cm
tree size: 7cm
year 6 - growth 2 cm
tree size: 9cm
... until you reach year 10
 */
        int size = 0;
        for (int i = 1; i < 7; i++) {
            System.out.print(i);
            for (int j = 0; j < i; j++)
                if (i >= 0 && i < 3) {
                    size = 1;
                    if (i > 2) {
                        size = 2;
                    }
                    System.out.print(size);

                }

        }
    }
}