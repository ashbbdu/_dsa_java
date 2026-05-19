package Day4_Recursion;

public class Basics {
    public static void recursiveFunction (int n) { // tail recursion
        if (n == 0) return;

        System.out.println(n);
        recursiveFunction(n -1);
    }

    public static void reverseRecursionFn (int n) { // head recursion
        if (n == 0) return;

        reverseRecursionFn(n - 1);
        System.out.println(n);
    }

    public static void recursiveFn1toN (int n , int current) {
        if (current > n) return;
        System.out.println(current);
        recursiveFn1toN(n  , current + 1);
    }
    public static void main(String[] args) {
        recursiveFunction(5);
        System.out.println();
        recursiveFn1toN(5 , 1);
        reverseRecursionFn(0);
    }
}
