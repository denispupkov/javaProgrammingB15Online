package day11;

import java.util.Scanner;

public class WarmUpIfElse {    // could not work with ==String

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String Bedroom = "Bd";
        String Living_Room ="Lr";
        String Kitchen = "Ki";
        String Hallway = "Ha";
        String TargetOption ="";

        System.out.println("where do you wanna turn on the light?");
        TargetOption=scan.next();

        if (TargetOption =="Bd") {

            TargetOption = Bedroom;
            System.out.println("You have selected Bd ");
        }

            else if (TargetOption=="Lr"){
                TargetOption=Living_Room;
                System.out.println("You have selected Lr ");
            }
             else if (TargetOption=="Ki") {
            TargetOption=Kitchen;
            System.out.println("You have selected Ki ");
        }
           else if (TargetOption=="Ha"){
            TargetOption=Hallway;
            System.out.println("You have selected Ha ");
        }


            else {
                System.out.println("There is no such light");
                TargetOption="Unknown";




        }

        System.out.println("you turn on the light in "+TargetOption);






    }

}