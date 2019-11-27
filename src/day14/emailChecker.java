package day14;

public class emailChecker {

    public static void main(String[] args) {

        String email = "abc123@gmail.ru";

        if (!email.contains("@") || email.contains(" ")) {

            System.out.println("Email INVALID");

        } else if (email.endsWith("gmail.com")) {

            System.out.println("Google mail");
        } else if (email.endsWith("yahoo.com")) {

            System.out.println("yahoo mail");

        } else if (email.endsWith("mail.ru")) {


            System.out.println("mail.ru email");


        }


    }

}