package Basics.Hashing.Questions;

import java.util.HashMap;
import java.util.Map;

public class FreqCount {
    public static Map<Character , Integer> charFrequency (String st) {
        Map<Character , Integer> hm = new HashMap<>();

        for(char val : st.toCharArray()) {
            hm.put(val , hm.getOrDefault(val , 0) + 1);
        }
        return hm;
    }
    public static void main(String[] args) {
        System.out.println(charFrequency("aabbcca"));
    }
}
