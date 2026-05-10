package Basics.Arrrays.Questions;

import java.util.Arrays;

public class ReverseAnArray {
    public static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int temp;
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }
}
