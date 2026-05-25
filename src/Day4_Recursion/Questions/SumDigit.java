package Day4_Recursion.Questions;

public class SumDigit {
    public static int calc(int num) {
        int sum = 0;
        while(num > 0) {
            int lastDigit = 0;
            lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }

        return sum ;
    }

    public static int addDigits (int num) {
       return   calc(num);
    }

    public static void main(String[] args) {
        int number = 529;
        System.out.println(addDigits(number));
    }
}
