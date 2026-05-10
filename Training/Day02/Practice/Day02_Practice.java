import java.util.ArrayList;

public class Day02_Practice {

    // Q1 — Reverse a String
    // Input:  "hello"
    // Output: "olleh"
    // Constraint: StringBuilder use karo
    // Time: O(__)  Space: O(__)
    public static String reverseString(String s) {
        return "";
    }

    // Q2 — Count Vowels in a String
    // Input:  "hello world"
    // Output: 3   (e, o, o)
    // Time: O(__)  Space: O(__)
    public static int countVowels(String s) {
        return 0;
    }

    // Q3 — Check if String is Palindrome
    // Input:  "racecar" → true
    // Input:  "hello"   → false
    // Constraint: Extra string/array mat banao — O(1) space
    // Hint: Day 1 ka two-pointer yaad hai?
    // Time: O(__)  Space: O(1)
    public static boolean isPalindrome(String s) {
        return false;
    }

    // Q4 — ArrayList Operations
    // Step by step karo — har line ek operation hai
    // Step 1: ArrayList banao aur {5, 10, 15, 20, 25} add karo
    // Step 2: Index 2 pe value print karo                          → Expected: 15
    // Step 3: Value 10 ko 99 se replace karo
    // Step 4: Poori list print karo                                → Expected: [5, 99, 15, 20, 25]
    // Step 5: List mein 99 hai ya nahi check karo                  → Expected: true
    // Step 6: Index 0 ka element remove karo
    // Step 7: Final size print karo                                → Expected: 4
    public static void arrayListOps() {

    }

    public static void main(String[] args) {
        // Q1
        System.out.println(reverseString("hello"));       // Expected: olleh
        System.out.println(reverseString("abcde"));       // Expected: edcba

        // Q2
        System.out.println(countVowels("hello world"));   // Expected: 3
        System.out.println(countVowels("AEIOU"));         // Expected: 5

        // Q3
        System.out.println(isPalindrome("racecar"));      // Expected: true
        System.out.println(isPalindrome("hello"));        // Expected: false
        System.out.println(isPalindrome("abba"));         // Expected: true

        // Q4
        arrayListOps();
    }
}
