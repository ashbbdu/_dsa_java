import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Day03_Practice {

    // ═══════════════════════════════════════════════
    // PATTERN 1 — FREQUENCY COUNT (HashMap)
    // ═══════════════════════════════════════════════

    // Q1 — Char Frequency
    // Har character kitni baar aaya print karo
    // Input:  "aabbcca"
    // Output: a=3, b=2, c=2
    // Time: O(__)  Space: O(__)
    public static void charFrequency(String s) {

    }

    // Q2 — Valid Anagram
    // Do strings anagram hain ya nahi (same characters, same count)
    // Input:  s = "anagram", t = "nagaram"  → true
    // Input:  s = "rat",     t = "car"      → false
    // Hint: Dono ki frequency map banao, compare karo
    // Time: O(__)  Space: O(__)
    public static boolean isAnagram(String s, String t) {
        return false;
    }

    // Q3 — Majority Element
    // Wo element dhundo jo n/2 se zyada baar aaya ho (hamesha exist karta hai)
    // Input:  {3, 2, 3}       → 3
    // Input:  {2, 2, 1, 1, 2} → 2
    // Hint: Frequency map banao, phir check karo count > n/2
    // Time: O(__)  Space: O(__)
    public static int majorityElement(int[] arr) {
        return -1;
    }

    // Q4 — Most Frequent Element
    // Sabse zyada baar aane wala element return karo
    // Input:  {1, 2, 2, 3, 3, 3}  → 3
    // Input:  {5, 5, 4, 4, 4}     → 4
    // Time: O(__)  Space: O(__)
    public static int mostFrequent(int[] arr) {
        return -1;
    }

    // ═══════════════════════════════════════════════
    // PATTERN 2 — SEEN/VISITED (HashSet)
    // ═══════════════════════════════════════════════

    // Q5 — Contains Duplicate
    // Array mein koi duplicate element hai ya nahi
    // Input:  {1, 2, 3, 1}  → true
    // Input:  {1, 2, 3, 4}  → false
    // Time: O(__)  Space: O(__)
    public static boolean containsDuplicate(int[] arr) {
        return false;
    }

    // Q6 — Intersection of Two Arrays
    // Do arrays mein common elements dhundo (unique)
    // Input:  a = {1, 2, 2, 3},  b = {2, 2, 3, 4}
    // Output: [2, 3]
    // Hint: Pehli array ka HashSet banao, doosri array traverse karte check karo
    // Time: O(__)  Space: O(__)
    public static ArrayList<Integer> intersection(int[] a, int[] b) {
        return new ArrayList<>();
    }

    // Q7 — Union of Two Arrays
    // Do arrays ke saare unique elements return karo
    // Input:  a = {1, 2, 3},  b = {2, 3, 4, 5}
    // Output: [1, 2, 3, 4, 5]
    // Hint: Dono arrays ek HashSet mein daal do
    // Time: O(__)  Space: O(__)
    public static ArrayList<Integer> union(int[] a, int[] b) {
        return new ArrayList<>();
    }

    // ═══════════════════════════════════════════════
    // PATTERN 3 — COMPLEMENT (HashMap)
    // ═══════════════════════════════════════════════

    // Q8 — Two Sum
    // Do numbers dhundo jinka sum = target, return their indices
    // Input:  arr = {2, 7, 11, 15}, target = 9  → [0, 1]
    // Input:  arr = {3, 2, 4},      target = 6  → [1, 2]
    // Hint: complement = target - arr[i]
    //       map mein check karo complement pehle aaya hai ya nahi
    //       map mein store karo → value:index
    // Time: O(__)  Space: O(__)
    public static int[] twoSum(int[] arr, int target) {
        return new int[]{};
    }

    // ═══════════════════════════════════════════════
    // PATTERN 4 — FIRST OCCURRENCE (HashMap + Order)
    // ═══════════════════════════════════════════════

    // Q9 — First Non-Repeating Character
    // String mein pehla aisa character jo sirf ek baar aaya ho
    // Input:  "leetcode"  → 'l'
    // Input:  "aabb"      → '#'  (koi nahi)
    // Hint: Pehle frequency map banao
    //       phir string ko dobara traverse karo — pehla char jiska count=1 wahi answer
    // Time: O(__)  Space: O(__)
    public static char firstNonRepeating(String s) {
        return '#';
    }

    // Q10 — First Duplicate in Array
    // Pehla element dhundo jo duplicate ho, uska index return karo
    // Input:  {5, 3, 4, 3, 5, 1}  → 1  (index of first duplicate, which is 3 at index 3)
    // Input:  {1, 2, 3, 4}        → -1 (koi duplicate nahi)
    // Hint: HashSet mein add karte jao — pehli baar contain kare wahi answer
    // Time: O(__)  Space: O(__)
    public static int firstDuplicate(int[] arr) {
        return -1;
    }

    public static void main(String[] args) {
        // Q1
        System.out.println("=== Q1 Char Frequency ===");
        charFrequency("aabbcca");                                     // a=3, b=2, c=2

        // Q2
        System.out.println("=== Q2 Valid Anagram ===");
        System.out.println(isAnagram("anagram", "nagaram"));          // true
        System.out.println(isAnagram("rat", "car"));                  // false

        // Q3
        System.out.println("=== Q3 Majority Element ===");
        System.out.println(majorityElement(new int[]{3, 2, 3}));      // 3
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 2}));// 2

        // Q4
        System.out.println("=== Q4 Most Frequent ===");
        System.out.println(mostFrequent(new int[]{1, 2, 2, 3, 3, 3}));// 3

        // Q5
        System.out.println("=== Q5 Contains Duplicate ===");
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4})); // false

        // Q6
        System.out.println("=== Q6 Intersection ===");
        System.out.println(intersection(new int[]{1,2,2,3}, new int[]{2,2,3,4})); // [2,3]

        // Q7
        System.out.println("=== Q7 Union ===");
        System.out.println(union(new int[]{1,2,3}, new int[]{2,3,4,5}));          // [1,2,3,4,5]

        // Q8
        System.out.println("=== Q8 Two Sum ===");
        int[] res = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(res[0] + ", " + res[1]);                   // 0, 1

        // Q9
        System.out.println("=== Q9 First Non-Repeating ===");
        System.out.println(firstNonRepeating("leetcode"));            // l
        System.out.println(firstNonRepeating("aabb"));                // #

        // Q10
        System.out.println("=== Q10 First Duplicate ===");
        System.out.println(firstDuplicate(new int[]{5, 3, 4, 3, 5, 1})); // 1
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 4}));        // -1
    }
}
