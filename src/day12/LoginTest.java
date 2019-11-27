package day12;

public class LoginTest {

    public static void main(String[] args) {

        String username="denispupkov";
        String password="12345";

        if (username.equals("denispupkov") && password.equals("12345")) {

            System.out.println("login successful");
        }
        else if ( ! username.equals("denispupkov")) {  // NOT EQUAL COMMAND

            System.out.println("username is not correct");
        }
        else if (!password.equals("12345")) {  //NOT EQUAL COMMAND
            System.out.println("password is incorrect");
        }

    }
}
