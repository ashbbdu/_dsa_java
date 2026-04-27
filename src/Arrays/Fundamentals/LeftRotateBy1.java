package Arrays.Fundamentals;

import java.util.Arrays;

public class LeftRotateBy1 {
    public static void rotateArrayByOneBrute(int[] nums) {
        int firstEle = nums[0];
        for(int i = 0 ; i < nums.length - 1 ; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = firstEle;
    }
    public static void main(String[] args) {
        int [] nums = {7, 6, 5, 4};
        rotateArrayByOneBrute(nums);
        System.out.println(Arrays.toString(nums));
    }
}
