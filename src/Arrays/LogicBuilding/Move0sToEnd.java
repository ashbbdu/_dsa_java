package Arrays.LogicBuilding;

import java.util.Arrays;

public class Move0sToEnd {
    public static void moveZeroesBrute(int[] nums) {
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

    public static void moveZeroesOptimal(int[] nums) {

        int i = 0;
        int  temp;
        for (int j = 1 ; j < nums.length  ; j++) {

            if(nums[j] != 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                i++;
            }
        }

    }
    public static void main(String[] args) {
        int [] nums = {4, 0, 5, 0, 0, 3, 0, 1, 0, 2, 7};
//        moveZeroesBrute(nums);
        moveZeroesOptimal(nums);
        System.out.println(Arrays.toString(nums));
    }
}
