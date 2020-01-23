package day43;

public class PetStaticPractice {

    public static void main(String[] args) {


        //String str = String.valueOf(10);

        Pet.showGeneralPetInfo();
//Pet.getName(); does not work

        Pet p1 = new Pet("cat", "yumyum");
        System.out.println("p1.getName() = " + p1.getName());
        p1.speak();

    }
}
