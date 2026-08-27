package Advance.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class UnionOfTwoArrays {

    public static int [] unionBrute (int [] nums1 , int [] nums2) {
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i = 0 ; i < nums1.length; i++) {
            ts.add(nums1[i]);
        }

        for(int i = 0 ; i < nums2.length; i++) {
            ts.add(nums2[i]);
        }

        int [] ans = new int[ts.size()];

        int cnt = 0;
        for(var t : ts) {
           ans[cnt++] = t;
        }

        return ans;

    }

    public static int [] unionOptimal (int [] nums1 , int [] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        List<Integer> unionArray = new ArrayList<>();

        while (i < n1 && j < n2) {
            if(nums1[i] <= nums2[j]) {
                if(unionArray.isEmpty() || unionArray.getLast() != nums1[i]) {
                    unionArray.add(nums1[i]);
                }
                i++;
            }
            else {
                if(unionArray.isEmpty() || unionArray.getLast() != nums2[j]) {
                    unionArray.add(nums2[j]);
                }
                j++;
            }


        }

        while (i < n1) {
            if (unionArray.isEmpty() || unionArray.getLast() != nums1[i]) {
                unionArray.add(nums1[i]);
            }
            i++;
        }

        // Add remaining elements of nums2, if any
        while (j < n2) {
            if (unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != nums2[j]) {
                unionArray.add(nums2[j]);
            }
            j++;
        }

        int[] Union = new int[unionArray.size()];
        for (int k = 0; k < unionArray.size(); k++) {
            Union[k] = unionArray.get(k);
        }

        return Union;
    }

    public static void main(String[] args) {
        int [] nums1 = {3, 4, 6, 7, 9, 9};
        int [] nums2 = {1, 5, 7, 8, 8};

        System.out.println(Arrays.toString(unionBrute(nums1 , nums2)));

        System.out.println(Arrays.toString(unionOptimal(nums1 , nums2)));
    }
}
