package day03;

public class CharacterAndBoolean {
    public static void main(String[] args) {

        char grade = 'A';
        char emailSign = '@';

        System.out.println("My score for Math is " + grade);
        System.out.println("denis.pupkov" + emailSign + "gmail.com");

        boolean isLightOn = true;
        System.out.println("did you turn off the light?: "+isLightOn);
        isLightOn = false;                                              // the value for the same boolean is changed
        System.out.println("did you turn off the light?: "+isLightOn);

        boolean areYouSleeping = false;
        System.out.println("are you sleeping?: "+areYouSleeping);


        boolean isWeatherNice = false;
        System.out.println("is the weather fine?: "+isWeatherNice);

    }
}
