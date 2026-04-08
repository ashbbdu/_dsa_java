package Arrays.Questions;

public class BestTimeToBuyAndSellStocks {

    public static int maxProfit(int[] nums) {
        int diff = 0;
        for (int i = 0 ; i < nums.length - 1  ; i++) {
            int val = nums[i];
            for (int j = i + 1 ; j < nums.length ; j++) {
                if(nums[j] > val) {
                    diff = Math.max(diff , nums[j] - val);
                }
            }

        }
        return diff;
    }

    public static void main(String[] args) {
        int [] arr = {3,8,1,5};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
