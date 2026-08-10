package Basics.Hashing;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class HashMapHashing {
    public static void main(String[] args) {
        int [] arr = {4, 4, 5, 5, 6};
//        int [] hashArr = new int[7];
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++) {
//            hm.put(arr[i] , hashArr[arr[i]] + 1); // will be 1 always becuse we are not updating hashArr to hold updated value
//            hashArr[arr[i]]++;
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(hm.get(6));
//        System.out.println(hashArr[6]);
        System.out.println(hm);

        System.out.println(Collections.max(hm.values()));

    }
}
