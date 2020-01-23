package day44;

public class SlackUser {

    protected String name;
    protected String status;


    public void sendMessage() {
        System.out.println("send message" + name + " Typing");

    }

    public void callSomeone() {
        System.out.println(name + " Calling");
    }

    public void addEmoji() {

        System.out.println(name + " adding emoji");

    }

}
