package day27;

public class MultiDArraysTask2 {

    public static void main(String[] args) {

        String[] developersTeam = {"devOne", "devTwo", "devThree", "devFour"};
        String[] testersTeam = {"TesterOne", "TesterTwo", "TesterThree"};
        String[] BATeam = {"BAOne", "BATwo", "BAThree"};

        String[][] scrumTeam = {developersTeam, testersTeam, BATeam};

        int maxLength = scrumTeam[0][0].length();

        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) {
                if (maxLength < eachElement.length()) {
                    maxLength = eachElement.length();
                }

            }

        }
        System.out.println("maxLength = " + maxLength);


        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) {
                if (maxLength == eachElement.length()) {

                    System.out.println("Longest String = " + eachElement);


                }
            }
        }
    }
}