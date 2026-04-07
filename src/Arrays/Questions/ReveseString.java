package Arrays.Questions;

import java.util.Arrays;

public class ReveseString {
    public static void reverseString(char[] s) {
       int start = 0;
       int end = s.length - 1;
       char temp;
       while(start < end) {
           temp = s[start];
           s[start] = s[end];
           s[end] = temp;
           start++;
           end--;
       }
    }

    public static void main(String[] args) {
        char [] str = {'h','e','l','l','o'};
        reverseString(str);
        System.out.println(Arrays.toString(str));
    }
}
