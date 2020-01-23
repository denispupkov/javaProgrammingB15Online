package day41;

public class Repl161 {

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        //int num = scan.nextInt();

        String word = "foo";
        String[] words = {"a", "foo", "bar", "foo", "foo"};
        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                cnt++;
            }


        }
        System.out.println(cnt);
    }
}


