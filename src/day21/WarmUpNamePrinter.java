package day21;

public class WarmUpNamePrinter {

    public static void main(String[] args) {

        String myName = "My_name_is_Denis";
        String arrow = "->";

        for (int i = 0; i <= myName.length() - 2; i += 2) { //scanning by 2 characters at a time


            System.out.print(myName.substring(i, i + 2)); //printing two characters at a time
            //System.out.print(arrow);
            System.out.print(" ");
        }


    }
}
