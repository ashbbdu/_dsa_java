package Basics.Arrrays;

import java.util.Arrays;

public class Concepts {
    public static void main(String[] args) {
//    Array Strings
    String s = "hello";
    char h = s.charAt(0);

    String su  = s.substring(1,4);
    System.out.println(su);

    String r = s.substring(2);
        System.out.println(r);

        String a = "abc";
        String b = "abc";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String ash = "a,b,c,d";
        String [] c = ash.split(",");
        System.out.println(Arrays.toString(c));


        char [] cArray = s.toCharArray();
        System.out.println(Arrays.toString(cArray));

    }
}
