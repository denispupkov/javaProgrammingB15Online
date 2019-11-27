package day12;

public class LoginTest_V2 {

    public static void main(String[] args) {

        String userName ="Denis Pupkov";

        boolean userNameCorrect =userName.equals("DENIS PUPKOV");

        System.out.println(userNameCorrect);

       boolean userNameCorrect2=userName.equalsIgnoreCase("DeNiS PuPkOv"); //IGNORE CASE EXAMPLE
        // boolean userNameCorrect2=userName.equals("ABC123");

        System.out.println(userNameCorrect2);
//-------------------------------------------------------------------------


    String name ="Emre";

    boolean nameEqualsWithoutCase = name.equalsIgnoreCase("emre"); //1 option

        System.out.println("Does this name has same character without caring about the case ");

        System.out.println(nameEqualsWithoutCase);

        System.out.println(name.equalsIgnoreCase("EmRe")); //2 option




    }
}
