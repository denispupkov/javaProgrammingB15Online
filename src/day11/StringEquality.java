package day11;

public class StringEquality {

    public static void main(String[] args) {

        //String name ="Arabia";

        char c1 = 'b';
        char c2 = 'B';
        char c3 = 'b';
        // all primitive types can be compared using ==
        //


        System.out.println("ois c1 equal to c2?");
        System.out.println(c1==c2);

        System.out.println("ois c1 equal to c3?");
        System.out.println(c1==c3);

        System.out.println("ois c2 equal to c3?");
        System.out.println(c2==c3);

        String name = "Rabia"; // String literal type of creation

        String name2 = new String("Rabia");

        String name3 = "Rabia";

        System.out.println(name);
        System.out.println(name2);

        System.out.println(name==name2); //false
        System.out.println(name==name3); //true

        //THE CORRECT WAY OF COMPARING THE STRING TO GET THE CONSISTENT RESULT IS EQUAL METHOD:
        //str1.equals(str2);

        System.out.println("_"+name.equals(name2)); //true
        System.out.println("_"+name.equals(name3)); //true




    }
}
