package Arrays.LogicBuilding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num : nums) {
            st.add(num);
        }


        int [] numsArr = new int[st.size()];
        int cnt = 0;
        for(int val : st) {
            numsArr[cnt++] = val;
        }


        return numsArr.length;
    }

    public static void main(String[] args) {
        int [] nums = {-2, 2, 4, 4, 4, 4, 5, 5};
        System.out.println(removeDuplicates(nums));

    }
}
