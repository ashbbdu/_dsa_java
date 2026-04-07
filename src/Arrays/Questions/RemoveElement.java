package Arrays.Questions;

import java.util.Arrays;

public class RemoveElement {
// Brute
//    public static int removeElement(int[] nums, int val) {
//        int start = 0;
//        int end = nums.length - 1;
//        int temp;
//        while(start < end) {
//            if(nums[start] == val) {
//                temp = nums[start];
//                nums[start] = nums[end];
//                nums[end] = temp;
//                end--;
//            }
//          else {
//                start++;
//            }
//        }
//
//        System.out.println(Arrays.toString(nums));
//        int count = 0;
//        for(int i = 0 ; i < nums.length ; i++) {
//            if(nums[i] != val) {
//                count++;
//            }
//        }
//        return count;
//    }

//    Optimal
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length ; i++) {
            if(nums[i] == val) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int [] arr = {3,2,2,3};
        int ans = removeElement(arr , 3);
        System.out.println(ans);
    }
}
