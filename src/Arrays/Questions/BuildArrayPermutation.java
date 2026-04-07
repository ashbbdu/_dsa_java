package Arrays.Questions;

import java.util.Arrays;

// LC : 1920
public class BuildArrayPermutation {
//    public static int[] buildArray(int[] nums) {
//        int [] arr =  new int[nums.length];
//        for(int i = 0 ; i < nums.length ; i++) {
//            arr[i] =  nums[nums[i]];
//        }
//        return arr;
//    }


//    optimal
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        for(int i = 0 ; i < n ; i++) {
            nums[i] = nums[i] / n;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,2,3};
        int [] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
