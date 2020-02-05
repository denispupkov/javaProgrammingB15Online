package day52;

public abstract class Book implements KnowledgeBank {

    String name;
    String author;

    public abstract void displayBookInfo();

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
