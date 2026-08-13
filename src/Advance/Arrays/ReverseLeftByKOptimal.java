package Advance.Arrays;

import java.util.Arrays;

public class ReverseLeftByKOptimal {


    public static void reverseArray (int [] nums , int start , int end) {
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;
        k = k % nums.length;

        reverseArray(nums , 0 , k - 1);
        reverseArray(nums , k , nums.length - 1);

        reverseArray(nums , 0 , nums.length -1);



        System.out.println(Arrays.toString(nums));

    }
}
