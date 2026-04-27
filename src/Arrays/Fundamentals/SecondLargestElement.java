package Arrays.Fundamentals;

import java.util.Arrays;

public class SecondLargestElement {
    public static int secondLargestElement(int [] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] > largest) {
                largest = nums[i];
            }
        }

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] > secondLargest && largest > nums[i]) {
                secondLargest = nums[i];
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static int secondLargestElementOptimal(int [] nums) {

        if(nums.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }



    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(secondLargestElement(arr));
    }
}
