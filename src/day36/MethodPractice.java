package day36;

public class MethodPractice {

    public static void main(String[] args) {

    Boolean b = true; //autoboxed into boolean object
    Boolean result1=checkIfStringHasNumber("ewews13sdfsfd");
    Boolean result2=checkIfStringHasNumber("ABC");
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println(checkIfStringHasNumber("fgfg44"));
    }

    public static Boolean checkIfStringHasNumber (String str) {
        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);
        if (Character.isDigit(eachChar)) {
            return Boolean.valueOf(true);
        }

        }
        System.out.println("NO NUMBER FOUND!!!");
        return  Boolean.valueOf(false);
    }
}
