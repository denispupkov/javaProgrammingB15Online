package day40;

public class SpaceShip {

    String name;
    String currentDirection; //up, doun, right, left
    int xCordinate;
    int yCordinate;


    public void setInitialPosition(int newX, int newY) {

        xCordinate = newX;
        yCordinate = newY;
    }


    public void setDirection(String newtDir) {

        if (newtDir.equalsIgnoreCase("up") ||
                newtDir.equalsIgnoreCase("down") ||
                newtDir.equalsIgnoreCase("right") ||
                newtDir.equalsIgnoreCase("left")) {
            currentDirection = newtDir;
        } else {
            System.out.println("Invalid direction");
            currentDirection = "";//set direction to empty value if user pass wrong direction
        }
    }

    public void move1Block() { //cannot be NULL because I get an error exception
        switch (currentDirection) {
            case "right":
                xCordinate += 1;
                break;

            case "left":
                xCordinate -= 1;
                break;

            case "up":
                yCordinate += 1;
                break;

            case "down":
                yCordinate -= 1;
                break;

            default:
                break;
        }
    }
//add a functionality to moveBlock with direction provided in one shot
    //we are using the functionality we already have to move

    public void move1Block(String newDirection) {
        setDirection(newDirection);
        move1Block();
    }


    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", xCordinate=" + xCordinate +
                ", yCordinate=" + yCordinate +
                '}';
    }

}
