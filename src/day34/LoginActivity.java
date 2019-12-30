package day34;

public class LoginActivity {

    public static void main(String[] args) {
        login1("user", "abc123");

    }

    public static void login1(String obj1, String obj2) {
        String userName = "user";
        String password = "abc123";

        if (obj1.equals(userName) && obj2.equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("NOT SUCCESSFUL");
        }

        System.out.println(login2("user", "bc123"));
    }

    public static boolean login2(String user, String password) {

        String userName = "user";
        String pass = "abc123";


        if (userName.equals("user") && password.equals("abc123")) {
            return true;
        } else {
            System.out.println(false);
        }
return false;
    }
}
