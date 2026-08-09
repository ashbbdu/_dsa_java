package Basics.Hashing;

import java.math.BigInteger;
import java.util.Scanner;

public class HashingConcepts {
    public static void main(String[] args) {
        int [] arr = {6,5,6,4,4,5,6};

//        Scanner sc = new Scanner(System.in);

        int [] hashArr = new int[7];

        for(int i = 0 ; i < arr.length  ; i++) {
            hashArr[arr[i]]++;
        }

        System.out.println(hashArr[6]);
        System.out.println(hashArr[1]);

        System.out.println((int)'a');

        char[] charArr = {'a', 'b', 'a', 'c', 'c', 'b', 'a'};

        int[] hashCharArr = new int[26];

        for (int i = 0; i < charArr.length; i++) {
            hashArr[charArr[i] - 'a']++;
        }

        System.out.println(hashCharArr['a' - 'a']); // 3
        System.out.println(hashCharArr['b' - 'a']); // 2



    }
}
