package day44;

public class SlackAdminUser extends SlackUser {

    int adminId;

    public SlackAdminUser(String name, String status, int adminId) {
        this.name = name;
        this.status = status;
        this.adminId = adminId;
    }


    public void sendAtChannelMessage() {

        System.out.println(name + " send message");
    }

    public void deleteMessage() {
        System.out.println(name + " delete message");
    }

    public void addChannel() {
        System.out.println(name + " add channel");

    }


    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


    public static void main(String[] args) {

        SlackAdminUser user1 = new SlackAdminUser("Denis", "student", 123);


        System.out.println("user1 = " + user1.name);
        // --- inherited methods we are calling
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();
        // --- our own methods we are calling
        user1.addChannel();
        user1.deleteMessage();
        user1.sendAtChannelMessage();
        System.out.println("user1 = " + user1);


    }

}
