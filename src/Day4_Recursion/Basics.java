package Day4_Recursion;

public class Basics {
    public static void recursiveFunction (int n) {
        if (n == 0) return;

        System.out.println(n);
        recursiveFunction(n -1);
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
    }
}
