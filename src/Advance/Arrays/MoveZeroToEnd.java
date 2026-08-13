package Advance.Arrays;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void moveZeroesBrute(int[] nums) {
        int cnt = 0;
        for(int i  =0 ; i < nums.length ;i++) {
            if(nums[i] != 0) {
                nums[cnt++] = nums[i];
            }
        }

        for(int i = cnt ; i < nums.length  ; i++ ) {
            nums[i] = 0;
        }
//        System.out.println(zeroCount);
//        int [] arr = new int[zeroCount];
//        for(int i  =0 ; i < nums.length ;i++) {
//            if(nums[i] == 0) {
//                zeroCount++;
//            }
//        }
        System.out.println(Arrays.toString(nums));

    }
    public static void main(String[] args) {
        int [] nums = {0, 1, 4, 0, 5, 2};
        moveZeroesBrute(nums);
    }
}
