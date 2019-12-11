package day24;

public class HomeWork {

    public static void main(String[] args) {

    String[] bunchOfWords ={"Father","Mother","SisterSisterSister","Aunt","Siblings","GrandGrandGrandMother",
            "GrandGrandFather"};

    String max="";
        for (String count: bunchOfWords) {

            if (count.length()>max.length()) {
                max=count;
            }

        }
        System.out.println("Longest word is "+max);


    }
}
