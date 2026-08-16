package Advance.Arrays;

import java.util.Arrays;

public class FindMissingNumber {

    public static int findMissingNumber (int [] nums) {
        int [] hashArr = new int[nums.length + 1];

        for(int i = 0 ;  i < nums.length ; i++) {
            hashArr[nums[i]]++;
        }

        System.out.println(Arrays.toString(hashArr));

        for(int i = 0 ; i < hashArr.length ; i++) {
            if(hashArr[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {0, 1, 2, 4, 5, 6};
        System.out.println(findMissingNumber(nums));
    }
}
