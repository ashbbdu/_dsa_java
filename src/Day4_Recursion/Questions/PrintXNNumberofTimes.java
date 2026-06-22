package Day4_Recursion.Questions;

public class PrintXNNumberofTimes {
    public static void printX (int x , int n) {
        if(n == 0) return;
        System.out.println(x);
        printX(x , n - 1);

    }
    public static void main(String[] args) {
        printX(1 , 4);
    }
}
