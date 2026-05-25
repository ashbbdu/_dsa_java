package Basics.BasicMaths;

public class CountOddDigits {
    public static int countOddDigit(int n) {
        if(n == 0) return 0;
        int oddCount = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            if(lastDigit % 2 != 0) {
                oddCount = oddCount + 1;
            }
            n = n / 10;
        }
        return oddCount;
    }
    public static void main(String[] args) {
        System.out.println(countOddDigit(0));
    }
}
