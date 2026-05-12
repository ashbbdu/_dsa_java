package Basics.Hashing.Hashmap;

import java.util.HashMap;

public class Concepts {
    public static void main(String[] args) {
        String ashi = "shish";
        int code = ashi.hashCode();
        System.out.println(code); //1540106246

        HashMap<String , Integer> m = new HashMap<>();
        m.put("Apple" , 1);
        m.put("Banana" , 2);
        m.put("Kiwi" , 4);
        System.out.println(m.containsKey("Kiwi"));

        System.out.println(m.getOrDefault("as" ,  0));

        System.out.println(m);
    }
}
