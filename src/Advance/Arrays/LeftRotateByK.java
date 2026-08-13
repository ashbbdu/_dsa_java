package Advance.Arrays;

import java.util.Arrays;

public class LeftRotateByK {
    public static void main(String[] args) {
//        System.out.println(2%6);
//        System.out.println(8%6);


        int [] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;
        k = k % nums.length;
        int [] temp = new int[k];


        for (int i = 0 ; i < k ; i++) {
            temp[i] = nums[i];
        }

        for(int i = 0 ; i < nums.length - k ; i++) {
            nums[i] = nums[i+k];
        }

        for(int i  = 0 ; i < k ; i++) {
            nums[nums.length - k + i] = temp[i];
        }


        System.out.println(Arrays.toString(nums));
    }
}
