package Basics.Arrrays.Questions;

public class SumAndAverage {
    public static void sumAndAverage(int[] arr) {
        int sum = 0;
        double average = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        average = (double) sum / arr.length;
        System.out.println("Sum = " + sum + " " + "Average = " +  average);
    }
    public static void main(String[] args) {
        int [] nums = {10, 20, 30, 40, 50};
        sumAndAverage(nums);
    }
}
