package day52;

public interface KnowledgeBank {


    public abstract void takeNote();

    public default void showTableOfContent() {
        System.out.println("chapter 1 till chapter 10");

    }
}
