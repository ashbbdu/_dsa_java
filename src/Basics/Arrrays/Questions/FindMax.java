package Basics.Arrrays.Questions;

public class FindMax {
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {3, 7, 1, 9, 4, 6};
        System.out.println(findMax(nums));
    }
}
