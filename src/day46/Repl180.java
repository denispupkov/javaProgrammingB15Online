package day46;

public class Repl180 {

    public static void main(String[] args) {
        System.out.println(coverString("hih", "hi")); //java [me]thods
    }

    public static String coverString(String main, String coverME) {
        String result = "";
        int lengthOfCoverMe = coverME.length();
        String newCoverME = "[" + coverME + "]";
        System.out.println("newCoverME = " + newCoverME);

        if (main.contains(coverME)) {
            result = main.replaceAll(coverME, newCoverME);
        } else {
            result = "[" + main + "]";
        }

        return result;
    }

}



