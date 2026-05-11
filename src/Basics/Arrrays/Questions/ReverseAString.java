package Basics.Arrrays.Questions;

import java.util.Arrays;

public class ReverseAString {

    public static String reverseStringUsingStringBuilder (String s) {

        StringBuilder st = new StringBuilder();
//

        for(int i = s.length() - 1  ; i >= 0 ; i--) {
            st.append(s.charAt(i));
        }



        return st.toString();
    }


    public static String reverseStringUsingTwoPointer (String st) {

        char [] ar = st.toCharArray();

        int start = 0;
        int end = ar.length - 1;
        char temp;
        while(start < end) {
            temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }

        return new String(ar);
    }
    public static void main(String[] args) {
        String s = "hello";

        String a = reverseStringUsingStringBuilder(s);
        System.out.println(a);

        String b = reverseStringUsingTwoPointer(s);
        System.out.println(b);


    }
}
