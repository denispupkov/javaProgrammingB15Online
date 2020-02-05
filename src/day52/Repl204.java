package day52;

public class Repl204 {

    public static void main(String[] args) {


        System.out.println(isAnagram("listen", "Silent"));
        System.out.println(isAnagram("earth", "heart"));
        System.out.println(isAnagram("star", "rats"));
        System.out.println(isAnagram("hi", "bye"));
        System.out.println(isAnagram("java", "cava"));


    }

    public static boolean isAnagram(String word1, String word2) {
        int cnt = 0;

        boolean trueOrFalse = false;
        for (int i = 0; i < word1.length(); i++) {

            if (word1.contains(word2.charAt(i) + "") && word1.length() == word2.length()) {
                cnt++;

            }
        }


        if (word2.length() == cnt && word1.length() == cnt) {
            trueOrFalse = true;
        } else {
            trueOrFalse = false;
        }
        return trueOrFalse;
    }
}

