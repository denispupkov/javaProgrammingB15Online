package day44;

public class CyberHouse {

    int houseNum;
    String design;
    private static String neighbouhoodName = "Cybertek Ave";


    public CyberHouse(int houseNum, String design) {
        this.houseNum = houseNum;
        this.design = design;
    }


    public void showAllInfo() {
        System.out.println("houseNum = " + this.houseNum +
                " design = " + this.design +
                "neighbouhood name = " + neighbouhoodName);

    }

    public static void showNeighborhoodName() {
        System.out.println(neighbouhoodName);
    }

    public String toString() {
        return "CyberHouse{" +
                "houseNum=" + houseNum +
                ", design='" + design + '\'' +
                '}';
    }

}

