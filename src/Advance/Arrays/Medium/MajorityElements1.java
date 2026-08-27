package Advance.Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MajorityElements1 {

    public static int findMissingNumberBrute (int [] nums) {
        int n = nums.length;

        for(int i = 0 ; i <= nums.length ; i++) {
            int flag = 1;
            for(int j = 0 ; j < nums.length ; j++) {
                if(nums[j] == i) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1) return i;
        }
        return -1;
    }

    public static int findMissingNumberBetter (int [] nums) {
        int n = nums.length;
        int ans = -1;

        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < n ; i++) {
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
//
//        System.out.println(hm);
        for(int i = 0 ; i <= n ; i++) { // why  <= n  , need dry run
            if(!hm.containsKey(i)) {
//                System.out.println(i);
                ans = i;
                break;
            }
        }

        return ans;
    }

    public static int sumOfElements (int [] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static int findMissingNumberOptimal1 (int [] nums) {
        int n = nums.length;

        int cal = (n * (n + 1)) / 2;

        int sum = cal - sumOfElements(nums);
        return sum;

    }

    public static int findMissingNumberOptimal2 (int [] nums) {
        int n = nums.length;

        int xor1 = 0;
        int xor2 = 0;

        for(int i = 0 ; i < n ; i++) {
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ (i+1);
        }

        return xor1 ^ xor2;

    }

    public static void main(String[] args) {
        int [] nums = {0, 2, 3, 1, 4};
//        int [] hashMap = new int[nums.length + 1]; // just confirm , length + 1 ki array bnate hai ya fr largestElement + 1 ki and why
//
//        for(int i = 0 ; i < nums.length ; i++) {
//            hashMap[nums[i]]++;
//        }
//
//        System.out.println(Arrays.toString(hashMap));
//
//        for(int i = 0 ; i < hashMap.length ; i++) {
//            System.out.println(i + " " + hashMap[i]);
//        }
//
//        for(int i = 0 ; i < hashMap.length ; i++) {
//            if(hashMap[i] == 0) {
//                System.out.println(i);
//                break;
//            }
//        }



//        System.out.println(nums[]);
//        System.out.println(hashMap[7]);
//
//        System.out.println(findMissingNumberBrute(nums) +  " nums");
        System.out.println( findMissingNumberBetter(nums));
        System.out.println( findMissingNumberOptimal1(nums));
        System.out.println( findMissingNumberOptimal2(nums));
    }
}
