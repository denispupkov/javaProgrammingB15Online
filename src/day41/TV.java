package day41;

public class TV {

    String name;
    boolean isOn;
    int currentChannel;


    public void turnOn() {

        System.out.println("Turning ON TV");
        if (isOn == false) {

            isOn = true;
        }
    }

    public void turnOff() {
        //if(isoN)
        if (isOn == true) {
            System.out.println("Turning OFF TV");
            isOn = false;
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    //we cannot set the channel if TV is OFF
    public void setCurrentChannel(int newChannel) {

        if (newChannel < 0 || newChannel > 50) {
            System.out.println("INVALID CHANNEL");
            return; //exit from the method
        }
        if (isOn == true) {
            currentChannel = newChannel;
        } else {
            System.out.println("TURN ON THE TV FIRST");
        }
    }

    public void moveForward() {
        if (isOn == true) {
            currentChannel += 1;
        } else {
            System.out.println("TURN ON YOUR TV FIRST");
        }
    }

    public void moveBackward() {
        if (isOn == true) {
            currentChannel -= 1;
        }
        System.out.println("TURN ON YOUR TV FIRST");
    }

    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
