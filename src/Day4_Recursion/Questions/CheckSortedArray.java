package Day4_Recursion.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckSortedArray {

    public static boolean isSortedBrute(ArrayList<Integer> nums) {
        //your code goes here
        for (int i = 0 ; i < nums.size() - 1; i++) {
            if(nums.get(i) > nums.get(i+1)) {
                return false;
            }

        }
        return true;
    }

    public static boolean check (ArrayList<Integer> nums , int start , int end) {
        if (start > end) return false;

        return check(nums , start + 1 , start + 1);
    }

    public static boolean isSorted(ArrayList<Integer> nums) {
        int start = 0;
        int end = nums.size() - 1;
        return check(nums , start , start + 1);
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        System.out.println(isSortedBrute(l));
        System.out.println(isSorted(l));
    }
}
