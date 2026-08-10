package Basics.Hashing;

public class DivisionMethod {
    public static void main(String[] args) {
        int [] arr = {59 , 101 , 550 , 759 , 809};

        int [] hashTable = new int[10];


//        Dry run

        for (int i = 0 ; i < arr.length ; i++) {
            int index = arr[i] % hashTable.length;

            while (hashTable[index] != 0) {
                index = (index + 1) % hashTable.length;
            }

            hashTable[index] = arr[i];
        }

//        System.out.println(hashTable[9]);
        for (int i = 0 ; i < hashTable.length ; i++) {
            System.out.println(i + " " + hashTable[i]);
        }

    }
}
