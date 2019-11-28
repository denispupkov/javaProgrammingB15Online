package day15;

public class ReplaceMethod {

    public static void main(String[] args) {

        String message ="I love Pumpkin, Pumpkin is FUN!";

        message.replace("Pumpkin","Java");
        System.out.println(message); //not replaced message because string is ammunable

        String messageTwo=message.replace("Pumpkin","Java");
        System.out.println(messageTwo); //will work

        String message3 ="Happy Thanks Giving to ALL!!!";

        message3=message3.replace("Thanks Giving","Thanksgiving"); //concatenate thanks and giving

        System.out.println("message3 = " + message3);

        message3=message3.replace("!!!","!"); //changing number of !
        System.out.println("message3 = " + message3);

        message3=message3.replace(" ",""); //removes all spaces
        System.out.println("message3 = " + message3);

        String message4 = "Tomorrow is off NO!";
        System.out.println(message4.replace("NO",""));

    }
}
