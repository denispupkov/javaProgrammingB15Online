package day53;

public class Repl210 {

    public static void main(String[] args) {

        String word ="----qwe--r--tyf...gd.---";

        String newWord="";

                for (int i=word.length()-1; i>=0; i--) {
                    if (word.charAt(i) > 64 && word.charAt(i) < 123) {
                        newWord += word.charAt(i) + "";
                    }
                }

        StringBuffer str = new StringBuffer(newWord);
        for (int j=0; j<word.length(); j++) {
            if (word.charAt(j)<65 || ((word.charAt(j)>90) &&
                    (word.charAt(j)<97)) || word.charAt(j)>122) {
                str.insert(j, word.charAt(j));
                newWord=str.toString();
                        }
                    }

        System.out.println(newWord.length());
       System.out.println("newWord = " + newWord);
            }
        }



