package day46;


class Main {
    public static int[] mergR(int[] a, int[] b) {
        int length = a.length + b.length;

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        b[0] = 4;
        b[1] = 5;
        b[2] = 6;

        int[] nums = new int[length];//{1,2,3};

        for (int i = 0; i < a.length; i++) {
            nums[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            nums[j] = b[j];
        }

        return nums;
    }//end mergR

    public static void main(String[] args) {

    }
}