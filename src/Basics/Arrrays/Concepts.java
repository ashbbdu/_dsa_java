package Basics.Arrrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

//        String Builder

//        This will take big O of n square , because String is immutable , so use String Builder instead which will take O(N) time complexity
        String result = "";
        for(int i = 0 ;i < 1000 ; i++) {
            result += 'a';
        }

        System.out.println(result);


        System.out.println();

        // GOOD — O(n) — ek hi object modify hota rehta hai
        StringBuilder sBuilder = new StringBuilder();
        for(int i = 0 ;i < 1000 ; i++) {
            sBuilder.append("a");
        }

        System.out.println(sBuilder.toString());

        System.out.println();
        StringBuilder greet = new StringBuilder();
        greet.append("World");
        greet.append("hello");
        greet.insert(1 , "there");
        System.out.println(greet.toString());

        System.out.println(greet.length());

//      Array ki size fixed hoti hai. ArrayList automatically grow hoti hai.
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(2 , 10);

        l.set(0 , 5); // updated the index with new value
        System.out.println(l);
    }
}
