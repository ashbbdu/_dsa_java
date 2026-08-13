package Advance.Arrays;

import java.util.Arrays;

public class MoveZeroToEnd {
//    public static void moveZeroesBrute(int[] nums) {
//        int cnt = 0;
//        for(int i  =0 ; i < nums.length ;i++) {
//            if(nums[i] != 0) {
//                nums[cnt++] = nums[i];
//            }
//        }
//
//        for(int i = cnt ; i < nums.length  ; i++ ) {
//            nums[i] = 0;
//        }
////        System.out.println(zeroCount);
////        int [] arr = new int[zeroCount];
////        for(int i  =0 ; i < nums.length ;i++) {
////            if(nums[i] == 0) {
////                zeroCount++;
////            }
////        }
//        System.out.println(Arrays.toString(nums));
//
//    }


    public static void moveZeroesOptimal(int[] nums) {
//        using two pointer , if the loop over the array keep j counter outside the loop . if(arr[i] != 0) swap with ne

//        this will move zero in front
//        int j = 0 ;
//        int temp;
//        for(int i = 0 ; i < nums.length ; i++) {
//            if(nums[i] == 0) {
//                temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//
//                j++;
//            }
//
//        }

//        this will move zero at back

        int j = 0 ;
        int temp;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }

        }

        System.out.println(Arrays.toString(nums) + " ans");

    }


    public static void main(String[] args) {
        int [] nums = {0, 1, 4, 0, 5, 2};
//        moveZeroesBrute(nums);
        moveZeroesOptimal(nums);
    }
}
