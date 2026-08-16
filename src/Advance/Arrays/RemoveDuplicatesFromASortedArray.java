package Advance.Arrays;

public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int [] nums = {0, 0, 3, 3, 5, 6};

        int i = 0;
        for(int j = 1 ; j < nums.length  ; j++) {
            if(nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
        }

        System.out.println(i+1);
    }
}
