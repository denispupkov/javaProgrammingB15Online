package day15;

import java.util.Scanner;

public class HomeworkRepl3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name="";
        System.out.println("Enter the name started with Dr, Mr, Miss or Mrs");
        name=scan.nextLine();

        if (name.startsWith("Dr.")) {

            System.out.println("If the name Started with (Dr) -->> Doctor");
        }
            else if (name.startsWith("Mr.")) {

                System.out.println("If the name Started with (Mr) -->> Male");
            }

        else if (name.startsWith("Ms.")) {

            System.out.println("If the name Started with (Ms) -->> Single Female");
        }
        else if (name.startsWith("Mrs")) {

            System.out.println("If the name Started with (Mrs) -->> Married female");
        }

    }



    }

