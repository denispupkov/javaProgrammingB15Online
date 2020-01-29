package day49;

public interface Chargeble {

    public default void charge() {

        System.out.println("DEFAULT charge ");
    }
}
