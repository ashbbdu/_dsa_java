import java.util.Arrays;

public class Day05_Practice {

    // ═══════════════════════════════════════════════
    // PART A — COMPLEXITY ANALYSIS (Mental Exercise)
    // ═══════════════════════════════════════════════
    // For Q1-Q5: Write the Time and Space complexity as comments.
    // No code needed — just analyze and write TC/SC above each block.

    // Q1: What is the time and space complexity?
    // TC: O(__)   SC: O(__)
    public static void q1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i * 2);
        }
    }

    // Q2: What is the time and space complexity?
    // TC: O(__)   SC: O(__)
    public static void q2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + j);
            }
        }
    }

    // Q3: What is the time and space complexity?
    // TC: O(__)   SC: O(__)
    public static void q3(int n) {
        int k = n;
        while (k > 1) {
            System.out.println(k);
            k = k / 2;
        }
    }

    // Q4: What is the time and space complexity?
    // TC: O(__)   SC: O(__)
    public static void q4(int n) {
        for (int i = 0; i < n; i++) {
            int k = n;
            while (k > 1) {
                k = k / 2;
            }
        }
    }

    // Q5: What is the time and space complexity?
    // TC: O(__)   SC: O(__)
    public static int q5(int n) {
        if (n <= 1) return n;
        return q5(n - 1) + q5(n - 2);
    }

    // ═══════════════════════════════════════════════
    // PART B — ARRAYS (Pending from Phase 1)
    // ═══════════════════════════════════════════════

    // Q6 — Check if Array is Sorted (Ascending)  ← LeetCode 896
    // Input:  {1, 2, 3, 4, 5}  → true
    // Input:  {1, 3, 2, 5, 4}  → false
    // Hint: arr[i] > arr[i+1] mila toh not sorted
    // Time: O(__)  Space: O(__)
    public static boolean isSorted(int[] arr) {
        return false;
    }

    // Q7 — Find Missing Number in [0..N]  ← LeetCode 268
    // Array mein 0 to n tak ke numbers hain but ek missing hai
    // Input:  {3, 0, 1}    → 2
    // Input:  {0, 1}       → 2
    // Input:  {9,6,4,2,3,5,7,0,1} → 8
    // Approach: Expected sum = n*(n+1)/2,  Missing = Expected - Actual
    // Time: O(__)  Space: O(__)
    public static int missingNumber(int[] arr) {
        return -1;
    }

    // Q8 — Single Number (XOR Trick)  ← LeetCode 136
    // Ek element sirf ek baar aata hai, baaki sab do baar
    // Input:  {4, 1, 2, 1, 2}  → 4
    // Input:  {2, 2, 1}        → 1
    // Hint: a^a = 0,  a^0 = a → saare XOR karo
    // Time: O(__)  Space: O(__)
    public static int singleNumber(int[] arr) {
        return 0;
    }

    // Q9 — Rotate Array by K Places (Right Rotation)  ← LeetCode 189
    // Input:  arr = {1, 2, 3, 4, 5, 6, 7},  k = 3
    // Output: {5, 6, 7, 1, 2, 3, 4}
    // Hint: Three-reverse trick
    //   k = k % arr.length  (agar k > n toh handle karo)
    //   Step 1: Reverse last k elements
    //   Step 2: Reverse first (n-k) elements
    //   Step 3: Reverse entire array
    // Time: O(__)  Space: O(__)
    public static void rotate(int[] arr, int k) {
        // Modifies arr in-place
    }

    // Q10 — Left Rotate by K Places
    // Input:  arr = {1, 2, 3, 4, 5},  k = 2
    // Output: {3, 4, 5, 1, 2}
    // Hint: Same reverse trick, but different steps
    //   Step 1: Reverse first k elements
    //   Step 2: Reverse last (n-k) elements
    //   Step 3: Reverse entire array
    // Time: O(__)  Space: O(__)
    public static void leftRotate(int[] arr, int k) {
        // Modifies arr in-place
    }

    // ═══════════════════════════════════════════════
    // PART C — TWO POINTERS (Intro Problems)
    // ═══════════════════════════════════════════════

    // Q11 — Valid Palindrome  ← LeetCode 125
    // Only alphanumeric characters consider karo, ignore case
    // Input:  "A man, a plan, a canal: Panama"  → true
    // Input:  "race a car"                       → false
    // Hint: left-right pointers, skip non-alphanumeric
    //   Character.isLetterOrDigit(c)
    //   Character.toLowerCase(c)
    // Time: O(__)  Space: O(__)
    public static boolean isPalindrome(String s) {
        return false;
    }

    // Q12 — Two Sum II (Sorted Array)  ← LeetCode 167
    // Sorted array mein two numbers dhundo jinka sum = target
    // Return 1-indexed positions
    // Input:  {2, 7, 11, 15},  target = 9  → [1, 2]
    // Input:  {2, 3, 4},       target = 6  → [1, 3]
    // Hint: left=0, right=n-1
    //   sum < target → left++
    //   sum > target → right--
    //   sum == target → return
    // Time: O(__)  Space: O(__)
    public static int[] twoSumSorted(int[] arr, int target) {
        return new int[]{};
    }

    // Q13 — Remove Duplicates from Sorted Array in-place  ← LeetCode 26
    // Sorted array mein duplicates remove karo, unique count return karo
    // Input:  {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
    // Output: 5  (array becomes {0, 1, 2, 3, 4, _, _, _, _, _})
    // Hint: slow = 0 (last unique position)
    //   fast se traverse, arr[fast] != arr[slow] toh slow++ aur copy
    // Time: O(__)  Space: O(__)
    public static int removeDuplicates(int[] arr) {
        return 0;
    }

    // Q14 — Move Zeros to End (Two Pointer approach)  ← LeetCode 283
    // Non-zero elements ka order maintain karo, zeros end mein le jao
    // Input:  {0, 1, 0, 3, 12}
    // Output: {1, 3, 12, 0, 0}
    // Hint: slow = 0 (next non-zero position)
    //   fast se traverse, arr[fast] != 0 toh swap(slow, fast), slow++
    // Time: O(__)  Space: O(__)
    public static void moveZeros(int[] arr) {

    }

    // Q15 — Container With Most Water  ← LeetCode 11
    // Bars ke beech mein max water store karna hai
    // Input:  height = {1, 8, 6, 2, 5, 4, 8, 3, 7}
    // Output: 49
    // Hint: left=0, right=n-1
    //   area = min(height[left], height[right]) × (right - left)
    //   Chhoti wall wala pointer move karo (kyunki badi wall se farak nahi)
    // Time: O(__)  Space: O(__)
    public static int maxWater(int[] height) {
        return 0;
    }

    // Helper: reverse a subarray in-place
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // PART A — just analyze, no output tests needed

        // PART B
        System.out.println("=== Q6 Is Sorted ===");
        System.out.println(isSorted(new int[]{1, 2, 3, 4, 5}));            // true
        System.out.println(isSorted(new int[]{1, 3, 2, 5, 4}));            // false

        System.out.println("=== Q7 Missing Number ===");
        System.out.println(missingNumber(new int[]{3, 0, 1}));              // 2
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));   // 8

        System.out.println("=== Q8 Single Number ===");
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));        // 4
        System.out.println(singleNumber(new int[]{2, 2, 1}));               // 1

        System.out.println("=== Q9 Right Rotate by K ===");
        int[] arr9 = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr9, 3);
        System.out.println(Arrays.toString(arr9));                           // [5, 6, 7, 1, 2, 3, 4]

        System.out.println("=== Q10 Left Rotate by K ===");
        int[] arr10 = {1, 2, 3, 4, 5};
        leftRotate(arr10, 2);
        System.out.println(Arrays.toString(arr10));                          // [3, 4, 5, 1, 2]

        // PART C
        System.out.println("=== Q11 Valid Palindrome ===");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car"));                      // false

        System.out.println("=== Q12 Two Sum Sorted ===");
        System.out.println(Arrays.toString(twoSumSorted(new int[]{2,7,11,15}, 9)));  // [1, 2]
        System.out.println(Arrays.toString(twoSumSorted(new int[]{2,3,4}, 6)));      // [1, 3]

        System.out.println("=== Q13 Remove Duplicates ===");
        int[] arr13 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr13));                         // 5

        System.out.println("=== Q14 Move Zeros ===");
        int[] arr14 = {0, 1, 0, 3, 12};
        moveZeros(arr14);
        System.out.println(Arrays.toString(arr14));                          // [1, 3, 12, 0, 0]

        System.out.println("=== Q15 Container With Most Water ===");
        System.out.println(maxWater(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})); // 49
        System.out.println(maxWater(new int[]{1, 1}));                       // 1
    }
}
