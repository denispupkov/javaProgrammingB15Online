package day09;

public class LanguagePicker {

    public static void main(String[] args) {

        int languageCode = 11;
        String greeting = "Hello"; //assigning an empty value

        if (languageCode == 1) {
            greeting = "Salam";
        } else if
        (languageCode == 2) {
            greeting = "Hola";
        } else if (languageCode == 3) {
            greeting = "Privet";
        } else if (languageCode == 4) {
            greeting = "Merhaba";
        } else if (languageCode == 5) {
            greeting = "Szia";
        } else if (languageCode == 6) {
            greeting = "Bonjur";
        } else if (languageCode == 7) {
            greeting = "Guten Tag";
        }

        else {
            System.out.println("wrong");
        }
         System.out.println(greeting);
    }

        //System.out.println("Wrong number");

}
