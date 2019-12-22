package day32;

public class WarmUpHomeWork {

    public static void main(String[] args) {

        printReverseName();
        printAnyReverseName("ABRACADABRA");
        printLastCharacter("Java");
        printFullNameInfo("Arya", "Stark");
        compareNameCharacterCount("Samuell", "William");
        printAtoZ();
        printZtoA();
        nameWithDashes("Lanesters");
        printAlphabetInRange('a', 'f');
        printAlphabetInRange('G', 'B');
    }


    public static void printReverseName() {

        String name = "Denis";

        for (int i = 4; i >= 0; i--) {

            System.out.print(name.charAt(i));


        }
        System.out.println();
    }

    public static void printAnyReverseName(String anyName) {


        for (int i = anyName.length() - 1; i >= 0; i--) {

            System.out.print(anyName.charAt(i));


        }
        System.out.println();
    }

    public static void printLastCharacter(String last) {


        System.out.println(last.charAt(last.length() - 1));


    }

    public static void printFullNameInfo(String first, String last) {


        System.out.println("Your first name is " + first + ", your last name is " + last);
        System.out.println("your full name length is " + (first.length() + last.length()));

    }

    public static void compareNameCharacterCount(String name1, String name2) {

        if (name1.length() > name2.length()) {

            System.out.println(name1 + " has more characters");
        } else if (name2.length() > name1.length()) {
            System.out.println(name2 + " has more characters");
        } else if (name1.length() == name2.length()) {

            System.out.println(name1 + " has the same number of characters as " + name2);
        }

    }

    public static void printAtoZ() {

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");

        }
        System.out.println();
    }

    public static void printZtoA() {

        for (char cha = 'Z'; cha >= 'A'; cha--) {
            System.out.print(cha + " ");

        }
        System.out.println();
    }

    public static void nameWithDashes(String name) {

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i != name.length() - 1)
                System.out.print("-");
        }
        System.out.println();

    }

    public static void printAlphabetInRange(char beginning, char ending) {

        if (beginning < ending) {

            System.out.println("We need to increment from " + beginning + " till " + ending);
            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.print("iChar = " + iChar);
            }
            System.out.println();

        } else if (beginning > ending) {

            System.out.println("We need to Decrement from " + beginning + " till " + ending);
            for (char iChar = beginning; iChar >= ending; iChar--) {
            }
            System.out.println();
        }


        /*
         if (beginning < ending) {
            System.out.println("WE NEED TO INCREMENT FROM " + beginning + " till " + ending);

            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.print(iChar + " ");
            }
            System.out.println();

        } else if (beginning > ending) {
            System.out.println("WE NEED TO DECREMENT FROM " + beginning + " till " + ending);

            for (char iChar = beginning; iChar >= ending; iChar--) {
                System.out.print(iChar + " ");
            }
            System.out.println();

        } else {
            System.out.println("THEY ARE SAME CHARACTER!!!!");
        }
    }
         */
    }
}