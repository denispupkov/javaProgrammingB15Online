package day33;

public class GetSpellNameReturnMethod {

    public static void main(String[] args) {


        getSpelledName("Denis"); //WILL NOT WORK!!!
        getSpelledName("Zeynep"); //WILL NOT WORK!!!

        String spelledName = getSpelledName("Denis");
        System.out.println("spelledName = " + spelledName); //WORKING
        System.out.println(getSpelledName("Zeynep")); //WORKING


        System.out.println(getSpelledName2("Masya"));


    }

    public static String getSpelledName(String name) {

        String result = "";

        for (int i = 0; i < name.length(); i++) {


            result = result + name.charAt(i);

            if (i != name.length() - 1) {

                result = result + "-";
            }
        }

        return result;
    }

    public static String getSpelledName2(String name) {
        String result = "";

        for (int i = 0; i < name.length() - 1; i++) {
            result += name.charAt(i) + "-"; //dash to make method to print right away

        }
        return result + name.charAt(name.length() - 1);
    }

}
