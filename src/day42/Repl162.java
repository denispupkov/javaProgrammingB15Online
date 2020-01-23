package day42;


class Main {

    public static void main(String[] args) {


    }

    public void count_appearance() {

        String word = "foo";
        String[] words = {"a", "foo", "bar", "foo", "bla"};

        int cnt = 0;
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(word)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    } //end  count_appearance

}


