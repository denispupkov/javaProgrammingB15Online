package day55;

public class Practice {

    public Practice() {
        this(100); // should be in first statement and can be called only ONES!
        //this("MOM");
        System.out.println("no arg constructor");

    }

    public Practice(int x) {
        //this("MOM");
        // super();
        System.out.println("1 arg constructor " + x);
    }

    public Practice(String str) {
        this(100);
        // super();
        System.out.println("1 arg constructor with String " + str);
    }


    public static void main(String[] args) {

        Practice t = new Practice();


    }


}
