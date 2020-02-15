package day59;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] nums = {1, 4, 6};
        try {
            System.out.println("nums[0] = " + nums[0]);
        } catch (Exception e) {
            System.out.println("Exception Cought " + e.getMessage());
        } finally {
            System.out.println("this code will always run no matter we have exception or not");
        }
        System.out.println("The end");

    }
}
