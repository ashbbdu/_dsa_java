import java.util.Arrays;

public class Day05_Solutions {

    // ════════════════════════════════════════════════════════════
    // PART B — ARRAYS
    // ════════════════════════════════════════════════════════════

    // Q6 — Check if Array is Sorted   ★ LC 896
    // Approach: Single pass, check every adjacent pair
    // Other ways: → Recursion — check arr[0]<=arr[1] and recurse on rest
    //             → Streams: IntStream.range(0,n-1).allMatch(i -> arr[i]<=arr[i+1])
    // Time: O(N)   Space: O(1)
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    // Q7 — Missing Number   ★ LC 268
    // Approach 1 (used here): Sum formula — expectedSum - actualSum
    // Other ways: → XOR approach — XOR all indices 0..n with all array elements
    //               pairs cancel, only missing number remains — same TC/SC
    //             → Sorting then scan — O(N log N) time, not optimal
    //             → HashMap to mark seen — O(N) time O(N) space, not optimal
    // Time: O(N)   Space: O(1)
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int x : arr) actual += x;
        return expected - actual;
    }

    // Q8 — Single Number   ★ LC 136
    // Approach: XOR all elements — pairs cancel (a^a=0), single remains (x^0=x)
    // Other ways: → HashMap<element, count>, find count==1 — O(N) time O(N) space
    //             → Sort then scan adjacent pairs — O(N log N) time O(1) space
    //             → Math: 2*sum(set) - sum(arr) = single — O(N) time O(N) space
    // Time: O(N)   Space: O(1)
    public static int singleNumber(int[] arr) {
        int result = 0;
        for (int x : arr) result ^= x;
        return result;
    }

    // Q9 — Rotate Array Right   ★ LC 189
    // Approach: Three-reverse trick
    //   Step 1: reverse(n-k, n-1)   → flip last k elements
    //   Step 2: reverse(0, n-k-1)   → flip first n-k elements
    //   Step 3: reverse(0, n-1)     → flip entire array
    // Other ways: → Extra array — copy last k to front, rest after — O(N) space
    //             → One-by-one rotation k times — O(N*k) time
    //             → Cyclic replacements — O(N) time O(1) space but complex
    // Time: O(N)   Space: O(1)
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) return;
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);
    }

    // Q10 — Left Rotate by K
    // Approach: Three-reverse trick (mirror of right rotation)
    //   Step 1: reverse(0, k-1)     → flip first k elements
    //   Step 2: reverse(k, n-1)     → flip last n-k elements
    //   Step 3: reverse(0, n-1)     → flip entire array
    // Other ways: → Same as Q9 other ways
    // Time: O(N)   Space: O(1)
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) return;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // ════════════════════════════════════════════════════════════
    // PART C — TWO POINTERS
    // ════════════════════════════════════════════════════════════

    // Q11 — Valid Palindrome   ★ LC 125
    // Approach: Left-right two pointers, skip non-alphanumeric, compare lowercase
    // Other ways: → Clean the string first (filter non-alnum), then check palindrome
    //               — O(N) time O(N) space for cleaned string
    //             → Recursion on cleaned string
    // Time: O(N)   Space: O(1)
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Q12 — Two Sum II   ★ LC 167
    // Approach: Left-right two pointers on sorted array
    //   sum < target → left++ (need bigger value)
    //   sum > target → right-- (need smaller value)
    // Other ways: → Binary search for complement — O(N log N) time O(1) space
    //             → HashMap — O(N) time O(N) space (overkill, array already sorted)
    // Time: O(N)   Space: O(1)
    public static int[] twoSumSorted(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            else if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }

    // Q13 — Remove Duplicates from Sorted Array   ★ LC 26
    // Approach: Slow-fast pointers — slow marks last unique, fast scans ahead
    // Other ways: → HashSet to track seen values — O(N) space (not in-place)
    //             → Stream distinct() — not in-place
    // Time: O(N)   Space: O(1)
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow + 1;
    }

    // Q14 — Move Zeroes   ★ LC 283
    // Approach: Slow-fast pointers — slow is next position for non-zero
    //   swap arr[slow] and arr[fast] when arr[fast] != 0
    // Other ways: → Two-pass: count non-zeros, fill front, fill rest with 0
    //               — O(N) time O(1) space but two loops
    //             → Extra array approach — O(N) space, not in-place
    // Time: O(N)   Space: O(1)
    public static void moveZeros(int[] arr) {
        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != 0) {
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
        }
    }

    // Q15 — Container With Most Water   ★ LC 11
    // Approach: Left-right two pointers, always move the shorter bar inward
    //   area = min(h[left], h[right]) * (right - left)
    //   track max area seen
    // Other ways: → Brute force O(N²) — check every pair of bars
    //             → Stack-based approach — same O(N) but more complex
    // Time: O(N)   Space: O(1)
    public static int maxWater(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println("=== Q6 Is Sorted ===");
        System.out.println(isSorted(new int[]{1,2,3,4,5}));              // true
        System.out.println(isSorted(new int[]{1,3,2,5,4}));              // false

        System.out.println("=== Q7 Missing Number ===");
        System.out.println(missingNumber(new int[]{3,0,1}));              // 2
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1})); // 8

        System.out.println("=== Q8 Single Number ===");
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));          // 4
        System.out.println(singleNumber(new int[]{2,2,1}));              // 1

        System.out.println("=== Q9 Right Rotate ===");
        int[] a = {1,2,3,4,5,6,7};
        rotate(a, 3);
        System.out.println(Arrays.toString(a));                           // [5,6,7,1,2,3,4]

        System.out.println("=== Q10 Left Rotate ===");
        int[] b = {1,2,3,4,5};
        leftRotate(b, 2);
        System.out.println(Arrays.toString(b));                           // [3,4,5,1,2]

        System.out.println("=== Q11 Valid Palindrome ===");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car"));                     // false

        System.out.println("=== Q12 Two Sum Sorted ===");
        System.out.println(Arrays.toString(twoSumSorted(new int[]{2,7,11,15}, 9))); // [1,2]

        System.out.println("=== Q13 Remove Duplicates ===");
        int[] c = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(c));                          // 5

        System.out.println("=== Q14 Move Zeros ===");
        int[] d = {0,1,0,3,12};
        moveZeros(d);
        System.out.println(Arrays.toString(d));                           // [1,3,12,0,0]

        System.out.println("=== Q15 Container With Most Water ===");
        System.out.println(maxWater(new int[]{1,8,6,2,5,4,8,3,7}));     // 49
        System.out.println(maxWater(new int[]{1,1}));                    // 1
    }
}
