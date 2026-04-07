package Arrays;

public class Basics {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[1]); // tc => O(1)
        int a = 30;
//        tc => O(n) => where n is length of array
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] == a) {
                System.out.println(i);
            }
        }
    }
}
