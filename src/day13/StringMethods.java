package day13;

public class StringMethods {

    public static void main(String[] args) {

        //equals
        //equalsIgnoreCase

        String s1 ="hello";
        String firstName="Denis";
        String lastName="Pupkov";
        System.out.println(s1.equals("abc"));
        System.out.println(s1.equalsIgnoreCase("HELLO"));
        System.out.println(s1.toUpperCase()); // to Upper case method of String to make all character upper case
        System.out.println(s1.toLowerCase());  // to Lower case method of String to make all character upper case

        System.out.println("My name is "+firstName.toUpperCase()+" "+lastName.toUpperCase()+" in Upper Case");
        System.out.println("My name is "+firstName.toLowerCase()+" "+lastName.toLowerCase()+" in Lower Case");

        System.out.println(firstName.length()+lastName.length()+" characters in my first and last name");

        int lengOfStr= s1.length()+firstName.length()+lastName.length();  //store number of characters in int



        System.out.println(lengOfStr);
        if (lengOfStr>4) {
            System.out.println("More than 4 characters"); }
        else {
            System.out.println("Not more than 4");
        }
    }
}
