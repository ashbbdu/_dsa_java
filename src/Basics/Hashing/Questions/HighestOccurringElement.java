package Basics.Hashing.Questions;

import java.util.HashMap;

public class HighestOccurringElement {
    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1,1,1,1,1,2,3,3,3,2,3,3,3};

        int [] hashMap = new int[4];

        for(int i = 0 ; i < nums.length ; i++) {
            hashMap[nums[i]]++;
        }

        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++) {
           hm.put(nums[i] , hm.getOrDefault(nums[i] , 0)+1);
        }

        System.out.println(hm);

        for(int i = 0 ; i < hashMap.length ; i++) {
            System.out.println(i + " " + hashMap[i]);
        }

//        int [] visited = new int[4];
//
//        for (int i  = 0 ; i < visited.length  ; i++) {
//           for(int j = i ; j < visited.length - 1 ; j++) {
//               if(nums[i] == nums[j]) {
//                    visited[i] = 1;
//               }
//            }
//        }
//
//    for (int i  = 0 ; i < visited.length ; i++) {
//        System.out.println(visited[i]);
//    }

//        int maxFrequency = 0;
//        int el = -1;
//        int cnt = 0;
//        for(int i = 0 ; i < nums.length  ; i++) {
//
//            for(int j = i ; j < nums.length; j++ ) {
//                if(nums[i] == nums[j]) {
//                    cnt = cnt + 1;
//                }
//
//                if(cnt > maxFrequency) {
//                    maxFrequency = cnt;
//
//                    el = nums[i];
//                }
//
//            }
//
//
//        }
//
//        System.out.println(cnt);
//        System.out.println(maxFrequency);
//        System.out.println(el);
    }
}
