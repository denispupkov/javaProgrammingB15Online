package day52;

public class PolymorphicBook {

    public static void main(String[] args) {

        Book b1 = new PaperBook("Game Of Thrones", "Akbar", 1);
        b1.displayBookInfo();
        Book b2 = new AudioBook("Agile", "Me", 2);
        Book b3 = new PaperBook("Karlson", "Sam", 2);
        Book b4 = new AudioBook("Throe", "Zeus", 1.5);

        KnowledgeBank kb = b1;
        kb.takeNote();
        kb.showTableOfContent();

        Book b5 = new AudioBook("Agile", "Guljannat", 2.4);
        b5.showTableOfContent();
        b5.displayBookInfo();
        System.out.println("b5 = " + b5);
    }
}
