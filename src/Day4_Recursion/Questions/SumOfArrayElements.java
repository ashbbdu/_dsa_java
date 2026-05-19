package Day4_Recursion.Questions;

public class SumOfArrayElements {
    public static int arraySum(int[] nums) {
      return sum(nums , 0);
    }

    public static int sum (int [] nums , int left) {
        if(left >= nums.length) return 0;

        return nums[left] + sum(nums , left + 1);
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        System.out.println(arraySum(nums));

    }
}
