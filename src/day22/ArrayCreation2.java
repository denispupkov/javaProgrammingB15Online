package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {

        int[] ages;

        ages = new int[]{3, 5, 11, 33, 57, 18};

        int itemCount = ages.length;

        System.out.println("itemCount = " + itemCount);

        System.out.println("ages = " + ages); //wrong way to print everything in array

        for (int i = 0; i < itemCount; i++) {

            System.out.println(ages[i]);

        }

        int[] areaCode = {703, 300, 665}; //iT MUST BE DECLARED IN ONE LINE with Int[]

        for (int i = 0; i < areaCode.length; i++) {

            System.out.print(areaCode[i] + " ");
        }
    }
}
