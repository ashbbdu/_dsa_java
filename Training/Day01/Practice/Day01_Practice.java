public class Day01_Practice {

    // Q1 — Find Maximum Element in Array
    // Input:  {3, 7, 1, 9, 4, 6}
    // Output: 9
    // Time: O(N)  Space: O(1)  [SOLVED]
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Q2 — Array ka Sum aur Average nikalo
    // Input:  {10, 20, 30, 40, 50}
    // Output: Sum = 150, Average = 30.0
    // Time: O(N)  Space: O(1)  [SOLVED]
    public static void sumAndAverage(int[] arr) {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        average = (double) sum / arr.length;
        System.out.println("Sum = " + sum + " " + "Average = " + average);
    }

    // Q3 — Reverse Array In-Place
    // Input:  {1, 2, 3, 4, 5}
    // Output: {5, 4, 3, 2, 1}
    // Constraint: Extra array use mat karo — O(1) space mein karo
    // Time: O(N)  Space: O(1)  [SOLVED]
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Q4 — Complexity Analysis — sirf answer comments mein likho
    //
    // Code A:
    //   for (int i = 0; i < n; i++)
    //     for (int j = i; j < n; j++)
    //       System.out.println(arr[i] + arr[j]);
    // Time: O(__) — Why: ______________________
    //
    // Code B:
    //   int x = arr[0] + arr[arr.length - 1];
    // Time: O(__) — Why: ______________________
    //
    // Code C:
    //   for (int i = 0; i < n; i++) print(arr[i]);
    //   for (int j = 0; j < n; j++) print(arr[j]);
    // Time: O(__) — Why: ______________________

    public static void main(String[] args) {
        // Q1
        int[] a1 = {3, 7, 1, 9, 4, 6};
        System.out.println("Max: " + findMax(a1));              // Expected: 9

        // Q2
        int[] a2 = {10, 20, 30, 40, 50};
        sumAndAverage(a2);                                       // Expected: Sum=150, Avg=30.0

        // Q3
        int[] a3 = {1, 2, 3, 4, 5};
        reverse(a3);
        for (int x : a3) System.out.print(x + " ");             // Expected: 5 4 3 2 1
        System.out.println();
    }
}
