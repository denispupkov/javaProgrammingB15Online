package day52;

public class AudioBook extends Book {

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }


    public void listen() {
        System.out.println("Listening the audio Book");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void displayBookInfo() {
        System.out.println("The name of audioBook is " + name + " and " + "the author is " + author +
                ", the duration is " + duration + " min.");
    }

    @Override
    public void takeNote() {
        System.out.println("Taking notes on the digital book by " +
                "writing the provided digital table");
    }

    @Override
    public void showTableOfContent() {
        System.out.println("if you wanna see table of content of " + name + " press the button");
    }


}
