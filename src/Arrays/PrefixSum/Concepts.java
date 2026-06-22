package Arrays.PrefixSum;

import java.util.Arrays;

public class Concepts {

    public static int sum (int left , int right , int[] prefix) {
        if(left == 0) {
            return prefix[right];
        }

        return prefix[right] - prefix[left - 1];
    }
    public static int [] generatePrefixArray (int [] arr) {
        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1 ; i < arr.length ; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        return prefix;
    }

    public static void main(String[] args) {
        int [] arr = {2,4,1,6,3};
        System.out.println(Arrays.toString(generatePrefixArray(arr)));
        System.out.println(sum(1,4 , generatePrefixArray(arr)));;

    }
}
