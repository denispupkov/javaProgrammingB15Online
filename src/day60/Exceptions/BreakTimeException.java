package day60.Exceptions;

public class BreakTimeException extends RuntimeException {//UNCHECKED


}

class MyOwnCheckedException extends Exception { //CHECKED

}

class Main {


    public static void main(String[] args) {


        // throw new BreakTimeException();

        try {
            throw new MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            System.out.println("My own Thing Cought!!!");
        }
    }

}