package day45;

class Main {
    public static void main(String[] args) {
        //test your code
        System.out.println(uniqueChars("spoon"));
    }


    public static String uniqueChars(String str) {
        //TODO: write your below
        String unique = "";
        int cnt = 0;


        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = 0; j <= str.length() - 1; j++) {

                if (!str.substring(i, i + 1).equals(str.substring(j, j + 1)) && i != j) {

                }
                unique += str.charAt(j);
            }


        }
        return unique;
    }

}


