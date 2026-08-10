package Basics.Hashing;

import java.util.ArrayList;

public class DivisionMethodChaining {
    public static void main(String[] args) {
        int[] arr = {59, 101, 550, 759, 809};

        // Hash table with 10 buckets
        ArrayList<Integer>[] hashTable = new ArrayList[10];

        // Create an empty ArrayList for every bucket
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new ArrayList<>();
        }

        // Insert elements
        for (int num : arr) {

            // Division method
            int index = num % hashTable.length;

            // Add the number to that bucket
            hashTable[index].add(num);
        }

        // Print the hash table
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(i + " -> " + hashTable[i]);
        }
    }
}
