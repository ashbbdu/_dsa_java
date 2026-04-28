package Arrays.LogicBuilding;

import java.util.Arrays;

public class Move0sToEnd {
    public static void moveZeroes(int[] nums) {
//        count zeros
        int zeroCount = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == 0) {
                zeroCount = zeroCount + 1;
            }
        }

        int num = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != 0) {
                nums[num++] = nums[i];
            }
        }

        for(int i = nums.length - zeroCount ; i < nums.length ; i++) {
            nums[i] = 0;
        }

    }
    public static void main(String[] args) {
        int [] nums = {5};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
