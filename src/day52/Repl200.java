package day52;

public class Repl200 {

    public static void main(String[] args) {


        String line = "sjhdflskajfh ERROR as.kjfhalskjfdh";

        line = line.toLowerCase();

        if (line.substring(0, 5).equals("error")) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }
}


