package day23;

public class StringArrayPractice {

    public static void main(String[] args) {

        String[] shows = {"Orville", "Gifted",
                "Game of Thrones", "Flash", "Arrow",
                "Super Girl"};

        int count = shows.length;

        System.out.println("count = " + count);

        for (int i = 0; i < count; i++) {

            String currentShow = shows[i];
            System.out.println(currentShow + " has character count " + currentShow.length());

        }

    }
}
