package Basics.Hashing.Hashmap;

import java.util.HashMap;
import java.util.Map;

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

        System.out.println();
        System.out.println(m.containsKey("Apple"));
        System.out.println(m.containsValue(1)); // returns [Apple=1, Kiwi=4, Banana=2]
        System.out.println( m.entrySet());
//        Traverse
        for(Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " -> " +  entry.getValue());
        }

//        only if the keys are needed

        System.out.println();
        for(String keys : m.keySet()) {
            System.out.println(keys);
        }

//        only if the values are needed

        System.out.println();
        for(Integer val : m.values()) {
            System.out.println(val);
        }

//        Freq count

        System.out.println();

        String st = "aabbcca";
        Map <Character , Integer> hm = new HashMap<>();

        for(char val : st.toCharArray()) {
            hm.put(val , hm.getOrDefault(val , 0) + 1);
        }

        System.out.println(hm);

        Map <Character , Integer> nm = new HashMap<>();
        nm.put('a' , 3);
        nm.put('b' , 2);
        nm.put('c' , 2);

        System.out.println(nm);

        System.out.println(nm.equals(hm));


    }
}
