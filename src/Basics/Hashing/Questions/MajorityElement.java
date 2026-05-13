package Basics.Hashing.Questions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] arr) {
        Map<Integer , Integer> hm = new HashMap<>();
        for(int val : arr) {
            hm.put(val ,  hm.getOrDefault(val , 0) + 1);
        }
        System.out.println(hm);
        int ans = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {

            if (ans < entry.getValue()) {
                ans = entry.getValue();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }
}
