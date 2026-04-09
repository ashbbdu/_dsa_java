package Arrays.Questions;

public class BestTimeToBuyAndSellStocks {

    public static int maxProfit(int[] nums) {
        int diff = 0;
//        for (int i = 0 ; i < nums.length - 1  ; i++) {
//            int val = nums[i];
//            for (int j = i + 1 ; j < nums.length ; j++) {
//                if(nums[j] > val) {
//                    diff = Math.max(diff , nums[j] - val);
//                }
//            }
//
//        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(minPrice > nums[i]) {
                minPrice = nums[i];
            } else {
                maxProfit = Math.max(maxProfit , nums[i] - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
