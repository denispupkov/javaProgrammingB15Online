package day09;

public class LanguagePickerSWITCH {

    public static void main(String[] args) {
        char languageCode = 'E';

        switch (languageCode) {
            case 'E':
                System.out.println("Hello");
                break; //used to get out of this branch

            case 'S':
                System.out.println("Hola");
                break;

            case 'T':
                System.out.println("Salam");
                break;
            //case 'G':
            //    System.out.println("Merhaba");
             //   break;
            case 'G':
                System.out.println("Guten Tag");
                break;

            //case 6:
            //    System.out.println("Szia");
              //  break;

            case 'F':
                System.out.println("Bonjur");
                break;

            default: // optional

                System.out.println("language is unknown");
        }


    }
}

