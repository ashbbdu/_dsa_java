package Day4_Recursion.Questions;

import java.util.Arrays;

public class ReverseAnArray {

    public static int[] swap(int[] nums , int start , int end) {
        int temp;
        if(start > end)  return nums;


        temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        return swap(nums , start + 1, end - 1);
    }

    public static int[] reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        return swap(nums , start , end);
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(nums)));
    }
}
