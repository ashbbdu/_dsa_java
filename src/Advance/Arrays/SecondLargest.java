package Advance.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargest {
    public static void secondLargestElementBrute (int [] nums) {
        Arrays.sort(nums);
        int secondLargest = -1;

        for(int i = nums.length - 1 ; i > 0 ; i--) {
            if(nums[i] != nums[i-1]) {
                secondLargest = nums[i-1];
                break;
            }
        }

        System.out.println(secondLargest);
    }
    public static void main(String[] args) {
        int [] arr = {7, 7, 2, 2, 10, 10, 10};

        secondLargestElementBrute(arr);
    }
}
