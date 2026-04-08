package Arrays.Questions;

public class MaxSubArray {
//    Brute
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int val;
        for (int i = 0 ; i < nums.length - 1  ; i++) {
             val = nums[i];
            for (int j = i + 1 ; j < nums.length ; j++) {
               val = val + nums[j];
               max = Math.max(max  , val);
            }

        }

       return 1;
    }
    public static void main(String[] args) {
//        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int [] arr = {3,8,1,5};
        int ans = maxSubArray(arr);
        System.out.println(ans);
    }
}
