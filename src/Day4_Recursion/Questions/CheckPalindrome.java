package Day4_Recursion.Questions;

public class CheckPalindrome {

    public static boolean checkElems(String s , int start , int end) {
        if(s.length() == 1) return true;
        if(s.charAt(start) != s.charAt(end)) return false;
        if(start > end) return true;

        return checkElems(s , start + 1 , end - 1);

    }

    public static boolean palindromeCheck(String s) {
        int start = 0;
        int end = s.length() - 1;
        return checkElems(s , start , end);
    }
    public static void main(String[] args) {
        String str = "a";
        System.out.println(palindromeCheck(str));
    }
}
