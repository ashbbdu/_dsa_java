import java.util.ArrayList;

public class Day02_Practice {

    // Q1 — Reverse a String
    // Input:  "hello"
    // Output: "olleh"
    // Time: O(N)  Space: O(N)  [SOLVED]

    // Approach 1 — StringBuilder (peeche se iterate)
    public static String reverseStringUsingStringBuilder(String s) {
        StringBuilder st = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            st.append(s.charAt(i));
        }
        return st.toString();
    }

    // Approach 2 — Two Pointer
    public static String reverseStringTwoPointer(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
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
