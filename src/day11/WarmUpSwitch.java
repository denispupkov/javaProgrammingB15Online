package day11;

import java.util.Scanner;

public class WarmUpSwitch {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String Bedroom = "Bd";
        String Living_Room ="Lr";
        String Kitchen = "Ki";
        String Hallway = "Ha";
        String TargetOption ="Ki";

        System.out.println("where do you wanna turn on the light?");
        TargetOption=scan.next();

        switch (TargetOption) {

            case "Bd":
                System.out.println("You have selected Bd ");
                TargetOption = "Bedroom";
                break;
            case "Lr":
                System.out.println("You have selected Lr ");
                TargetOption = "Living_Room";
                break;
            case "Ki":
                System.out.println("You have selected Ki ");
                TargetOption = "Kitchen";
                break;
            case "Ha":
                System.out.println("You have selected Ha ");
                TargetOption = "Hallway";
                break;

            default:
                System.out.println("There is no such light");
                TargetOption="Unknown";
                break;



        }

        System.out.println("you turn on the light in "+TargetOption);






    }

}