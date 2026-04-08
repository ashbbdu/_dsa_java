package Arrays.Questions;


import java.util.Arrays;

// LC 167 => https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSum2 {

//    So this solution is correct but getting TLE , so have to find out a better solution
//    public static int[] twoSum(int[] numbers, int target) {
//        int [] arr = {-1 ,-1};
//        for(int i = 0; i < numbers.length - 1 ; i++) {
//            for (int j = i + 1; j < numbers.length ; j++) {
//                if(numbers[i] + numbers[j] == target) {
//                    arr[0] = i+1;
//                    arr[1] = j+1;
//                }
//            }
//
//        }
//        return arr;
//    }

    public static int[] twoSum(int[] numbers, int target) {
        int [] arr = {-1 ,-1};
        int start = 0;
        int end = numbers.length - 1;
        while(start < end) {
            if(numbers[start] + numbers[end] == target) {
                arr[0] = start+1;
                arr[1] = end+1;
//                start++;
//                end--;
                break;
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {-10,-8,-2,1,2,5,6};
        int target = 0;
        int [] ans = twoSum(arr , target);
        System.out.println(Arrays.toString(ans));
    }
}
