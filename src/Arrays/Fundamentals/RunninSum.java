package Arrays.Fundamentals;


import java.util.Arrays;

public class RunninSum {
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int [] arr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++) {

            arr[i] = sum + nums[i];
            sum = sum + nums[i];

        }

        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] arr = {1,2,3,4};
        runningSum(arr);
    }
}



