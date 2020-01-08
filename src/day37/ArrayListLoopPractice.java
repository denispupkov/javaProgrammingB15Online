package day37;

import java.util.ArrayList;

public class ArrayListLoopPractice {

    public static void main(String[] args) {

        ArrayList<String> nameList =new ArrayList<String>();
        nameList.add("Qalbinur");
        nameList.add("Ruzi");
        nameList.add("Sabahiddin");
        nameList.add("Guzelnur");
        nameList.add("Muyesser");
        nameList.add("Mustafa");

        String longestName = "";


        for (int i = 0; i <nameList.size() ; i++) {
            String currentName = nameList.get(i);
            if (currentName.length() > longestName.length()) {
                longestName=currentName;
            }
        }

        System.out.println("longestName = " + longestName);

         // length (for inside the array) arr[arr.length-1]
        // length()  (for inside the String) str.charAt(str.length-1
        // size() (for inside ArrayList) lst.get(lst.size()-1

       // String currentName = nameList.get(i);

        for (int i = 0; i <nameList.size() ; i++) {

            if (nameList.get(i).length()==longestName.length()) {
                System.out.println("longest word = " + nameList.get(i));
            }

        }


    }
}
