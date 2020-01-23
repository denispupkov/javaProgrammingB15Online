package day45;

public class Book extends Object {

    public static void main(String[] args) {

        Book b1 = new Book();

        System.out.println("b1.toString() = " + b1.toString());


    }

    @Override //this is called annotation,
    //it is make it abvious to declare we are rewriting the inherited super class method
    public String toString() {
        return "my own version of toString";
    }

}
