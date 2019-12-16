package day26;

public class ToCharArrayPractice {

    public static void main(String[] args) {

        String survey = "B15 Online 1 Month Survey";

        char[] surveyChar = survey.toCharArray();

        for (char each : surveyChar) {

            System.out.println("each char is :" + each);


        }

        int x = 0;

        while (x < surveyChar.length) {

            System.out.println("each char is " + surveyChar[x]);
            x++;
        }

        int y = 0;

        do {
            System.out.println(surveyChar[y]);
            y++;
        }
        while (y < surveyChar.length);


    }
}
