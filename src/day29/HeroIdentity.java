package day29;

public class HeroIdentity {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";
        String heroX = "Superman-************";


        String[] hiddenIdentity = hero1.split("-");

        String herocode = hiddenIdentity[0];
        String fullname = hiddenIdentity[1];

        int nameLength = fullname.length();

        System.out.println(herocode);
        System.out.println(fullname);
        System.out.println(nameLength);


        String stars = "";
        for (int i = 0; i < nameLength; i++) {

            stars = stars + "*";

        }


        System.out.print(herocode);
        System.out.print("-");
        System.out.print(stars);

        heroX = herocode + "-" + stars; //second variant
        System.out.println();
        System.out.println(heroX);


    }
}
