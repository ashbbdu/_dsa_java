package Advance.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class LeftRotateBy1 {
    public static void main(String[] args) {
        int [] nums = {-1, 0, 3, 6};

        int firstEle = nums[0];
        for(int i = 0 ; i < nums.length - 1  ; i++) {
                nums[i] = nums[i+1];
        }

        nums[nums.length - 1] = firstEle;
        System.out.println(Arrays.toString(nums));
    }
}
