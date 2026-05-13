package Basics.Hashing.Questions;

import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr) {
        Map<Integer , Integer> hm = new HashMap<>();
        for(int val : arr) {
            hm.put(val , hm.getOrDefault(val , 0) + 1);
        }

        for(int val : hm.values()) {
            if(val != 1) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsDuplicateOptimal(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        for(int val : arr) {
            if(hs.contains(val)) return true;

            hs.add(val);
        }

        return false;
    }

    public static boolean containsDuplicateSpaceOptimized(int[] arr) {
        Arrays.sort(arr);  // O(n log n)

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) return true;  // SC for this O(1) , TC : O(n log n)
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4 , 1};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicateOptimal(nums));
    }
}
