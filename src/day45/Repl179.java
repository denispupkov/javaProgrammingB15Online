package day45;

class Main {
    public static void main(String[] args) {
        //test your code
        System.out.println(uniqueChars("mama"));
    }


    public static String uniqueChars(String str) {
        //TODO: write your below
        String unique = "";


        for (int i = 0; i <= str.length() - 1; i++) {
            int cnt = 0;
            for (int j = i; j <= str.length() - 1; j++) {

                if (unique.contains(str.substring(i, i + 1))) {
                    continue;
                } else {
                    unique += str.charAt(i);
                }
            }


//                if (str.substring(i, i + 1).equals(str.substring(j, j + 1)) && i != j) {
//                cnt++;
//                }
//
//                }
//            if (cnt<1 && i!=str.length()) {
//                unique += str.charAt(i);}
//                else {
//
//                }
//           }

        }
        return unique;
    }
}




