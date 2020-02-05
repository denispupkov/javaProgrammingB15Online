package day52;

public class PaperBook extends Book implements Readable {

    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    public void read() {
        System.out.println("reading the book");


    }

    @Override
    public void displayBookInfo() {
        System.out.println("Paper book is " + author + " and weight " + weight + " pound");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


    @Override
    public void takeNote() {

    }

    @Override
    public void showTableOfContent() {

    }

    @Override
    public void Read() {

    }
}
