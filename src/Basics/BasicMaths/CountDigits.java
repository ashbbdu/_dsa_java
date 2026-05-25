package Basics.BasicMaths;

public class CountDigits {
    public static int countDigit(int n) {
        if(n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count = count + 1;
            n = n  / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigit(456));
    }
}
