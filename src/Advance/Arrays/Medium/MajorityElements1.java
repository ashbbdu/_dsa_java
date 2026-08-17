package Advance.Arrays.Medium;

import java.util.Arrays;

public class MajorityElements1 {
    public static void main(String[] args) {
        int [] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int [] hashMap = new int[nums.length + 1]; // just confirm , length + 1 ki array bnate hai ya fr largestElement + 1 ki and why

        for(int i = 0 ; i < nums.length ; i++) {
            hashMap[nums[i]]++;
        }

        System.out.println(Arrays.toString(hashMap));

        for(int i = 0 ; i < hashMap.length ; i++) {
            System.out.println(i + " " + hashMap[i]);
        }
//        System.out.println(nums[]);
//        System.out.println(hashMap[7]);
    }
}
