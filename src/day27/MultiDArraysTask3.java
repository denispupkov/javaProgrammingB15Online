package day27;

public class MultiDArraysTask3 {

    public static void main(String[] args) {

        String[] developersTeam = {"devOne", "devTwo", "devThree", "devFour"};
        String[] testersTeam = {"TesterOne", "TesterTwo", "TesterThree"};
        String[] BATeam = {"BAOne", "BATwo", "BAThree"};

        String[][] scrumTeam = {developersTeam, testersTeam, BATeam};


        int minLength = scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];

        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j < scrumTeam[i].length; j++) {

                if (minLength > scrumTeam[i][j].length()) {

                    minLength = scrumTeam[i][j].length();
                    shortestString = scrumTeam[i][j];
                }
            }

        }
        System.out.println("shortestString = " + shortestString);
        System.out.println("minLength = " + minLength);


    }
}
