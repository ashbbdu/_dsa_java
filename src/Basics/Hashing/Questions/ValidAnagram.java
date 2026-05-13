package Basics.Hashing.Questions;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        Map<Character , Integer> hm = new HashMap<>();
        Map <Character , Integer> nm = new HashMap<>();
        for(char val : s.toCharArray()) {
            hm.put(val , hm.getOrDefault(val , 0) + 1);
        }


        for(char val : t.toCharArray()) {
            nm.put(val , nm.getOrDefault(val , 0) + 1);
        }
        return hm.equals(nm);
    }

    public static boolean isAnagramOptimize(String s, String t) {

        if(s.length() != t.length()) return false;
        Map<Character , Integer> hm = new HashMap<>();
        for(char val : s.toCharArray()) {
            hm.put(val , hm.getOrDefault(val , 0) + 1);
        }

        for(char val : t.toCharArray()) {
            hm.put(val , hm.getOrDefault(val , 0) - 1);
        }

        for(int h : hm.values()) {
            if(h != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagramOptimize("anagran" , "nagaraa"));
    }
}
