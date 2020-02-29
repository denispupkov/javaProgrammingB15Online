package day64;

public class Mentoring {

    public static void main(String[] args) {


        String str = "All lanes are currently closed. There was accident. Commuters' should avoid the area. ";


        str.replace(".", "");
        str.replace("'", "");

        String[] splitted = str.split(" ");

        String longest = splitted[0];

        for (int i = 0; i < splitted.length; i++) {

            if (splitted[i].length() > longest.length()) {
                longest = splitted[i];

            }
        }
        System.out.println("longest = " + longest);
    }
}
