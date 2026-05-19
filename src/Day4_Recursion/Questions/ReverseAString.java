package Day4_Recursion.Questions;

import java.util.ArrayList;
import java.util.List;

public class ReverseAString {
    public static ArrayList<Character>  swap (ArrayList<Character> s , int start , int end) {

        if(start >= end) return s; // means array is already reversed

        char temp;
        temp = s.get(start);
        s.set(start, s.get(end));
        s.set(end, temp);


        return swap(s , start + 1 , end -1);
    }

    public static ArrayList<Character> reverseString(ArrayList<Character> s) {
        int start = 0;
        int end = s.size() - 1;
        return swap(s , start , end);

    }
    public static void main(String[] args) {
        ArrayList<Character> l = new ArrayList<>();
        l.add('h');
        l.add('e');
        l.add('l');
        l.add('l');
        l.add('o');
        System.out.println(reverseString(l));

        System.out.println(l.size());
    }
}
