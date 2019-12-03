package day18;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {


        for (int x = 0; x <= 50; x += 2) {

            System.out.println("counting by 2 " + x);
        }

        for (int y = 0; y <= 100; y += 3) {
            System.out.println("counting by 3 " + y);
        }

        for (int i = 1; i < 100; i++) { //fori shortcut

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }


        for (int a = 0; a < 100; a++)
            if (a % 5 == 0 && a % 3 == 0) {

                System.out.println(a + " this is fizz buzz number");
            }

    }
    /// teachers code
    // for (int i = 0; i < 100; i++) {

    //if (i % 5 == 0 && i % 3 == 0) {
    //    System.out.println(i + " IS FIZZ BUZZ NUMBER");

}


