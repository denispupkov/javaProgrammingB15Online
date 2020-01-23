package day43;

public class Starbucks {

    public static void main(String[] args) {

        Coffee c1 = new Coffee();
        System.out.println("c1 = " + c1);

        Coffee c2 = new Coffee("Intensito", 9);
        System.out.println("c2 = " + c2);

        Coffee c3 = new Coffee("Blonde", 3, 3.4);
        System.out.println("c3 = " + c3);
        Coffee c4 = new Coffee("Latte", 5, -5);
        System.out.println("c4 = " + c4);
//        List<String> lst = new ArrayList<>();
//
//        lst.add("abc");
//        lst.add(null);
//        lst.add(null);


    }

}

