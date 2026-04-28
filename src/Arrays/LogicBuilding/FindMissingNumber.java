package Arrays.LogicBuilding;

public class FindMissingNumber {
    public static int missingNumberBrute(int[] nums) {
        int n = nums.length;
        int ans = -1;
        for(int i = 0 ; i <= n ; i++) {
            for(int j = 0 ; j < nums.length ; j++) {
                if(nums[j] != i) {
                    ans = i;
                } else {
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {0, 1, 2, 4, 5, 6};
        System.out.println(missingNumberBrute(nums));
    }
}
