package day14;

public class StringReview {

    public static void main(String[] args) {

        String str = "I like Pumpkin";
        String str2 = "I don't like melon";

        System.out.println(str.equals("pumpkin"));

        System.out.println(str.contains("Pumpkin")); // contains method checks string inside another string
        boolean gotPumpkin = str.contains("Pumpkin"); // saves the result into boolean
        System.out.println("gotPumpkin = " + gotPumpkin);//soutv - shortcut to print in nice format

        boolean startedWithI = str.startsWith("I li");
        System.out.println("startedWithI = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("kin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);



    }
}
