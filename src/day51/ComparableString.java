package day51;

public class ComparableString {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "xyz";

        System.out.println(s1.compareTo(s2));
        //it could give you any MINUS number< any PLUS NUMBER or ZERO
        System.out.println(s2.compareTo(s1));

        System.out.println(s1.compareTo(s1));
    }
}
