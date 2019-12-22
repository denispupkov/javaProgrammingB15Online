package day32;

public class StringActions {

    public static void main(String[] args) {

        String name = "Denis";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i != name.length() - 1)
                System.out.print("-");
        }


    }
}
